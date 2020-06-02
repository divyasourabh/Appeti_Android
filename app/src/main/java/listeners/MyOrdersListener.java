package listeners;

import java.util.List;

import pojo.MyOrderModel;

/**
 * Created by Lenovo on 7/10/2015.
 */
public interface MyOrdersListener {
    public void myOrdersListener(List<MyOrderModel.MyOrder> myorderList);
}
