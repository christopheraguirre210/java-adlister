public class DaoFactory {

    private static ListProducts DaoProductImp = new ListProducts();

    public Products getProductsDao() {
        if (DaoProductImp == null) {
            DaoProductImp = new ListProducts();
        }
        return DaoProductImp;
    }
}
