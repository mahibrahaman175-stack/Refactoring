package RapidPass;

public class Station {
    public int stationNumber;
    public String stationName;
    public int entryCount;
    public int exitCount;
    public int revenueAccumulated;

    public Station(int stationNumber, String stationName, int entryCount, int exitCount, int revenueAccumulated){
        this.stationNumber=stationNumber;
        this.stationName=stationName;
        this.entryCount=entryCount;
        this.exitCount=exitCount;
        this.revenueAccumulated=revenueAccumulated;
    }

}
