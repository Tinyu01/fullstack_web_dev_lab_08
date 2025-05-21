# QuickCart E-commerce Application

A Spring MVC-based web application that allows users to view product listings dynamically. This application demonstrates the implementation of the MVC architecture using Spring Boot with JSP views.

## Project Overview

QuickCart is an e-commerce platform that displays a catalog of products to customers. The application showcases:

- Spring MVC architecture implementation
- Model-View-Controller pattern
- Dynamic content rendering with JSP
- Data passing between controllers and views
- Styling with CSS

## Features

- Product listing with details (ID, Name, Description, Price)
- Responsive design
- Clean separation between business logic and presentation

## Tech Stack

- Java 17
- Spring Boot 3.x
- JSP (JavaServer Pages)
- JSTL (JSP Standard Tag Library)
- Maven
- Embedded Tomcat server

## Project Structure

```
quickcart/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── quickcart/
│   │   │           └── ecommerce/
│   │   │               ├── QuickCartApplication.java
│   │   │               ├── model/
│   │   │               │   └── Product.java
│   │   │               └── controller/
│   │   │                   └── ProductController.java
│   │   ├── resources/
│   │   │   ├── static/
│   │   │   │   └── css/
│   │   │   │       └── product-styles.css
│   │   │   └── application.properties
│   │   └── webapp/
│   │       └── WEB-INF/
│   │           └── jsp/
│   │               └── products.jsp
│   └── test/
├── pom.xml
└── README.md
```

## Setup Instructions

### Prerequisites

- JDK 17 or higher
- Maven 3.6 or higher
- IntelliJ IDEA or any Java IDE

### Steps to Run

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/quickcart.git
   cd quickcart
   ```

2. Build the project:
   ```
   mvn clean package
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

4. Open a web browser and navigate to:
   ```
   http://localhost:8080/
   ```

## Implementation Details

### Model

The `Product` class represents an item in the store's catalog with properties:
- id (int): Unique identifier for the product
- name (String): Name of the product
- description (String): Brief description of the product
- price (double): Cost of the product

### Controller

The `ProductController` handles HTTP requests and maps them to the appropriate views:
- `@GetMapping({"/", "/products"})`: Maps both the root path and "/products" path to the product listing page
- Initializes a list of sample products
- Passes the products to the view using the Model object

### View

The `products.jsp` file displays the product catalog:
- Uses JSTL for iterating through the product list
- Renders a table with product information
- Includes CSS for styling

### Configuration

The application is configured in `application.properties`:
- View resolver configuration for JSP files
- Application name

## Screenshots

(Screenshots of the running application would be inserted here)

## Implementation Notes

- The JSP files are stored in the `WEB-INF/jsp/` directory to prevent direct access
- JSTL is used for dynamic content rendering in JSP
- The application maps both the root URL "/" and "/products" to the same controller method for convenience

## Troubleshooting

If you encounter any issues:

1. Ensure all dependencies are properly loaded in Maven
2. Check that the JSP files are in the correct location
3. Verify that the controller methods are properly annotated
4. Confirm that the JSTL tag library is correctly referenced in the JSP file

## Future Enhancements

- Add CRUD operations for products
- Implement user authentication
- Create a shopping cart functionality
- Add search and filter capabilities