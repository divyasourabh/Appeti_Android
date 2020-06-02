package listeners;

import java.util.ArrayList;
import java.util.List;

import pojo.FlavourModel;
import pojo.LocationModel;

/**
 * Created by Lenovo on 6/8/2015.
 */
public interface FlavourLoadedListener {
        public void onFlavourLoaded(List<FlavourModel.Flavour> flavourList);
}
