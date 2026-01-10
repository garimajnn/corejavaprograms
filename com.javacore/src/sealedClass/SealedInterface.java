package sealedClass;

// interface can be sealed or non-sealed
// interface can give permisiion to sealedclass too

sealed interface SealedInterface permits A, Y {

}
non-sealed interface Y extends SealedInterface{

}