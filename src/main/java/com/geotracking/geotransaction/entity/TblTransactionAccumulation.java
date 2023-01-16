package com.geotracking.geotransaction.entity;

import com.geotracking.geotransaction.util.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "tbl_transaction_accumulation")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TblTransactionAccumulation extends AuditEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Column(name = "total_accumulation_monthly")
    private Long totalAccumulationMonthly;

    @Column(name = "total_accumulation_yearly")
    private Long totalAccumulationYearly;

    @JoinColumn(name = "id_device", referencedColumnName = "id")
    @ManyToOne
    private TblDevice idDevice;
    
}
