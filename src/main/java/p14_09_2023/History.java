package p14_09_2023;

import java.util.ArrayList;

public class History {
    private ArrayList<HistoryPage> pages = new ArrayList<>();

    public History(ArrayList<HistoryPage> pages) {
        this.pages = pages;
    }

    public void addPage(HistoryPage page){
        this.pages.add(page);
    }
    public void deleteByLink (String pageLink){
        for (int i = 0; i < this.pages.size(); i++) {
            if (this.pages.get(i).getPageLink().equals(pageLink)){
                this.pages.remove(this.pages.get(i));
            }
        }
    }
    public void deleteHistory(){
        for (int i = 0; i < this.pages.size(); i++) {
            this.pages.remove(i);
        }
    }
    public void saveCredentials(String pageName, String username, String password){
        for (int i = 0; i < this.pages.size(); i++) {
            if (this.pages.get(i).getPageName().equals(pageName)){
                this.pages.get(i).saveCredentials(username,password);
            }
        }
    }
    public void deleteAllCredentials (){
        for (int i = 0; i < this.pages.size(); i++) {
            if (this.pages.get(i).getUsername() != null || this.pages.get(i).getPassword() != null){
                this.pages.get(i).saveCredentials(null,null);
            }
        }
    }
    public void deleteAllCredentialsLastHour (int hour, int minute){
        int totalMinutes= hour*60 + minute;
        for (int i = 0; i < this.pages.size(); i++) {
            int total = this.pages.get(i).getOpenHour() * 60 + this.pages.get(i).getOpenMinute();
           if (total > totalMinutes-60){
               this.pages.get(i).saveCredentials(null,null);
           }
        }
    }
    public void printHistory(){
        for (int i = 0; i < this.pages.size(); i++) {
            this.pages.get(i).printPage();
        }
    }

    public ArrayList<HistoryPage> getPages() {
        return pages;
    }
}
