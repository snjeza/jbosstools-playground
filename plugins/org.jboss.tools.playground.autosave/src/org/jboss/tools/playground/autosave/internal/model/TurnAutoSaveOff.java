/*******************************************************************************
 * Copyright (c) 2014 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributor:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/
package org.jboss.tools.playground.autosave.internal.model;

import org.jboss.tools.playground.autosave.internal.AutoSaveProcessor;

/**
 * @author "Ilya Buziuk (ibuziuk)"
 */
public class TurnAutoSaveOff implements Command {

	@Override
	public void execute() {
		AutoSaveProcessor.INSTANCE.disableAutoSave();
//		AutoSaveJob.getInstance().cancel();
	}

}
