package EjercicioNN3;


public class EjercicioReloj {

    private int Horas, Segundos, Minutos;

    public EjercicioReloj() {
        Horas = 12;
        Minutos = 00;
        Segundos = 00;
    }

    public EjercicioReloj(int h, int m, int s) {
        Horas = h;
        Minutos = m;
        Segundos = s;
    }

    public EjercicioReloj(int s) {
        Horas = s / 3600;
        s &= 3600;
        Minutos = s / 3600;
        s &= 3600;
        Segundos = s;
    }

    public void setReloj(int s) {
        Horas = s / 3600;
        s &= 3600;
        Minutos = s / 60;
        s %= 60;
        Segundos = s;

    }

    //metodo getReloj(), getMinutos(), getSegundos()
    public int getReloj() {
        return Horas;
    }

    public int getHoras() {
        return Horas;
    }

    public int getMinutos() {
        return Minutos;
    }

    public int getSegundos() {
        return Segundos;
    }

    public void setHoras(int h){
        Horas=h;
    }
    public void setMinutos(int m){
        Minutos=m;
    }
    public void setSegundos(int s){
        Segundos=s;
    }

//Metodo tick : Creo un incrementador;  

    public void tick() {
        Segundos++;
        if (Segundos == 60) {
            Segundos = 0;
            Minutos++;
            if (Minutos == 60) {
                Minutos = 0;
                Horas++;
                if (Horas == 24) {
                    Horas = 0;
                }
            }
        }
        
    }
    
    public void addReloj(EjercicioReloj r3){ 
        Horas+=r3.Horas;
        Minutos+=r3.Minutos;
        Segundos+=r3.Segundos;
        if (Segundos>=60){
            Segundos-=60;
            Minutos++;
        }
        if (Minutos>=60){
            Minutos-=60;
            Horas++;
        }
        if (Horas>=24){
            Horas-=24;
        }
    }


    public String toString(){
        return Horas+":"+Minutos+":"+Segundos;
    }
   

    public void tick2(){
        Segundos--;
        if (Segundos==-1){
            Segundos=59;
            Minutos--;
            if (Minutos==-1){
                Minutos=59;
                Horas--;
                if (Horas==-1){
                    Horas=23;
                }
            }
        }
    }
    
    
    public void restaReloj(EjercicioReloj r3){
        Horas-=r3.Horas;
        Minutos-=r3.Minutos;
        Segundos-=r3.Segundos;
        if (Segundos<0){
            Segundos+=60;
            Minutos--;
        }
        if (Minutos<0){
            Minutos+=60;
            Horas--;
        }
        if (Horas<0){
            Horas+=24;
        }
    }
    
     public static void main(String[] args){
        
        EjercicioReloj r1 = new EjercicioReloj();  
        System.out.println("horas: "+r1.Horas+" minutos: "+r1.Minutos+" segundos: "+r1.Segundos);

        EjercicioReloj r2 = new EjercicioReloj(22,10,13); 
        System.out.println("horas: "+r2.Horas+" minutos: "+r2.Minutos+" segundos: "+r2.Segundos);

        EjercicioReloj r3 = new EjercicioReloj(50000); 
        System.out.println("horas: "+r3.Horas+" minutos: "+r3.Minutos+" segundos: "+r3.Segundos);

        //llamamos al metodo setReloj para cambiar el valor en este caso por segundos
        r3.setReloj(80000);
        System.out.println("horas: "+r3.Horas+" minutos: "+r3.Minutos+" segundos: "+r3.Segundos);

        //llamamos al metodo getReloj para obtener el valor en este caso de las horas, minutos, segundos
        System.out.println("horas: "+r2.getReloj()+" minutos: "+r2.getMinutos()+" segundos: "+r2.getSegundos());

     
        r2.setHoras(10);
        r2.setMinutos(20);
        r2.setSegundos(30);
        System.out.println("horas: "+r2.Horas+" minutos: "+r2.Minutos+" segundos: "+r2.Segundos);

  
        r2.tick(); 
        System.out.println("horas: "+r2.Horas+" minutos: "+r2.Minutos+" segundos: "+r2.Segundos);

    
        r2.addReloj(r3); //sumo las horas, minutos, segundos del reloj 3
        System.out.println("horas: "+r2.Horas+" minutos: "+r2.Minutos+" segundos: "+r2.Segundos);
        
   
        System.out.println(r2.toString());

        r2.tick2();
        System.out.println("horas: "+r2.Horas+" minutos: "+r2.Minutos+" segundos: "+r2.Segundos);
        
    
        r2.restaReloj(r3); //resto las horas, minutos, segundos del reloj 3
        System.out.println("horas: "+r2.Horas+" minutos: "+r2.Minutos+" segundos: "+r2.Segundos);

        System.out.println("Hola weon");
    }
 }

