package p14_09_2023;

import java.util.ArrayList;

public class Zadatak3v {
    public static void main(String[] args) {
        History first = new History(new ArrayList<>());
        first.addPage(new HistoryPage("Google", "www.google.com",12,25));
        first.addPage(new HistoryPage("Facebook", "www.facebook.com",12,31));
        first.saveCredentials("Facebook","vladimir","password");
        first.addPage(new HistoryPage("Yahoo", "www.yahoo.com",13,45));
        first.addPage(new HistoryPage("Instagram", "www.instagram.com",14,18));
        first.saveCredentials("Instagram","vladimir","password");
        first.addPage(new HistoryPage("YouTube", "www.youtube.com",14,28));
        first.addPage(new HistoryPage("GitHub", "www.github.com",15,19));
        first.saveCredentials("GitHub","vladimir","password");
        first.deleteAllCredentialsLastHour(15,20);
        first.printHistory();

    }
}
