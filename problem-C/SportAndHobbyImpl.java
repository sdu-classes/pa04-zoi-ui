class SportAndHobbyImpl implements  PersonInterface , SportInterface , HobbyInterface{
    private String name;
    private int age;
    private String myFavoriteSport;
    private String myHobby;
    @Override
    public void setNaame(String myname) {
        name = myname;

    }

    @Override
    public void setAge(int myAge) {
        age = myAge;

    }

    @Override
    public String getMyFavoriteSport() {
        return myFavoriteSport;
    }

    @Override
    public void setMyFavoriteSport(String sportname) {
        myFavoriteSport = sportname;

    }

    @Override
    public int howMuchItCostToPlayThisSport() {
       return age *10;
    }

    @Override
    public String whatIsMyHobby() {
        return myHobby;
    }

    @Override
    public void setMyHobby(String hobby) {
        myHobby = hobby;

    }

    @Override
    public String toString() {
        return "SportAndHobbyImpl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", myFavoriteSport='" + myFavoriteSport + '\'' +
                ", myHobby='" + myHobby + '\'' +
                 " cost =  " + howMuchItCostToPlayThisSport() + '}';
    }
}

