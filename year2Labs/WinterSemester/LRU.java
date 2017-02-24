// Brandon Byrne (20115464)
// Lab 3 POSIX CT2530
// February 23, 2017
// Professor: Kashif Amjad

public class LRU {
    public int size;
    public int[][] table;
    public int[] priority;
    public int[] page;
    
    public LRU(int x) {
        // instanciate arrays to size of int x
        this.size = x;
        table = new int[size][size];
        priority = new int[size];
        page = new int[size];
        
        for(int col = 0; col < size; col++) {
            for(int row = 0; row < size; row++) {
                table[col][row] = -1;
            }
        }
        
        for(int i = 0; i < size; i++) {
            priority[i] = 0;
        }
        
        // possibly set i to 1 and <= size
        for(int i = 0; i < size; i++) {
            page[i] = i;
        }
        
    }
    
    public void reference(int x) {
        if(x > size) {
            System.out.println("Error: That reference is too large for the table");
        } else {
        
            for(int col = 0; col < size; col++) {
                table[col][x - 1] = 1;
            }
        
            for(int row = 0; row < size; row++) {
                table[x - 1][row] = 0;
            }
            
            for (int row = 0; row < size; row++) {
                int sum = 0;
                for(int col = size - 1; col >=0; col--) {
                    sum += table[col][row] * (int) Math.pow(2, size - col - 1);
                }
                priority[row] = sum;
            }
            
            
            
            
        }
        
    }
    
public int findPage() {
    int temp = priority[0];
    for(int i = 0; i < size; i++) {
        if(temp > priority[i] && priority[i] >= 0)
            temp = priority[i];
    }
    
    for(int j = 0; j < priority.length; j++) {
        if(temp == priority[j]) {
            temp = j + 1;
        }
    }
    return temp;
}


    
    public void print() {
        
        System.out.print("\nIf a table value == 'N' then that page has not been referenced yet");
        System.out.print("\n\nColumns:   ");
        
        for(int i = 0; i < size; i++) {
            System.out.print("| " + (i + 1) + " ");
        }
        
        System.out.print("|\n\t  ");
        for(int i = 0; i < size; i++) {
            System.out.print("-----");
        }
        
        System.out.print("\nRows:\n |\n ▼");
        
       
        
        System.out.println("\n\t   ");
        
//        System.out.println();
        
        
        for(int row = 0; row < size; row++) {
            System.out.print((row + 1) + "\t   ");
            for(int col = 0; col < size; col++) {
                if(table[col][row] == -1) {
                    System.out.print("| N ");
                } else {
                
                    System.out.print("| " + table[col][row] + " ");
                }
            }
                
            System.out.print("|\n");
            for(int x = 0; x < size; x++) {
                System.out.print("-------");
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("Priorities: ");
        for(int i = 0; i < priority.length; i++) {
            System.out.println((i + 1) + ":  " + priority[i]);
        }
        
        System.out.println("\nLowest priority value means it wasn't used recently.\nTherefore that is the least recently used.");
        System.out.println("\nLeast Recently Used Page / Least Recently Referenced: " + findPage());

    }
    
    
}
