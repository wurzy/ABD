Connection c = DriverManager.getConnection("jdbc:postgresql://localhost/abd", "abduser", "segredo");
Statement s = c.createStatement();
ResultSet rs = s.executeQuery("select * from teste");
while(rs.next()){
    System.out.println(rs.getInt(1) + " " + getString(2));
}
s.executeUpdate("INSERT INTO teste VALUES (2,'dois')");