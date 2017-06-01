package com.eichinn.flyweight.practical;

/**
 * Created by ei_chinn on 2017/6/1.
 */
public class AuthorizationFlyweight implements Flyweight{

    private String securityEntity;
    private String permit;

    public AuthorizationFlyweight(String state) {
        String[] states = state.split(",");
        securityEntity = states[0];
        permit = states[1];
    }

    public String getSecurityEntity() {
        return securityEntity;
    }

    public String getPermit() {
        return permit;
    }

    @Override
    public boolean match(String securityEntity, String permit) {
        return this.securityEntity.equals(securityEntity) && this.permit.equals(permit);
    }

    @Override
    public void add(Flyweight flyweight) {
        throw new UnsupportedOperationException("unsupported operation");
    }
}
