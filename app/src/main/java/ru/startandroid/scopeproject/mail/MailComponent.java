package ru.startandroid.scopeproject.mail;

import dagger.Subcomponent;
import ru.startandroid.scopeproject.folders.FolderListActivityComponent;
import ru.startandroid.scopeproject.letters.LetterListActivityComponent;
import ru.startandroid.scopeproject.letters.LetterListActivityModule;

@MailScope
@Subcomponent(modules = MailModule.class)
public interface MailComponent {

    FolderListActivityComponent createFoldersListActivityComponent();

    LetterListActivityComponent createLetterListActivityComponent(LetterListActivityModule letterListActivityModule);

}
