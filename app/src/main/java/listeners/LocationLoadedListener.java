package listeners;

import java.util.ArrayList;
import java.util.List;

import pojo.LocationModel;

/**
 * Created by Lenovo on 6/8/2015.
 */
public interface LocationLoadedListener {
        public void onLocationLoaded( List<LocationModel.Location> locationList);
}
