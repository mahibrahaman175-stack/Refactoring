package RapidPass;

public class Journey {
    private int journeyId;
    private String cardNumber;
    private int entryStation;
    private int exitStation;
    private int entryHour;
    private int entryMinute;
    private int exitHour;
    private int exitMinute;
    private double computedFare;
    private double penaltyApplied;
    private boolean complete;

    public Journey(int journeyId, String cardNumber, int entryStation, int exitStation,
                   int entryHour, int entryMinute, int exitHour, int exitMinute){
        this.journeyId=journeyId;
        this.cardNumber=cardNumber;
        this.entryStation=entryStation;
        this.entryHour=entryHour;
        this.entryMinute=entryMinute;

        this.complete=false;
        this.computedFare=0;
        this.penaltyApplied=0;
    }

    public int getJourneyId() {
        return journeyId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getEntryStation() {
        return entryStation;
    }

    public int getExitStation() {
        return exitStation;
    }

    public int getEntryHour() {
        return entryHour;
    }

    public int getEntryMinute() {
        return entryMinute;
    }

    public int getExitHour() {
        return exitHour;
    }

    public int getExitMinute() {
        return exitMinute;
    }

    public double getComputedFare() {
        return computedFare;
    }

    public double getPenaltyApplied() {
        return penaltyApplied;
    }

    public boolean isComplete() {
        return complete;
    }


}
