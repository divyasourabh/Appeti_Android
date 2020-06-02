package listeners;

import pojo.CartProductModel;
import pojo.UtilityModel;

/**
 * Created by Lenovo on 7/9/2015.
 */
public interface SaveCartItemListener {
    public void saveCartItemListener(CartProductModel.CartItemAdd  cart);
}
