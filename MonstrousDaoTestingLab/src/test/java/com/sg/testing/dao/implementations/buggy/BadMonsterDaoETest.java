/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.testing.dao.implementations.buggy;

import com.sg.testing.model.Monster;
import com.sg.testing.model.MonsterType;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author gavinlinnihan
 */
public class BadMonsterDaoETest {
    
    BadMonsterDaoE testDao;
    Map<Integer, Monster> monsters = new HashMap<>();

    @BeforeEach
    public void setUp() {

        testDao = new BadMonsterDaoE();
    }

    @Test
    public void testAddMonster() throws Exception {
        int id1 = 1;
        Monster monster1 = new Monster();
        monster1.setName("Wolfie");
        monster1.setType(MonsterType.WEREWOLF);
        monster1.setFavoriteFood("Tacos");
        monster1.setPeopleEaten(0);

        testDao.addMonster(id1, monster1);
        Monster addedMonster = testDao.getMonster(id1);
        
        Monster monster2 = new Monster();
        monster2.setName("Muck");
        monster2.setType(MonsterType.SWAMPTHING);
        monster2.setFavoriteFood("Kelp");
        monster2.setPeopleEaten(5);
        testDao.addMonster(id1, monster2);

        //assert
        assertEquals(addedMonster.getName(), monster1.getName(), "This should be Wolfie");
        assertEquals(addedMonster.getFavoriteFood(), monster1.getFavoriteFood(), "This should be tacos");
        assertEquals(addedMonster.getPeopleEaten(), monster1.getPeopleEaten(), "This should be 0");
        assertEquals(addedMonster.getType(), monster1.getType(), "This should be WEREWOLF");
   
       
    }

    @Test
    public void testGetAllMonsters() throws Exception {
        int id1 = 1;
        Monster monster1 = new Monster();
        monster1.setName("Wolfie");
        monster1.setType(MonsterType.WEREWOLF);
        monster1.setFavoriteFood("Tacos");
        monster1.setPeopleEaten(0);

        int id2 = 2;
        Monster monster2 = new Monster();
        monster2.setName("Muck");
        monster2.setType(MonsterType.SWAMPTHING);
        monster2.setFavoriteFood("Kelp");
        monster2.setPeopleEaten(5);

        testDao.addMonster(id1, monster1);
        testDao.addMonster(id2, monster2);

        List<Monster> monsterList = testDao.getAllMonsters();
        assertNotNull(monsterList, "The list should not be empty");
        assertEquals(2, monsterList.size(), "The list should have 2 monsters");

        assertTrue(monsterList.contains(monster1), "Wolfie should be in the list");
        assertTrue(monsterList.contains(monster2), "Muck should be in the list");
    }

    @Test
    public void testRemoveMonster() throws Exception {
        int id1 = 1;
        Monster monster1 = new Monster();
        monster1.setName("Wolfie");
        monster1.setType(MonsterType.WEREWOLF);
        monster1.setFavoriteFood("Tacos");
        monster1.setPeopleEaten(0);

        int id2 = 2;
        Monster monster2 = new Monster();
        monster2.setName("Muck");
        monster2.setType(MonsterType.SWAMPTHING);
        monster2.setFavoriteFood("Kelp");
        monster2.setPeopleEaten(5);

        testDao.addMonster(id1, monster1);
        testDao.addMonster(id2, monster2);

        Monster removedMonster = testDao.removeMonster(id1);
        List<Monster> monsterList = testDao.getAllMonsters();

        assertNotNull(monsterList, "List should not be null");
        assertEquals(1, monsterList.size(), "List should have 1 monster");

        assertFalse(monsterList.contains(monster1), "List should not include Wolfie");
        assertTrue(monsterList.contains(monster2), "List should include Muck");

        removedMonster = testDao.removeMonster(id2);
        assertEquals(monster2, removedMonster, "Muck was removed");

        monsterList = testDao.getAllMonsters();

        assertTrue(monsterList.isEmpty(), "The list should be empty");
        Monster findMonster = testDao.getMonster(id1);
        assertNull(findMonster, "Wolfie has been removed");
        findMonster = testDao.getMonster(id2);
        assertNull(findMonster, "Muck has been removed");

    }

    @Test
    public void testEditMonster() throws Exception {
        int id1 = 1;
        Monster monster1 = new Monster();
        monster1.setName("Wolfie");
        monster1.setType(MonsterType.WEREWOLF);
        monster1.setFavoriteFood("Tacos");
        monster1.setPeopleEaten(0);

        testDao.addMonster(id1, monster1);
        assertEquals(monster1.getName(), "Wolfie", "monster1 should be Wolfie");

        monster1.setName("Doggo");
        testDao.updateMonster(id1, monster1);

        assertEquals(monster1.getName(), "Doggo", "monster1 should be Doggo");

    }
    
    @Test
    public void testGetMonster() throws Exception {
        int id1 = 1;
        Monster monster1 = new Monster();
        monster1.setName("Wolfie");
        monster1.setType(MonsterType.WEREWOLF);
        monster1.setFavoriteFood("Tacos");
        monster1.setPeopleEaten(0);
        testDao.addMonster(id1, monster1);
        
        Monster retrieveMonster = testDao.getMonster(id1);
        
        Monster retrievedTwice = testDao.getMonster(id1);
        assertEquals(retrieveMonster,retrievedTwice);
    }
}

//the getMonster removes the monster from the Map. so if the monster is retrieved
//again with getMonster, it won't exist!
