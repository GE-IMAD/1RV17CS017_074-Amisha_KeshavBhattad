package objects;


public class MapItem {

    private final String mName;
    private final String mNumber;
    private final String mWebsite;
    private final String mAddress;

    public MapItem(String name, String number, String website, String address) {
        this.mName = name;
        this.mNumber = number;
        this.mWebsite = website;
        this.mAddress = address;
    }

    public String getName() {
        return mName;
    }

    public String getNumber() {
        return mNumber;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public String getAddress() {
        return mAddress;
    }
}