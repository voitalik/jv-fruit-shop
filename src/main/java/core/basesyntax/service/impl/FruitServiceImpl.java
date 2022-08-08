package core.basesyntax.service.impl;

import core.basesyntax.dao.FruitDao;
import core.basesyntax.model.FruitTransaction;
import core.basesyntax.service.FruitService;

public class FruitServiceImpl implements FruitService {
    private FruitDao fruitDao;

    public FruitServiceImpl(FruitDao fruitDao) {
        this.fruitDao = fruitDao;
    }

    @Override
    public void createNewFruitEntity(FruitTransaction.Operation operation, String fruitName, int quantity) {
        FruitTransaction fruit = new FruitTransaction(operation, fruitName, quantity);
        fruitDao.add(fruit);
    }
}
