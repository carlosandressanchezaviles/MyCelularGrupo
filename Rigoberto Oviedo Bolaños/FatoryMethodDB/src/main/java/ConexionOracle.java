public class ConexionOracle implements IBaseDatos{

    @Override
    public void crearConexion() {
        System.out.println("CONECTANDOSE  ...... A " + TipoConexionDb.ORACLE +"\n");
    }
}
