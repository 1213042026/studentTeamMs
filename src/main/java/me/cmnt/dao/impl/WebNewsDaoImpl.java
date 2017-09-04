package me.cmnt.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import me.cmnt.model.WebNews;

@Repository("webNewsDao")
@SuppressWarnings("unchecked")
public class WebNewsDaoImpl extends BaseDaoImpl {

	/**
     * 根据条件查找
     * @param obj
     * @param queryType --> 0：查找所有，1：根据id查找，2：根据用户id查找，3：显示最多10条新闻
     * @return
     */
	@Override
	public List<Object> query(Object obj, int queryType) {
		if (obj instanceof WebNews) {
			WebNews webNews = (WebNews) obj;
			String HQL = "";
			switch (queryType) {
				case 0: HQL = "from WebNews"; break;
				case 1: HQL = "from WebNews where id = " + webNews.getId(); break;
				case 2: HQL = "from WebNews where user_id = " + webNews.getUser_id(); break;
				case 3: HQL = "from WebNews"; break;
				default: break;
			}
			if (!HQL.isEmpty()) {
				if (queryType == 3) {
					return sessionFactory.getCurrentSession().createQuery(HQL).setMaxResults(10).list();
				} else {
					return sessionFactory.getCurrentSession().createQuery(HQL).list();
				}
			}
		}
		return null;
	}

}
