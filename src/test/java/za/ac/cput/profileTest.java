package za.ac.cput;

import java.util.*;

import org.junit.jupiter.api.*;
import sun.java2d.cmm.Profile;

import static org.junit.jupiter.api.Assertions.*;

class profileTest {
    private profile name;
    private profile surname;

    void setUp()
    {
        name = new profile();
        surname = new profile();
    }

    //Collection
    //Add test case
    @Test
    void testAddCollection()
        {
           Collection profileCollection = new HashSet();

           profileCollection.add("Bonnie");
           profileCollection.add("Andy");
           profileCollection.add("Tango");
           profileCollection.add("Sihle");

            System.out.println("4 new profiles added." + profileCollection);

            assertEquals(4, profileCollection.size());
        }

    //Remove test case
    @Test
    void testRemoveCollection()
    {
        Collection profileCollection = new HashSet();

        profileCollection.add("Bonnie");
        profileCollection.add("Andy");
        profileCollection.add("Tango");
        profileCollection.add("Sihle");

        profileCollection.remove("Tango");
        profileCollection.remove("Bonnie");

        System.out.println("2 profiles removed" + profileCollection);

        assertEquals(2, profileCollection.size());
    }

    //Find test case
    @Test
    void testFindCollection()
    {
        Collection profileCollection = new HashSet();

        profileCollection.add("Bonnie");
        profileCollection.add("Andy");
        profileCollection.add("Tango");
        profileCollection.add("Sihle");

        profileCollection.contains("Sihle");

        System.out.println("Profile found is: " + profileCollection.contains("Sihle"));
        assertEquals(4, profileCollection.size());
    }

    //List
    //Add test case
    @Test
    void testAddList()
    {
        List profileList = new ArrayList();

        profileList.add("Nikiwe");
        profileList.add("Zelpha");
        profileList.add("Zelda");
        profileList.add("Sylvano");

        System.out.println("Adding 4 profiles" + profileList);
        assertEquals(4, profileList.size());

    }

    //Remove test case
    @Test
    void testRemoveList()
    {
        List profileList = new ArrayList();

        profileList.add("Nikiwe");
        profileList.add("Zelpha");
        profileList.add("Zelda");
        profileList.add("Sylvano");

        profileList.remove("Nikiwe");

        System.out.println("Removed 1 profile" + profileList);
        assertEquals(3, profileList.size());
    }

    //Find test case
    @Test
    void testFindList()
    {
        List profileList = new ArrayList();

        profileList.add("Nikiwe");
        profileList.add("Zelpha");
        profileList.add("Zelda");
        profileList.add("Sylvano");

        profileList.contains("Sylvano");

        System.out.println("Profile found is: " + profileList.contains("Sylvano"));
        assertEquals(4, profileList.size());

    }

    //Set
    //Add test case
    @Test
    void testAddSet()
    {
        Set profileSet = new HashSet();
        profileSet.add("Joshua");
        profileSet.add("Busi");
        profileSet.add("Bob");
        profileSet.add("Jesse");

        System.out.println("4 profiles added." + profileSet);

        assertEquals(4, profileSet.size());
    }

    //Remove test case
    @Test
    void testRemoveSet()
    {
        Set profileSet = new HashSet();
        profileSet.add("Joshua");
        profileSet.add("Busi");
        profileSet.add("Bob");
        profileSet.add("Jesse");

        profileSet.remove("Bob");

        System.out.println("1 profile removed" + profileSet);

        assertEquals(3, profileSet.size());
    }

    //Find test case
    @Test
    void testFindSet()
    {
        Set profileSet = new HashSet();
        profileSet.add("Joshua");
        profileSet.add("Busi");
        profileSet.add("Bob");
        profileSet.add("Jesse");

        profileSet.contains("Bob");

        System.out.println("Profile found is: " + profileSet.contains("Bob"));
        assertEquals(4, profileSet.size());


    }

    //Map
    //Add test case
    @Test
    void testAddMap()
    {
        HashMap profileMap = new HashMap<>();
        profileMap.put(5, "Handy");
        profileMap.put(8, "Mandy");
        profileMap.put(13, "Randy");
        profileMap.put(21, "Blake");
        profileMap.put(34, "Drake");

        System.out.println("5 new profiles added" + profileMap);

        assertEquals(5, profileMap.size());

    }

    //Remove test case
    @Test
    void testRemoveMap()
    {
        HashMap profileMap = new HashMap<>();
        profileMap.put(5, "Handy");
        profileMap.put(8, "Mandy");
        profileMap.put(13, "Randy");

        String Randy = (String) profileMap.remove(13);

        System.out.println("1 profile removed" + profileMap);

        assertEquals(2, profileMap.size());

    }

    //Find test case
    @Test
    void testFindMap()
    {
        HashMap profileMap = new HashMap<>();
        profileMap.put(5, "Handy");
        profileMap.put(8, "Mandy");
        profileMap.put(13, "Randy");

        boolean containsKey = profileMap.containsKey(5);

        System.out.println("Profile found is: " + profileMap.containsKey(5));

        assertEquals(3, profileMap.size());
    }


}