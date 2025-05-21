# QuickCart Implementation Guide

This document provides a step-by-step guide for implementing the QuickCart product catalog application using Spring MVC and JSP.

## Prerequisites

Before starting the implementation, ensure you have:

- JDK 17 or higher installed
- Maven installed
- IntelliJ IDEA or another Java IDE

## Step 1: Project Setup

1. Create a new Spring Boot project with the following details:
   - Group: com.quickcart
   - Artifact: ecommerce
   - Name: QuickCart
   - Description: E-commerce application built with Spring MVC
   - Package name: com.quickcart.ecommerce
   - Java version: 17
   - Dependencies: Spring Web

2. Open the project in your IDE.

## Step 2: Configure JSP Support

1. Open `pom.xml` and add the following dependencies:

```xml
<dependency>
    <groupId>org.apache.tomcat.embed</groupId>
    <artifactId>tomcat-embed-jasper</artifactId>
    <version>10.1.31</version>
</dependency>
<dependency>
    <groupId>org.glassfish.web</groupId>
    <artifactId>jakarta.servlet.jsp.jstl</artifactId>
    <version>3.0.1</version>
</dependency>
<dependency>
    <groupId>jakarta.servlet.jsp.jstl</groupId>
    <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
    <version>3.0.0</version>
</dependency>
```

2. Open `application.properties` and add:

```properties
spring.application.name=QuickCart
spring.mvc.view.prefix=/WEB-INF/jsp/
spring.mvc.view.suffix=.jsp
```

## Step 3: Create Model Class

1. Create a new package `com.quickcart.ecommerce.model`.
2. Create a Java class `Product.java` with the following attributes:
   - id (int)
   - name (String)
   - description (String) 
   - price (double)
3. Add a constructor, getters, and setters for all attributes.

## Step 4: Create Controller

1. Create a new package `com.quickcart.ecommerce.controller`.
2. Create a Java class `ProductController.java`.
3. Add the `@Controller` annotation to the class.
4. Create a method `getProducts` that:
   - Maps to both `/` and `/products` URLs
   - Creates sample products
   - Adds them to a list
   - Adds the list to the model
   - Returns the view name "products"

## Step 5: Create View Directory Structure

1. Create the following directories:
   - `src/main/webapp`
   - `src/main/webapp/WEB-INF`
   - `src/main/webapp/WEB-INF/jsp`

## Step 6: Create CSS File

1. Create a CSS file at `src/main/resources/static/css/product-styles.css`.
2. Add styles for the body, heading, and table elements.

## Step 7: Create JSP File

1. Create a JSP file at `src/main/webapp/WEB-INF/jsp/products.jsp`.
2. Include the JSTL core tag library with `<%@ taglib prefix="c" uri="jakarta.tags.core" %>`.
3. Create an HTML structure with:
   - `<!DOCTYPE html>` declaration
   - HTML, head, and body tags
   - Title "Product List"
   - Link to the CSS file
   - H1 heading "Available Products"
   - Table with headers for ID, Name, Description, and Price
   - JSTL forEach loop to iterate through the products
   - Table cells displaying each product's properties

## Step 8: Run the Application

1. Build the project with `mvn clean package`.
2. Run the application with `mvn spring-boot:run`.
3. Open a web browser and navigate to `http://localhost:8080/`.

## Common Issues and Troubleshooting

### Issue: Whitelabel Error Page
- **Solution**: Ensure your controller has the correct `@GetMapping` annotations for both `/` and `/products`.

### Issue: JSP Not Rendering
- **Solution**: Make sure:
  - JSP dependencies are correctly added to pom.xml
  - application.properties has the correct view resolver configuration
  - The JSP file is in the correct directory

### Issue: JSTL Not Working
- **Solution**: Verify:
  - JSTL dependencies are correctly added to pom.xml
  - The correct taglib directive is included at the top of the JSP file
  - The attribute names in the JSP match the model attribute names

### Issue: CSS Not Applied
- **Solution**: Check:
  - The CSS file is in the correct location
  - The link tag in the JSP file has the correct href path

## Key Concepts Covered

- Spring MVC architecture
- Model-View-Controller pattern
- JSP and JSTL for dynamic view rendering
- Spring Boot configuration
- Data passing between controllers and views