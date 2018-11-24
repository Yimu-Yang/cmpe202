# Lab10 Notes

## Compare to Lab1

### LAB #1 - Code Maintainability
* In lab1, if we want to implement all three kinds of the gumball machine, we need to implement them in three different classes. In addition, we need to test those three gumball machines separately by writing three different testing methods.

### Feature IDE / AspectJ
* For Feature IDE/AspectJ solution, we can implement these three types of gumball machines in one class with some auxiliary aspects. Each type of gumball machine can be constructed dynamically by adding or deleting some aspects. Also, we only need to write one testing method to test all three of them. The code becomes much simpler than that of Lab1.

## GumballMachineV1 

* Feature Model
![Feature Model](./Screenshots/GumballMachineV1/Feature_Model.png)

* Choose QTR 25
![Config](./Screenshots/GumballMachineV1/Feature_Model_Configs_QTR25.png)
![Output](./Screenshots/GumballMachineV1/Output_QTR25.png)

* Choose QTR 50
![Config](./Screenshots/GumballMachineV1/Feature_Model_Configs_QTR50.png)
![Output](./Screenshots/GumballMachineV1/Output_QTR50.png)

* Choose COINS 50
![Config](./Screenshots/GumballMachineV1/Feature_Model_Configs_COINS50.png)
![Output](./Screenshots/GumballMachineV1/Output_COINS50.png)

## GumballMachineV2

* Feature Model
![Feature Model](./Screenshots/GumballMachineV2/Feature_Model.png)

* Choose CRANKMODEL, ONEQTR, COST25
![Config](./Screenshots/GumballMachineV2/Feature_Model_Configs_CRANKMODEL_ONEQTR_COST25.png)
![Output](./Screenshots/GumballMachineV2/Output_CRANKMODEL_ONEQTR_COST25.png)

* Choose CRANKMODEL, TWOQTR, COST50
![Config](./Screenshots/GumballMachineV2/Feature_Model_Configs_CRANKMODEL_TWOQTR_COST50.png)
![Output](./Screenshots/GumballMachineV2/Output_CRANKMODEL_TWOQTR_COST50.png)

* Choose SLOTMODEL, COST25
![Config](./Screenshots/GumballMachineV2/Feature_Model_Configs_SLOTMODEL_COST25.png)
![Output](./Screenshots/GumballMachineV2/Output_SLOTMODEL_COST25.png)

* Choose SLOTMODEL, COST50
![Config](./Screenshots/GumballMachineV2/Feature_Model_Configs_SLOTMODEL_COST50.png)
![Output](./Screenshots/GumballMachineV2/Output_SLOTMODEL_COST50.png)
