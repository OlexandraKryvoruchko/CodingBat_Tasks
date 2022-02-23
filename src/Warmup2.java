public class Warmup2 {

    public String stringTimes(String str, int n) {
        String newStr = "";
        for( int i = 0; i < n; i++) {
            newStr = newStr + str;
        }
        return newStr;
    }





    public String frontTimes(String str, int n) {
        String newStr = "";
        String firstPart = "";

        if(str.length() < 3){
            firstPart = str;
        }else{
            firstPart = str.substring(0, 3);
        }

        for(int i = 0; i < n; i++){
            newStr = newStr + firstPart;
        }

        return newStr;
    }




    boolean doubleX(String str) {

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i)=='x'){
                if (str.charAt(i + 1) =='x') {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    boolean doubleX(String str) {

        int firstX = str.indexOf('x');

        if(firstX != str.length() - 1 &&
                str.substring(firstX + 1, firstX + 2).equals("x"))

            return true;

        return false;
    }



    public String stringBits(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i = i + 2){
            newStr = newStr + str.charAt(i);}
        return newStr;
    }



    public String stringSplosion(String str) {
        String newStr = "";

        for( int i = 0; i < str.length() + 1; i++)
            newStr = newStr + str.substring(0, i);
        return newStr;
    }




    public int last2(String str) {

        if(str.length() < 2){
            return 0;}

        String lastChars = str.substring(str.length() - 2);
        int count = 0;

        for( int i = 0; i < str.length() -2; i++){

            if(str.substring( i, i + 2).equals(lastChars)){
                count = count + 1;
            }
        }
        return count;
    }



    public int arrayCount9(int[] nums) {
        int count = 0;
        for( int i = 0; i < nums.length; i++){
            if(nums[i] == 9){
                count = count + 1;
            }
        }
        return count;
    }




    public boolean arrayFront9(int[] nums) {

        int length = 4;

        if(nums.length < 4)
            length = nums.length;

        for( int i = 0; i < length; i++){
            if(nums[i] == 9){
                return true;}

        }
        return false;
    }



    public boolean array123(int[] nums) {
        if(nums.length < 3){
            return false;}

        for( int i = 0; i < nums.length - 2; i++){
            if( nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3 )
                return true;
        }

        return false;
    }



    public String stringX(String str) {

        String newStr = "";

        for( int i = 0; i < str.length(); i++){
            if( !(i > 0  && i < str.length() - 1 &&
                    str.substring(i, i + 1).equals("x"))){

                newStr = newStr + str.substring(i, i + 1);
            }
        }
        return  newStr;

    }




    public String altPairs(String str) {

        String newStr = "";


        for( int i = 0; i < str.length(); i = i + 4){

            int secChar = i + 2;

            if(secChar > str.length()){
                secChar = str.length();
            }
            newStr = newStr + str.substring( i, secChar);
        }
        return newStr;

    }



    public String stringYak(String str) {

        String newStr = "";

        for( int i = 0; i < str.length(); i++)
            if(i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k')
                i = i + 2;
            else
                newStr = newStr + str.charAt(i);

        return newStr;

    }



    public int array667(int[] nums) {
        int count = 0;

        for( int i = 0; i < nums.length - 1; i++)
            if( nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7))
                count = count + 1;

        return count;

    }



    public boolean noTriples(int[] nums) {

        for( int i = 0; i < nums.length -2; i++){

            int chr = nums[i];

            if( nums[i + 1] == chr && nums[i + 2] == chr){
                return false;
            }
        }
        return true;
    }














}
