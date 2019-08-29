package io.github.hapjava.impl.services;

import io.github.hapjava.accessories.Doorbell;
import io.github.hapjava.impl.characteristics.doorbell.ProgrammableSwitchCharacteristic;

public class DoorbellService extends AbstractServiceImpl {

  public DoorbellService(Doorbell doorbell) {
    this(doorbell, doorbell.getLabel());
  }

  public DoorbellService(Doorbell doorbell, String serviceName) {
    super("00000121-0000-1000-8000-0026BB765291", doorbell, serviceName);
    addCharacteristic(new ProgrammableSwitchCharacteristic(doorbell));
  }
}
