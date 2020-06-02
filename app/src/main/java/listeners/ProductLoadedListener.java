package listeners;

import java.util.ArrayList;
import java.util.List;

import pojo.ProductModel;

/**
 * Created by Lenovo on 6/7/2015.
 */
public interface ProductLoadedListener {
    public void onProductLoaded(ProductModel productModel);
}
