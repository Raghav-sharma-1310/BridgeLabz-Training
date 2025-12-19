// Create a claas with name SpringSeason to find whether day and month is Spring season
class SpringSeason{
    public static void main(String args[]){
        // Take input using command line 
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Checking Spring Season.
        if((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)){
            System.out.println("Its a Spring Season");
        }
        else{
            System.out.println("Not a Spring Season");
        }
    }
}