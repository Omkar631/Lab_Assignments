package thurs_lab_31stAug;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Prod_Mmt{

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/product";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "Omkar0603@";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD)) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
            	System.out.println("********************************************");
                System.out.println("****----Product Management System----****\n");
                System.out.println("1. Create Product");
                System.out.println("2. Read Product");
                System.out.println("3. Update Product");
                System.out.println("4. Delete Product");
                System.out.println("5. Exit");
                System.out.print("Select an option: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        createProduct(connection, scanner);
                        break;
                    case 2:
                        System.out.print("Enter Product ID: ");
                        int productId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        Product product = getProductById(connection, productId);
                        if (product != null) {
                            System.out.println("\nRead Product: " + product);
                        } else {
                            System.out.println("\nProduct not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter Product ID: ");
                        int updateProductId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        updateProduct(connection, updateProductId, scanner);
                        break;
                    case 4:
                        System.out.print("Enter Product ID to delete: ");
                        int deleteProductId = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline character
                        deleteProduct(connection, deleteProductId);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void createProduct(Connection connection, Scanner scanner) throws SQLException {
        System.out.print("Enter Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter Category: ");
        String category = scanner.nextLine();

        String insertSQL = "INSERT INTO products (P_name, Qun, Price, Cate) VALUES (?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, quantity);
            preparedStatement.setDouble(3, price);
            preparedStatement.setString(4, category);
            preparedStatement.executeUpdate();
            System.out.println("Product created successfully.");
        }
    }

    public static Product getProductById(Connection connection, int productId) throws SQLException {
        String selectSQL = "SELECT * FROM products WHERE P_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {
            preparedStatement.setInt(1, productId);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return new Product(
                            resultSet.getInt("P_id"),
                            resultSet.getString("P_name"),
                            resultSet.getInt("Qun"),
                            resultSet.getDouble("Price"),
                            resultSet.getString("Cate")
                    );
                }
            }
        }
        return null;
    }

    public static void updateProduct(Connection connection, int productId, Scanner scanner) throws SQLException {
        System.out.print("Enter new Product Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter new Price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter new Category: ");
        String category = scanner.nextLine();

        String updateSQL = "UPDATE products SET P_name = ?, Qun = ?, Price = ?, Cate = ? WHERE P_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, quantity);
            preparedStatement.setDouble(3, price);
            preparedStatement.setString(4, category);
            preparedStatement.setInt(5, productId);
            preparedStatement.executeUpdate();
            System.out.println("Product updated successfully.");
        }
    }

    public static void deleteProduct(Connection connection, int productId) throws SQLException {
        String deleteSQL = "DELETE FROM products WHERE P_id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, productId);
            int rowsAffected = preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Product deleted successfully.");
            } else {
                System.out.println("Product not found.");
            }
        }
    }
}

class Product {
    private int id;
    private String name;
    private int quantity;
    private double price;
    private String category;

    public Product(int id, String name, int quantity, double price, String category) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}



    

