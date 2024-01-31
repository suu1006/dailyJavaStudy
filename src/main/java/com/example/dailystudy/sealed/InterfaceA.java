package com.example.dailystudy.sealed;

public sealed interface InterfaceA permits InterfaceB { // sealed 봉인한다. permits InterfaceB만 내 자식이 되거라
    void methodA();
}
