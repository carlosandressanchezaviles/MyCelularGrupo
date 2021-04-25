public class ConexionSqlserver implements IBaseDatos{
    @Override
    public void crearConexion() {
        System.out.println("CONECTANDOSE  ...... A " + TipoConexionDb.SQLSERVER +"\n");
    }
}
