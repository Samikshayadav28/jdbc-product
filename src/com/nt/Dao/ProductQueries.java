package com.nt.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import com.nt.entity.Product;

import java.sql.*;
import java.util.*;

public class ProductQueries {

    public void register(Product p) {
        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO prod (id, name, price, qty, qlty, man_date, exp_date) VALUES (?, ?, ?, ?, ?, ?, ?)"
            );
            ps.setInt(1, p.getId());
            ps.setString(2, p.getName());
            ps.setFloat(3, p.getPrice());
            ps.setInt(4, p.getQty());
            ps.setString(5, p.getQlty());
            ps.setString(6, p.getMan_date());
            ps.setString(7, p.getExp_date());

            int result = ps.executeUpdate();
            System.out.println(result + " product added successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updatePrice(int id, float newPrice) {
        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement ps = con.prepareStatement("UPDATE prod SET price = ? WHERE id = ?");
            ps.setFloat(1, newPrice);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateName(int id, String newName) {
        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement ps = con.prepareStatement("UPDATE prod SET name = ? WHERE id = ?");
            ps.setString(1, newName);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteProduct(int id) {
        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement ps = con.prepareStatement("DELETE FROM prod WHERE id = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectAll() {
        try (Connection con = ConnectionFactory.getConnection()) {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM prod");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getFloat("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectById(int id) {
        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM prod WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getFloat("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectByPrice(float price) {
        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM prod WHERE price = ?");
            ps.setFloat(1, price);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getFloat("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectByName(String name) {
        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM prod WHERE name = ?");
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getFloat("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectByPriceGreaterThan(float price) {
        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM prod WHERE price >= ?");
            ps.setFloat(1, price);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getFloat("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void selectByPriceBetween(float min, float max) {
        try (Connection con = ConnectionFactory.getConnection()) {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM prod WHERE price BETWEEN ? AND ?");
            ps.setFloat(1, min);
            ps.setFloat(2, max);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name") + " " + rs.getFloat("price"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
