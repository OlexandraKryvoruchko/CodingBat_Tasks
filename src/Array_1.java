public class Array_1 {

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











































}
