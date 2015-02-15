package net.catosplace.twitter;

import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Created by psellars on 15/02/15.
 */
public class TwitterListService extends Service<TwitterListConfiguration> {

    public static void main(String[] args) throws Exception {
        new TwitterListService().run(args);
    }

    @Override
    public void initialize(Bootstrap<TwitterListConfiguration> bootstrap) {

    }

    @Override
    public void run(TwitterListConfiguration configuration, Environment environment) throws Exception {

    }
}
