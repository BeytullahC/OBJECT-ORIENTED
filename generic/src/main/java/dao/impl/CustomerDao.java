package dao.impl;

import dao.generic.AbstractDao;
import dao.generic.GenericInterFace;
import model.Customer;

import java.sql.Connection;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class CustomerDao extends AbstractDao<Customer> implements GenericInterFace<Customer> {
    @Override
    protected Connection getConnection() {
        return null;
    }
}
