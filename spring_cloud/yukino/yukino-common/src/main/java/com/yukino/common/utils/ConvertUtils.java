
package com.yukino.common.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;

/**
 * 转换工具类
 *
 * @author wang33
 * @since 1.0.0
 */
@Log4j2
public class ConvertUtils {

  public static <T> T sourceToTarget(Object source, Class<T> target) {
    if (source == null) {
      return null;
    }
    T targetObject = null;
    try {
      targetObject = target.newInstance();
      BeanUtils.copyProperties(source, targetObject);
    } catch (Exception e) {
      log.error("convert error ", e);
    }

    return targetObject;
  }

  public static <T> List<T> sourceToTarget(Collection<?> sourceList, Class<T> target) {
    if (sourceList == null) {
      return null;
    }

    List<T> targetList = new ArrayList<>(sourceList.size());
    try {
      for (Object source : sourceList) {
        T targetObject = target.newInstance();
        BeanUtils.copyProperties(source, targetObject);
        targetList.add(targetObject);
      }
    } catch (Exception e) {
      log.error("convert error ", e);
    }

    return targetList;
  }
}
