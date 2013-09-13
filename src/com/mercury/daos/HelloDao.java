package com.mercury.daos;

import java.util.List;

import org.hibernate.*;

import com.mercury.beans.User;

public class HelloDao {
	public void save(User user) {
		Session session = HibernateUtil.currentSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<User> query() {
		String hql = "from User";
		Session session = HibernateUtil.currentSession();
		return session.createQuery(hql).list();
	}
}
