package org.launchcode.techjobs.oo.test;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Test;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;
/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

@Test
    public void testJobConstructorSetsAllFields(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertTrue(job.getName() instanceof String);
    assertTrue(job.getEmployer() instanceof Employer);
    assertTrue(job.getLocation() instanceof Location);
    assertTrue(job.getPositionType() instanceof PositionType);
    assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
    assertEquals(job.getName() , "Product tester");
    assertEquals(job.getEmployer().getValue() , "ACME");
    assertEquals(job.getLocation().getValue() , "Desert");
    assertEquals(job.getPositionType().getValue() , "Quality control");
    assertEquals(job.getCoreCompetency().getValue() , "Persistence");
}

@Test
    public void testJobsForEquality(){
    Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertFalse(job1.equals(job2));
}

@Test
    public void testToStringStartsAndEndsWithNewLine(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals(job.toString().charAt(0), '\n');
    assertEquals(job.toString().charAt(job.toString().length()-1), '\n');
}

@Test
    public void testToStringContainsCorrectLabelsAndData(){
    Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals(job.toString(), "\nID: 4\n" +
            "Name: Product tester\n" +
            "Employer: ACME\n" +
            "Location: Desert\n" +
            "Position Type: Quality control\n" +
            "Core Competency: Persistence\n");
}

@Test
    public void testToStringHandlesEmptyField(){
    Job job = new Job("Product tester", null , new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    assertEquals(job.toString(), "\nID: 3\n" +
            "Name: Product tester\n" +
            "Employer: Data not available\n" +
            "Location: Desert\n" +
            "Position Type: Quality control\n" +
            "Core Competency: Persistence\n");
}
}
