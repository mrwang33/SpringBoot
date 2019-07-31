package com.yukino.tools.service;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.yukino.common.utils.ConvertUtils;
import com.yukino.tools.dto.ToolsDTO;
import com.yukino.tools.entity.Tools;
import com.yukino.tools.repository.ToolsRepository;
import com.yukino.user.dto.UserDTO;
import com.yukino.user.feign.UserFeignClient;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wanghuan
 */
@Service
public class ToolsService {

  @Autowired
  private ToolsRepository toolsRepository;
  @Autowired
  private UserFeignClient userFeignClient;

  @Transactional(rollbackFor = Exception.class)
  @LcnTransaction
  public boolean save(ToolsDTO toolsDTO) {
    UserDTO userDTO = new UserDTO();
    userDTO.setName(toolsDTO.getUsername());
    userFeignClient.addUser(userDTO);
    Tools tools = ConvertUtils.sourceToTarget(toolsDTO, Tools.class);
    boolean b = toolsRepository.insert(tools) > 0;
    int i = 1 / toolsDTO.getType();
    return b;
  }
}
