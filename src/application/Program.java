package application;

import model.DAO.DaoFactory;
import model.DAO.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        Department dp = new Department(1, "books");

        System.out.println(dp);

        Seller seller = new Seller(21, "bob", "bob@gmail.com", new Date(), 3000.00, dp);

        SellerDAO sellerdao = DaoFactory.createSellerDao();


        System.out.println(seller);
    }
}
