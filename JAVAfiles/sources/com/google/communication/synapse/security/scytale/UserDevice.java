package com.google.communication.synapse.security.scytale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class UserDevice {
    final String registrationId;
    final String userId;

    public UserDevice(String str, String str2) {
        this.userId = str;
        this.registrationId = str2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UserDevice)) {
            return false;
        }
        UserDevice userDevice = (UserDevice) obj;
        if (!this.userId.equals(userDevice.userId) || !this.registrationId.equals(userDevice.registrationId)) {
            return false;
        }
        return true;
    }

    public String getRegistrationId() {
        return this.registrationId;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return ((this.userId.hashCode() + 527) * 31) + this.registrationId.hashCode();
    }

    public String toString() {
        return "UserDevice{userId=" + this.userId + ",registrationId=" + this.registrationId + "}";
    }
}
