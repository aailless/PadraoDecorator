public class SecurityValidationDecorator extends QueryExecutorDecorator {

    public SecurityValidationDecorator(QueryExecutor queryExecutor) {
        super(queryExecutor);
    }

    @Override
    public void execute(String query) {

        String queryUpper = query.toUpperCase();

        if (queryUpper.contains("DROP")
                || queryUpper.contains("DELETE")
                || queryUpper.contains("TRUNCATE")
                || queryUpper.contains("ALTER")) {

            System.out.println("Query bloqueada: palavra perigosa detectada.");
            return;
        }

        if (query.contains("' OR '1'='1")
                || query.contains("--")) {

            System.out.println("Query bloqueada: possível SQL Injection detectado.");
            return;
        }

        if (query.contains(";")) {
            System.out.println("Query bloqueada: caractere ';' não permitido.");
            return;
        }

        queryExecutor.execute(query);
    }
}