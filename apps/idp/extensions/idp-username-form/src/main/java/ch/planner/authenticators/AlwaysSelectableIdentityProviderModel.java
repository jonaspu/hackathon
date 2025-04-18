package ch.planner.authenticators;

import java.util.HashMap;
import java.util.Map;
import org.keycloak.models.IdentityProviderModel;

/**
 * This is a fork from https://github.com/sventorben/keycloak-home-idp-discovery
 */
final class AlwaysSelectableIdentityProviderModel extends IdentityProviderModel {

  AlwaysSelectableIdentityProviderModel(IdentityProviderModel delegate) {
    super(delegate);
  }

  @Override
  public boolean isHideOnLogin() {
    return false;
  }

  @Override
  public Map<String, String> getConfig() {
    Map<String, String> superConfig = new HashMap<>(super.getConfig());
    superConfig.put("hideOnLoginPage", Boolean.FALSE.toString());
    return superConfig;
  }
}
