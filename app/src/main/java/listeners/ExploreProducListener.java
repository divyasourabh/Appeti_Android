package listeners;

import java.util.List;

import pojo.ExploreItemsModel;
import pojo.FlavourModel;

/**
 * Created by Lenovo on 7/12/2015.
 */
public interface ExploreProducListener {
    public void exploreProducListener(List<ExploreItemsModel.ExploreItem> exploreItemList);
}
