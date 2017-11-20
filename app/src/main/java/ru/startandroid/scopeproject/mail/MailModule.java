package ru.startandroid.scopeproject.mail;

import android.util.Log;

import dagger.Module;
import dagger.Provides;
import ru.startandroid.scopeproject.api.ApiService;
import ru.startandroid.scopeproject.datatype.Account;

@Module
public class MailModule {

    private Account account;

    public MailModule(Account account) {
        this.account = account;
    }

    @Provides
    public Account provideAccount() {
        return account;
    }

    @Provides
    @MailScope
    MailManager provideMailManager(Account account, ApiService apiService) {
        return new MailManager(account, apiService);
    }
}
