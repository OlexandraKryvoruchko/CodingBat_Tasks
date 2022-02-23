public class Warmup1 {

        public boolean sleepIn(boolean weekday, boolean vacation) {
            if (!weekday || vacation) {
                return true;
            } else {
                return false;
            }
        }


        public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
            if (aSmile && bSmile || !aSmile && !bSmile) {
                return true;
            } else {
                return false;
            }
        }


        public int sumDouble(int a, int b) {
            int sum = a + b;
            int sumDouble = (a + b) * 2;
            if (a == b) {
                return sumDouble;
            } else {
                return sum;
            }
        }


        public int diff21(int n) {
            int difference = 21 - n;
            int differenceDouble = (n - 21) * 2;
            if (n > 21) {
                return differenceDouble;
            } else {
                return difference;
            }
        }


        public boolean parrotTrouble(boolean talking, int hour) {
            if (talking && (hour < 7 || hour > 20)) {
                return true;
            } else {
                return false;
            }
        }


        public boolean makes10(int a, int b) {
            if (a == 10 || b == 10 || a + b == 10) {
                return true;
            } else {
                return false;
            }
        }


        public boolean nearHundred(int n) {
            int hundred = Math.abs(n - 100);
            int twoHundred = Math.abs(n - 200);

            if (hundred <= 10 || twoHundred <= 10)
                return true;
            else
                return false;
        }


        public boolean posNeg(int a, int b, boolean negative) {
            if (negative) {
                return (a < 0 && b < 0);
            } else {
                return (a < 0 && b >= 0 || a >= 0 && b < 0);
            }
        }


        public String notString(String str) {
            if (str.startsWith("not"))
                return str;
            else
                return "not" + " " + str;
        }

    /*public String notString(String str) {
  if(str.length() >= 3 && str.substring(0, 3).equals("not ")){
  return str;
  }else{
  return "not" + " " + str;}
}*/


        public String missingChar(String str, int n) {
            String newStr;
            newStr = str.substring(0, n) + str.substring(n + 1);
            return newStr;
        }


        public String frontBack(String str) {
            String firstChar = str.substring(0, 1);
            String lastChar = str.substring(str.length() - 1);
            String middleChars = str.substring(1, str.length() - 1);

            if (str.length() < 2)
                return str;

            if (str.isEmpty())

                if (str.length() == 2)
                    return firstChar + lastChar;
            return lastChar + middleChars + firstChar;
        }



        public String front3(String str) {
            //String front3Str = str.substring(0,3);
            if(str.length() <= 3){
                return str + str + str;
            }else{
                String front3Str = str.substring(0,3);
                return front3Str + front3Str + front3Str;}
        }


        public String backAround(String str) {
            if(str.length() < 3){
                return str + str + str;
            }else{
                String lastChar = str.substring(str.length() - 1);
                return lastChar + str + lastChar;}
        }


        public boolean or35(int n) {
            if(n % 3 == 0 || n % 5 == 0){
                return true;
            }else{
                return false;}
        }



        public String front22(String str) {
            if(str.length() <= 2){
                return str + str +str;
            }else{
                String front22Str = str.substring(0, 2);
                return front22Str + str + front22Str;
            }
        }


        public boolean startHi(String str) {
            if(str.startsWith("hi")){
                return true;
            }else{
                return false;}
        }



        public boolean icyHot(int temp1, int temp2) {
            if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
                return true;
            } else {
                return false;
            }
        }



        public boolean in1020(int a, int b) {
            if ((a >= 10 && a <= 20) || (b >= 10 && b <= 20)) {
                return true;
            } else {
                return false;}
        }




        public boolean hasTeen(int a, int b, int c) {
            if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19) {
                return true;
            } else{
                return false;}
            }




///???
          public boolean loneTeen(int a, int b) {
          return ( (13 <= a && a <= 19) != ( 13 <= b  && b <= 19) );

}




        public String delDel(String str) {
                if(str.length() >= 4 && str.substring(1,4).equals("del")) {
                    return str.substring(0, 1) + str.substring(4);
                }else{
                    return str;}
            }



        public boolean mixStart(String str) {
            if(str.length() < 3){
                return false;}
            String secTherChars = str.substring(1,3);
            if(secTherChars.equals("ix")){
                return true;
            }else{ return false;}
        }



        public String startOz(String str) {
            String subStr = "";
            if(str.length() >= 1  && str.charAt(0) == 'o'){
                return subStr  = subStr + str.charAt(0); }

            if(str.length() >= 2  && str.charAt(1) == 'z'){
                return subStr = subStr + str.charAt(1);}

            return subStr;
        }



        public int intMax(int a, int b, int c) {
            if(a > b && a > c){
                return a;}
            if(b > a && b > c){
                return b;}
            return c;
        }




        public boolean in3050(int a, int b) {
            if(a >= 30 && a <= 40 && b >= 30 && b <= 40)
                return true;
            if(a >= 40 && a <= 50 && b >= 40 && b <= 50)
                return true;

            return false;
        }





        public int max1020(int a, int b) {
            int maxA;
            int maxB;
            if (a >= 10 && a <= 20) {
                maxA = a;}
            else {
                maxA = 0;}

            if (b >= 10 && b <= 20){
                maxB = b;}
            else {
                maxB = 0;}

            return Math.max(maxA, maxB);
        }





        public boolean stringE(String str) {
            int eCount = 0;

            for( int i = 0; i < str.length(); i++){
                if(str.charAt(i) == 'e'){
                    eCount++;
                }
            }
            return (eCount >= 1 && eCount <=3);
        }



        public boolean lastDigit(int a, int b) {
            if(a % 10 == b % 10){
                return true;
            }else{
                return false;}
        }






        public String endUp(String str) {
            if(str.length() > 3){
                String start = str.substring(0, str.length() -3 );
                String end = str.substring(str.length() -3);
                return start + end.toUpperCase();
            }else{
                return str.toUpperCase();}
        }



        public String everyNth(String str, int n) {
            String everyNthStr = "";
            if(n > 0)
                for(int i =0; i < str.length(); i = i + n){
                    everyNthStr = everyNthStr + str.charAt(i);
                }
            return everyNthStr;
        }

    }
