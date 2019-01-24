package com.asuka.machine.controller;

import com.asuka.common.RestResponse;
import com.asuka.machine.entity.Machine;
import com.asuka.machine.remote.UserRemote;
import com.asuka.machine.service.MachineService;
import com.asuka.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MachineController {

  @Autowired
  private UserRemote userRemote;
  @Autowired
  private MachineService machineService;

  @RequestMapping(value = "/machine", method = RequestMethod.POST)
  public RestResponse<List<Machine>> getAll(User user) {
    List<Machine> all = machineService.getAll();
    userRemote.save(user);
    return RestResponse.success(all);
  }

}
