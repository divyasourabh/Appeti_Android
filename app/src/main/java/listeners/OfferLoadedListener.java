package listeners;

import java.util.List;

import pojo.OfferModel;

/**
 * Created by Lenovo on 8/30/2015.
 */
public interface OfferLoadedListener {
    public void onOfferLoadedListener(List<OfferModel> couponList);
}
