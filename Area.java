public class Area {
    int a;
    int b;
    int c;
    void area (){
        double p = (a+b+c)/2;
        double s = p * (p-a) * (p-b) * (p-c);
        System.out.println("Uch burchtuktun ayanty " + " \n" + " S =  " + Math.sqrt(s));
    }

}
