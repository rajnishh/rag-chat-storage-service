package com.chatbot.storage.dto.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author rajnish
 *
 * The type Paged response.
 *
 * @param <T> the type parameter
 */
@Data
@Builder
public class PagedResponse<T> {
    private List<T> content;
    private long totalElements;
    private int totalPages;
    private int currentPage;
    private int size;
    private boolean hasNext;
    private boolean hasPrevious;
}