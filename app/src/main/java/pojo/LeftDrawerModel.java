package pojo;

import android.graphics.Bitmap;

/**
 * Created by Lenovo on 6/7/2015.
 */
public class LeftDrawerModel {
    public String sectionName;
    public Bitmap sectionImage;

    public Bitmap getSectionImage() {
        return sectionImage;
    }

    public void setSectionImage(Bitmap sectionImage) {
        this.sectionImage = sectionImage;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
