package ru.startandroid.scopeproject.mail;

import java.util.List;

import ru.startandroid.scopeproject.api.ApiService;
import ru.startandroid.scopeproject.datatype.Account;
import ru.startandroid.scopeproject.datatype.Folder;
import ru.startandroid.scopeproject.datatype.Letter;

public class MailManager {

    private Account account;
    private ApiService apiService;

    public MailManager(Account account, ApiService apiService) {
        this.account = account;
        this.apiService = apiService;
    }

    public List<Folder> getFolders() {
        return apiService.getFolders(account);
    }

    public List<Letter> getLetters(Folder folder) {
        return apiService.getLetters(folder);
    }
}
