class Basic extends Thread {
    public void run(){
        int i = 1;
        while(true){
            System.out.println(i + "Hello");
            i++;
        }
    }
}
class Test{
    public static void main(String[] args) {
        Basic b = new Basic();
        b.start();
        int i = 1;
        while(true){
            System.out.println(i + "World");
            i++;
        }
    }
}
