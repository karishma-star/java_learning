public class varargsdemo{
    void add(int... a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println("sum is: "+sum);
    }
    public static void main(String[] args){
        varargsdemo demo=new varargsdemo();
        demo.add(1,2,3,4,5);
        demo.add(1,2,3,4,5,6,7,8,9,10);

    }
}