/*
 * Licensed to Elastic Search and Shay Banon under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. Elastic Search licenses this
 * file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.index.analysis;

import org.apache.lucene.analysis.WhitespaceAnalyzer;
import org.elasticsearch.index.Index;
import org.elasticsearch.index.settings.IndexSettings;
import org.elasticsearch.util.inject.Inject;
import org.elasticsearch.util.inject.assistedinject.Assisted;
import org.elasticsearch.util.settings.Settings;

/**
 * @author kimchy (Shay Banon)
 */
public class WhitespaceAnalyzerProvider extends AbstractIndexAnalyzerProvider<WhitespaceAnalyzer> {

    private final WhitespaceAnalyzer analyzer;

    @Inject public WhitespaceAnalyzerProvider(Index index, @IndexSettings Settings indexSettings, @Assisted String name, @Assisted Settings settings) {
        super(index, indexSettings, name);
        this.analyzer = new WhitespaceAnalyzer();
    }

    @Override public WhitespaceAnalyzer get() {
        return this.analyzer;
    }
}
