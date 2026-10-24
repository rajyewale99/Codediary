class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int mod[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int am1 = Integer.parseInt(arriveAlice.substring(0,2));
        int am2 = Integer.parseInt(leaveAlice.substring(0,2));
        int ad1 = Integer.parseInt(arriveAlice.substring(3));
        int ad2 = Integer.parseInt(leaveAlice.substring(3));
        int bm1 = Integer.parseInt(arriveBob.substring(0,2));
        int bm2 = Integer.parseInt(leaveBob.substring(0,2));
        int bd1 = Integer.parseInt(arriveBob.substring(3));
        int bd2 = Integer.parseInt(leaveBob.substring(3));
        

        int startm = Math.max(am1,bm1);
        int endm = Math.min(am2, bm2);
        
        if (startm > endm) {
            return 0;
        }

        int startd;
        int endd;

        if(startm == am1 && startm == bm1){
            startd = Math.max(ad1, bd1);
        }else if(startm == am1){
            startd = ad1;
        }else{
            startd = bd1;
        }

        if(endm == am2 && endm == bm2){
            endd = Math.min(ad2, bd2);
        }else if(endm == am2){
            endd = ad2;
        }else{
            endd = bd2;
        }

        System.out.println(startm+" "+startd);
        System.out.println(endm+" "+endd);
        int day = 0;
        
        while (startm <= endm) {
            if (startm == endm) {
                if (startd <= endd) {
                    day += endd - startd + 1;
                }
                break;
            } else {
                day += mod[startm - 1] - startd + 1;
                startm++;
                startd = 1;
            }
        }

        return day;
    }
}