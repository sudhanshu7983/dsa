package searching;

class BinarySearcher {
    public int binarySearch(
            int[] sortdeArray,
            int key,
            int firstIndex,
            int lastIndex) {
        int index = Integer.MIN_VALUE;
        while(firstIndex<lastIndex){
            int middleIndex = firstIndex+(lastIndex-firstIndex)/2;
            if(sortdeArray[middleIndex]==key){
                return middleIndex;
            } else if (sortdeArray[middleIndex]<key) {
                firstIndex=middleIndex+1;

            } else if (sortdeArray[middleIndex]>key) {
                lastIndex=middleIndex-1;

            }
        }
        return index;
    }
}
class m{
    public static void main(String[] args) {

    }
}
