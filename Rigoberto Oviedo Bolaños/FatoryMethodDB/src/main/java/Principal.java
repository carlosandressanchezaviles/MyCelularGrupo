import java.util.Random;

public class Principal {

    public static void main(String[] args) throws InterruptedException {
    IBaseDatos baseDatos = null;
    ConcrectFactoryDb concrectFactory = new ConcrectFactoryDb();

        Random rnd = new Random();
        Integer var = 0;


        for(; ;) {

            var = rnd.nextInt(4);
            Thread.sleep(10000);
            switch (var) {
                case 0:
                    baseDatos = concrectFactory.factoryDb(TipoConexionDb.ORACLE);
                    break;
                case 1:
                    baseDatos = concrectFactory.factoryDb(TipoConexionDb.SQLSERVER);
                    break;
                case 2:
                    baseDatos = concrectFactory.factoryDb(TipoConexionDb.MONGODB);
                    break;
                default:
                    System.out.print("\n NO SOLICITO");
                    break;
            }

            baseDatos.crearConexion();

        }
    }
}
