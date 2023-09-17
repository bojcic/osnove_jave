package p14_09_2023;

public class HistoryPage {
    private String pageName;
    private String pageLink;
    private int openHour;
    private int openMinute;
    private String username;
    private String password;

    public HistoryPage(String pageName, String pageLink, int openHour, int openMinute) {
        this.pageName = pageName;
        this.pageLink = pageLink;
        this.openHour = openHour;
        this.openMinute = openMinute;
    }
    public void saveCredentials (String username, String password){
        this.username=username;
        this.password=password;
    }
    public void deleteCredentials (){
        this.username=null;
        this.password=null;
    }

    public void printPage(){
        System.out.print(this.openHour + " - " + this.openMinute + " - " + this.pageName + " - " + this.pageLink);
        if (this.username != null && this.password != null){
            System.out.println("* u: " + this.username + " p: " + this.password);
        }else {
            System.out.println();
        }

    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageLink() {
        return pageLink;
    }

    public void setPageLink(String pageLink) {
        this.pageLink = pageLink;
    }

    public int getOpenHour() {
        return openHour;
    }

    public void setOpenHour(int openHour) {
        this.openHour = openHour;
    }

    public int getOpenMinute() {
        return openMinute;
    }

    public void setOpenMinute(int openMinute) {
        this.openMinute = openMinute;
    }
}
