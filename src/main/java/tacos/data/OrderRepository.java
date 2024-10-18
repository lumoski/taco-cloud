package tacos.data;

import java.util.Optional;

import tacos.domain.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder tacoOrder);

}
