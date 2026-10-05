public class QueryExecutorDecorator implements QueryExecutor {
     protected QueryExecutor queryExecutor;

    public QueryExecutorDecorator(QueryExecutor queryExecutor) {
        this.queryExecutor = queryExecutor;
    }

    @Override
    public void execute(String query) {
        queryExecutor.execute(query);
    }
}