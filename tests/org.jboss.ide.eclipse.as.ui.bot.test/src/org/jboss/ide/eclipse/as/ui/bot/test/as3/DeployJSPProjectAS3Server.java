package org.jboss.ide.eclipse.as.ui.bot.test.as3;

import org.jboss.ide.eclipse.as.ui.bot.test.template.DeployJSPProjectTemplate;
import org.jboss.tools.ui.bot.ext.config.Annotations.Require;
import org.jboss.tools.ui.bot.ext.config.Annotations.Server;
import org.jboss.tools.ui.bot.ext.config.Annotations.ServerState;
import org.jboss.tools.ui.bot.ext.config.Annotations.ServerType;

/**
 * @see DeployJSPProjectTemplate
 * @author Lucia Jelinkova
 *
 */
@Require(server=@Server(type=ServerType.JbossAS, version="3.2", state=ServerState.Running))
public class DeployJSPProjectAS3Server extends DeployJSPProjectTemplate {

	@Override
	protected String getConsoleMessage() {
		return "deploy, ctxPath=/" + PROJECT_NAME;
	}
}
