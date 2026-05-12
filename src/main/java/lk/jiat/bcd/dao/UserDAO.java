package lk.jiat.bcd.dao;

import lk.jiat.bcd.model.User;
import lk.jiat.bcd.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {

    public boolean saveUser(User user) throws Exception {

        Connection connection = DBConnection.getConnection();

        String query = "INSERT INTO user (name, mobile) VALUES (?, ?)";

        PreparedStatement pstm = connection.prepareStatement(query);
        pstm.setString(1, user.getName());
        pstm.setString(2, user.getMobile());

        int result = pstm.executeUpdate();

        return result > 0;
    }
}
