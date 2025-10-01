package examples;// North of equator is positive
// East of prime meridian is positive

public class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public boolean withinRectangle(Location southwest, Location northeast) {
        if (latitude >= southwest.latitude && longitude >= southwest.longitude &&
            latitude <= northeast.latitude && longitude <= northeast.longitude) {
            return true;
        } else {
            return false;
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "(" + latitude + ", " + longitude + ")";
    }

    @Override
    public boolean equals(Object other) {
        //return this.toString().equals(other.toString());
        if (other instanceof Location) {
            Location that = (Location)other;
            return this.latitude == that.latitude && this.longitude == that.longitude;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Location conway = new Location(35.0918, -92.4367);
        Location jonesboro = new Location(35.8357, -90.7051);
        Location texarkana = new Location(33.4251, -94.0477);

        System.out.println(conway.withinRectangle(texarkana, jonesboro));

        System.out.println("Conway is at: " + conway);

        Location hendrix = new Location(35.0918, -92.4367);
        System.out.println(conway.equals(hendrix));
        System.out.println(conway.equals(texarkana));
    }
}
