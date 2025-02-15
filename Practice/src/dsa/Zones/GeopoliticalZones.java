package Zones;

public enum GeopoliticalZones {
    NORTH_CENTRAL("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau" ),
    NORTH_EAST("Adamawa","Bauchi","Borna","Gombe","Taraba","Yobe"),
    NORTH_WEST("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTH_EAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_South("Akwa-Ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SOUTH_WEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");

    public String[] getStates() {
        return states;
    }

     String[] states;

    GeopoliticalZones(String...states) {
        this.states = states;
    }


}
