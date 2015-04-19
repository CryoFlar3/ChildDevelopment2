package computermentors.org.childdevelopment.model;

/**
 * Created by CryoFlar3 on 4/19/2015.
 */
public class Page {
    private int mImageId;
    private String mHeader;
    private String mText;

    public Page(int imageId, String text){
        mImageId = imageId;
        mText = text;
    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public String getHeader() {
        return mHeader;
    }

    public void setHeader(String header) {
        mHeader = header;
    }

}
