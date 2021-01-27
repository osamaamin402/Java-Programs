import java.io.*;
import java.util.*;
class RelaceSameChar
{
	public static void main(String[] args) {
        String s = "halloween";
        String s1 = "halcyon";
        char[] ss = s.toCharArray();
        char[] ss1 = s1.toCharArray();

        for(int i=0;i<ss.length;i++){
          for(int j=0;j<ss1.length;j++){
                if(ss1[j] == ss[i]){
                    ss1[j] = ss1[j+1]; //Replace the common char with x
                }
            }
         }
        System.out.println(Arrays.toString(ss1));
    }
}