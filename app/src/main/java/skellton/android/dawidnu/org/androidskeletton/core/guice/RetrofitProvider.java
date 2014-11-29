package skellton.android.dawidnu.org.androidskeletton.core.guice;

import android.content.res.Resources;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.TypeLiteral;

import java.lang.reflect.ParameterizedType;

import retrofit.RestAdapter;
import skellton.android.dawidnu.org.androidskeletton.R;
import skellton.android.dawidnu.org.androidskeletton.core.BaseRestService;

import static skellton.android.dawidnu.org.androidskeletton.R.string.base_http_url;

/**
 * Created by Daniel on 13.11.2014.
 */
public class RetrofitProvider<T> implements Provider {

    @Inject
    private Resources resources;

    @Override
    public T get() {
        Class<T> clazz = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];

        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(resources.getString(base_http_url) + "/" + clazz.getName().toLowerCase())
                .build();
        return restAdapter.create(clazz);
    }
}
