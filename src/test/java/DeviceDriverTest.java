
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

public class DeviceDriverTest {

    @Test
    public void read_From_Hardware() {
        // TODO: replace hardware with a Test Double
        FlashMemoryDevice hardware = null;
        DeviceDriver driver = new DeviceDriver(hardware);
        byte data = driver.read(0xFF);
        assertEquals(0, data);
    }

}
