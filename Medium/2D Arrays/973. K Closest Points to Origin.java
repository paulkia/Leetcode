class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] result = new int[k][2];
        Map<Integer, List<Integer[]>> distToPt = new TreeMap();
        for (int i = 0; i < points.length; i++) {
            int distSq = points[i][0]*points[i][0] + points[i][1]*points[i][1];
            if (distToPt.containsKey(distSq)) {
                distToPt.get(distSq).add(pairIntToIntg(points[i]));
            } else {
                List<Integer[]> p = new LinkedList<>();
                p.add(pairIntToIntg(points[i]));
                distToPt.put(distSq, p);
            }
        }
        
        int index = 0;
        for (int distSq : distToPt.keySet()) {
            List<Integer[]> mapPoints = distToPt.get(distSq);
            for (Integer[] pt : mapPoints) {
                result[index++] = pairIntgToInt(pt);
                if (index == k)
                    return result;
            }
        }
        
        return result;
    }
    
    private Integer[] pairIntToIntg(int[] intArr) {
        Integer[] result = new Integer[2];
        result[0] = intArr[0];
        result[1] = intArr[1];
        return result;
    }
    
    private int[] pairIntgToInt(Integer[] intgArr) {
        int result[] = new int[2];
        result[0] = intgArr[0];
        result[1] = intgArr[1];
        return result;
    }
}