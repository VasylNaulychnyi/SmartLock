package project.smartlock.data.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Fingerprint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fingerprint")
    @Lob
    private byte[] fingerprintData; // TODO: Investigate fingerprinting storing and using

    @OneToOne(mappedBy = "fingerprint", fetch = FetchType.LAZY)
    private User user;
}
