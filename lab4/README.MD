### CRC Card

| Restaurant ||
|:---|:---|
|Responsibilities|Collaborators|
|• Maintain a queue of waiting parties|• Party|
|• Maintain a list of table observers|• ConcreteObserver|
|• Check new party in|• ConcreteObserver, Party|
|• Check new party out|• ConcreteObserver, Party|
|• When a party leave, notify and serve the next capable party in the waitlist if any|• ConcreteObserver, Party, Table|



| ConcreteObserver ||
|:---|:---|
|Responsibilities|Collaborators|
|• Maintains the reference to a table|• Table|
|• Keep states consistent with table state|• Table, FullTableState, EmptyTableState|



| Table ||
|:---|:---|
|Responsibilities|Collaborators|
|• Record the current table state|• FullTableState, EmptyTableState|
|• Check new party in based on the current state and change its state accordingly|• FullTableState, EmptyTableState|
|• Check old party out based on the current state and change its state accordingly|• FullTableState, EmptyTableState|
|• When its state changes, notify the observer|• Observer|
|• Record the table size||



| FullTableState ||
|:---|:---|
|Responsibilities|Collaborators|
|• Maintain a reference to table||
|• No action is token when checking new party in||
|• Check party out and change the table state to empty|• Table|



| EmptyTableState ||
|:---|:---|
|Responsibilities|Collaborators|
|• Maintain a reference to table||
|• Check new party in and change the table state to full|• Table|
|• No action is token when checking new party in||



| Party ||
|:---|:---|
|Responsibilities|Collaborators|
|• Record a String[] of their names||
|• Record Party’s cell phone number||
|• Record the size of the party||
|• Record a reference of the current occupied table||
|• When a table is ready, be able to “confirm” or “leave” the wait list|• Restaurant|



### Explanation
For the Din Tai Fung problem, I choose to use observer and state pattern. Because basically there are only two states for a table, which are full and empty. Those two states should behave differently when checking new party in and checking old party out. A state pattern should work well for the Table object.
Also, a restaurant object should be notified if a table’s state changed from full to empty, so it can serve the next capable party in its waiting list. It is suitable to use an observer pattern to help the restaurant to check all the current state of its tables.


State Pattern Role:
Table plays the role of Context.
FullTableState, EmptyTableState plays the role of ConcreteState subclasses.

Observer Pattern Role:
Table plays the role of ConcreteSubject.
ConcreteObserver plays the role of ConcreteObserver.
