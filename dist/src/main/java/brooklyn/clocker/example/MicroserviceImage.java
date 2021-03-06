/*
 * Copyright 2014-2015 by Cloudsoft Corporation Limited
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
package brooklyn.clocker.example;

import org.apache.brooklyn.api.catalog.Catalog;
import org.apache.brooklyn.api.catalog.CatalogConfig;
import org.apache.brooklyn.api.entity.ImplementedBy;
import org.apache.brooklyn.config.ConfigKey;

import brooklyn.entity.container.docker.application.VanillaDockerApplication;

/**
 * Brooklyn managed {@link VanillaDockerApplication}.
 */
@Catalog(name = "Image Microservice",
        description = "A container microservice defined by a Docker image",
        iconUrl = "classpath://container.png")
@ImplementedBy(MicroserviceImageImpl.class)
public interface MicroserviceImage extends Microservice {

    @CatalogConfig(label = "Image Name", priority = 80)
    ConfigKey<String> IMAGE_NAME = VanillaDockerApplication.IMAGE_NAME;

    @CatalogConfig(label = "Image Tag", priority = 80)
    ConfigKey<String> IMAGE_TAG = VanillaDockerApplication.IMAGE_TAG;

}
