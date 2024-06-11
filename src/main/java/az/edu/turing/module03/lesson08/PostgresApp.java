package az.edu.turing.module03.lesson08;

import az.edu.turing.module03.lesson08.config.PostgresConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class PostgresApp {

    public static void main(String[] args) {
        final Connection conn = new PostgresConfiguration().getConnection();

        try {
            conn.setAutoCommit(false);

            final String sql1 = "INSERT INTO people (name) VALUES (?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql1);
            preparedStatement.setString(1, "John");
            preparedStatement.executeUpdate();

            conn.commit();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
//            conn.rollback();
        }

//        final String sql2 = "DELETE FROM people WHERE id = 1 or 1=1;";

    }
}
