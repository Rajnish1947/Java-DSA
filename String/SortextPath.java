public class SortextPath {

    public static float GetStotestpath(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char charter=path.charAt(i);
            if (charter=='S') {
                y--;
            }
            else if (charter=='N') {
                y++;
                
            } else if(charter=='W') {
                x--;
            }
            else if (charter == 'E') {
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String path="WNEENESENNN";
        System.out.println("Sortest path is : "+GetStotestpath(path));
    }

}
