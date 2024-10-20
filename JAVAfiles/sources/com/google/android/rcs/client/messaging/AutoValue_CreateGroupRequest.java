package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import defpackage.alog;
import defpackage.alzz;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_CreateGroupRequest extends CreateGroupRequest {
    private final PendingIntent a;
    private final String b;
    private final String c;
    private final alog d;
    private final Optional e;

    public AutoValue_CreateGroupRequest(PendingIntent pendingIntent, String str, String str2, alog alogVar, Optional optional) {
        this.a = pendingIntent;
        this.b = str;
        this.c = str2;
        this.d = alogVar;
        this.e = optional;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupRequest
    public final PendingIntent a() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupRequest
    public final alog b() {
        return this.d;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupRequest
    public final Optional c() {
        return this.e;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupRequest
    public final String d() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.CreateGroupRequest
    public final String e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CreateGroupRequest) {
            CreateGroupRequest createGroupRequest = (CreateGroupRequest) obj;
            if (this.a.equals(createGroupRequest.a()) && this.b.equals(createGroupRequest.d()) && this.c.equals(createGroupRequest.e()) && alzz.at(this.d, createGroupRequest.b()) && this.e.equals(createGroupRequest.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        Optional optional = this.e;
        alog alogVar = this.d;
        return "CreateGroupRequest{intent=" + this.a.toString() + ", id=" + this.b + ", subject=" + this.c + ", member=" + alogVar.toString() + ", opaqueData=" + String.valueOf(optional) + "}";
    }
}
