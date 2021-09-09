# CmasSystems
Project to CMAS Systems

The solution should be developed using features delivered in Java 8 or greater with a TDD approach and should have excellent unit test coverage. 

# Technical Description

The Test has three steps, where it needs to very attention and velocity to development.

- Step1:
  - Write some code that prints out the following for a contiguous range of numbers: the name 'CMAS' for numbers that are multiples of 3, 'systems' 
    for numbers that are multiples of 5, 'CMASsystems' for numbers that are multiples of 15, e.g. 
    if I run the program over a range from 1-20 I should get the following output:
      1 2 CMAS 4 systems CMAS 7 8 CMAS systems 11 CMAS 13 14 CMASsystems 16 17 CMAS 19 systems.
- Step2
  - Enhance your existing CMASsystems solution to perform the following: If the number contains a three you must output the text 'good'. 
    This overrides any existing behaviour e.g. 
    if I run the program over a range from 1-20 I should get the following output:
      1 2 good 4 systems CMAS 7 8 CMAS systems 11 CMAS good 14 CMASsystems 16 17 CMAS 19 systems.
- Step3
  - Enhance your existing solution to perform the following: Produce a report at the end of the program showing how many times the following were 
    output CMAS systems CMASsystems good and integer (for the numbers). e.g. if I run the program over a range from 1-20 I should get the following output:
    
      1 2 good 4 systems CMAS 7 8 CMAS systems 11 CMAS good 14 CMASsystems 16 17 CMAS 19 systems
      
      CMAS: 4 
      systems: 3 
      CMASsystems: 1 
      good: 2
      integer: 10

