package co.com.certificacion.utils;


public enum EndPointServices {


    ENDPOINT_USUARIO("https://reqres.in/api/users/"),
    ENDPOINT_ERROR("http://dummy.restapiexample.com/api/v1/employeeE/"),

    ENDPOINT_DELETE("https://reqres.in/api/users/");

    private final String toString;

    EndPointServices(String toString) {
        this.toString = toString;
    }

    @Override
    public String toString() {
        return toString;
    }
}
