package Addresses;

import java.util.ArrayList;
import java.util.Scanner;
import UserOperations.User;
public class AddressManager {
    private static Scanner input = new Scanner(System.in);

    public static void addAddress(User user){
        Address newAddress;
        System.out.println("Yeni adres ekleme alanı");
        System.out.println("1 - Ev Adresi");
        System.out.println("2 - İş Adresi");
        System.out.println("Adres seçimini giriniz : ");
        int address = input.nextInt();

// Consume the newline character
        input.nextLine();

        System.out.println("Şehir giriniz :");
        String city = input.nextLine();

        System.out.println("İlçeyi yazınız :");
        String district = input.nextLine();

        System.out.println("Sokak giriniz : ");
        String street = input.nextLine();
        System.out.println("Detaylı adresi yazınız :");
        String detailAddress = input.nextLine();

        if (address == 1){
            newAddress = new HomeAddress(city ,district ,street ,detailAddress);
        }else {
            newAddress = new BusinessAddress(city, district, street, detailAddress);
        }
        user.setAddressList(newAddress);
    }
    public static void deleteAddress(User user, int id) {
        ArrayList<Address> addressList = user.getAddressList();
        if (id >= 1 && id <= addressList.size()) {
            addressList.remove(id - 1);
            System.out.println("Silme işlemi gerçekleşti.");
        } else {
            System.out.println("Geçersiz adres numarası.");
        }
    }

}
