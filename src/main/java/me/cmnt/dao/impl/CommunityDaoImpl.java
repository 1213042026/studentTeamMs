package me.cmnt.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import me.cmnt.model.Community;

@Repository("communityDao")
@SuppressWarnings("unchecked")
public class CommunityDaoImpl extends BaseDaoImpl{

	/**
     * 根据条件查找用户
     * @param obj
     * @param queryType --> 0：查找所有部门，1：根据id查找
     * @return
     */
	@Override
	public List<Object> query(Object obj, int queryType) {
		if (obj instanceof Community) {
			Community community = (Community) obj;
			String HQL = "";
			switch (queryType) {
				case 0: HQL = "from Community"; break;
				case 1: HQL = "from Community where id = " + community.getId(); break;
				case 2: HQL = "from Community where community_name = '" + community.getCommunity_name() + "'"; break;
				case 3: HQL = "from Community"; break;
				default: break;
			}
			if (!HQL.isEmpty()) {
				if (queryType == 3) {
					return sessionFactory.getCurrentSession().createQuery(HQL).setMaxResults(2).list();
				} else {
					return sessionFactory.getCurrentSession().createQuery(HQL).list();
				}
			}
		}
		return null;
	}

}
