package ru.startandroid.scopeproject.account;

import ru.startandroid.scopeproject.api.ApiService;
import ru.startandroid.scopeproject.datatype.Account;

public class AccountManager {

    private ApiService apiService;

    public AccountManager(ApiService apiService) {
        this.apiService = apiService;
    }

    public Account login(String user, String password) {
        return apiService.login(user, password);
    }

}
