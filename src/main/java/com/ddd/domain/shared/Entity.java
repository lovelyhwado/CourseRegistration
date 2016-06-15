package com.ddd.domain.shared;

public interface Entity<T> {

	boolean sameIdentityAs(T other);
}
