package br.ufg.inf.estevaocs;

import org.everit.json.schema.Schema;
import org.everit.json.schema.ValidationException;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class SchemaJsonValidator {

    public void validar(String schemaName, String json, Object obj) throws ValidationException, IOException {
        try (InputStream inputStream = getClass().getResourceAsStream(schemaName)) {
            JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream));
            Schema schema = SchemaLoader.load(rawSchema);
            Reader jsonReadr = new FileReader(json);
            schema.validate(new JSONObject(jsonReadr)); // throws a ValidationException if this object is invalid
        }
    }

}
