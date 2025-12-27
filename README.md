Challenge: Implement a Custom Predicate
Imagine you are building a product search feature for an online store. You want to help users quickly find products by filtering a list of product names. For instance, you might want to find all products that start with the letter "S". Instead of hardcoding the filtering logic, you decide to create a custom predicate interface that allows you to pass any filtering condition as a lambda expression. This makes your code flexible and reusable for different search criteria.

Task
Completed
Implement a method to filter a list of strings using a custom predicate. The method should apply the predicate to each string and return a new list containing only the strings that match the predicate.

Iterate through each element in the items list.
For each element, check if it satisfies the predicate.
If the element satisfies the predicate, add it to a new list.
Return the new list containing all matching elements.

----------------------------------------------
Challenge: Stream Data Processing
Imagine you are managing payroll for a company and need to process a list of employee salaries. Your goal is to identify all employees earning above a certain threshold, give those employees a 10% raise, and then calculate the total cost of these increased salaries. Using Java's Stream API and lambda expressions can make this task concise and expressive, allowing you to filter, transform, and aggregate data efficiently in a single pipeline.

Task
Completed
Process a list of employee salaries to identify those above a specific threshold, increase them by 10%, and return the total sum of the increased salaries.

Filter the input list to include only salaries greater than 3000.
Increase each filtered salary by 10%.
Sum all the increased salaries.
Return the total as an integer.

_______________________________________________

Challenge: Event Handler with Lambda

Imagine you are building a notification system for a messaging app. Whenever a new message arrives, you want to process it—perhaps by displaying a notification, logging it, or triggering some other action. Instead of hard-coding the response, you decide to use a lambda expression to handle the event, making your system flexible and easy to extend. In this scenario, a lambda can be passed as an event handler to process each new message as it arrives.

Task
Implement a method to process new messages using a lambda expression.

The method must take a String message and a Consumer<String> lambda as parameters.
The method must apply the provided lambda to the message.
