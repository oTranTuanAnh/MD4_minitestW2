package com.minitest2.service.category;

import com.minitest2.model.dto.TotalAmount;
import com.minitest2.model.entity.Category;
import com.minitest2.service.IGenerateService;

public interface ICategoryService extends IGenerateService<Category> {
    Iterable<TotalAmount> getTotalAmount();
}
