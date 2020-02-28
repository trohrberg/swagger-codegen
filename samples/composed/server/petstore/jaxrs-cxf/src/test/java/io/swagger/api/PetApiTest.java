/**
 * Swagger Petstore
 * This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.api;

import io.swagger.model.Body1;
import io.swagger.model.Body2;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Swagger Petstore
 *
 * <p>This is a sample Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/). 
 *
 * API tests for PetApi 
 */
public class PetApiTest {


    private PetApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("/", PetApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Add a new parrow to the store
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addParrotTest() {
        Body2 body = null;
        //InlineResponse2001 response = api.addParrot(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Add a new pet to the store
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPetTest() {
        Pet body = null;
        //api.addPet(body);
        
        // TODO: test validations
        
        
    }
    /**
     * Deletes a pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePetTest() {
        Long petId = null;
        String apiKey = null;
        //api.deletePet(petId, apiKey);
        
        // TODO: test validations
        
        
    }
    /**
     * Find pet by ID
     *
     * schedule pet feeding
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void feedPetTest() {
        Pet body = null;
        String token = null;
        String petType = null;
        String status = null;
        Long petId = null;
        String sessionId = null;
        //api.feedPet(body, token, petType, status, petId, sessionId);
        
        // TODO: test validations
        
        
    }
    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() {
        List<String> status = null;
        //List<Pet> response = api.findPetsByStatus(status);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Finds Pets by tags
     *
     * Muliple tags can be provided with comma separated strings. Use\\ \\ tag1, tag2, tag3 for testing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() {
        List<String> tags = null;
        //List<Pet> response = api.findPetsByTags(tags);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * get Parrots
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getParrotsTest() {
        //List<Object> response = api.getParrots();
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPetByIdTest() {
        Long petId = null;
        //Pet response = api.getPetById(petId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * update parrots
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateParrotsTest() {
        Body1 body = null;
        //InlineResponse200 response = api.updateParrots(body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Update an existing pet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePetTest() {
        Pet body = null;
        //api.updatePet(body);
        
        // TODO: test validations
        
        
    }
    /**
     * Updates a pet in the store with form data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePetWithFormTest() {
        Long petId = null;
        String name = null;
        String status = null;
        //api.updatePetWithForm(petId, name, status);
        
        // TODO: test validations
        
        
    }
    /**
     * uploads an image
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void uploadFileTest() {
        Long petId = null;
        org.apache.cxf.jaxrs.ext.multipart.Attachment body = null;
        //ModelApiResponse response = api.uploadFile(petId, body);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
}
