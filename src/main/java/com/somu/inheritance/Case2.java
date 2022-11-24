package com.somu.inheritance;

import java.io.Serializable;

// CASE 2 : WHAT IF PARENT DIDN'T IMPLEMENT SERIALIZABLE OR CHILD IMPLEMENT
public class Case2 {
    
}

class Animal1 
{
    int i = 10;
}

 class Dog2 extends Animal1 implements Serializable{

    int j = 20;
}