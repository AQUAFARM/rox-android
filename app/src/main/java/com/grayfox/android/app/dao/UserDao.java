/*
 * Copyright 2014-2015 Daniel Pedraza-Arcega
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.grayfox.android.app.dao;

import com.google.inject.ImplementedBy;

import com.grayfox.android.app.dao.impl.sqlite.UserSqliteDao;
import com.grayfox.android.client.model.User;

@ImplementedBy(UserSqliteDao.class)
public interface UserDao {

    User fetchCurrent();

    void saveOrUpdate(User user);

    void deleteCurrent();
}