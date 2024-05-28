package az.edu.turing.module03.lesson06;

import az.edu.turing.module03.lesson06.config.PostgresConfiguration;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresApp {

    public static void main(String[] args) {
        final Connection conn = new PostgresConfiguration().getConnection();

        try {
            final String sql1 = "SELECT * FROM people;";
            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(sql1);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println(id + " " + name);
            }
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        final String sql2 = "DELETE FROM people WHERE id = 1 or 1=1;";

    }
}
