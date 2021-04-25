public class ConexionBDB implements Iconexion {
    @Override
    public void hacer_conexion() {
        System.out.println("Coneccion a"+TipoConexion.basededatosB+"\n");
    }
}