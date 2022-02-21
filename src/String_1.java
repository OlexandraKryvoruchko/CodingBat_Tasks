public class String_1 {

    public String helloName(String name) {

        String greeting = "Hello ";
        String chr = "!";
        String newStr = "";

        return newStr = greeting + name + chr;

    }


    public String makeAbba(String a, String b) {

        String newStr = "";

        return a + b + b + a;
    }



    public String makeTags(String tag, String word) {

        String newStr = "";
        String tagStart = "<";
        String tagFinish = ">";
        String tagSlash = "</";

        return newStr = tagStart + tag + tagFinish + word + tagSlash + tag + tagFinish;

    }



    public String makeOutWord(String out, String word) {

        String newStr = "";
        String startChars = out.substring(0, 2);
        String finishChars = out.substring(2, 4);

        return newStr = startChars + word + finishChars;

    }



    public String extraEnd(String str) {

        String newStr = "";

        if( str.length() > 2) {

            String lastTwo = str.substring(str.length() - 2);

            return newStr = lastTwo + lastTwo + lastTwo;
        }
        return newStr = str + str + str ;
    }




    public String firstTwo(String str) {

        if(str.length() > 2){

            String firstTwo = "";

            firstTwo = str.substring(0, 2);
            return firstTwo;

        }else{

            return str;
        }
    }




    public String firstHalf(String str) {

        int lengthHalf = str.length() / 2;
        String firstHalf = "";

        if( str.length() > 1 ){

            firstHalf = str.substring(0, lengthHalf);
            return firstHalf;
        }
        return str;
    }




    public String withoutEnd(String str) {
        String middle = "";

        if( str.length() > 1){

            middle = str.substring(1, str.length() - 1);
            return middle;
        }
        return str;
    }




    public String comboString(String a, String b) {

        //if( a.length() > 1 && b.length() > 1){

        if( a.length() < b.length()){
            return a + b + a;
        }else{
            return b + a + b;
        }
    }




    public String nonStart(String a, String b) {

        String newA = "";
        String newB = "";

        if( a.length() > 0 || b.length() > 0){

            newA = a.substring(1);
            newB = b.substring(1);

            return newA + newB;
        } else {
            return a + b;
        }
    }





    public String left2(String str) {

        String firstTwo = "";
        String finish = "";

        if(str.length() > 2){

            firstTwo = str.substring(0, 2);
            finish = str.substring(2);
            return finish + firstTwo;
        }else{
            return str;
        }

    }




    public String right2(String str) {

        String lastTwo = "";
        String start = "";

        if(str.length() > 2){

            lastTwo = str.substring(str.length() - 2);
            start = str.substring(0, str.length() - 2);

            return lastTwo + start;
        }else{
            return str;
        }
    }





    public String theEnd(String str, boolean front) {

        if(front == true){
            return str.substring(0, 1);
        }
        if(front == false){
            return str.substring(str.length() - 1);
        }
        return str;
    }



    public String withouEnd2(String str) {

        String middle = "";
        String empty = "";

        if( str.length() > 1){

            middle = str.substring(1, str.length() - 1);
            return middle;
        }
        return empty;

    }




    public String middleTwo(String str) {

        String middleTwo = "";
        int count = str.length() / 2;

        if( str.length() > 1)

            middleTwo = str.substring( count - 1, count) +
                    str.substring( count, count + 1);

        return middleTwo;

    }



    public boolean endsLy(String str) {

        String lastTwo = "";

        if( str.length() > 1){
            lastTwo = str.substring(str.length() - 2);
            if(lastTwo.equals("ly")){
                return true;
            }
        }
        return false;

    }




    public String nTwice(String str, int n) {

        String newStr = "";

        if( str.length() > 3 ){
            newStr = str.substring(0, n) + str.substring(str.length() - n);

            return newStr;
        }
        return str;
    }




    public String twoChar(String str, int index) {

        String newStr = "";

        if( index >= 0 && index <= str.length() - 2){

            newStr = str.substring(index, index + 2);
            return newStr;
        } else {

            newStr = str.substring(0, 2);
            return newStr;
        }
    }






    public String middleThree(String str) {

        String newStr = "";
        int mid = str.length() / 2;

        if( str.length() > 3){

            newStr = str.substring(mid - 1, mid + 2);
            return newStr;

        }else {
            return str;
        }
    }




    public boolean hasBad(String str) {

        if( str.length() >= 3 && str.substring(0, 3).equals("bad") ||
                str.length() >= 4 && str.substring(1, 4).equals("bad")){

            return true;}

        return false;
    }




    public String atFirst(String str) {

        String newStr = "";

        if(str.length() >= 2){
            newStr = str.substring(0, 2);
            return newStr;
        } else {
            if(str.length() == 1){
                newStr = str.substring(0, 1) + "@";
                return newStr;
            }
            return "@@";
        }
    }



    public String lastChars(String a, String b) {

        String firstA = "";
        String lastB = "";

        if( a.length() >= 1){
            firstA = a.substring(0, 1);
        } else {
            firstA = "@";}
        if(  b.length() >= 1){
            lastB = b.substring(b.length() - 1);
        } else {
            lastB = "@";
        }
        return firstA + lastB;

    }




    public String conCat(String a, String b) {

        if(a.length() == 0 || b.length() == 0){
            return a + b;}

        if( a.length() > 0 && (a.substring(a.length() - 1).equals(b.substring(0, 1)))){
            return a + b.substring(1);
        }else{
            return a + b;
        }

    }






    public String lastTwo(String str) {

        String newStr = "";

        if( str.length() >= 2 ){

            String start = str.substring(0, str.length() - 2);
            String lastTwo =  "" + str.charAt(str.length() - 1) +
                    str.charAt(str.length() - 2);

            newStr = start + lastTwo;
            return newStr;
        }else{
            return str;
        }

    }





    public String seeColor(String str) {

        if( str.startsWith("red")){
            return "red";

        }else{
            if(str.startsWith("blue")){
                return "blue";
            }else{
                return "";
            }
        }
    }





    public boolean frontAgain(String str) {

        if(str.length() < 2){
            return false;
        }else{

            if(str.substring(0, 2).equals(str.substring(str.length() - 2))){
                return true;
            }
            return false;
        }
    }





    public String minCat(String a, String b) {

        String newStr = "";
        int dif = 0;


        if( a.length() > b.length() ){

            dif = a.length() - b.length();
            newStr = a.substring( dif) + b;
            return newStr;
        }
        if(b.length() > a.length()){

            dif = b.length() - a.length();
            newStr = a + b.substring(dif);
            return newStr;
        }

        return a + b;
    }






    public String extraFront(String str) {

        String firstTwo = "";

        if(str.length() > 2){

            firstTwo = str.substring(0,2);
            return firstTwo + firstTwo + firstTwo;
        }
        if(str.length() <= 2){

            return str + str + str;
        }
        return str;
    }






    public String without2(String str) {

        String firstTwo = "";

        if(str.length() <= 1){
            return str;
        }

        if(str.length() == 2){
            return "";
        } else {

            firstTwo = str.substring(0, 2);

            if(firstTwo.equals(str.substring(str.length() - 2))){
                return str.substring(2);

            } else {
                return str;
            }
        }
    }




    public String deFront(String str) {

        String newStr = "";
        String firstCr = str.substring(0, 1);
        String secCr = str.substring(1, 2);
        String lastPart = str.substring(2);

        if(firstCr.equals("a")){
            newStr = newStr + firstCr;
        }
        if(secCr.equals("b")){
            newStr = newStr + secCr;
        }
        newStr = newStr + lastPart;
        return newStr;
    }




    public String startWord(String str, String word) {

        if(str.length() > 0 && str.substring(1).startsWith(word.substring(1))){

            return str.substring(0, word.length());

        }else{
            return "";
        }
    }



//???
    public String withoutX(String str) {

        String newStr = str;

        if(str.startsWith("x")){

            newStr = str.substring(1);
        }
        if(newStr.endsWith("x")){

            newStr = newStr.substring(0, newStr.length() - 1);
        }
        return newStr;

    }



    public String withoutX2(String str) {

        String newStr = str;

        if (str.length() > 1 && str.charAt(1) == 'x'){
            newStr = str.substring(0,1) + str.substring(2);

        }
        if (str.length() > 0 && str.charAt(0) == 'x'){
            newStr = newStr.substring(1);

        }
        return newStr;
    }




























































}
