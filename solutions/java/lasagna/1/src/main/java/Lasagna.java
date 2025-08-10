public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int mins = 40;
        return mins;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int x){
        return 40 - x;
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int x){
        return x*2;
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int x, int y){
        int layerstime =x*2;
        return layerstime+y;
    }
}
