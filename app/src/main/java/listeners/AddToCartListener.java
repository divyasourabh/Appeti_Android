package listeners;

import java.util.ArrayList;

import pojo.CartProductModel;
import pojo.ProductModel;

/**
 * Created by Lenovo on 6/17/2015.
 */
public interface AddToCartListener {
    public void onProductAddedToCart(CartProductModel.CartItemAdd productList);
}
