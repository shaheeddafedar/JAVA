package mapinterface_and_enums;


enum Weekday {
   Monday(true),
   Tuesday(true),
   Wednesday(true),
   Thursday(true),
   Friday(true),
   Saturday(false),
   Sunday(false);  

   private boolean isWeekday;

    Weekday(boolean isWeekday) {
    this.isWeekday = isWeekday;
}


  public boolean isWeekday() {
    return isWeekday;
}


  public String getType(){
    return isWeekday?"Weekday":"Weekend";
  }


}
