public class Lasagna {
    public int expectedMinutesInOven(){
        int mins = 40;
        return mins;
    }

    public int remainingMinutesInOven(int x){
        return expectedMinutesInOven() - x;
    }

    public int preparationTimeInMinutes(int x){
        return x*2;
    }

    public int totalTimeInMinutes(int x, int y){
        return preparationTimeInMinutes(x)+y;
    }
}
