package computermentors.org.childdevelopment.model;

/**
 * Created by CryoFlar3 on 4/19/2015.
 */
public class Page {
    private int mImageId;
    private String mHeader;
    private String mSubHeader1;
    private String mSubHeader2;
    private String mProgress;


    public Page(int imageId, String text1, String text2, String text3, String text4){
        mImageId = imageId;
        mSubHeader1 = text2;
        mHeader = text1;
        mSubHeader2 = text4;
        mProgress = text3;

    }

    public String getSubHeader2() {
        return mSubHeader2;
    }

    public void setSubHeader2(String subHeader2) {
        mSubHeader2 = subHeader2;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getHeader() {
        return mHeader;
    }

    public void setHeader(String header) {
        mHeader = header;
    }

    public String getSubHeader1() {
        return mSubHeader1;
    }

    public void setSubHeader1(String subHeader1) {
        mSubHeader1 = subHeader1;
    }

    public String getProgress() {
        return mProgress;
    }

    public void setProgress(String progress) {
        mProgress = progress;
    }


}
