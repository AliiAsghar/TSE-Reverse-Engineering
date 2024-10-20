package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.abhi;
import defpackage.abos;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class GoogleCertificatesLookupQuery extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleCertificatesLookupQuery> CREATOR = new abos(11);
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    private final Context f;

    public GoogleCertificatesLookupQuery(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.f = (Context) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.d = z3;
        this.e = z4;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [com.google.android.gms.dynamic.IObjectWrapper, android.os.IBinder] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.h(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.x(parcel, 4, ObjectWrapper.wrap(this.f));
        abhi.h(parcel, 5, this.d);
        abhi.h(parcel, 6, this.e);
        abhi.g(parcel, e);
    }
}
