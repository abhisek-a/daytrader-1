md pods_combined
copy "accounts\deployment.yaml"                        "pods_combined\accounts_deployment.yaml"
copy "accounts\service.yaml"                           "pods_combined\accounts_service.yaml"
copy "gateway\deployment.yaml"                         "pods_combined\gateway_deployment.yaml"
copy "gateway\service.yaml"                            "pods_combined\gateway_service.yaml"
copy "portfolios\deployment.yaml"                      "pods_combined\portfolios_deployment.yaml"
copy "portfolios\service.yaml"                         "pods_combined\portfolios_service.yaml"
copy "quotes\deployment.yaml"                          "pods_combined\quotes_deployment.yaml"
copy "quotes\service.yaml"                             "pods_combined\quotes_service.yaml"
copy "report-generator\deployment.yaml"                "pods_combined\report-generator_deployment.yaml"
copy "scdf-trade-generator\deployment.yaml"            "pods_combined\scdf-trade-generator_deployment.yaml"
copy "scdf-trade-generator\service.yaml"               "pods_combined\scdf-trade-generator_service.yaml"
copy "scdf-trade-processor\deployment.yaml"            "pods_combined\scdf-trade-processor_deployment.yaml"
copy "scdf-trade-processor\service.yaml"               "pods_combined\scdf-trade-processor_service.yaml"
copy "scdf-trade-validation\deployment.yaml"           "pods_combined\scdf-trade-validation_deployment.yaml"
copy "scdf-trade-validation\service.yaml"              "pods_combined\scdf-trade-validation_service.yaml"
copy "trade-consumer\deployment.yaml"                  "pods_combined\trade-consumer_deployment.yaml"
copy "trade-consumer\service.yaml"                     "pods_combined\trade-consumer_service.yaml"
copy "trade-producer\deployment.yaml"                  "pods_combined\trade-producer_deployment.yaml"
copy "trade-producer\service.yaml"                     "pods_combined\trade-producer_service.yaml"
copy "web\deployment.yaml"                             "pods_combined\web_deployment.yaml"
copy "web\service.yaml"                                "pods_combined\web_service.yaml"
copy "web-react\deployment.yaml"                       "pods_combined\web-react_deployment.yaml"
copy "web-react\service.yaml"                          "pods_combined\web-react_service.yaml"
