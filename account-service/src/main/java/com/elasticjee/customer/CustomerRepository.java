package com.elasticjee.customer;

import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * 为{@link Customer}领域类提供包括分页和排序等基本的管理能力
 * @author chaokunyang
 * @create 2017/3/9
 */
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {

}
