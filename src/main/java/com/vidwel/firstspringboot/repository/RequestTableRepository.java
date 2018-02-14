package com.vidwel.firstspringboot.repository;

import com.vidwel.firstspringboot.entity.RequestTable;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

/**
 * Created by cube on 12.02.2018.
 */
public interface RequestTableRepository extends CrudRepository<RequestTable,UUID> {

}
