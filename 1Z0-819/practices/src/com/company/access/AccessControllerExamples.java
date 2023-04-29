package com.company.access;

import java.io.File;
import java.security.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

abstract class AccessControllerExamples {
  List<File> dir; //initialize dir somehow

  public <R> List<R> executeFunction(Function<File, R> fun) {
    List<R> l = new ArrayList<R>();
    for (File f : dir) {
      applyWithCheckPermission(fun, l, f);
      applyWithControlPermission(fun, l, f);
    }
    return l;
  }

  private <R> void applyWithCheckPermission(Function<File, R> fun, List<R> l, File f) {
    Permission perm1 = new java.io.FilePermission(f.getPath(), "read");
    AccessController.checkPermission(perm1);

    AccessController.doPrivileged(new PrivilegedAction<Void>() {
      public Void run() {
        l.add(fun.apply(f));
        return null;
      }
    });
  }

  private <R> void applyWithControlPermission(Function<File, R> fun, List<R> l, File f) {
    Permission perm = new java.io.FilePermission(f.getPath(), "read");
    PermissionCollection perms = perm.newPermissionCollection();
    perms.add(perm);

    AccessController.doPrivileged(new PrivilegedAction<Void>() {
      public Void run() {
        l.add(fun.apply(f));
        return null;
      }
    }, new AccessControlContext(new ProtectionDomain[]{new ProtectionDomain(null, perms)}));
  }
}
