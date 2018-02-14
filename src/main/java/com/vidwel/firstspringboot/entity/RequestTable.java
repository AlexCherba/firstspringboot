package com.vidwel.firstspringboot.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by cube on 12.02.2018.
 */
@Entity
@Table(name = "request_table")
@Getter
@Setter
@NoArgsConstructor
public class RequestTable {
    @Id
    @GenericGenerator(name = "uuid-gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid-gen")
    @Column(name = "request_id")
    private UUID requestId;

    @Column(name = "request_number")
    private int requestNumber;

    @Column(name = "real_number")
    private int realNumber;
}
