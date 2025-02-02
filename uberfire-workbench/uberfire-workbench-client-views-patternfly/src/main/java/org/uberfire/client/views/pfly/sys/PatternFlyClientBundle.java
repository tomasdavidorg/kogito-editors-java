/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.client.views.pfly.sys;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;
import com.google.gwt.resources.client.TextResource;

public interface PatternFlyClientBundle extends ClientBundle {

    PatternFlyClientBundle INSTANCE = GWT.create(PatternFlyClientBundle.class);

    @Source("org/uberfire/client/views/static/bootstrap-select/js/bootstrap-select.min.js")
    TextResource bootstrapSelect();

    @Source("org/uberfire/client/views/static/js/patternfly.min.js")
    TextResource patternFly();

    @Source("org/uberfire/client/views/static/moment/moment-with-locales.min.js")
    TextResource moment();

    @Source("org/uberfire/client/views/static/moment-timezone/moment-timezone-with-data-2012-2022.min.js")
    TextResource momentTimeZone();

    @DataResource.DoNotEmbed
    @DataResource.MimeType("text/javascript")
    @Source("org/uberfire/client/views/static/appformer-js-monaco/monaco.min.js")
    DataResource monacoEditor();
}
