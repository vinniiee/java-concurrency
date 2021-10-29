public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(()-> {

                System.out.println("Inside thread: "+Thread.currentThread().getName()+
                                   " | with priority: "+Thread.currentThread().getPriority());
//                throw new RuntimeException("Intentional error!");
        });

        thread.setPriority(7);
        thread.setUncaughtExceptionHandler(( th, ex)-> {System.out.println("Critical error occured in thread: "
                                                                +th.getName()+"\n Error message: "+ex.getMessage());});
        thread.setName("new thread");
        System.out.println("Before starting thread inside: "+Thread.currentThread().getName());
        thread.start();
        System.out.println("After starting thread inside: "+Thread.currentThread().getName());

    }
}
