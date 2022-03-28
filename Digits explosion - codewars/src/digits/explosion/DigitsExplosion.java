package digits.explosion;

public class DigitsExplosion {

    public static void main(String[] args) {
        System.out.println(explode("312"));
    }
    
    public static String explode(String digits) {
        char c;
        String str = "";
        for(int i=0 ; i<digits.length() ; i++){
            c = digits.charAt(i);
            for(int j=0 ; j<Integer.parseInt(c+"") ; j++){
                str += c;
            }
        }
        return str;
  }
    
}
