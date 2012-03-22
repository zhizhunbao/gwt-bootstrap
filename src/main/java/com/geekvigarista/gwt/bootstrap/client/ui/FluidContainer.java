package com.geekvigarista.gwt.bootstrap.client.ui;

import com.geekvigarista.gwt.bootstrap.client.ui.base.DivWidget;
import com.geekvigarista.gwt.bootstrap.client.ui.resources.Bootstrap;
import com.google.gwt.user.client.ui.IsWidget;

/**
 *
 * @author carlos
 */
public class FluidContainer extends DivWidget {

    public FluidContainer() {
        setStylePrimaryName(Bootstrap.container_fluid);
    }

    @Override
    public void add(IsWidget child) {
        assert child instanceof Column : "Child must be a Column";
        super.add(child);
    }
}