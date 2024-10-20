package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abzb;
import defpackage.aozb;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CableAuthenticationData extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CableAuthenticationData> CREATOR = new abzb(4);
    public final long a;
    private final aozb b;
    private final aozb c;
    private final aozb d;

    public CableAuthenticationData(long j, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        abhg.m(bArr);
        aozb w = aozb.w(bArr);
        abhg.m(bArr2);
        aozb w2 = aozb.w(bArr2);
        abhg.m(bArr3);
        aozb w3 = aozb.w(bArr3);
        this.a = j;
        this.b = w;
        this.c = w2;
        this.d = w3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CableAuthenticationData)) {
            return false;
        }
        CableAuthenticationData cableAuthenticationData = (CableAuthenticationData) obj;
        if (this.a != cableAuthenticationData.a || !d.B(this.b, cableAuthenticationData.b) || !d.B(this.c, cableAuthenticationData.c) || !d.B(this.d, cableAuthenticationData.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int e = abhi.e(parcel);
        abhi.n(parcel, 1, j);
        abhi.j(parcel, 2, this.b.H(), false);
        abhi.j(parcel, 3, this.c.H(), false);
        abhi.j(parcel, 4, this.d.H(), false);
        abhi.g(parcel, e);
    }
}
