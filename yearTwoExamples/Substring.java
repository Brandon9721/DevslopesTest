class Substring
{
    public static void main(String[] args)
    {
        String s1 = "Hello world, this is a string";
        String s2 = s1.substring(0,11);
        
        System.out.println(s1);

        System.out.println(s2);
   
        char[] chs = s1.toCharArray();
        for(int i = 0; i < chs.length; i++)
            System.out.println(chs[i]);
    
    }
}
