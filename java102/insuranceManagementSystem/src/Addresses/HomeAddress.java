package Addresses;

public class HomeAddress extends AddressId implements Address<HomeAddress>{
    private int addressId;
    private String city;
    private String district;
    private String street;
    private String addressDetails;

    public HomeAddress (String city, String district, String street, String addressDetails) {
        this.addressId= AddressId.id;
        this.city = city;
        this.district = district;
        this.street = street;
        this.addressDetails = addressDetails;
    }

    @Override
    public void showAddressInfo(){
        System.out.println("Ev adresi :");
        System.out.println("Id : "+this.getAddressId()+"- Şehir : "+this.getCity()+", İlçe : "+this.getDistrict()+", Sokak  : "+this.getStreet());
        System.out.println("Detaylı Adres : "+this.getAddressDetails());
    }

    public int getAddressId() {
        return addressId;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
