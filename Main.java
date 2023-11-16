public class Main {
    public static void main(String[] args){
        Kert kert=new Kert(new Virág[]{new Virág(3),new Virág(6)},new Fa[]{new Fa(8),new Fa(12)});
        kert.kertallapot();
        kert.ontoz(10);
        kert.kertallapot();
    }
}