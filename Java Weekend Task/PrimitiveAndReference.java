public class ValueVsReference {
    public static void updateData(int primitiveVar, int[] arrayData) {
        primitiveVar += 20;
        arrayData[0] += 20;
    }

    public static void main(String[] args) {
        int primitiveVar = 8;
        int[] arrayData = { 8, 16, 24 };

        System.out.println("Before modification: primitiveVar = " + primitiveVar + ", arrayData[0] = " + arrayData[0]);
        updateData(primitiveVar, arrayData);
        System.out.println("After modification: primitiveVar = " + primitiveVar + ", arrayData[0] = " + arrayData[0]);
    }
}
