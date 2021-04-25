public class ConcrectFactoryDb extends AbstracFactoryDb{
    @Override
    public IBaseDatos factoryDb(TipoConexionDb conexion) {

        switch (conexion){
            case ORACLE:
                return new ConexionOracle();
            case SQLSERVER:
                return new ConexionSqlserver();
            case MONGODB:
                return new ConexionMongodb();
        }
        return null;
    }
}
