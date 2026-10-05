public class AuditDecorator extends QueryExecutorDecorator {

    private String usuario;

    public AuditDecorator(QueryExecutor queryExecutor, String usuario) {
        super(queryExecutor);
        this.usuario = usuario;
    }

    @Override
    public void execute(String query) {
        System.out.println("[AUDIT] Usuário responsável: " + usuario);
        queryExecutor.execute(query);
    }
}