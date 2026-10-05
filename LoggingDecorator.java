public class LoggingDecorator extends QueryExecutorDecorator {
    public LoggingDecorator(QueryExecutor queryExecutor) {
        super(queryExecutor);
    }

    @Override
    public void execute(String query) {
        System.out.println("[LOG] Tentando executar: " + query);
        queryExecutor.execute(query);
    }
}
