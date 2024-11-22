public class PasswordGenerator{

    private static int count = 0;
    private int digits;
    private String prefix;

    public PasswordGenerator(int n, String s){
        digits = n;
        prefix = s;
    }
    public PasswordGenerator(int n){
        digits = n;
        prefix = "A";
    }
    public int pwCount(){
        return count;
    }
    public String pwGen(){
        String num = "";
        int n;
        for (int i=1;i<=digits;i++){
            n = (int)(Math.random()*10);
            num += n + "";
        }
        count++;
        return prefix + "." + num;
    }
    
    public static void main (String[]args){

        PasswordGenerator pw1 = new PasswordGenerator(4, "chs");
        System.out.println(pw1.pwCount());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwGen());
        System.out.println(pw1.pwCount());
        PasswordGenerator pw2 = new PasswordGenerator(6);
        System.out.println(pw2.pwCount());
        System.out.println(pw2.pwGen());
        System.out.println(pw2.pwCount());
        System.out.println(pw1.pwCount());


    }
}