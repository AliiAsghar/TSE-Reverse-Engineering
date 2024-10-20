package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjj;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class UsageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UsageInfo> CREATOR = new abjj(14);
    final DocumentId a;
    final long b;
    final int c;
    public final String d;
    final DocumentContents e;
    final boolean f;
    final int g;
    final int h;
    public final String i;

    public UsageInfo(DocumentId documentId, long j, int i, String str, DocumentContents documentContents, boolean z, int i2, int i3, String str2) {
        this.a = documentId;
        this.b = j;
        this.c = i;
        this.d = str;
        this.e = documentContents;
        this.f = z;
        this.g = i2;
        this.h = i3;
        this.i = str2;
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.h));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.n(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.q(parcel, 4, this.d, false);
        abhi.o(parcel, 5, this.e, i, false);
        abhi.h(parcel, 6, this.f);
        abhi.m(parcel, 7, this.g);
        abhi.m(parcel, 8, this.h);
        abhi.q(parcel, 9, this.i, false);
        abhi.g(parcel, e);
    }
}
