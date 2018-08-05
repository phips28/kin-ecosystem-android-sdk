package com.kin.ecosystem.core.network.model;/*
 * Kin Ecosystem
 * Apis for client to server interaction
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * payload required for signing in
 */
public class SignInData {

    @SerializedName("jwt")
    private String jwt = null;
    @SerializedName("user_id")
    private String userId = null;
    @SerializedName("app_id")
    private String appId = null;
    @SerializedName("device_id")
    private String deviceId = null;
    @SerializedName("api_key")
    private String apiKey = null;
    @SerializedName("wallet_address")
    private String walletAddress = null;

    /**
     * Gets or Sets signInType
     */
    @JsonAdapter(SignInTypeEnum.Adapter.class)
    public enum SignInTypeEnum {

        JWT("jwt"),
        WHITELIST("whitelist");

        private String value;

        SignInTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static SignInTypeEnum fromValue(String text) {
            for (SignInTypeEnum b : SignInTypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public static class Adapter extends TypeAdapter<SignInTypeEnum> {

            @Override
            public void write(final JsonWriter jsonWriter, final SignInTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public SignInTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return SignInTypeEnum.fromValue(String.valueOf(value));
            }
        }
    }

    @SerializedName("sign_in_type")
    private SignInTypeEnum signInType = null;

    public SignInData jwt(String jwt) {
        this.jwt = jwt;
        return this;
    }


    /**
     * jwt should contain \&quot;user_id\&quot;, \&quot;app_id\&quot; and \&quot;timestamp\&quot;, issuer,
     *
     * @return jwt
     **/
    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }

    public SignInData userId(String userId) {
        this.userId = userId;
        return this;
    }


    /**
     * Get userId
     *
     * @return userId
     **/
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SignInData appId(String appId) {
        this.appId = appId;
        return this;
    }


    /**
     * Get appId
     *
     * @return appId
     **/
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public SignInData deviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get deviceId
     *
     * @return deviceId
     **/
    public String getDeviceId() {
        return deviceId;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public SignInData apiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public String getApiKey() {
        return this.apiKey;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public SignInData walletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
        return this;
    }


    /**
     * the address where earned funds will go to
     *
     * @return publicAddress
     **/
    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }

    public SignInData signInType(SignInTypeEnum signInType) {
        this.signInType = signInType;
        return this;
    }


    /**
     * Get signInType
     *
     * @return signInType
     **/
    public SignInTypeEnum getSignInType() {
        return signInType;
    }

    public void setSignInType(SignInTypeEnum signInType) {
        this.signInType = signInType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SignInData signInData = (SignInData) o;
        return this.jwt.equals(signInData.jwt) &&
            this.userId.equals(signInData.userId) &&
            this.appId.equals(signInData.appId) &&
            this.deviceId.equals(signInData.deviceId) &&
            this.walletAddress.equals(signInData.walletAddress) &&
            this.signInType.equals(signInData.signInType);
    }

    @Override
    public int hashCode() {
        return jwt.hashCode() + userId.hashCode() + appId.hashCode() +
            deviceId.hashCode() + walletAddress.hashCode() + signInType.hashCode();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignInData {\n");

        sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
        sb.append("    deviceId: ").append(toIndentedString(deviceId)).append("\n");
        sb.append("    publicAddress: ").append(toIndentedString(walletAddress)).append("\n");
        sb.append("    signInType: ").append(toIndentedString(signInType)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}


