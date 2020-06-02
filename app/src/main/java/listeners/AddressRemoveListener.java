package listeners;

import java.util.List;

import pojo.AddressModel;

/**
 * Created by Lenovo on 7/3/2015.
 */
public interface AddressRemoveListener {
    public void addressRemoveListener(List<AddressModel.Address> removeAddress);
}
