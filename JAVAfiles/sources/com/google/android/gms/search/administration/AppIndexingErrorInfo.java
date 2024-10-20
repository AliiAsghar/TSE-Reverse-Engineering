package com.google.android.gms.search.administration;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;
import defpackage.abhi;
import defpackage.acgc;
import defpackage.aoee;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppIndexingErrorInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppIndexingErrorInfo> CREATOR = new acgc(9);
    public String a;
    public int b;
    public int c;
    public String d;
    public long e;
    public Thing f;
    public aoee g;

    public AppIndexingErrorInfo() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.q(parcel, 4, this.d, false);
        abhi.n(parcel, 5, this.e);
        abhi.o(parcel, 6, this.f, i, false);
        abhi.o(parcel, 7, this.g, i, false);
        abhi.g(parcel, e);
    }

    public AppIndexingErrorInfo(String str, int i, int i2, String str2, long j, Thing thing, aoee aoeeVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = j;
        this.f = thing;
        this.g = aoeeVar;
    }
}
