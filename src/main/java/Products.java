import java.util.List;

public interface Products {

    List<ProductBean> ListAllProducts();
    void insert(ProductBean productBean);
}
