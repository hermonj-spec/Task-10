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

    public String getSoftwareName() {
        return SoftwareName;
    }

    public String getVersion() {
        return Version;
    }

    public double getPrice() {
        return Price;
    }

    public void  displaySoftwareDisplay() {
        System.out.println("--- Software Details ---");
        System.out.println("Software Name: " + SoftwareName);
        System.out.println("Version: " + Version);
        System.out.println("Price: $" + Price);
        System.out.println();
    }
}
