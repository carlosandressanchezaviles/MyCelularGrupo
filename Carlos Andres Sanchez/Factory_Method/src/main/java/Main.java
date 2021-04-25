import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Iconexion vista = null;
        ConcrectFactoryDB fabrica = new ConcrectFactoryDB();
        Random rnd = new Random();
        Integer var = 0;
        var = rnd.nextInt(4);
        switch (var){
            case 1:
                vista = fabrica.factoryConexion(TipoConexion.basededatosA);
                break;
            case 2:
                vista = fabrica.factoryConexion(TipoConexion.basededatosB);
                break;
            case 3:
                vista = fabrica.factoryConexion(TipoConexion.basededatosC);
                break;
            default:
                System.out.print("\n NO SOLICITO");
                break;
        }
        vista.hacer_conexion();
    }
}
