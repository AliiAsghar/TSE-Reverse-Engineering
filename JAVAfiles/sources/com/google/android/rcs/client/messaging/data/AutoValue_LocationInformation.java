package com.google.android.rcs.client.messaging.data;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AutoValue_LocationInformation extends LocationInformation {
    public final double a;
    public final double b;
    public final Optional c;
    private final Optional d;
    private final String e;
    private final Optional f;
    private final Optional g;
    private final Optional h;
    private final Optional i;

    public AutoValue_LocationInformation(Optional optional, String str, Optional optional2, Optional optional3, Optional optional4, double d, double d2, Optional optional5, Optional optional6) {
        this.d = optional;
        this.e = str;
        this.f = optional2;
        this.g = optional3;
        this.h = optional4;
        this.a = d;
        this.b = d2;
        this.c = optional5;
        this.i = optional6;
    }

    @Override // com.google.android.rcs.client.messaging.data.LocationInformation
    public final double a() {
        return this.b;
    }

    @Override // com.google.android.rcs.client.messaging.data.LocationInformation
    public final double b() {
        return this.a;
    }

    @Override // com.google.android.rcs.client.messaging.data.LocationInformation
    public final Optional c() {
        return this.i;
    }

    @Override // com.google.android.rcs.client.messaging.data.LocationInformation
    public final Optional d() {
        return this.f;
    }

    @Override // com.google.android.rcs.client.messaging.data.LocationInformation
    public final Optional e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LocationInformation) {
            LocationInformation locationInformation = (LocationInformation) obj;
            if (this.d.equals(locationInformation.h()) && this.e.equals(locationInformation.i()) && this.f.equals(locationInformation.d()) && this.g.equals(locationInformation.e()) && this.h.equals(locationInformation.f()) && Double.doubleToLongBits(this.a) == Double.doubleToLongBits(locationInformation.b()) && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(locationInformation.a()) && this.c.equals(locationInformation.g()) && this.i.equals(locationInformation.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.rcs.client.messaging.data.LocationInformation
    public final Optional f() {
        return this.h;
    }

    @Override // com.google.android.rcs.client.messaging.data.LocationInformation
    public final Optional g() {
        return this.c;
    }

    @Override // com.google.android.rcs.client.messaging.data.LocationInformation
    public final Optional h() {
        return this.d;
    }

    public final int hashCode() {
        return ((((((((((((((((this.d.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.a) >>> 32) ^ Double.doubleToLongBits(this.a)))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    @Override // com.google.android.rcs.client.messaging.data.LocationInformation
    public final String i() {
        return this.e;
    }
}
