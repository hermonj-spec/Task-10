package catalog;

public class Software {
    protected String SoftwareName;
    protected String Version;
    protected double Price;

    public Software(String softwareName, String version, double price) {
        SoftwareName = softwareName;
        Version = version;
        Price = price;
    }
}
