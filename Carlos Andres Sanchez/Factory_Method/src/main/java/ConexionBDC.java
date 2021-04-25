public class ConexionBDC implements Iconexion {
    @Override
    public void hacer_conexion() {
        System.out.println("Coneccion a"+TipoConexion.basededatosC+"\n");
    }
}