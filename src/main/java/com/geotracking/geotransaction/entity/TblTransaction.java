package com.geotracking.geotransaction.entity;

import com.geotracking.geotransaction.util.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tbl_transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TblTransaction extends AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Column(name = "total")
    private Integer total;

    @Column(name = "lat")
    private Long lat;

    @Column(name = "lon")
    private Long lon;

    @JoinColumn(name = "id_device", referencedColumnName = "id")
    @ManyToOne
    TblDevice idDevice;

    @Column(name = "transaction_at")
    LocalDateTime transactionAt;

    @Column(name = "address")
    private String address;
}
