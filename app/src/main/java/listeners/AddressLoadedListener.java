package listeners;

import java.util.ArrayList;
import java.util.List;

import pojo.AddressModel;
import pojo.ProductModel;

/**
 * Created by Lenovo on 6/28/2015.
 */
public interface AddressLoadedListener {
    public void addressLoadedListener(List<AddressModel.Address> addressList);
}