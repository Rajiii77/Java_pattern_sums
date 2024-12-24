class NumChangePyramid {
    public static void main(String[] args) {
        int num=4;
        int count=1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=num; j++){
                if(i>=j){
                    System.out.print(count+" ");
                    count++;
                }
                else{
                    System.out.print(" ");
                }
               

            }
            System.out.println();
        }
    }
}
