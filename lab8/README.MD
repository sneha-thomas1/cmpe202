Chain of Responsibility is used to implement credit card text entry and 
Decorator pattern and Composite pattern is used to implement Credit Card Display

Depending on the count of digit added,we need to decide to which part of the credit card(ie card number,card expiry or card cvc) the digit should be added,ie in the code,depending on the count,digit should be passed to appropriate object(ie card number,card expiry or card cvc).So chain of responsibility is used since app object does not know which card object should handle the digit entered,it just passes it to cardnumber object.If the count is within cardnumber range ,it will accept the digit or else passes it to next handler ie cardexpiry and so on.not specific for 

Decorator pattern is used because space needs to be added dynamically during display of the card number and slash needs to be added dynamically during the display of card expiry date.Decorator pattern was used because it is the best pattern to add a new functionality to an object dynamically.
Composite pattern is  used as cardnumber,cardexpiry and card cvc forms a part of screen and when screen's contents needs to be displayed,contents of all its components need to be displayed.
