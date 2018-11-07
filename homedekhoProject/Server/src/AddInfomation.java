/**
 * Created by Manish on 10/30/2018.
 */
public class AddInfomation {
    CommonFunction cf = new CommonFunction();
    private String address;
    private String city;
    private String state;
    private String propertyType;
    private boolean parking;
    private boolean transport;
    private String description;
    private String ctname;
    private String ctphone;
    private String ctemail;
    private String profileimage;
    private String image1;
    private String image2;
    private String image3;
    private String image4;
    private String date;
    private int price;
    public void setAddress(String address){
        this.address = address;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setPropertyType(String propertyType){
        this.propertyType = propertyType;
    }
    public void setParking(boolean parking){
        this.parking = parking;
    }
    public void setTransport(boolean transport){
        this.transport = transport;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setCtname(String ctname){
        this.ctname = ctname;
    }
    public void setCtphone(String ctphone){
        this.ctphone = ctphone;
    }
    public void  setCtemail(String ctemail){
        this.ctemail = ctemail;
    }
    public void  setProfileimage(String profileimage){
        this.profileimage = profileimage;
    }
    public void  setImage1(String image1){
        this.image1 = image1;
    }
    public void  setImage2(String image2){
        this.image2 = image2;
    }
    public void  setImage3(String image3){
        this.image3 = image3;
    }
    public void  setImage4(String image4){
        this.image4 = image4;
    }
    public void  setPrice(int price){
        this.price = price;
    }
    public String getAddress(){
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getPropertyType(){
        return propertyType;
    }
    public boolean getParking(){
        return parking;
    }
    public boolean getTransport(){
        return transport;
    }
    public String getDescription(){
        return description;
    }
    public String getCtname(){
        return ctname;
    }
    public String getCtphone(){
        return ctphone;
    }
    public String  getCtemail(){
        return ctemail;
    }
    public String  getProfileimage(){
        return profileimage;
    }
    public String  getImage1(){
        return image1;
    }
    public String  getImage2(){
        return image2;
    }
    public String  getImage3(){
        return image3;
    }
    public int  getprice(){
        return price;
    }
    public String getImage4(){ return image4;}
    public String getDate(){ return cf.getCurrentDate();}
}
