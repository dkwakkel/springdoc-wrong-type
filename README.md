# SpringDoc NPE issue with HATEOAS

This is a slight modification of https://github.com/didjoman/Springdoc-String-Schema-returned-mediatype-issue 

```sh
git clone https://github.com/smurf667/springdoc-npe
mvn spring-boot:run
curl --location --request GET http://localhost:8080/api-docs --header "Content-Type: application/json"
```

The `NullPointerException` can be seen in `org.springdoc.core.converters.HateoasLinksConverter.resolve(AnnotatedType, ModelConverterContext, Iterator<ModelConverter>)` with a debugger; it is silently handled.
