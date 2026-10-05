public class BasicQueryExecutor implements QueryExecutor {

    @Override
    public void execute(String query) {
        System.out.println("Executando SQL: " + query);
    }
}