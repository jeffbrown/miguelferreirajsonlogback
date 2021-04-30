package miguelferreirajsonlogback;

import io.micronaut.http.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("/demo")
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);

    @Get(uri="/", produces="text/plain")
    public String index() {
        log.info("Test Message");
        return "Example Response";
    }
}