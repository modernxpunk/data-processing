package org.obrii.mit.dp2021.alexkovalskyi.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StartSQL implements CrudDataInterface {
    
    int id = 1;
    private Logger logger;
    private Statement statement;
    private Connection connection;
    
    public StartSQL(){
        logger=Logger.getLogger(FilesCrud.class.getName());
        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(
                    Config.getURL(), 
                    Config.getDbUser(), 
                    Config.getDbPass()
            );
            this.connection.setAutoCommit(false);
            this.statement = this.connection.createStatement();
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getClass().getName()+": "+e.getMessage());
            System.exit(0);
        }
            SQL("CREATE TABLE IF NOT EXISTS users ("
                        + "id integer primary key not null, "
                        + "name text not null, "
                        + "age integer not null, "
                        + "gender text not null, "
                        + "email text not null "
                        + ");"
            );
        }
        
    private void SQL(String sql){
        try{
            statement.executeUpdate(sql);
            connection.commit();
        }
        catch(SQLException e){
             logger.log(Level.WARNING, null, e);
        }
    }
    
    @Override
    public List<Data> readData() {
        try {
            ResultSet result = this.statement.executeQuery("SELECT * FROM users");
            List<Data> data = new ArrayList<>();

            while (result.next()) {
                data.add(new Data(
                        result.getInt("id"),
                        result.getString("name"),
                        result.getInt("age"),
                        result.getString("gender"),
                        result.getString("email")
                ));
            }
            return data;
        } catch (SQLException e) {
            this.logger.log(Level.WARNING, e.toString());
            return new ArrayList<>();
        }
        
    }

    @Override
    public void createData(Data data) {
        List<Data> datasize = this.readData();
        data.setId(datasize.size());
        SQL(String.format("INSERT INTO users (id, name, age, gender, email) VALUES (%d, '%s', %d, '%s', '%s');",
                data.getId(), data.getName(), data.getAge(), data.getGender(), data.getEmail()));
    }

    @Override
    public void deleteData(int id) { 
        SQL("DELETE FROM users WHERE id = " + id);
    }
    
    @Override
    public void updateData(int id, Data data) {  
        SQL(String.format(
                "UPDATE users SET name = '%s', age = %d, gender = '%s', email = '%s' WHERE id = %d",
                data.getName(), data.getAge(), data.getGender(), data.getEmail(), id)
        );
    }
    
    public List<Data> sortData(String phrase) {
        List<Data> newData = new ArrayList<>();
        for (Data d : this.readData()) {
            if(d.getName().contains(phrase)){
                newData.add(d);
            }
        }
        return newData;
    }
    
}
