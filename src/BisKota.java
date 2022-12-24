import  java.util.ArrayList;
public class BisKota {

    public static int GetPassenger(ArrayList<int[]> BisKota){

        return (BisKota.get(0)[0]+ BisKota.get (1)[0] + BisKota.get(2)[0]) - (BisKota.get(0)[1] + BisKota.get(1)[1] + BisKota.get(2)[1]) ;
    }

    public static void main(String[] args) {
        ArrayList<int[]> StopGo = new ArrayList<int[]>();
        StopGo.add(new int []{3, 0});
        StopGo.add(new int []{5, 2});
        StopGo.add(new int []{4, 0});
        System.out.println(GetPassenger(StopGo));

    }
}