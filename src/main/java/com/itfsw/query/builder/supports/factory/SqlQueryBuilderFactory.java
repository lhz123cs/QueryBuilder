/*
 * Copyright (c) 2017.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.itfsw.query.builder.supports.factory;

import com.itfsw.query.builder.config.SqlBuilderConfig;
import com.itfsw.query.builder.supports.SqlBuilder;

/**
 * ---------------------------------------------------------------------------
 *
 * ---------------------------------------------------------------------------
 * @author: hewei
 * @time:2017/10/30 16:23
 * ---------------------------------------------------------------------------
 */
public class SqlQueryBuilderFactory extends AbstractQueryBuilderFactory {
    private SqlBuilderConfig config;    // 配置

    /**
     * 获取构建对象
     * @return
     */
    @Override
    public SqlBuilder builder(){
        return null;
    }
}
