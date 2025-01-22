import org.junit.Test;

import static org.junit.Assert.*;


    public class MyListTest {

        @Test
        public void newList_isEmptyTest() {
            MyList strings = new MyList();
            assertTrue(strings.isEmpty());
        }

        @Test
        public void addStringToList_ListIsNotEmptyTest() {
            MyList strings = new MyList();
            strings.add("g-strings");
            assertFalse(strings.isEmpty());
        }

        @Test
        public void addStringRemoveStringFromMyList_myListIsEmptyTest() {
            MyList strings = new MyList();
            strings.add("g-strings");
            assertFalse(strings.isEmpty());

            strings.remove("g-strings");
            assertTrue(strings.isEmpty());
        }

        @Test
        public void addStringToMyList_sizeIsOneTest() {
            MyList strings = new MyList();
            //assertEquals(0, strings.size());
            strings.add("g-strings");
            assertEquals(1, strings.size());
        }


    }


}