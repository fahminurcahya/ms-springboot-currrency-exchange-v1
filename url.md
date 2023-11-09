- port
  Limit service (8080, 8081, ...)
  spring cloud config server (8888)
  currency-exchange (8000, 8001, ...)
  currency-conversion (8100, 8101, ...)
  eureka naming server (8761)
  api getway (8765)
  zipkin (9411)

- currency-exchange
  http://localhost:8000/currency-exchange/from/USD/to/INR
  http://localhost:8001/currency-exchange/from/USD/to/INR

- currency-conversion
  http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10
  http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10

- Initial
  http://localhost:8765/CURRENCY-EXCHANGE/currency-exchange/from/USD/to/INR
  http://localhost:8765/CURRENCY-CONVERSION/currency-conversion/from/USD/to/INR/quantity/10
  http://localhost:8765/CURRENCY-CONVERSION/currency-conversion-feign/from/USD/to/INR/quantity/10

- Lower Case
  http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR
  http://localhost:8765/currency-conversion/currency-conversion/from/USD/to/INR/quantity/10
  http://localhost:8765/currency-conversion/currency-conversion-feign/from/USD/to/INR/quantity/10

- Custom Routes
  http://localhost:8765/currency-exchange/from/USD/to/INR
  http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
  http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
  http://localhost:8765/currency-conversion-new/from/USD/to/INR/quantity/10
