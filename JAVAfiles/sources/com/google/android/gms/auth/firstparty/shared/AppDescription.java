package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abmi;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppDescription extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AppDescription> CREATOR = new abmi(18);
    private static final String g = "[AppDescription]";
    final int a;
    final int b;
    final String c;
    final String d;
    final String e;
    final boolean f;

    public AppDescription(int i, int i2, String str, String str2, String str3, boolean z) {
        boolean z2;
        getClass().getSimpleName();
        this.a = i;
        this.c = str;
        this.d = str2;
        abhg.l(str3, String.valueOf(g).concat(" callingPkg cannot be null or empty!"));
        this.e = str3;
        if (i2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        d.t(z2, "Invalid callingUid! Cannot be 0!");
        this.b = i2;
        this.f = z;
    }

    public final String toString() {
        return getClass().getSimpleName() + "<" + this.e + ", " + this.b + ">";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.m(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.h(parcel, 6, this.f);
        abhi.g(parcel, e);
    }
}
