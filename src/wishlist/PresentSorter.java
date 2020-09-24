package wishlist;

public class PresentSorter {
    public void sortPresentsByDesire(Present[] presents) {// sorting will be in ascending order
        // TODO
        // 9 5 7 6 2 4
        for (int i = 1; i < presents.length; i++){
            Present current = presents[i]; //5
            int j = i-1;
            while (j>=0 && current.desire < presents[j].desire){// is 5 < 9?
                presents[j+1] = presents[j]; // presents[1] = 9
                j--; // j = -1
            }
            j++; // j = 0
            presents[j] = current;// presents[0] = 5
        }
    }
}
