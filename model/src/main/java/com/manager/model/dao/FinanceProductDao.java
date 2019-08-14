package com.manager.model.dao;

import com.manager.model.bean.DeleteQueryBean;
import com.manager.model.bean.FinanceProductQueryBean;
import com.manager.model.bean.FinanceProductResultBean;
import com.manager.model.entity.FinanceProduct;

import java.util.List;

// extends FinanceProductMapper
public interface FinanceProductDao {

    public  Integer insertProduct(FinanceProduct product);

    public List<FinanceProductResultBean>  selectFinanceProduct(FinanceProductQueryBean query);

    public FinanceProduct selectOneProduct(Integer id);

    public Integer countRecordNum(FinanceProductQueryBean query);

    public void updateProduct(FinanceProduct product);

    public  void deleteProducts(DeleteQueryBean bean);

}
