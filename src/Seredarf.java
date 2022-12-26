public class Seredarf {

static void function(int a, int z,int y){
    System.out.println("середнє арифметичне ");
    System.out.println((a+z+y)/3);

}

static void function(double a, double z,double y){
   //max
    if (a>z && a>y) {
        System.out.println("Max number "+ a);
    } else if (z>a && z>y) {
        System.out.println("Max number "+z);

    }else {
        System.out.println("Max number "+y);
    }}

    static void function(float a, float z,float y){
    //min
    if(a<y && a<z){
        System.out.println("min number "+a);
    }else if(y<a && y<z){
        System.out.println("min number "+y);
    }else {
        System.out.println("min number "+z);
    }
}



    public static void main(String[] args) {
function(3,4,5);
function(3.0,4.0,5.0);
function(3f,4f,5f);
    }

}
