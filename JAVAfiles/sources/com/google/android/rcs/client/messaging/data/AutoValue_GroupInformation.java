package com.google.android.rcs.client.messaging.data;

import defpackage.alog;
import defpackage.alzz;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_GroupInformation extends GroupInformation {
    private final String a;
    private final String b;
    private final String c;
    private final alog d;
    private final Optional e;
    private final Optional f;

    public AutoValue_GroupInformation(String str, String str2, String str3, alog alogVar, Optional optional, Optional optional2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = alogVar;
        this.e = optional;
        this.f = optional2;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupInformation
    public final alog a() {
        return this.d;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupInformation
    public final Optional b() {
        return this.e;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupInformation
    public final Optional c() {
        return this.f;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupInformation
    public final String d() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupInformation
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GroupInformation) {
            GroupInformation groupInformation = (GroupInformation) obj;
            if (this.a.equals(groupInformation.e()) && this.b.equals(groupInformation.f()) && this.c.equals(groupInformation.d()) && alzz.at(this.d, groupInformation.a()) && this.e.equals(groupInformation.b()) && this.f.equals(groupInformation.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.rcs.client.messaging.data.GroupInformation
    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }
}
