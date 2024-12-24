class NumberTriangular {
    public static void main(String[] args) {
        
                int num=4;
                int count=1;
                for(int i=1; i<=num; i++)
                {
                    for(int j=1; j<=num; j++)
                    {
                        if(i+j>=num+1)
                        {
                            System.out.print(count+" ");
                        }
                        else{
                            System.out.print(" ");
                        }
                    }
                    count++;
                    System.out.println();
                }
            }    
        
    
}
