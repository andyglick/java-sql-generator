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

package org.sql.generation.implementation.grammar.booleans;

import org.sql.generation.api.grammar.booleans.UniquePredicate;
import org.sql.generation.api.grammar.query.QueryExpression;
import org.sql.generation.implementation.transformation.spi.SQLProcessorAggregator;

/**
 * 
 * @author Stanislav Muhametsin
 */
public class UniquePredicateImpl extends UnaryPredicateImpl<UniquePredicate>
    implements UniquePredicate
{

    public UniquePredicateImpl( SQLProcessorAggregator processor, QueryExpression query )
    {
        this( processor, UniquePredicate.class, query );
    }

    protected UniquePredicateImpl( SQLProcessorAggregator processor, Class<? extends UniquePredicate> predicateClass,
        QueryExpression query )
    {
        super( processor, predicateClass, query );
    }

    @Override
    public QueryExpression getValueExpression()
    {
        return (QueryExpression) super.getValueExpression();
    }
}
