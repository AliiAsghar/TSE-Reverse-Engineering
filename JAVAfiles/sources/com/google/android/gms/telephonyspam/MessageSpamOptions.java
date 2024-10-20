package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.achm;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MessageSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MessageSpamOptions> CREATOR = new achm(17);
    public final int a;
    public final String b;
    public final long c;
    public final List d;

    public MessageSpamOptions(int i, String str, long j, List list) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.q(parcel, 2, this.b, false);
        abhi.n(parcel, 3, this.c);
        abhi.r(parcel, 4, this.d, false);
        abhi.g(parcel, e);
    }
}
