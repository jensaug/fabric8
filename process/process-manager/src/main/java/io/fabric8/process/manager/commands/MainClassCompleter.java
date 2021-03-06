/*
 * Copyright (C) FuseSource, Inc.
 * http://fusesource.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.fabric8.process.manager.commands;

import org.apache.karaf.shell.console.Completer;
import org.apache.karaf.shell.console.completer.StringsCompleter;

import java.util.List;

/**
 * Completes common main class names
 */
public class MainClassCompleter implements Completer {
    private String[] mainClasses = {
            "org.apache.camel.spring.javaconfig.Main",
            "org.apache.camel.spring.Main",
            "org.apache.camel.test.blueprint.Main"
    };

    @Override
    public int complete(final String buffer, final int cursor, final List candidates) {
        StringsCompleter delegate = new StringsCompleter(mainClasses);
        return delegate.complete(buffer, cursor, candidates);
    }
}
