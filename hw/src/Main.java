public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(578954321, "iPhone");
        Phone phone2 = new Phone();
        Phone phone3 = new Phone(887462496, "Xiaomi");
        phone2.setModel("Huawei");
        phone2.setNumber(997451361);
        phone2.setWeight(150);
        phone3.setWeight(230);
        phone1.setWeight(300);
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());
        phone1.reciveCall("Ivan");
        phone2.reciveCall("Valera");
        phone3.reciveCall("Iryna");
    }
}
