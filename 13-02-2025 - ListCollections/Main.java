
public class Main {

    public static void main(String[] args) {
        ArrList a= new ArrList();
        Linklist l=new Linklist();
        Vectorlists v=new Vectorlists();
        Stacklists s=new Stacklists();

        new Thread(){
            public void run(){a.arrayList();}
        }.start();

        new Thread(){
            public void run(){l.linklist();}
        }.start();

        new Thread(){
            public void run(){v.vectorlists();}
        }.start();

        new Thread(){
            public void run(){s.stacklists();}
        }.start();
    }
}

