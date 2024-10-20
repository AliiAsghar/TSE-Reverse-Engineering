package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achm;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MessageContent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageContent> CREATOR = new achm(16);
    public final int a;
    public final String b;
    public final int c;
    public final long d;

    public MessageContent(int i, String str, int i2, long j) {
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.m(parcel, 3, this.c);
        abhi.n(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
