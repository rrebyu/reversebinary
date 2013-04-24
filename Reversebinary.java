/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * @ruizhiyu
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rrebyu
 */
public class Reversebinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int charLength;
        char [] binaryChar;
        char [] binaryCharReverse;
        String binary = new String();
        String binaryReverse;
        // read in int
        BufferedReader stdin  = new BufferedReader(new InputStreamReader(System.in));
        try {
            binary = Integer.toBinaryString(Integer.parseInt(stdin.readLine()));
            
        } catch (IOException ex) {
            Logger.getLogger(Reversebinary.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        binaryChar = binary.toCharArray();
        charLength = binaryChar.length;
        binaryCharReverse = new char[charLength];
        
       
        for (int i = 0; i < charLength; i++ ) {
            binaryCharReverse[i] = binaryChar[charLength-1-i];
        }
        
        binaryReverse = new String(binaryCharReverse);
        System.out.println(Integer.parseInt(binaryReverse, 2));   
    }
}
