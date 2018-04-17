package com.asuka.machine.service;

import com.asuka.machine.entity.Machine;
import com.asuka.service.BaseService;

import java.util.List;

public interface MachineService extends BaseService<Machine> {

    List<Machine> getMachineByUserId(Integer userId);
}
