package skellton.android.dawidnu.org.androidskeletton.core;

/**
 * Created by Daniel on 13.11.2014.
 */
public abstract class BaseModel {

    protected Long id;
    protected Long externalId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
