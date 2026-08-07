public class ThreadDemo extends Thread{
    public void run(){
        int i;
        for(i=0;i<10;i++){
            System.out.println("---------Values"+i+getState());
                try{

                   Thread.sleep(300);
                }
                catch(InterruptedException e){
                     System.out.println(e);
                }


        }
    }
     
    
    public static void main(String args[]){
        ThreadDemo t1=new ThreadDemo();
        t1.start();
        System.out.println("Alive"+t1.isAlive());
        System.out.println("state"+t1.getState());

    }
}