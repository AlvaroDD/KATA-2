package kata2;

public class Example {
    public static void main(String[] args) {
        Integer[] array = {1,4,9,10,3,2,2,1,8,1,3};
        String[] array2 = {"Alexis","Alvaro","Ana","Roberto","Juan","Jose","Jose","Juan","Daniel","Ana","Ana"};
        
        Histogram<Integer> histogram = HistagramBuilder.computeHistogram(array);
        System.out.println(histogram.toString());
        System.out.println("");
        Histogram<String> histogram2 = HistagramBuilder.computeHistogram(array2);
        System.out.println(histogram2.toString());
    }
}
