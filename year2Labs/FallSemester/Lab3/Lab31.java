// Lab 31 Classes and objects II
// Brandon Byrne (20115464)
import java.util.*;

class IntegerSet
{
    private int[] a = new int[101];
    
    public IntegerSet()
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = 0;
        }
    }
    
    public void insert(int x)
    {
            a[x] = 1;
    }
    
    public void delete(int x)
    {
        a[x] = 0;
    }
    
    public IntegerSet union(IntegerSet x)
    {
        IntegerSet tempSet = new IntegerSet();
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == 1 || x.a[i] == 1)
            {
                tempSet.insert(i);
            }
        }
        return tempSet;
    }
    
    public IntegerSet intersection(IntegerSet x)
    {
        IntegerSet tempSet = new IntegerSet();
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == 1 && x.a[i] == 1)
            {
                tempSet.insert(i);
            }
        }
        return tempSet;
    }
   
    public IntegerSet difference(IntegerSet x)
    {
        IntegerSet tempSet = new IntegerSet();
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] == 1 && x.a[i] != 1)
            {
                tempSet.insert(i);
            }

        }
        return tempSet;
    }
    
    public boolean equals(IntegerSet x)
    {
        boolean result = false;
        for(int i = 0; i < a.length; i++)
        {
            if((a[i] == 1 && x.a[i] == 1) || a[i] == 0 && x.a[i] == 0)
            {
                result = true;
            }
            else
            {
                result = false;
                break;
            }
        }
        return result;
    }
  
    public String toString()
    {
        String s = "{";
        String s2 = "}";
        for(int i = 0; i < a.length; i++)
        {
           
            if(a[i] == 1)
                s +=  i + ",";
                //s += a[i] + ", ";
        }
        int sublength = s.length() - 1;
        String s3 = s.substring(0,sublength) + s2;
    
        return s3;
    }
}

class Lab31
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        System.out.println("\nCreate an integer set by inputting numbers within the range of 1 to 100\nTo finish adding numbers to set, enter 0");
        // creates 2 integer sets
        IntegerSet userSet = new IntegerSet();
        IntegerSet userSet2 = new IntegerSet();

        
        // while loop adds user inputted integers to each set
        int x;
        while(true)
        {
            x = s.nextInt();
            if(x == 0)
            {
                break;
            }
            userSet.insert(x);
        }
        System.out.println(userSet);
        
        System.out.println("\nCreate another integer set of integers between 1 and 100, enter 0 to finish set");
        while(true)
        {
            x = s.nextInt();
            if(x == 0)
            {
                break;
            }
            userSet2.insert(x);
        }
        
        
        // print out each set and also their methods of union, intersection... and so on
        System.out.println("\n\n\nSet 1: " + userSet);
         System.out.println("Set 2: " + userSet2 + "\n");
    
        IntegerSet union = userSet.union(userSet2);
        System.out.println("Union: " + union + "\n");
    
        IntegerSet intersect = userSet.intersection(userSet2);
        System.out.println("Intersections: " + intersect + "\n");
    
        IntegerSet diffAB = userSet.difference(userSet2);
        System.out.println("Difference A - B: " + diffAB + "\n");
    
        IntegerSet diffBA = userSet2.difference(userSet);
        System.out.println("Difference B - A: " + diffBA + "\n");
        
        
        // test if the sets are equal and if not, the user must make use of the insert and delete methods
        // to make the second set equal the first one to end the program
        while(true)
        {
            if(userSet.equals(userSet2)) // if equal state they are equal and end program
            {
                System.out.println("Your integer sets contain the same values!\n");
                System.out.println(userSet + "\n" + userSet2 + "\n");
                break;
            }
            else // if not equal loop through a menu that asks user to insert or delete integers to obtain equal sets
            {
                System.out.println("\n" + userSet + "\n" + userSet2 + "\n");
                System.out.println("\nTry to insert or delete integers from set 2 to make it equal set 1");
                System.out.println("*********************************\n*   1: Insert   *   2: Delete   *");
                System.out.print("*********************************\n\nEnter option '1' or '2': ");
                int userSelect = s.nextInt();
                if(userSelect == 1)
                {
                    System.out.println("\nType values to be inserted and enter '0' to finish\n");
                    while(true)
                    {
                        x = s.nextInt();
                        if(x == 0)
                        {
                            System.out.println("\n");
                            break;
                        }
                        userSet2.insert(x);
                    }
                }
                else if(userSelect == 2)
                {
                    System.out.println("\nType values to be deleted and enter '0' to finish\n");
                    while(true)
                    {
                        x = s.nextInt();
                        if(x == 0)
                        {
                            System.out.println("\n");
                            break;
                        }
                        userSet2.delete(x);
                    }
                }
            }
        }
    }
}






// class to test each method before writing main class Lab31
class TestClass
{
    public static void main(String[] args)
    {
        IntegerSet a = new IntegerSet();
        IntegerSet b = new IntegerSet();
        a.insert(1);
        a.insert(2);
        a.insert(3);
        a.insert(4);
        System.out.println(a + "\n");
        
        b.insert(3);
        b.insert(4);
        b.insert(5);
        b.insert(6);
        b.insert(1);
        b.insert(2);
        b.delete(5);
        b.delete(6);
       
        System.out.println(b + "\n");
        
        IntegerSet c = a.union(b);
        System.out.println("Union: " + c + "\n");
        
        IntegerSet d = a.intersection(b);
        System.out.println("Intersections: " + d + "\n");
        
        IntegerSet e = a.difference(b);
        System.out.println("Difference A - B: " + e + "\n");
        
        IntegerSet f = b.difference(a);
        System.out.println("Difference B - A: " + f + "\n");
        
        if(a.equals(b))
        {
            System.out.println("EQUAL");
        }
        
        else
        {
            System.out.println("NOT EQUAL");
        }
        
    }
}
