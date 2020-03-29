package objects;

public class Weather {

    private int mImageId;
    private int mMinTemp;
    private int mMaxTemp;
    private String mDayOfWeek;
    private String mDate;

    public Weather(int imageId, int maxTemp, int minTemp, String dayOfWeek, String date) {
        this.mImageId = imageId;
        this.mMaxTemp = maxTemp;
        this.mMinTemp = minTemp;
        this.mDayOfWeek = dayOfWeek;
        this.mDate = date;
    }

    public int getMinTemp() {
        return mMinTemp;
    }

    public int getMaxTemp() {
        return mMaxTemp;
    }

    public int getImageId() {
        return mImageId;
    }

    public String getDayOfWeek() {
        return mDayOfWeek;
    }

    public String getDate() {
        return mDate;
    }

}
