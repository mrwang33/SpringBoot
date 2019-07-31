package com.yukino.tools.controller;

import com.yukino.tools.dto.ToolsDTO;
import com.yukino.tools.service.ToolsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanghuan
 */
@RestController
public class ToolsController {

  @Autowired
  private ToolsService toolsService;

  @PostMapping
  public ResponseEntity saveTools(@RequestBody ToolsDTO toolsDTO) {
    boolean result = toolsService.save(toolsDTO);
    if (!result) {
      return ResponseEntity.badRequest().build();
    }
    return ResponseEntity.ok().build();
  }
}
