/*-
 *******************************************************************************
 * Copyright (c) 2011, 2014 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Matthew Gerring - initial API and implementation and/or initial documentation
 *******************************************************************************/
package org.eclipse.richbeans.examples.example1.ui;

import org.eclipse.richbeans.api.widget.IFieldWidget;
import org.eclipse.richbeans.widgets.scalebox.ScaleBox;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SimpleComposite extends Composite {

	private ScaleBox x,y;

	public SimpleComposite(Composite parent, int style) {
		super(parent, style);
		createContent();
	}

	private void createContent() {
		
		setLayout(new GridLayout(2, false));
		
		Label label = new Label(this, SWT.NONE);
		label.setText("x");
		
		x = new ScaleBox(this, SWT.NONE);
		x.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		x.setUnit("°");
		x.setMinimum(0);
		x.setMaximum(1000);
		
		label = new Label(this, SWT.NONE);
		label.setText("y");
		
		y = new ScaleBox(this, SWT.NONE);
		y.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false));
		y.setIntegerBox(true);
		y.setUnit("m");
		y.setMinimum(0);
		y.setMaximum(x);
	}

	
	public IFieldWidget getX() {
		return x;
	}
	
	public IFieldWidget getY() {
		return y;
	}

}
