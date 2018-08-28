package com.abcdpower.riskcontrol.zxjt.service.impl;

import com.abcdpower.riskcontrol.zxjt.dao.BaseMapper;
import com.abcdpower.riskcontrol.zxjt.service.IBaseService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service(value="baseServiceImpl")
public class BaseServiceImpl<T,I extends BaseMapper<T>> implements IBaseService<T> {
	
	private I baseMapper;

	public I getBaseMapper() {
		return baseMapper;
	}

	public void setBaseMapper(I baseMapper) {
		this.baseMapper = baseMapper;
	}

	public Object insert(T po) {
		return baseMapper.insert(po);
	}

	public int delete(Map<String, Object> param) {
		return baseMapper.delete(param);
	}

	public int update(T po) {
		return baseMapper.update(po);
	}

	public T get(Map<String, Object> param) {
		return baseMapper.get(param);
	}

	public List<T> list(Map<String, Object> param) {
		return baseMapper.list(param);
	}



}
