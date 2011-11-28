package whiteship.init;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import whiteship.config.AppConfig;

import javax.sql.DataSource;

/**
 * @author: keesunbaik
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class QueryDslInitializer {

    @Autowired DataSource dataSource;

    @Test
    public void di(){

    }

}
