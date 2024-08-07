class OverLoad implements InterF1 {
    
    public void add(){
        System.out.println("Addition of " + a + " and " + b + " is: " + (a+b));
    }

    public void sub(){
        System.out.println("Subraction of " + a + " and " + b + " is: " + (a-b));
    }

    public static void main(String []args){
        OverLoad o = new OverLoad();
        o.add();
        o.sub();
    }
}