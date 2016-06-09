package br.com.iarecommender.recommender.service;

import java.util.HashSet;
import java.util.Set;

public class Application extends javax.ws.rs.core.Application {

	@Override
	public Set<Class<?>> getClasses() {
		HashSet<Class<?>> rs = new HashSet<Class<?>>();
		
		rs.add(TestService.class);

		return rs;
	}

}
