package searching;

class Solution {
    boolean containsElement (int[] arr, int key) {

        for (int index = 0; index < arr.length; index++) {
            if (key==arr[index]) {
                return true;
            }
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        int[] arr= new int[8];
        Solution solution = new Solution();
         boolean result = solution.containsElement(new int[]{1, 2, 3, 4, 5},7);
        System.out.println(result);
    }
}
