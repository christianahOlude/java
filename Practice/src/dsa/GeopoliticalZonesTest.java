import Zones.GeopoliticalZones;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeopoliticalZonesTest {
    @Test
    public void testSameGeopoliticalZones() {
        var zone = GeopoliticalZones.NORTH_CENTRAL;
        var newZone = GeopoliticalZones.NORTH_CENTRAL;
        assertSame(zone, newZone);
        //assertEquals(newZone, zone);
    }
    @Test
    public void testStatesInGeopoliticalZones() {
        var zone = GeopoliticalZones.NORTH_CENTRAL;
        assertArrayEquals(new String[] {"Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau" }, zone.getStates());
    }

}