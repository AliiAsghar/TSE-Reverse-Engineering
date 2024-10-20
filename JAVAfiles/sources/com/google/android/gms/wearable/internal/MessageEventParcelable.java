package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MessageEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageEventParcelable> CREATOR = new acll(2);
    public final int a;
    public final String b;
    public final byte[] c;
    public final String d;

    public MessageEventParcelable(int i, String str, byte[] bArr, String str2) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = str2;
    }

    public final String toString() {
        Object valueOf;
        byte[] bArr = this.c;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String str = this.b;
        return "MessageEventParcelable[" + this.a + "," + str + ", size=" + valueOf.toString() + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, i2);
        abhi.q(parcel, 3, this.b, false);
        abhi.j(parcel, 4, this.c, false);
        abhi.q(parcel, 5, this.d, false);
        abhi.g(parcel, e);
    }
}
