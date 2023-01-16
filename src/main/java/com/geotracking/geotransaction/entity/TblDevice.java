package com.geotracking.geotransaction.entity;

import com.geotracking.geotransaction.util.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_device")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TblDevice extends AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "id_jenispajak", referencedColumnName = "id")
    @ManyToOne
    private TblJenispajak idJenispajak;

    @Column(name = "device_name")
    private String deviceName;
    

}
