package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abzo;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InProductHelp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InProductHelp> CREATOR = new abzo(11);
    public GoogleHelp a;
    public final String b;
    public String c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;

    public InProductHelp(GoogleHelp googleHelp, String str, String str2, int i, String str3, int i2, String str4) {
        this.a = googleHelp;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = i2;
        this.g = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        abzo.a(this, parcel, i);
    }
}
