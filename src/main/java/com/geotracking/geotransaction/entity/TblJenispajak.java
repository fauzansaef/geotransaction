package com.geotracking.geotransaction.entity;

import com.geotracking.geotransaction.util.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_jenispajak")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TblJenispajak extends AuditEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Column(name = "nama_jenispajak")
    private String namaJenispajak;
}
