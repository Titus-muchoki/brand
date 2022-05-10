public class brand {
    int modelYear;
    String modelType;
    public brand(int year, String type) {
        modelYear = year;
        modelType= type;
    }
    public static void main(String[] args) {
        brand myObj = new brand(2022,"xdrive 40i");
        System.out.println(myObj.modelType + " " + myObj.modelYear);

    }
}
