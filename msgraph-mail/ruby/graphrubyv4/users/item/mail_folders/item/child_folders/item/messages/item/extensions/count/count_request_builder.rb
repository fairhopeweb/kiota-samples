require 'microsoft_kiota_abstractions'
require_relative '../../../../../../../../../../graphrubyv4'
require_relative '../../../../../../../../../users'
require_relative '../../../../../../../../item'
require_relative '../../../../../../../mail_folders'
require_relative '../../../../../../item'
require_relative '../../../../../child_folders'
require_relative '../../../../item'
require_relative '../../../messages'
require_relative '../../item'
require_relative '../extensions'
require_relative './count'

module Graphrubyv4
    module Users
        module Item
            module MailFolders
                module Item
                    module ChildFolders
                        module Item
                            module Messages
                                module Item
                                    module Extensions
                                        module Count
                                            ## 
                                            # Builds and executes requests for operations under \users\{user-id}\mailFolders\{mailFolder-id}\childFolders\{mailFolder-id1}\messages\{message-id}\extensions\$count
                                            class CountRequestBuilder < MicrosoftKiotaAbstractions::BaseRequestBuilder
                                                
                                                ## 
                                                ## Instantiates a new CountRequestBuilder and sets the default values.
                                                ## @param path_parameters Path parameters for the request
                                                ## @param request_adapter The request adapter to use to execute the requests.
                                                ## @return a void
                                                ## 
                                                def initialize(path_parameters, request_adapter)
                                                    super(path_parameters, request_adapter, "{+baseurl}/users/{user%2Did}/mailFolders/{mailFolder%2Did}/childFolders/{mailFolder%2Did1}/messages/{message%2Did}/extensions/$count{?%24filter}")
                                                end
                                                ## 
                                                ## Get the number of the resource
                                                ## @param request_configuration Configuration for the request such as headers, query parameters, and middleware options.
                                                ## @return a Fiber of integer
                                                ## 
                                                def get(request_configuration=nil)
                                                    request_info = self.to_get_request_information(
                                                        request_configuration
                                                    )
                                                    return @request_adapter.send_async(request_info, number, nil)
                                                end
                                                ## 
                                                ## Get the number of the resource
                                                ## @param request_configuration Configuration for the request such as headers, query parameters, and middleware options.
                                                ## @return a request_information
                                                ## 
                                                def to_get_request_information(request_configuration=nil)
                                                    request_info = MicrosoftKiotaAbstractions::RequestInformation.new()
                                                    request_info.url_template = @url_template
                                                    request_info.path_parameters = @path_parameters
                                                    request_info.http_method = :GET
                                                    request_info.headers.add('Accept', 'text/plain')
                                                    unless request_configuration.nil?
                                                        request_info.add_headers_from_raw_object(request_configuration.headers)
                                                        request_info.set_query_string_parameters_from_raw_object(request_configuration.query_parameters)
                                                        request_info.add_request_options(request_configuration.options)
                                                    end
                                                    return request_info
                                                end
                                                ## 
                                                ## Returns a request builder with the provided arbitrary URL. Using this method means any other path or query parameters are ignored.
                                                ## @param raw_url The raw URL to use for the request builder.
                                                ## @return a count_request_builder
                                                ## 
                                                def with_url(raw_url)
                                                    raise StandardError, 'raw_url cannot be null' if raw_url.nil?
                                                    return CountRequestBuilder.new(raw_url, @request_adapter)
                                                end

                                                ## 
                                                # Get the number of the resource
                                                class CountRequestBuilderGetQueryParameters
                                                    
                                                    ## 
                                                    # Filter items by property values
                                                    attr_accessor :filter
                                                    ## 
                                                    ## Maps the query parameters names to their encoded names for the URI template parsing.
                                                    ## @param original_name The original query parameter name in the class.
                                                    ## @return a string
                                                    ## 
                                                    def get_query_parameter(original_name)
                                                        raise StandardError, 'original_name cannot be null' if original_name.nil?
                                                        case original_name
                                                            when "filter"
                                                                return "%24filter"
                                                            else
                                                                return original_name
                                                        end
                                                    end
                                                end
                                            end
                                        end
                                    end
                                end
                            end
                        end
                    end
                end
            end
        end
    end
end