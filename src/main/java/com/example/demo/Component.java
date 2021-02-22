package com.example.demo;

import javax.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author Oliver Henlich
 */
@org.springframework.stereotype.Component
public class Component {

  private static final Logger LOGGER = LoggerFactory.getLogger(Component.class);

  @Value("${a.property:defaultValue}")
  private String property;

  @PostConstruct
  public void postConstruct() {
    LOGGER.info("postConstruct() - property = {} ", property);
  }

  public void componentMethod1() {
    Configurable configurable = new Configurable();
    LOGGER.info("componentMethod1() - configurable = {} ", configurable);

    configurable.configurableMethod1();

  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + ": property=" + property;
  }
}
