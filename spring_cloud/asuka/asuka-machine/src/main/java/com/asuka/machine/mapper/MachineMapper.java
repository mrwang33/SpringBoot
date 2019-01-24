package com.asuka.machine.mapper;

import com.asuka.machine.entity.Machine;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MachineMapper {

  int deleteByPrimaryKey(Integer machineId);

  int insert(Machine record);

  int insertSelective(Machine record);

  Machine selectByPrimaryKey(Integer machineId);

  int updateByPrimaryKeySelective(Machine record);

  int updateByPrimaryKey(Machine record);

  List<Machine> getMachinesByUserId(Integer userId);

  List<Machine> getAllMachine();
}