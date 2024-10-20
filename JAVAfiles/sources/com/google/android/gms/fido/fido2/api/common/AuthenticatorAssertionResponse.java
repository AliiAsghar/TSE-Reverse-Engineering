package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.abye;
import defpackage.albo;
import defpackage.algv;
import defpackage.amcn;
import defpackage.aozb;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new abye(2);
    public final aozb a;
    private final aozb b;
    private final aozb c;
    private final aozb d;
    private final aozb e;

    public AuthenticatorAssertionResponse(aozb aozbVar, aozb aozbVar2, aozb aozbVar3, aozb aozbVar4, aozb aozbVar5) {
        this.b = aozbVar;
        this.c = aozbVar2;
        this.d = aozbVar3;
        this.e = aozbVar4;
        this.a = aozbVar5;
    }

    public final byte[] a() {
        return this.d.H();
    }

    public final byte[] b() {
        return this.c.H();
    }

    @Deprecated
    public final byte[] c() {
        return this.b.H();
    }

    public final byte[] d() {
        return this.e.H();
    }

    public final byte[] e() {
        aozb aozbVar = this.a;
        if (aozbVar == null) {
            return null;
        }
        return aozbVar.H();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        if (!d.B(this.b, authenticatorAssertionResponse.b) || !d.B(this.c, authenticatorAssertionResponse.c) || !d.B(this.d, authenticatorAssertionResponse.d) || !d.B(this.e, authenticatorAssertionResponse.e) || !d.B(this.a, authenticatorAssertionResponse.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e})), Integer.valueOf(Arrays.hashCode(new Object[]{this.a}))});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("keyHandle", amcn.h.j(c()));
        aj.b("clientDataJSON", amcn.h.j(b()));
        aj.b("authenticatorData", amcn.h.j(a()));
        aj.b("signature", amcn.h.j(d()));
        byte[] e = e();
        if (e != null) {
            aj.b("userHandle", amcn.h.j(e));
        }
        return aj.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, c(), false);
        abhi.j(parcel, 3, b(), false);
        abhi.j(parcel, 4, a(), false);
        abhi.j(parcel, 5, d(), false);
        abhi.j(parcel, 6, e(), false);
        abhi.g(parcel, e);
    }
}
