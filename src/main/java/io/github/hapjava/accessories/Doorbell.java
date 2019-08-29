package io.github.hapjava.accessories;

import io.github.hapjava.HomekitAccessory;
import io.github.hapjava.HomekitCharacteristicChangeCallback;
import io.github.hapjava.Service;
import io.github.hapjava.impl.services.DoorbellService;
import java.util.Collection;
import java.util.Collections;

public interface Doorbell extends HomekitAccessory {

  @Override
  default Collection<Service> getServices() {
    return Collections.singleton(new DoorbellService(this));
  }

  /**
   * Subscribe to changes of the doorbell
   *
   * @param callback the function to call when the state changes.
   */
  void subscribeDoorbell(HomekitCharacteristicChangeCallback callback);

  /** Unsubscribe from changes of the doorbell */
  void unsubscribeDoorbell();
}
