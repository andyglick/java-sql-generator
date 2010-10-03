/*
 * Copyright (c) 2010, Stanislav Muhametsin. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.sql.generation.api.grammar.modification;

import org.atp.api.Typeable;

/**
 * This syntax element represents a single {@code SET} element of {@code UPDATE} statement.
 * 
 * @author Stanislav Muhametsin
 */
public interface SetClause
    extends Typeable<SetClause>
{

    /**
     * Returns the update target, typically a name of the column.
     * 
     * @return The update target, typically a name of the column.
     */
    public String getUpdateTarget();

    /**
     * Returns the update source, that is, data, for the columns.
     * 
     * @return The data for the columns.
     */
    public UpdateSource getUpdateSource();
}
