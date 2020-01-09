import java.util.ArrayList;
import java.util.List;

public class ListProducts implements Products {
    private List<ProductBean> product_db = new ArrayList();

    // When an instance of this class is created, we'll populate the
    // products array list with data, "faking" the records
    public ListProducts() {
        insert(new ProductBean("hammer", 9.99));
        insert(new ProductBean("screwdriver", 9.99));
        insert(new ProductBean("drill", 19.99));
    }

    @Override
    public List<ProductBean> ListAllProducts() {
        return null;
    }

    // Persist a new record. We'll simulate this by adding the passed object
    // to our internal array list of products.
    public void insert(ProductBean productBean) {
        this.product_db.add(productBean);
    }

    public List<ProductBean> all() {
        return this.product_db;
    }
}

