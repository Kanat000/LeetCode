package Medium;

public class MostWaterSolution {
    public int maxArea(int[] height) {
//        int maxArea = 0;
//        for(int i=0;i<height.length;i++){
//            for (int j=i;j< height.length;j++){
//                int area;
//                if(height[j]>height[i])
//                    area = height[i]*Math.abs(j-i);
//                else
//                    area = height[j]*Math.abs(j-i);
//
//                if(area>maxArea)
//                    maxArea = area;
//            }
//        }
//        return maxArea;
//
/*

        int maxHeight = 0;
        int indexOfMaxHeight = 0;
        int maxArea = 0;
        int indexOfSecondRectangle = 0;
        for(int i=0;i<height.length;i++){
            if(maxHeight<height[i]){
                maxHeight = height[i];
                indexOfMaxHeight = i;
            }
        }

        for(int i=0;i<height.length;i++){

            int area = height[i]*(Math.abs(i-indexOfMaxHeight));
            if(maxArea < area){
                maxArea = area;
                indexOfSecondRectangle = i;
            }

        }
        int head = indexOfSecondRectangle;
        int tail = indexOfMaxHeight;
        if(indexOfSecondRectangle > indexOfMaxHeight){
            head = indexOfMaxHeight;
            tail = indexOfSecondRectangle;
        }
        for (int i=0;i<head;i++){
            for(int j=tail;j<height.length-1;j++){
                int area;
                if(height[j]>height[i])
                    area = height[i]*(j-i);
                else
                    area = height[j]*(j-i);

                if(area>maxArea)
                    maxArea = area;
            }
        }
        return maxArea;*/

//True answer, time complexity should be O(n)
       int maxarea = 0, l = 0, r = height.length - 1;
                while (l < r) {
                    maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
                    if (height[l] < height[r])
                        l++;
                    else
                        r--;
                }
                return maxarea;

    }

}
