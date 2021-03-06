/*
 * Copyright (c) 2013, 2017 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.tyrus.server;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.websocket.Decoder;
import javax.websocket.Encoder;
import javax.websocket.Extension;
import javax.websocket.server.ServerEndpointConfig;

/**
 * @author Stepan Kopriva (stepan.kopriva at oracle.com)
 */
public abstract class ServerEndpointConfigAdapter implements ServerEndpointConfig {
    @Override
    public String getPath() {
        return null;
    }

    @Override
    public List<Class<? extends Encoder>> getEncoders() {
        return null;
    }

    @Override
    public List<Class<? extends Decoder>> getDecoders() {
        return null;
    }

    @Override
    public List<String> getSubprotocols() {
        return Collections.emptyList();

    }

    @Override
    public List<Extension> getExtensions() {
        return Collections.emptyList();
    }

    @Override
    public Map<String, Object> getUserProperties() {
        return Collections.emptyMap();
    }

    @Override
    public Configurator getConfigurator() {
        return new ServerEndpointConfig.Configurator() {
        };
    }
}
