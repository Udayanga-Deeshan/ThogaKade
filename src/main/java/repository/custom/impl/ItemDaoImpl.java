package repository.custom.impl;

import dto.Item;
import entity.ItemEntity;
import repository.CrudReposiory;
import repository.custom.ItemDao;

import java.util.List;

public class ItemDaoImpl   implements ItemDao {

    @Override
    public boolean save(ItemEntity entity) {
        return false;
    }

    @Override
    public boolean update(ItemEntity entity) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public ItemEntity search(String s) {
        return null;
    }

    @Override
    public List<ItemEntity> getAll() {
        return List.of();
    }
}
