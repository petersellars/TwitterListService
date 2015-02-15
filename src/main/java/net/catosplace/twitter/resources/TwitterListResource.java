package net.catosplace.twitter.resources;

import com.yammer.metrics.annotation.Timed;
import net.catosplace.twitter.core.TwitterList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by psellars on 15/02/15.
 */
@Path("/lists")
@Produces(MediaType.APPLICATION_JSON)
public class TwitterListResource {

    private final String template;
    private final AtomicLong counter;

    public TwitterListResource(String template) {
        this.template = template;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public TwitterList getTwitterLists() {
        final String value = String.format(template);
        return new TwitterList(counter.incrementAndGet());
    }
}
