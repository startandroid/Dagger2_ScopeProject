package ru.startandroid.scopeproject.letters;

import dagger.Subcomponent;
import ru.startandroid.scopeproject.ActivityScope;

@ActivityScope
@Subcomponent(modules = LetterListActivityModule.class)
public interface LetterListActivityComponent {

    void injectLettersListActivity(LetterListActivity activity);

}
