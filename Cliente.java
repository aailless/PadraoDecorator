public class Cliente {

    public static void main(String[] args) {

        QueryExecutor executor =
            new LoggingDecorator(
                new SecurityValidationDecorator(
                    new BasicQueryExecutor()
                )
            );

        executor.execute("SELECT * FROM users");

        System.out.println();

        executor.execute("DROP TABLE users");

        System.out.println();

        executor.execute("SELECT * FROM users WHERE name = '' OR '1'='1'");
    }
}