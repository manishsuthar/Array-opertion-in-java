
public class AddDetails {
	DbHandler dbh = new DbHandler();
    public String AddNewDetails(AddInfomation info){
        String address = info.getAddress();
        String city = info.getCity();
        String state = info.getState();
        String propertyType = info.getPropertyType();
        boolean parking = info.getParking();
        boolean transport = info.getTransport();
        String description = info.getDescription();
        String ctname = info.getCtname();
        String ctphone = info.getCtphone();
        String ctemail = info.getCtemail();
        String profileimage = info.getProfileimage();
        String image1 = info.getImage1();
        String image2 = info.getImage2();
        String image3 = info.getImage3();
        String image4 = info.getImage4();
        int price = info.getprice();
        String date = info.getDate();
        String sql = "INSERT INTO `details`(`date`, `address`, `city`, `state`, `type`, `parking`, `station`, `description`, `ctname`, `ctemail`, `ctphone`, `profileImage`, `image1`, `image2`, `image3`, `image4`,`price`)";
                sql +="VALUES ('"+date+"','"+address+"','"+city+"','"+state+"','"+propertyType+"',"+parking+","+transport+",'"+description+"','"+ctname+"','"+ctemail+"','"+ctphone+"','"+profileimage+"','"+image1+"','"+image2+"','"+image3+"','"+image4+"',"+price+")";
        System.out.print(sql);
        boolean res = dbh.DbInsert(sql);
       	if(res) {
       		return "Success";
       	}else {
       		return "Failed";
       	}

    }
}
