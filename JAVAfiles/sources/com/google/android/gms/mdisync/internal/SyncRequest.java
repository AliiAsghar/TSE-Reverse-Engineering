package com.google.android.gms.mdisync.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.mdisync.SyncOptions;
import defpackage.a;
import defpackage.abhi;
import defpackage.acfe;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SyncRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SyncRequest> CREATOR = new acfe(10);
    public final byte[] a;
    public final SyncOptions b;
    private final int c;

    public SyncRequest(int i, byte[] bArr, SyncOptions syncOptions) {
        int U = a.U(i);
        this.c = U == 0 ? 1 : U;
        this.a = bArr;
        this.b = syncOptions;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.c - 1;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.j(parcel, 2, this.a, false);
        abhi.o(parcel, 3, this.b, i, false);
        abhi.g(parcel, e);
    }
}
