public class Array1 {

    public boolean firstLast6(int[] nums) {

        if( nums.length >= 1 && nums[0] == 6 || nums[nums.length - 1] == 6){
            return true;
        }
        return false;
    }


    public boolean sameFirstLast(int[] nums) {

        if(nums.length >= 1 && nums[0] == nums[nums.length - 1]){
            return true;
        }
        return false;
    }



    public int[] makePi() {

        return new int[] {3, 1, 4};
    }



    public boolean commonEnd(int[] a, int[] b) {

        if( a[0] == b[0] || a[a.length - 1] ==
                b[b.length - 1]){
            return true;
        }
        return false;
    }



    public int sum3(int[] nums) {

        int sum = 0;

        for( int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        return sum;
    }



    public int[] rotateLeft3(int[] nums) {

        int lastInt = nums[0];

        nums[0] = nums[1];
        nums[1] = nums[2];
        nums[2] = lastInt;

        return nums;
    }



    public int[] reverse3(int[] nums) {

        int lastInt = nums[0];

        nums[0] = nums[2];
        nums[2] = lastInt;

        return nums;

    }




    public int[] maxEnd3(int[] nums) {

        int max = 0;

        if(nums[0] > nums[nums.length - 1]){
            max = nums[0];
        }else{
            max = nums[nums.length - 1];
        }

        for( int i = 0; i < nums.length; i++){
            nums[i] = max;
        }
        return nums;
    }




    public int sum2(int[] nums) {

        if( nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        return nums[0] + nums[1];
    }




    public int[] middleWay(int[] a, int[] b) {

        int[] middle = {a[1], b[1]};
        return middle;
    }



    public int[] makeEnds(int[] nums) {

        int[] firstLast = {nums[0], nums[nums.length - 1]};

        return firstLast;

    }




    public boolean has23(int[] nums) {

        if( (nums[0] == 2 || nums[1] == 2) || (nums[0] == 3 || nums[1] == 3)){
            return true;
        }
        return false;

    }



    public boolean no23(int[] nums) {

        if ((nums[0] == 2 || nums[1] == 2) || (nums[0] == 3 || nums[1] == 3)){
            return false;
        }
        return true;

    }




    public int[] makeLast(int[] nums) {

        int length2 = nums.length * 2;
        int[] newNums = new int [length2];

        newNums[newNums.length - 1] = nums[nums.length - 1];

        return newNums;
    }




    public boolean double23(int[] nums) {

        if (nums.length >= 2) {
            if ((nums[0] == 2 && nums[1] == 2) ||
                    nums[0] == 3 && nums[1] == 3) {
                return true;
            }
            return false;
        }
        return false;
    }



    public int[] fix23(int[] nums) {

        if(nums[0] == 2 && nums[1] == 3){
            nums[1] = 0;
        }

        if(nums[1] == 2 && nums[2] == 3){
            nums[2] = 0;
        }
        return nums;
    }



    public int start1(int[] a, int[] b) {

        int count = 0;

        if(a.length > 0 ){
            if( a[0] == 1){
                count++;
            }
        }
        if(b.length > 0)
            if( b[0] == 1){
                count++;
            }

        return count;
    }



    public int[] biggerTwo(int[] a, int[] b) {

        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if( sumA == sumB || sumA > sumB ){
            return a;
        }else{
            return b;
        }
    }





    public int[] makeMiddle(int[] nums) {

        int midL = nums.length / 2;
        int [] midCh = new int [2];

        if(nums.length >= 3){

            midCh[0] = nums[midL - 1];
            midCh[1] = nums[midL];
            return midCh;
        }
        return nums;
    }





    public int[] plusTwo(int[] a, int[] b) {

        int [] allElm = new int[4];

        allElm[0] = a[0];
        allElm[1] = a[1];
        allElm[2] = b[0];
        allElm[3] = b[1];

        return allElm;

    }





    public int[] swapEnds(int[] nums) {

        int length = nums.length;
        int firstCh = nums[0];

        nums[0] = nums[length - 1];
        nums[length - 1] = firstCh;

        return nums;

    }




    public int[] midThree(int[] nums) {

        int midCh = nums.length / 2;
        int [] mid = new int [3];

        mid[0] = nums[midCh - 1];
        mid[1] = nums[midCh];
        mid[2] = nums[midCh + 1];

        return mid;
    }







        public int maxTriple(int[] nums) {

            int midCh = nums.length / 2;
            int first = nums[0];
            int mid = nums[midCh];
            int last = nums[nums.length - 1];

            if( nums.length > 1)

                if(first > mid && first > last)
                    return first;
            if( mid > first && mid > last)
                return mid;


            return last;

    }





    public int[] frontPiece(int[] nums) {

        int [] newNums = new int [2];

        if(nums.length <= 1 || nums.length == 2)
            return nums;

        if(nums.length > 2)

            newNums[0] = nums[0];
        newNums[1] = nums[1];

        return newNums;

    }



    public boolean unlucky1(int[] nums) {

        if( nums.length >= 2 && nums[0] == 1 && nums[1] == 3 ){
            return true;

        }
        else if(nums.length > 2 && nums[1] == 1 && nums[2] == 3 ){
            return true;
        }
        else if( nums.length > 2 && nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3 ){
            return true;
        }
        return false;
    }



    public int[] make2(int[] a, int[] b) {

        int [] two = new int [2];

        if( a.length == 1){
            two[0] = a[0];
            two[1] = b[0];
        }
        else if( a.length == 0){
            two[0] = b[0];
            two[1] = b[1];
        }
        else if( a.length > 1){
            two[0] = a[0];
            two[1] = a[1];
        }
        return two;
    }



    public int[] front11(int[] a, int[] b) {

        if( a.length > 0 && b.length > 0 ){
            int[] newM = new int[2];

            newM[0] = a[0];
            newM[1] = b[0];

            return newM;
        }

        if( a.length > 0 && b.length == 0 ){
            int[] newM = new int[2];

            newM[0] = a[0];

            return newM;
        }

        if( a.length == 0 && b.length > 0 ){
            int[] newM = new int[1];

            newM[0] = b[0];

            return newM;
        }

        int[] newM = new int[0];

        return newM;
    }











































}
