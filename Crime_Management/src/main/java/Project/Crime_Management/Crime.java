package Project.Crime_Management;
import javax.persistence.*;

@Entity
public class Crime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "station_id")
    private CrimeStation station;

    private String dateAndPlace;
    private String description;
    private String victims;
    private String crimeDetails;
    private String mainSuspects;
    
    // Constructor
    public Crime() {
    }

    // Getter and setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CrimeStation getStation() {
        return station;
    }

    public void setStation(CrimeStation station) {
        this.station = station;
    }

    public String getDateAndPlace() {
        return dateAndPlace;
    }

    public void setDateAndPlace(String dateAndPlace) {
        this.dateAndPlace = dateAndPlace;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVictims() {
        return victims;
    }

    public void setVictims(String victims) {
        this.victims = victims;
    }

    public String getCrimeDetails() {
        return crimeDetails;
    }

    public void setCrimeDetails(String crimeDetails) {
        this.crimeDetails = crimeDetails;
    }

    public String getMainSuspects() {
        return mainSuspects;
    }

    public void setMainSuspects(String mainSuspects) {
        this.mainSuspects = mainSuspects;
    }
}
