class MovieTheaterTest{

  public static void main(String args[]){
    MovieTheater myChairMap =new MovieTheater();
    
    // Initialize the array
    myChairMap.setChairMap();

    myChairMap.name = "Ann";
    myChairMap.setChair();

    myChairMap.name = "Bond";
    myChairMap.setChair();

    myChairMap.name = "Cindy";
    myChairMap.setChair();

    myChairMap.name = "Donald";
    myChairMap.setChair();
    

    myChairMap.displayChairMap();
    
    //Challenge Lab:  Searching the chair
    //cm.name = "Donald";
    //cm.searchChair();

   //Challenge Lab: Searching the chair
    //cm.name = "Ronn";
    //cm.searchChair();
  } //end main
 }//end class

