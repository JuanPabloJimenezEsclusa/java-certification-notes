package com.company.type.sealed;

@SuppressWarnings("all")
sealed class Bear permits Kodiak, Panda {}
final class Kodiak extends Bear {}
non-sealed class Panda extends Bear {}
class Hormiguero extends Panda {}

//class sealed Frog permits GlassFrog {} // DOES NOT COMPILE
//final class GlassFrog extends Frog {}

abstract sealed class Wolf permits Timber {}
final class Timber extends Wolf {}
//final class MyWolf extends Wolf {} // DOES NOT COMPILE

sealed class Mammal permits Equine {}
sealed class Equine extends Mammal permits Zebra {}
final class Zebra extends Equine {}

abstract sealed class Wolf2 permits Timber2 {}
abstract non-sealed class Timber2 extends Wolf2 {}
abstract class MyWolf extends Timber2 {}
class MyFurryWolf extends MyWolf {}

//sealed class Snake permits Snake.Cobra, Python {
sealed abstract class Snake {
  final class Cobra extends Snake {}
}
final class Python extends Snake {}




sealed interface Swims permits Duck, Swan, Floats {}

// Classes permitted to implement sealed interface
final class Duck implements Swims {}
final class Swan implements Swims {}

// Interface permitted to extend sealed interface
non-sealed interface Floats extends Swims {}

