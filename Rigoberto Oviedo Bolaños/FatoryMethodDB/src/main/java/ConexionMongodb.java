public class ConexionMongodb implements IBaseDatos{
    @Override
    public void crearConexion() {
        System.out.println("CONECTANDOSE  ...... A " + TipoConexionDb.MONGODB +"\n");
    }
}
