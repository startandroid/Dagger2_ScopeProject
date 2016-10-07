package ru.startandroid.scopeproject.letters;

import dagger.Module;
import dagger.Provides;
import ru.startandroid.scopeproject.ActivityScope;
import ru.startandroid.scopeproject.datatype.Folder;
import ru.startandroid.scopeproject.mail.MailManager;

@Module
public class LetterListActivityModule {

    private Folder folder;

    public LetterListActivityModule(Folder folder) {
        this.folder = folder;
    }

    @ActivityScope
    @Provides
    public Folder provideFolder() {
        return folder;
    }

    @ActivityScope
    @Provides
    public LetterListActivityPresenter provideLettersListActivityPresenter(Folder folder, MailManager mailManager) {
        return new LetterListActivityPresenter(folder, mailManager);
    }
}
