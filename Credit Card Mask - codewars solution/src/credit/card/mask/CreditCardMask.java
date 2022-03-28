package credit.card.mask;

public class CreditCardMask {

    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
    }
    
    public static String maskify(String str) {
        if(str.length()<=4)
            return str;
        else{
            String finalStr = "";
            boolean flag = false;
            for(int i=0 ; i<str.length() ; i++){
                if(i==str.length()-4)
                    flag = true;
                if(flag)
                    finalStr += str.charAt(i);     
                else
                    finalStr += "#";
            }
            return finalStr;
        }        
    }
    
}
