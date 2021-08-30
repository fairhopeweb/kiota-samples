require 'microsoft_kiota_abstractions'
require_relative '../users'
require_relative './inference_classification'
require_relative './overrides/item/inference_classification_override_request_builder'
require_relative './overrides/overrides_request_builder'

module Graphrubyv4::Users::InferenceClassification
    ## 
    # Builds and executes requests for operations under \users\{user-id}\inferenceClassification
    class InferenceClassificationRequestBuilder
        
        ## 
        # Current path for the request
        @current_path
        ## 
        # The http core service to use to execute the requests.
        @http_core
        ## 
        # Whether the current path is a raw URL
        @is_raw_url
        def overrides()
            return Graphrubyv4::Users::InferenceClassification::Overrides::OverridesRequestBuilder.new(@current_path + @path_segment , @http_core, false)
        end
        ## 
        # Path segment to use to build the URL for the current request builder
        @path_segment
        ## 
        ## Instantiates a new InferenceClassificationRequestBuilder and sets the default values.
        ## @param currentPath Current path for the request
        ## @param httpCore The http core service to use to execute the requests.
        ## @param isRawUrl Whether the current path is a raw URL
        ## @return a void
        ## 
        def initialize(current_path, http_core, is_raw_url=true) 
            @path_segment = "/inferenceClassification"
            @http_core = http_core
            @current_path = current_path
            @is_raw_url = is_raw_url
        end
        ## 
        ## Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
        ## @param h Request headers
        ## @param o Request options for HTTP middlewares
        ## @return a request_information
        ## 
        def create_delete_request_information(h=nil, o=nil) 
            request_info = MicrosoftKiotaAbstractions::RequestInformation.new()
            request_info.set_uri(@current_path, @path_segment, @is_raw_url)
            request_info.http_method = :DELETE
            request_info.set_headers_from_raw_object(h)
            return request_info;
        end
        ## 
        ## Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
        ## @param h Request headers
        ## @param o Request options for HTTP middlewares
        ## @param q Request query parameters
        ## @return a request_information
        ## 
        def create_get_request_information(q=nil, h=nil, o=nil) 
            request_info = MicrosoftKiotaAbstractions::RequestInformation.new()
            request_info.set_uri(@current_path, @path_segment, @is_raw_url)
            request_info.http_method = :GET
            request_info.set_headers_from_raw_object(h)
            request_info.set_query_string_parameters_from_raw_object(q)
            return request_info;
        end
        ## 
        ## Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
        ## @param body 
        ## @param h Request headers
        ## @param o Request options for HTTP middlewares
        ## @return a request_information
        ## 
        def create_patch_request_information(body, h=nil, o=nil) 
            request_info = MicrosoftKiotaAbstractions::RequestInformation.new()
            request_info.set_uri(@current_path, @path_segment, @is_raw_url)
            request_info.http_method = :PATCH
            request_info.set_headers_from_raw_object(h)
            request_info.set_content_from_parsable(self.serializer_factory, "application/json", body)
            return request_info;
        end
        ## 
        ## Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
        ## @param h Request headers
        ## @param o Request options for HTTP middlewares
        ## @param responseHandler Response handler to use in place of the default response handling provided by the core service
        ## @return a CompletableFuture of void
        ## 
        def delete(h=nil, o=nil, response_handler=nil) 
            request_info = self.create_delete_request_information(
                h
            )
            return @http_core.send_async(request_info, nil, response_handler)
        end
        ## 
        ## Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
        ## @param h Request headers
        ## @param o Request options for HTTP middlewares
        ## @param q Request query parameters
        ## @param responseHandler Response handler to use in place of the default response handling provided by the core service
        ## @return a CompletableFuture of inference_classification
        ## 
        def get(q=nil, h=nil, o=nil, response_handler=nil) 
            request_info = self.create_get_request_information(
                q, h
            )
            return @http_core.send_async(request_info, Graphrubyv4::Users::InferenceClassification::InferenceClassification, response_handler)
        end
        ## 
        ## Gets an item from the graphrubyv4.users.inferenceClassification.overrides collection
        ## @param id Unique identifier of the item
        ## @return a inference_classification_override_request_builder
        ## 
        def overrides_by_id(id) 
            return Graphrubyv4::Users::InferenceClassification::Overrides::Item::InferenceClassificationOverrideRequestBuilder.new(@current_path + @path_segment  + "/overrides/" + id, @http_core, false)
        end
        ## 
        ## Relevance classification of the user's messages based on explicit designations which override inferred relevance or importance.
        ## @param body 
        ## @param h Request headers
        ## @param o Request options for HTTP middlewares
        ## @param responseHandler Response handler to use in place of the default response handling provided by the core service
        ## @return a CompletableFuture of void
        ## 
        def patch(body, h=nil, o=nil, response_handler=nil) 
            request_info = self.create_patch_request_information(
                body, h
            )
            return @http_core.send_async(request_info, nil, response_handler)
        end
    end
end
