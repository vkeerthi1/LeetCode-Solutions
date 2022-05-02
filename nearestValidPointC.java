package leedtcode.May;

public class nearestValidPointC {

    public static int nearestValidPoint(int x, int y, int[][] points) {
        var nearest = -1;

        for (int i = 0, minDistance = Integer.MAX_VALUE; i < points.length; i++)
            if (x == points[i][0] || y == points[i][1]) { // check valid point
                var distance = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]); // find Manhattan distance

                if (minDistance > distance) {
                    minDistance = distance; // maintain the nearest valid point
                    nearest = i;
                }
            }
        return nearest;
    }

    public static void main(String[] args) {
        int x = 3, y = 4;
        int arr[][] = { {1,2},{3,1},{2,4},{2,3},{4,4} };
        int ans= nearestValidPoint(x,y,arr);
        System.out.println(ans);
    }
}
