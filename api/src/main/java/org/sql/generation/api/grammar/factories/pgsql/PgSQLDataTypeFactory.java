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

package org.sql.generation.api.grammar.factories.pgsql;

import org.sql.generation.api.grammar.common.datatypes.pgsql.Text;
import org.sql.generation.api.grammar.factories.DataTypeFactory;

/**
 * This is factory for creating SQL pre-defined types, as well as types specific for PostgreSQL.
 * 
 * @author Stanislav Muhametsin
 */
public interface PgSQLDataTypeFactory
    extends DataTypeFactory
{

    /**
     * Creates the data type representing {@code TEXT} data type.
     * 
     * @return The data type representing {@code TEXT} data type.
     */
    public Text text();
}
