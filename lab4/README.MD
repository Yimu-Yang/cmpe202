### CRC Card

|Responsibilities|Collaborators|
|:---|:---|
|• Maintain a queue of waiting parties|• Party|
|• Maintain a list of table observers|• ConcreteObserver|
|• Check new party in|• ConcreteObserver, Party|
|• Check new party out|• ConcreteObserver, Party|
|• When a party leave, notify and serve the next capable party in the waitlist if any|• ConcreteObserver, Party, Table|


### Explanation
For the Din Tai Fung problem, I choose to use observer and state pattern. Because basically there are only two states for a table, which are full and empty. Those two states should behave differently when checking new party in and checking old party out. A state pattern should work well for the Table object.
Also, a restaurant object should be notified if a table’s state changed from full to empty, so it can serve the next capable party in its waiting list. It is suitable to use an observer pattern to help the restaurant to check all the current state of its tables.


State Pattern Role:
Table plays the role of Context.
FullTableState, EmptyTableState plays the role of ConcreteState subclasses.

Observer Pattern Role:
Table plays the role of ConcreteSubject.
ConcreteObserver plays the role of ConcreteObserver.
