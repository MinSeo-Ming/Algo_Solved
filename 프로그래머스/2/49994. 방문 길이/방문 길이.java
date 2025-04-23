import java.util.*;
import java.io.*;

class Solution {
    
    public static boolean isVaild(int nx,int ny){
        return 0<=nx && nx<11 && 0 <=ny && ny< 11;
    }
    
    public static final HashMap<Character, int[]> location = new HashMap<>();
    public static void initLoc(){
        location.put('U', new int [] {-1,0} );
        location.put('D', new int [] {1,0} );
        location.put('R', new int [] {0,1}) ;
        location.put('L', new int [] {0,-1} );
    }
    public int solution(String dirs) {
        initLoc();
        
        int x =5, y=5;
        HashSet<String>answer = new HashSet<>();
        
        for(int i=0; i<dirs.length(); i++){
            int [] offset = location.get(dirs.charAt(i));
            int nx = x + offset[0];
            int ny = y + offset[1];
            if(!isVaild(nx,ny))
                continue;
            answer.add(x+" "+y+" "+nx+" "+ny);
            answer.add(nx+" "+ny+" "+x+" "+y);
            x = nx;
            y = ny;
        }
            
        return answer.size()/2;
    }
}