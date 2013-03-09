package com.teamlazerbeez.http.di;

import com.google.inject.AbstractModule;
import com.google.inject.servlet.GuiceFilter;
import com.teamlazerbeez.http.metrics.JerseyMetricsModule;
import com.teamlazerbeez.http.sandwich.SandwichModule;
import com.yammer.metrics.Metrics;
import com.yammer.metrics.core.MetricsRegistry;

public class WebModule extends AbstractModule {
	
	@Override
	protected void configure() {
		install(new SandwichModule());
		install(new JerseyMetricsModule());
		
		bind(GuiceFilter.class);
		
		bind(MetricsRegistry.class).toInstance(Metrics.defaultRegistry());
	}
}
