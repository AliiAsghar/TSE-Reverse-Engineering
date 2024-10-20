package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class SaveRestoreStateRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SaveRestoreStateRequest> CREATOR = new acll(16);
    public final String a;
    public final int b;
    public final byte[] c;

    public SaveRestoreStateRequest(String str, int i, byte[] bArr) {
        this.a = str;
        this.b = i;
        this.c = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.m(parcel, 2, this.b);
        abhi.j(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
