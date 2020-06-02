package listeners;

import java.util.ArrayList;

import pojo.OrderedProductModel;
import pojo.ProductModel;

/**
 * Created by Lenovo on 6/28/2015.
 */
public interface OrderLoadedListener {
    public void onOrderLoadedListener(OrderedProductModel orderedProductModel);
}
