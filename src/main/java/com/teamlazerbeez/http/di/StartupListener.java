package com.teamlazerbeez.http.di;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class StartupListener extends GuiceServletContextListener {
	private Injector injector;

	@Override
	protected Injector getInjector() {
		this.injector = Guice.createInjector(new WebModule());
		return this.injector;
	}
}
