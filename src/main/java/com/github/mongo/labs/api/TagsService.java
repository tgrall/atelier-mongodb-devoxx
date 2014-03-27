/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p/>
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  <p/>
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.github.mongo.labs.api;

import com.github.mongo.labs.model.Tag;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Api(value = "/tags", description = "Consultation de tags")
@Path("/tags")
@Produces(MediaType.APPLICATION_JSON)
public class TagsService {

    @GET
    @Path("/")
    @ApiOperation(value = "Retourne les tags les plus utilisés avec leurs statistiques associés",
            notes = "Le framework d'aggrégation doit être utilisé pour remonter les bonnes données"
    )
    public Iterable<Tag> all() {
        return null;
    }
}
