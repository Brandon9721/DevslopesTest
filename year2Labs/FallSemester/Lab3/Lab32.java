//  Lab32.java
//  Brandon Byrne, started Oct. 10, finished Oct. 28


//

class CA
{
    private boolean[] cell;
    private int size;
    private int rule;
    private boolean[] ttable;

    
    public CA(int x, int y)
    {
        this.size = x;
        this.rule = y;
        
        cell = new boolean[size];
        cell[size / 2] = true;
        
        ttable = new boolean[8];
        
        int ruleNum = rule;
        int i = 0;
        
       
        
        for(int j = 0; j < size; j++)
        {
            if(cell[j] == true)
            {
                System.out.print("X");
            }
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        
        
        while(i != 7)
        {
            ttable[i] = toBoolean(ruleNum % 2);  // calls toBoolean to see if n%2 == 1
            ruleNum = ruleNum / 2;
            i++;
        }
        
        
        

    }
    

        
    private boolean toBoolean(int n)
    {
        if(n == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
//    private void print(boolean[] x)
//    {
//        for(int i = 0; i < x.length; i++)
//        {
//            System.out.print(x[i] + " \n");
//        }
//    }
    
    private int toInt(boolean x)
    {
        if(x)
            return 1;
        else
            return 0;
    }
 

    
    public boolean[] getState()
    {
        boolean[] tempArray = new boolean[size];
        
        for(int i = 0; i < size; i++)
        {
            tempArray[i] = cell[i];
        }
        
        int left;
        int center;
        int right;
        
        
        // left most cell in array
        left = toInt(cell[size - 1]);
        center = toInt(cell[0]);
        right = toInt(cell[1]);
        
        int index = (4 * left) + (2 * center) + right;
        tempArray[0] = ttable[index];
        
        
        for(int i = 1; i < size - 1; i++)
        {
            left = toInt(cell[i - 1]);
            center = toInt(cell[i]);
            right = toInt(cell[i + 1]);
            
            index = (4 * left) + (2 * center) + right;
           
            tempArray[i] = ttable[index];
        }
        
        
        left = toInt(cell[size - 2]);
        center = toInt(cell[size - 1]);
        right = toInt(cell[0]);
        
        index = (4 * left) + (2 * center) + right;

        tempArray[size - 1] = ttable[index];
        
        
        
        
        
        for(int j = 0; j < size; j++)
        {
            cell[j] = tempArray[j];
        }
        
    
        return tempArray;
        
    }
    
    
    
//    public String toString()
//    {
//        String s = "";
//        for(int i = 0; i < size; i++)
//        {
//            if(cell[i])
//            {
//                s += "X";
//            }
//            else
//            {
//               s += " ";
//            }
//        }
//        return s;
//    }
}

class Lab32
{
    public static void main(String[] args)
    {
        
        if (args.length > 0)
        {
            
            int size = Integer.parseInt(args[0]);
            int rule = Integer.parseInt(args[1]);
            
            if(rule > 0 && rule <= 255)
            {
                
                CA a = new CA(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                
                boolean[] boolarray;
                
                
                int loopBreaker = 0;
                
                
                while (true)
                {
                    
                    boolarray = a.getState();
                    
                    for(int z = 0; z < size; z++)
                    {
                        
                        if(boolarray[z] == true)
                            System.out.print("X");
                        else
                            System.out.print(" ");
                        
                    }
                    
                    System.out.println();
                    
                    if(loopBreaker == size)
                    {
                        break;
                    }
                    else
                        loopBreaker++;
                    
                }
                
            }
        }
    }

}












class TestCell
{
    public static void main(String[] args)
    {
    


        if (args.length > 0)
        {
            
            int size = Integer.parseInt(args[0]);
            int rule = Integer.parseInt(args[1]);
           
            if(rule > 0 && rule <= 255)
            {
            
                CA a = new CA(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
                
                boolean[] b;

        
                int loopBreaker = 0;
               
                
                while (true)
                {
                    
                    b = a.getState();
                    
                    for(int z = 0; z < size; z++)
                    {
                        
                        if(b[z] == true)
                            System.out.print("X");
                        else
                            System.out.print(" ");
                        
                    }
                    
                    System.out.println();
                    
                    if(loopBreaker == size)
                    {
                        break;
                    }
                    else
                        loopBreaker++;
                    
                }

            }
        }
    }
}
