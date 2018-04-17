package com.asuka.machine.service.impl;

import com.asuka.machine.entity.Machine;
import com.asuka.machine.mapper.MachineMapper;
import com.asuka.machine.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class MachineServiceImpl implements MachineService {
    @Autowired
    private MachineMapper machineMapper;

    @Override
    public List<Machine> getMachineByUserId(Integer userId) {
        return machineMapper.getMachinesByUserId(userId);
    }

    @Override
    public List<Machine> getAll() {
        return machineMapper.getAllMachine();
    }

    @Override
    public Machine getById(Serializable serializable) {
        return null;
    }

    @Override
    public int save(Machine machine) {
        return 0;
    }

    @Override
    public int update(Machine machine) {
        return 0;
    }

    @Override
    public int delete(Serializable serializable) {
        return 0;
    }
}
