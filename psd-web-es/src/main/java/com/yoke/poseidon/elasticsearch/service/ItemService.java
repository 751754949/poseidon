package com.yoke.poseidon.elasticsearch.service;

import com.yoke.poseidon.elasticsearch.entity.EsItem;
import org.springframework.data.domain.Page;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * @Author Yoke
 * @Date 2018/12/13 上午11:11
 */
public interface ItemService {

	EsItem add(@NonNull EsItem esItem);

	void delete(@NonNull String itemId);

	EsItem update(@NonNull EsItem esItem);

	Page<EsItem> getByKey(String keyWord, int page, int limit);

	EsItem getById(String itemId);

	List<EsItem> getAll();

	/**
	 * 从商品展示服务同步数据
	 */
	List<EsItem> syncData();

	/**
	 * 商品推荐
	 */
	List<EsItem> recommend(String itemId, int page, int size);

	Page<EsItem> test();

}
