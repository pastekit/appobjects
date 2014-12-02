/**
 *
 * Copyright (c) 2014 Kerby Martino and others. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.appobjects;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Transaction;

/**
 * Created by kerby on 4/28/14.
 */
public interface Unmarshaller {

    public abstract Object unmarshall(Entity entity);

    public abstract void unmarshall(Object destination, Entity entity);

    public abstract Object unmarshall(Transaction transaction, Entity entity);

    public abstract void unmarshall(Object destination, Transaction transaction, Entity entity);

}