package com.example.practicalapp;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "wishlist136.000webhostapp.com";
    private Map<String, String> params;

    public RegisterRequest(String email, String username, String password,
                           Response.Listener<String> responseListener) {
        super(Method.POST, REGISTER_REQUEST_URL, responseListener, null);
        params = new HashMap<>();
        params.put("email", email);
        params.put("username", username);
        params.put("password", password);
    }

    @Override
    public Map<String, String> getParams() {
        return params;
    }
}
