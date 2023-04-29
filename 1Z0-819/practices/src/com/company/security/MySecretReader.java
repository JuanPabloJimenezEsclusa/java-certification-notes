package com.company.security;

import java.security.*;

public class MySecretReader {
  private static final String KEY = "java.home";
  public String getSecret() {
    return AccessController.doPrivileged(
      new PrivilegedAction<String>() {
        public String run() {
          return System.getProperty(KEY);
        }
      });
  }

  public void readData(Runnable task, String path) {
    // Check permission
    Permission permission = new java.io.FilePermission(path,"read");
    AccessController.checkPermission(permission);

    // Execute task with limited permission
    final var permissions = permission.newPermissionCollection();
    permissions.add(permission);
    AccessController.doPrivileged(
      new PrivilegedAction<Void>() {
        public Void run() {
          task.run();
          return null;
        }
      },
      // Using a limited context prevents privilege elevation
      new AccessControlContext(
        new ProtectionDomain[] {
          new ProtectionDomain(null, permissions)
        })
    );
  }

  public static void main(String[] args) {
    System.out.println(new MySecretReader().getSecret());
  }
}
