public class MetricsDecorator extends QueryExecutorDecorator {

    public MetricsDecorator(QueryExecutor queryExecutor) {
        super(queryExecutor);
    }

    @Override
    public void execute(String query) {
        long inicio = System.currentTimeMillis();

        queryExecutor.execute(query);

        long fim = System.currentTimeMillis();

        System.out.println("[METRICS] Tempo de execução: "
                + (fim - inicio) + "ms");
    }
}