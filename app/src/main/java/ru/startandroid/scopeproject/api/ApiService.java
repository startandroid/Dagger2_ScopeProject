package ru.startandroid.scopeproject.api;

import java.util.ArrayList;
import java.util.List;

import ru.startandroid.scopeproject.datatype.Account;
import ru.startandroid.scopeproject.datatype.Folder;
import ru.startandroid.scopeproject.datatype.Letter;

public class ApiService {

    public Account login(String user, String password) {
        // some code to get account data from server
        // ...
        return generateFakeAccount();
    }

    public List<Folder> getFolders(Account account) {
        // some code to get account's folders data from server
        // ...
        return generateFakeFolders();
    }

    public List<Letter> getLetters(Folder folder) {
        // some code to get folder's letters data from server
        // ...
        return generateFakeLetters();
    }

    private Account generateFakeAccount() {
        return new Account();
    }

    private List<Folder> generateFakeFolders() {
        List<Folder> folders = new ArrayList<>();
        folders.add(new Folder("Inbox"));
        folders.add(new Folder("Sent"));
        folders.add(new Folder("Starred"));
        folders.add(new Folder("Drafts"));
        return folders;
    }

    private List<Letter> generateFakeLetters() {
        List<Letter> letters = new ArrayList<>();
        letters.add(new Letter("Subject 1"));
        letters.add(new Letter("Subject 2"));
        letters.add(new Letter("Subject 3"));
        letters.add(new Letter("Subject 4"));
        return letters;
    }

}
