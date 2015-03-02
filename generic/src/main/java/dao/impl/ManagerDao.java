package dao.impl;

import dao.generic.AbstractDao;
import dao.generic.GenericInterFace;
import model.Manager;

import java.sql.Connection;

/**
 * Created by BeytullahC on 02.03.2015.
 */
public class ManagerDao extends AbstractDao<Manager> implements GenericInterFace<Manager> {
    @Override
    protected Connection getConnection() {
        return null;
    }
}
