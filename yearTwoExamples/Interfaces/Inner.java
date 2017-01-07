class Outer
{
    private int outerVar = 100;
    
    class Inner
    {
        private int innerVar = 20;
        
        public int getSum(int x)
        {
            return outerVar + innerVar + x;
        }
    }
}

class TestInner
{
    public static void main(String[] args)
    {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner;
      
    }
}
