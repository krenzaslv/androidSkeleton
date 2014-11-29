package skellton.android.dawidnu.org.androidskeletton.core.guice;

import com.google.inject.AbstractModule;
import com.google.inject.TypeLiteral;

import skellton.android.dawidnu.org.androidskeletton.core.BaseRestService;
import skellton.android.dawidnu.org.androidskeletton.core.user.User;

/**
 * Created by Daniel on 13.11.2014.
 */
public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(new TypeLiteral<BaseRestService<Class>>(){}).toProvider(new RetrofitProvider<Class>().get());
    }
}
