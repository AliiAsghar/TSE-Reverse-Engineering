package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SharedKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SharedKey> CREATOR = new abmm(8);
    public final int a;
    public final byte[] b;

    public SharedKey(int i, byte[] bArr) {
        d.aC(bArr, "keyMaterial cannot be null");
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SharedKey) {
            SharedKey sharedKey = (SharedKey) obj;
            if (this.a == sharedKey.a && Arrays.equals(this.b, sharedKey.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.j(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }
}
