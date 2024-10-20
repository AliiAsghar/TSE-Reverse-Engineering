package com.google.android.gms.search.queries;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achi;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class Annotation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<Annotation> CREATOR = new achi(14);
    public final int a;
    public final byte[] b;

    public Annotation(int i, byte[] bArr) {
        this.a = i;
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.j(parcel, 5, this.b, false);
        abhi.g(parcel, e);
    }
}
