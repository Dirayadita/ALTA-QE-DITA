public class Mean {
    private static float Mean(float[] number){
        float total = 0;
        int i;
        for (i = 0; i < number.length; i++){
            total = total + number[i];

        }
        return total/ number.length;
    }

    public static void main(String[] args) {
        float[] value = {2, 2, 2, 2};
        System.out.println(Mean(value));
    }
}