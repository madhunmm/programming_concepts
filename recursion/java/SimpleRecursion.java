public class SimpleRecursion 
{
    public int factorial(int n)
    {
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        } 
    }
    public Data factorialWithLabel(String label, int n)
    {
        if(n == 0)
        {
            Data data = new Data();
            data.value = 1;
            data.label = label + "=";
            return data;

        }
        else
        {
            String newLabel;
            if(label.isBlank())
            {
                newLabel = Integer.toString(n);
            }
            else
            {
                newLabel = label + "x" + n;
            }
            
            Data data = factorialWithLabel(newLabel, n-1);
            Data retVal = new Data();
            retVal.value = n * data.value;
            retVal.label = data.label;
            return retVal;
        }
    }
    public static void main(String args[])
    {
        SimpleRecursion r = new SimpleRecursion();
        Data d = r.factorialWithLabel("", 5);
        System.out.println(d.label + d.value);
        //System.out.println(r.factorial(10));
    }

    private class Data
    {
        public String label;
        public int value;
    } 
    
}
