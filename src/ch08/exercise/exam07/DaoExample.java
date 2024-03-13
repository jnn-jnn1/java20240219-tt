package ch08.exercise.exam07;

public class DaoExample {
    public static void dbWork(DataAccessObject dao) {
        dao.select();
        dao.select();
        dao.update();
        dao.delete();
    }

    public static void main(String[] args) {
        dbWork(new OracleDao());
        dbWork(new MySqlDao());
    }
}
