public class Main {
    public int maxArea(int[] height) {
        int low=0,high=height.length-1;
        int area =0,max=0;
        while(low<high){
            if(height[low]>height[high]){
                area=(high-low)*height[high];
                high--;
            }
            else{
                area=(high-low)*height[low];
                low++;

            }
            if(area>max) {
                max=area;
            }
        }
        return max;
    }
}
