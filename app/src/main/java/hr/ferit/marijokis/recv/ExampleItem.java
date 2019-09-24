package hr.ferit.marijokis.recv;

public class ExampleItem {
    private int mImageResource;
    private String mText1;

    public ExampleItem(int imageResource, String text1) {
        mImageResource = imageResource;
        mText1 = text1;
    }


    public int getImageResource() {
        return mImageResource;
    }

    public String getText1() {
        return mText1;
    }
}