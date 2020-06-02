package listeners;

import java.util.List;

import pojo.CartProductModel;

/**
 * Created by Lenovo on 6/20/2015.
 */
public interface UpdateCartListener {
    public void onUpdateCart(CartProductModel.Cart cart);
}
