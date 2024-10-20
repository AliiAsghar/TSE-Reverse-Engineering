package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfy;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DogfoodsToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DogfoodsToken> CREATOR = new acfy(20);
    public final byte[] a;

    public DogfoodsToken(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int e = abhi.e(parcel);
        abhi.j(parcel, 2, bArr, false);
        abhi.g(parcel, e);
    }
}
