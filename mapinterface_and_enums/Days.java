package mapinterface_and_enums;

enum Days {

// Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday,  


Monday ("First day of the week"),
Tuesday ("Second day"),
Wednesday ("Midweek day"),
Thursday ("Fourth day"),
Friday ("Last working day"),
Saturday ("Weekend begins"),
Sunday ("Holiday / Rest day");

public String action;

private Days(String action) {
    this.action = action;
}


}




