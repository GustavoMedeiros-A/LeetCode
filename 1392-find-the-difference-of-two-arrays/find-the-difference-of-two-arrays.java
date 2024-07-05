class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();

        Set<Integer>  set1 = new HashSet<>();
        Set<Integer>  set2 = new HashSet<>();

        for(int num : nums1) {
            set1.add(num);
        }

        for (int num : nums2) {
            set2.add(num);
        }

        // Create two more ArrayList to insert the values that is not in one but is in the other
        ArrayList<Integer> arrayListSet1 = new ArrayList<>();
        ArrayList<Integer> arrayListSet2 = new ArrayList<>();

        for(int num : set1) {
            if(!set2.contains(num)){
                arrayListSet1.add(num);
            }
        }

        for(int num : set2) {
            if(!set1.contains(num)){
                arrayListSet2.add(num);
            }
        }

        result.add(arrayListSet1);
        result.add(arrayListSet2);
        // Add this two arrays list into the result
        return result;


    }
}