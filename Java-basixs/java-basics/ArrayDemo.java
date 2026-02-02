public class ArrayDemo {
    public static void main(String[] args)
    {
        int a[][]=new int[2][2];
        String b[][]=new String[2][2];

        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                a[i][j]=(int)(Math.random()*100);
                b[i][j]="Ravi";
            }
        }
        for (int i=0;i<a.length;i++)
        {
            for (int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        

    }
    
}
