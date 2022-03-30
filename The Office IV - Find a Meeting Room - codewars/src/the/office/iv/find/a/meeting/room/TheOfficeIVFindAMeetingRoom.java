package the.office.iv.find.a.meeting.room;

public class TheOfficeIVFindAMeetingRoom {

    public static void main(String[] args) {
        char x[] = {'X','X','O'};
        System.out.println(meeting(x));
    }
    
    public static Object meeting(char[] x) {
        for(int i=0 ; i<x.length ; i++){
            if(x[i]=='O')
                return i;
        }
        return "None available!";
    }
    
}
