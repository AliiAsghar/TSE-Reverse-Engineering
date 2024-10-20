package com.google.android.gms.appdatasearch;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DocumentResults extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DocumentResults> CREATOR = new abjg(7);
    final String a;
    final Bundle b;
    final Bundle c;
    final Bundle d;

    public DocumentResults(String str, Bundle bundle, Bundle bundle2, Bundle bundle3) {
        this.a = str;
        this.b = bundle;
        this.c = bundle2;
        this.d = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.t(parcel, 2, this.b);
        abhi.t(parcel, 3, this.c);
        abhi.t(parcel, 4, this.d);
        abhi.g(parcel, e);
    }
}
