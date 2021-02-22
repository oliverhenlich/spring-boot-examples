package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Oliver Henlich
 */
@org.springframework.beans.factory.annotation.Configurable
public class Configurable {

  private static final Logger LOGGER = LoggerFactory.getLogger(Configurable.class);

  @Value("${a.property:defaultValue}")
  private String property;

  @Autowired
  private Component component;

  public void configurableMethod1() {
    LOGGER.info("configurableMethod1() - property = {} ", property);
    LOGGER.info("configurableMethod1() - component = {}", component);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + ": property=" + property +
        ", component=" + component;
  }


}
