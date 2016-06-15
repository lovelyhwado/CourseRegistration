package com.ddd.domain.shared;

public interface DomainEvent<T> {

	boolean sameEventAs(T other);
}
