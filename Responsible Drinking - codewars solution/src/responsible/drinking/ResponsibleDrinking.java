package responsible.drinking;

public class ResponsibleDrinking {

    public static void main(String[] args) {
        System.out.println(hydrate("1 beer"));
    }
    
    public static String hydrate(String drinkString) {
        int count = 0;
        for(int i=0 ; i<drinkString.length() ; i++){
            if(Character.isDigit(drinkString.charAt(i)))
                count += Integer.parseInt(drinkString.substring(i,i+1));
        }
        if(count==1)
            return "1 glass of water";
        else if(count == 0)
            return "0 glasses of water";
        return count+" glasses of water";
    }
    
}
