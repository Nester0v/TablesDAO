import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class AuthorsDAO {
    private final Connection connection;

    public AuthorsDAO(Connection connection) {
        this.connection = connection;
    }

    public void createTable() throws SQLException {
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE person (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "name VARCHAR(100)" +
                    ")");
        }
    }
    public Collection<Author> getAll() throws SQLException{
        Collection<Author> authors = new ArrayList<>();
        try (Statement statement = connection.createStatement()){}
        }
    }
}
