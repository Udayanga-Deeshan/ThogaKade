package repository.custom;

import dto.Item;
import entity.ItemEntity;
import repository.CrudReposiory;

public interface ItemDao  extends CrudReposiory<ItemEntity,String> {
}
