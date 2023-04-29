package com.company.security;

import java.security.*;
import java.util.HashMap;
import java.util.Map;
import java.util.PropertyPermission;

public class SecretFile {
  private static Map<String, User> data = new HashMap<>();
  public static SecretFile get(String key) {
    var cacheRecord = data.get(key);
    if (cacheRecord != null) {
      AccessController.checkPermission(cacheRecord.getPermission());
      return cacheRecord.getValue();
    }

    final Permission permission = new PropertyPermission(key,"read");
    AccessController.checkPermission(permission);

    final var permissions = permission.newPermissionCollection();
    permissions.add(permission);
    var secret = AccessController.doPrivileged(
      new PrivilegedAction<SecretFile>() {
        public SecretFile run() {
          return new SecretFile();
        }
      }, new AccessControlContext(new ProtectionDomain[] {
        new ProtectionDomain(null, permissions) }));
    data.put(key, new User(secret, permission));
    return secret;
  }

  private static class User {
    public User(SecretFile secret, Object permission) {

    }

    public Permission getPermission() {
      return null;
    }

    public SecretFile getValue() {
      return null;
    }
  }
}
