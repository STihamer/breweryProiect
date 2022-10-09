package guru.sfg.beer.order.service.services.beer;

import guru.sfg.beer.order.service.domain.BeerOrder;

public interface BeerOrderManager {

    BeerOrder newBeerOrder(BeerOrder beerOrder);
}