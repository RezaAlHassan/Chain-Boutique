# Chain-Boutique
### Simulating operations of a chain boutique store using Java

#### This program simulates the operations (like production, employee management, expenses, profit, products etc) of a boutique store featuring 5 user types who performs certain workflows/functions/tasks.

### User Roles
-	#### Admin (Owner)
-	#### Regional Store Manager
-	#### Factory Overseer 
-	#### Regional Accountant
-	#### Shareholders

## Admin
Goal-1: View staff information by factory locations and store locations

Workflow:
-	The option will be present after login, in a sidebar, labelled “Staff” 
-	Selecting this option will show 2 buttons labelled “Load factory staff” and “Load store staff”
-	Two tables will be present where the data will be loaded
-	Selecting “Load factory staff” will load the database table which will contain information about staff working in factories in 4 columns. The columns will be labelled “Job Title”, “Name”, “Salary” and “Additional information”.
-	Selecting “Load store staff” will load the database which will contain information about staff working in regional stores in a table containing 4 columns. The columns will be labelled “Employee Id”, “Job Title”, “Name” and “Salary” 

Goal-2: View total company expenses

Workflow:
-	This option will also be present upon login in the sidebar labelled as “Expenses”
-	Selecting this option will generate a click event which will show the total expenses in a pie chart. 
-	The factory expenses will be the addition of all expenses in factories such as utility bill, salary (values must be taken from the staff information database) and damaged raw material cost. All of these separate expenses will be shown in a list format under the category of factory expenses. 
-	The pie chart for factory expenses can be selected from the combo box which will consist of ‘utilities’ and ‘damaged goods’. These values will be taken from the factory overseer. 
-	The store expenses will be the addition of all expenses in regional stores such as utility bill, salary (values must be taken from the staff information database) and damaged product cost. All of these separate expenses will be shown in a list format under the category of store expenses.
-	The pie chart for factory expenses can be selected from the combo box which will consist of ‘utilities’ and ‘damaged goods’. These values will be taken from the regional manager. 

Goal-3: Change existing store locations (removed)
Workflow:
-	The option will be present, in the same sidebar, labelled “Locations” 
-	Selecting this option will generate a click event which will show the number of stores with their respective locations in a list format which can be numbered.
-	The admin can then be prompted to enter the number of the store to change its location. 
-	Entering wrong number will display a message that says “store does not exist”.
-	Entering correct number will open up a text box with a submit button that will allow the admin to change the store location. (Must be in string format).


Goal-4: View messages from staff members (Regional Manager, Factory Overseer or Regional Accountant) [Admin Inbox]
Workflow:
-	The option will be present, in the same sidebar, labelled “Messages” 
-	Selecting this option (clicking it) will generate a click event which will show a list of staff members with buttons labelled “Regional Manager”, “Factory Overseer” and “Regional Accountant”.
-	The selecting either of these options (clicking them) will show the most recent message from their respective user in the textbox. 

Goal-5: View total company sales
Workflow:
-	The option will be present, in the same sidebar ,labelled “Sales” 
-	Selecting this option will generate a click event which will show the total sales in a list format. 
-	In the list, the total sales will be shown along with other sales information that will be in a list.
-	The total sales will be calculated using ‘items sold’ multiplied by ‘price’ of the specific product ID.  All of these values will be given in the list

•	Regional Manager:
Goal-1: View all products and delete products. (Product Database)
Workflow:
-	The option will be present after login, in a sidebar, labelled “Products” 
-	Selecting this option will generate a click event which will show all products under different categories with their price in a table like format.
-	The table will have 4 columns labelled ‘Product Id’, ‘Product Name’, ‘Product Category’ and ‘Price’. 
-	Each category can have multiple products but each product will have its price displayed beside it.

Goal-2: Create new products
Workflow:
-	To create a product some text fields will be present in the same window as the “Products tab”
-	An “Add to DB” button will be present which, upon clicking, will store a product in the database by using the text field information. 
-	Product id automatically incremented from the last product’s id making it a unique one.

Goal-3: View all regional outlet staff information and delete staff   member (if fired) [Staff information database Table]
Workflow:
-	The option will be present, in the same sidebar, labelled “Staff”
-	Selecting this option will generate a click event which will show a table with 4 columns showing information about staff.
-	The table columns will be labelled “Employee Id”, “Staff Name”, “Job Type” and “Salary”
-	A row of staff information can be deleted by selecting the row and clicking the delete button assigned to it.
Goal-4: Add to existing staff members working at the regional outlet 
Workflow:
-	To create a product some text fields will be present in the same window as the “Products” tab.
-	An “Add to DB” button will be present which, upon clicking, will store a staff in the database by using the text field information. 
-	Staff id automatically incremented from the last product’s id making it a unique one.
Goal-5: Request stock/budget from or write complaint to admin 
Workflow:
-	The option will be present, in the same sidebar, labelled “Message Admin”
-	Selecting this option will generate a click event which will open up a text box where the user can write a message to the admin.
-	A submit button will be present on the bottom of the text box, upon clicking will send the message to the admin inbox

•	Factory Overseer:
Goal-1: Update factory expenses 
Workflow:
-	The option will be present after login, in a sidebar, labelled “Expenses”
-	Selecting this option will generate a click event which will show the total factory expenses along with ‘Utilities’, ‘Salary’ and ‘Damaged Raw Materials’ in a list format. 
-	Total expenses will have a value, calculated by the addition of utilities, salaries and damaged raw materials input made by the user. (will not be present on the screen)
-	On clicking ‘Utilities’, ‘Salary’ or ‘Damaged Raw Materials’ from the list  will have a  text field to collect user input for these fields. 
-	When submitted, it will update the value (for that variable such as utilities) and also update the factory expenses and total company expenses (in admin panel).
-	The expense cannot be updated again until a 24 hour period is passed

Goal-2: Update number of products available for delivery 
Workflow:
-	The option will be present, in the same sidebar, labelled “Products Available”
-	On clicking this option, it will open up a form which will two fields labelled “Product Id” and “Number of products available for delivery”
-	Selecting product id will show a dropdown list of all product ids listed in the Product Database.
-	Selecting a product id will allow you to update any number inside it
-	Starting value will be 0. 
Goal-3: Report or send message to admin
Workflow:
-	The option will be present, in the same sidebar, labelled “Report”
-	Selecting this option will generate a click event which will open up a text box where the user can write a message to the admin.
-	A submit button will be present on the bottom of the text box, upon clicking will send the message to the admin inbox.
-	A checkbox will also be present selecting which will mark the message as an important message.
-	An empty message cannot be sent
Goal-4: Change cost price of products
Workflow:
-	The option will be present, in the same sidebar, labelled “Product Prices”
-	On clicking this option, it will open a list of all products listed by the Regional Manager in the Products Table Database.  
-	On clicking any one of the products, it will open up a form with one field labelled ‘Updated Price’ with a submit button.
Goal-5: Upload new Product Design
Workflow:
-	The option will be present, in the same sidebar, labelled “Product Design”
-	On clicking this option, it will have two button one labelled “Upload Product Picture” and “Submit”. 
-	A textbox will be present in which the product description can be written
-	On clicking the submit button, the product will be uploaded/saved in database
-	On clicking upload picture will open a file chooser which will allow the user to select a picture which can be viewed in the tab.

•	Regional Accountant :
Goal-1: Update expenses (regional store)
Workflow:
-	The option will be present after login, in a sidebar, labelled “Expenses”
-	Selecting this option will generate a click event which will show the total factory expenses along with ‘Utilities’, ‘Salary’ and ‘Damaged or Returned Products’ in a list format. 
-	Total expenses will have a value, calculated by the addition of utilities, salaries and damaged or returned products input made by the user.
-	On clicking ‘Utilities’, ‘Salary’ or ‘Damaged or Returned Products’ from the list, will open up a form which will accept an input from the user. It will have one field labelled “Updated Value” and have a submit button. 
-	When submitted, it will update the value (for that variable such as utilities) and also update the store expenses and total company expenses (in admin panel).
-	Starting values for all variables will be 0.
-	The expense cannot be updated again until a 24 hour period is passed

Goal-2: Update sales (regional store)
Workflow:
-	The option will be present, in the same sidebar, labelled “Sales”
-	On clicking this option, it will open up a form which will accept an input from the user. It will have 2 fields labelled “Product Id” and “Number of items sold” and have a submit button. 
-	Starting value will be 0. 
-	When submitted, the values will be sent to the admin. (A calculation can also take place to find sales such as sales=product price*number of products sold) [product price will be fetched by its product id] 

Goal-3: Change product price 
Workflow:
-	The option will be present, in the same sidebar, labelled “Products”
-	On clicking this option, it will open a list of all products listed by the Regional Manager in the Products Table Database (explained in more detail in Regional Manager User).  
-	On clicking any one of the products, it will open up a form with one field labelled ‘Updated Price’ with a submit button.
Goal-4: File complaint or status report to Admin
Workflow:
-	The option will be present, in the same sidebar, labelled “Report”
-	Selecting this option will generate a click event which will open up a text box where the user can write a message to the admin.
-	Max character limit of the text box is 500 characters.
-	A submit button will be present on the bottom of the text box, upon clicking will send the message to the admin inbox.
-	An empty message cannot be sent
Goal-5: View staff information 
Workflow:
-	The option will be present, in the same sidebar, labelled “Staff”
-	Selecting this option will open up the Staff Information Database Table (explained in more detail in Regional Manager User Role), to be viewed by the user.

•	Shareholders:
Goal-1: View staff information 
Workflow:
-	The option will be present after login, in a sidebar, labelled “Expenses”
-	Selecting this option will open up the Staff Information Database Table (explained in more detail in Regional Manager User Role), to be viewed by the user.
-	All the names of staffs and their jobs will be visible except their salaries.

Goal-2:  Update Share
Workflow:
-	The option will be present, in the same sidebar, labelled “Update Share”
-	Upon clicking, a pop up will appear which will have a slider starting from 1-20%, with a submit button
-	They will be able to move the slider from any value between 1 to 20%
-	Setting the slider to a value and clicking on the submit button will submit the share the user wishes to have.

Goal-3: View profit revenue made by the company 
Workflow:
-	The option will be present, in the same sidebar, labelled “Profit”
-	Selecting this option will show the profit made by the company. It will only be singly displayed on the screen.
-	This profit to be shown will be calculated by: Total Company Sales – Total Company Expenses (from the admin panel).
Goal-4: Withdraw Share 
Workflow:
-	The option will be present, in the same sidebar, labelled “Withdraw Share”
-	On clicking this option, it will open up checkbox. 
-	On clicking this checkbox, a message will pop up on the screen asking if the user is sure he wants to with draw his share. Two buttons will be placed on bottom labelled ‘yes’ and ‘no’. 
-	Clicking ‘yes’ will send a message to the admin box saying the user has withdrew his share. 
-	He will also be redirected to the ‘Review and Feedback’ to write a feedback to the admin.
-	
Goal-5: Review or feedback to admin
Workflow:
-	The option will be present, in the same sidebar, labelled “Feedback”
-	Selecting this option will generate a click event which will open up a text box where the user can write a message to the admin.
-	Max character limit of the text box is 500 characters.
-	A submit button will be present on the bottom of the text box, upon clicking will send the message to the admin inbox.

