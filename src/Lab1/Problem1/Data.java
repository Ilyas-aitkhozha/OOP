package Lab1.Problem1;

public class Data {
    private double sum;
    private double max;
    private int count;

    public Data(){
        sum = 0.0;
        max = 0.0;
        count = 0;
    }
    public void add(double value){
        if (count==0){
            max = value;
        }
        else if(value>max){
            max = value;

        }
        sum+=value;
        count++;
    }

    public double getAvg(){
        if (count == 0){
            return 0.0;
        }
        return sum/count;
    }
    public double getMax(){
        if (count == 0){
            return 0.0;
        }
        return max;
    }
}
