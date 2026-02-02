class NanaException extends Exception {
    public NanaException(String message) {
        super(message);
    }
}

public class ExceptionDemo
{
    public static void main(String[] args) {
        int i=20;
        int j=0;

        try{
            j=18/i;
            if(j==0)
                throw new NanaException("Division by zero");
        }
        catch(NanaException e)
        {
            System.out.println(e);
        }
    }

}