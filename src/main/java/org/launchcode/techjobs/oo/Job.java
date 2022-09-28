package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        StringBuilder  result= new StringBuilder("\n");
        result.append("ID: "+id +"\n");
        if(name != null && !name.isEmpty()) {
            result.append("Name: "+name +"\n");
        } else{
            result.append("Name: Data not available\n");
        }
        if(employer != null && !employer.getValue().isEmpty()) {
            result.append("Employer: "+employer.getValue() +"\n");
        } else{
            result.append("Employer: Data not available\n");
        }
        if(location != null && !location.getValue().isEmpty()) {
            result.append("Location: "+location.getValue() +"\n");
        } else{
            result.append("Location: Data not available\n");
        }
        if(positionType != null && !positionType.getValue().isEmpty()) {
            result.append("Position Type: "+positionType.getValue() +"\n");
        } else{
            result.append("Position Type: Data not available\n");
        }
        if(coreCompetency != null  && !coreCompetency.getValue().isEmpty()) {
            result.append("Core Competency: "+coreCompetency.getValue() +"\n");
        } else{
            result.append("Core Competency: Data not available\n");
        }
        return result.toString();
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public Employer getEmployer() { return employer; }

    public void setEmployer(Employer employer) { this.employer = employer; }

    public Location getLocation() { return location; }

    public void setLocation(Location location) { this.location = location; }

    public PositionType getPositionType() { return positionType; }

    public void setPositionType(PositionType positionType) { this.positionType = positionType; }

    public CoreCompetency getCoreCompetency() { return coreCompetency; }

    public void setCoreCompetency(CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }

    public int getId() { return id; }
}

