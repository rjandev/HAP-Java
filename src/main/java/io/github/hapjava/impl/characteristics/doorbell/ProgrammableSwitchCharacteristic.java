package io.github.hapjava.impl.characteristics.doorbell;

import io.github.hapjava.HomekitCharacteristicChangeCallback;
import io.github.hapjava.accessories.Doorbell;
import io.github.hapjava.characteristics.BooleanCharacteristic;
import io.github.hapjava.characteristics.EventableCharacteristic;
import java.util.concurrent.CompletableFuture;

public class ProgrammableSwitchCharacteristic extends BooleanCharacteristic
    implements EventableCharacteristic {

  private final Doorbell doorbell;

  public ProgrammableSwitchCharacteristic(Doorbell doorbell) {
    super("00000073-0000-1000-8000-0026BB765291", false, true, "Doorbell rang");
    this.doorbell = doorbell;
  }

  @Override
  protected CompletableFuture<Boolean> getValue() {
    return CompletableFuture.completedFuture(true);
  }

  @Override
  protected void setValue(Boolean value) throws Exception {
    // Read Only
  }

  @Override
  public void subscribe(HomekitCharacteristicChangeCallback callback) {
    doorbell.subscribeDoorbell(callback);
  }

  @Override
  public void unsubscribe() {
    doorbell.unsubscribeDoorbell();
  }
}
