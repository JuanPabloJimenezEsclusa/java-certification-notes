package com.company.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.function.Function;

import static java.lang.annotation.ElementType.TYPE_PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(value=RUNTIME)
@Target(value={TYPE_USE,TYPE_PARAMETER})
@interface NonNull{     }

public class TypeUseExample {
  public static void main(String[] args) {
    //@NonNull String str = "";
    //var str = @NonNull "";
    var str = (@NonNull String) "";
    //Function<Integer, String> f = (Integer @NonNull val ) -> Integer.toHexString(val);
    //Function<Integer, String> f = ( var @NonNull val ) -> Integer.toHexString(val);
    //Function<Integer, String> f = ( @NonNull val ) -> Integer.toHexString(val);
  }
}
