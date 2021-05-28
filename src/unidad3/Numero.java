package unidad3;

public class Numero {
    
    int num;
    
    public Numero(int num){
        this.num = num;
    }
    
    public int getNum(){
        return num;
    }
     public void setNum(int a){
         num = a;
     }
     
     @Override
     public String toString(){
         return "Número: " + String.valueOf(num);
     }
}
