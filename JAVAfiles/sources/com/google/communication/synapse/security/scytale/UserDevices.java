package com.google.communication.synapse.security.scytale;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class UserDevices {
    final ArrayList<String> deviceIds;
    final String userId;

    public UserDevices(String str, ArrayList<String> arrayList) {
        this.userId = str;
        this.deviceIds = arrayList;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UserDevices)) {
            return false;
        }
        UserDevices userDevices = (UserDevices) obj;
        if (!this.userId.equals(userDevices.userId) || !this.deviceIds.equals(userDevices.deviceIds)) {
            return false;
        }
        return true;
    }

    public ArrayList<String> getDeviceIds() {
        return this.deviceIds;
    }

    public String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return ((this.userId.hashCode() + 527) * 31) + this.deviceIds.hashCode();
    }

    public String toString() {
        return "UserDevices{userId=" + this.userId + ",deviceIds=" + String.valueOf(this.deviceIds) + "}";
    }
}
