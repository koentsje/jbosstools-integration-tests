package org.jboss.tools.portlet.ui.bot.test.jsf;

import static org.jboss.tools.portlet.ui.bot.entity.EntityFactory.portlet;

import org.jboss.tools.portlet.ui.bot.entity.PortletDefinition;
import org.jboss.tools.portlet.ui.bot.test.template.LoadPortletInBrowser4xRuntimeTemplate;


public class LoadJSFPortletInBrowserRuntime4x extends LoadPortletInBrowser4xRuntimeTemplate {

	@Override
	protected PortletDefinition getPortletDefinition() {
		return portlet("JSFPortlet", "JBoss JSF Portlet");
	}
}