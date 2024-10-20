package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abkq;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated(forRemoval = true)
/* loaded from: classes2.dex */
public class AuthzenBeginTxData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthzenBeginTxData> CREATOR = new abkq(1);
    final int a;
    final int b;
    public final byte[] c;

    public AuthzenBeginTxData(int i, int i2, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthzenBeginTxData)) {
            return false;
        }
        AuthzenBeginTxData authzenBeginTxData = (AuthzenBeginTxData) obj;
        if (this.b != authzenBeginTxData.b || !Arrays.equals(this.c, authzenBeginTxData.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 2, this.b);
        abhi.j(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
