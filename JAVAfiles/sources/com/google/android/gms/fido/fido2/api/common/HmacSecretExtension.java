package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abzb;
import defpackage.aozb;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class HmacSecretExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HmacSecretExtension> CREATOR = new abzb(14);
    public final int a;
    private final aozb b;
    private final aozb c;
    private final aozb d;

    public HmacSecretExtension(aozb aozbVar, aozb aozbVar2, aozb aozbVar3, int i) {
        this.b = aozbVar;
        this.c = aozbVar2;
        this.d = aozbVar3;
        this.a = i;
    }

    public final byte[] a() {
        aozb aozbVar = this.b;
        if (aozbVar == null) {
            return null;
        }
        return aozbVar.H();
    }

    public final byte[] b() {
        aozb aozbVar = this.d;
        if (aozbVar == null) {
            return null;
        }
        return aozbVar.H();
    }

    public final byte[] c() {
        aozb aozbVar = this.c;
        if (aozbVar == null) {
            return null;
        }
        return aozbVar.H();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof HmacSecretExtension)) {
            return false;
        }
        HmacSecretExtension hmacSecretExtension = (HmacSecretExtension) obj;
        if (!d.B(this.b, hmacSecretExtension.b) || !d.B(this.c, hmacSecretExtension.c) || !d.B(this.d, hmacSecretExtension.d) || this.a != hmacSecretExtension.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, Integer.valueOf(this.a)});
    }

    public final String toString() {
        return "HmacSecretExtension{coseKeyAgreement=" + abhn.g(a()) + ", saltEnc=" + abhn.g(c()) + ", saltAuth=" + abhn.g(b()) + ", getPinUvAuthProtocol=" + this.a + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.j(parcel, 1, a(), false);
        abhi.j(parcel, 2, c(), false);
        abhi.j(parcel, 3, b(), false);
        abhi.m(parcel, 4, this.a);
        abhi.g(parcel, e);
    }
}
