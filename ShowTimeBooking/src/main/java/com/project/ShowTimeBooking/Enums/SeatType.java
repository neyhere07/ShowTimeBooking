package com.project.ShowTimeBooking.Enums;

public enum SeatType {
    SILVER("Silver"),
    GOLD("Gold"),
    PLATINUM("Platinum"),
    LOUNGERS("Loungers"),
    SEMI_RECLINERS("Semi Recliners"),
    RECLINERS("Recliners"),
    PHYSICALLY_HANDICAPPED("Physically Handicapped");
    private final String displayName;
    SeatType(String displayName){
        this.displayName=displayName;
    }
    public String getDisplayName(){
        return this.displayName;
    }
}
