package com.bank.repository.impl;

import java.util.List;

public class Pageable<T> {
    private final List<T> items;
    private final int pageNumber;
    private final int itemsNumberPerPage;
    private final int maxPageNumber;

    public Pageable(List<T> items, int pageNumber,
                    int itemsNumberPerPage, int maxPageNumber) {
        this.items = items;
        this.pageNumber = pageNumber;
        this.itemsNumberPerPage = itemsNumberPerPage;
        this.maxPageNumber = maxPageNumber;
    }

    public List<T> getItems() {
        return items;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public int getItemsNumberPerPage() {
        return itemsNumberPerPage;
    }

    public int getMaxPageNumber() {
        return maxPageNumber;
    }
}
