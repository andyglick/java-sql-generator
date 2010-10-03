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

package org.sql.generation.api.grammar.query.pgsql;

import org.sql.generation.api.grammar.builders.query.pgsql.PgSQLQuerySpecificationBuilder;
import org.sql.generation.api.grammar.query.QuerySpecification;

/**
 * This syntax element represents the query specification in PostgreSQL. It adds the {@link LimitClause} and
 * {@link OffsetClause} to standard query components.
 * 
 * @author Stanislav Muhametsin
 * @see PgSQLQuerySpecificationBuilder
 */
public interface PgSQLQuerySpecification
    extends QuerySpecification
{
    /**
     * Returns the {@link LimitClause} of this query.
     * 
     * @return The {@link LimitClause} of this query.
     */
    public LimitClause getLimit();

    /**
     * Returns the {@link OffsetClause} of this query.
     * 
     * @return The {@link OffsetClause} of this query.
     */
    public OffsetClause getOffset();
}
