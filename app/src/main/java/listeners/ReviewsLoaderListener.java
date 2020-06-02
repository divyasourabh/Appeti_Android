package listeners;

import java.util.List;

import pojo.CartProductModel;
import pojo.ProductReviewsModel;

/**
 * Created by Lenovo on 7/9/2015.
 */
public interface ReviewsLoaderListener {
    public void reviewsLoaderListener(List<ProductReviewsModel.ReviewModel> reviewModelList);
}
