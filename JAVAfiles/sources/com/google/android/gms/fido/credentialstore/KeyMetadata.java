package com.google.android.gms.fido.credentialstore;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class KeyMetadata extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyMetadata> CREATOR = new abxj(12);
    public final byte[] a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Bitmap e;

    public KeyMetadata(byte[] bArr, String str, String str2, boolean z, Bitmap bitmap) {
        boolean z2 = false;
        if (bArr != null && str != null && str2 != null) {
            z2 = true;
        }
        d.t(z2, "Parameters cannot be null");
        this.a = bArr;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = bitmap;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 1, bArr, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.h(parcel, 4, this.d);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.g(parcel, e);
    }
}
