class SpringSeasonMethod{
    // checkSpringSeason Method to check spring season
    public static boolean checkSpringSeason(int month, int day){
        // Checking Spring Season.
        boolean isSpring = false;
        if((month == 3 && day >= 20) || (month == 4) || (month == 5) || (month == 6 && day <= 20)){
            isSpring = true;
        }
        else{
            isSpring = false;
        }
        return isSpring;
    }

    public static void main(String args[]){
        // Take input using command line 
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Call method to display results
        boolean result = checkSpringSeason(month, day);
        if(!result){
           System.out.println("Not a Spring Season");
        }
        else{
           System.out.println("Its a Spring Season");
        }
        
    }
}