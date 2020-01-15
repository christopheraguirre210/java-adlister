import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.*;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao() throws SQLException {
        Config config = new Config();
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword()
        );
    }

    @Override
    public List<Ad> all() {
        List<Ad> ShowAll = new ArrayList<>();
        String query = "SELECT * FROM ads";

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                ShowAll.add(
                        new Ad(
                                rs.getInt("id"),
                                rs.getInt("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ShowAll;
    }

    @Override
    public long insert(Ad ad) throws SQLException {
        String query = "INSERT INTO ads(user_id, title, description) VALUES (1, 'Big Fish', 'Fresh fish served daily')";
        Statement statement = connection.createStatement();
        statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        if (rs.next()) {
            System.out.println("Inserted a new record! New id: " + rs.getLong(1));
        }
        int numberOfRowsEffected = statement.executeUpdate((query));
        return numberOfRowsEffected;
    }

    public static void main(String[] args) throws SQLException {
//        Ads adsDao = new MySQLAdsDao();
//
//        List<Ad> ads = adsDao.all();
//        for (Ad ad : ads){
//            System.out.println(ad);
//        }
//        create test Ad


//         test insert method

        Ads adsDao = new MySQLAdsDao();
        Ad ad = new Ad(1, "Big Fish", "Fresh fish served daily");
        adsDao.insert(ad);
        List<Ad> ads = adsDao.all();
        for (Ad single : ads) {
            System.out.println(single);
        }
    }

}

