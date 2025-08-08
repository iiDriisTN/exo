public class Lasagna {
    public int expectedMinutesInOven(){
        int mins = 40;
        return mins;
    }

    public int remainingMinutesInOven(int x){
        return 40 - x;
    }

    public int preparationTimeInMinutes(int x){
        return x*2;
    }

    public int totalTimeInMinutes(int x, int y){
        int layerstime =x*2;
        return x*2+y;
    }
}
