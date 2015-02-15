package net.catosplace.twitter.core;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by psellars on 15/02/15.
 */
public class TwitterList {

    private long id;

    public TwitterList() {
        // Jackson deserialization
    }

    public TwitterList(long id) {
        this.id = id;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

}
