public class ConcrectFactoryDB extends AbstracFactoryBD {

    @Override
    public Iconexion factoryConexion(TipoConexion conexionDB) {
        switch (conexionDB) {
            case basededatosA:
                return new ConexionBDA();
            case basededatosB:
                return new ConexionBDB();
            case basededatosC:
                return new ConexionBDC();
        }
        return null;
    }
}
