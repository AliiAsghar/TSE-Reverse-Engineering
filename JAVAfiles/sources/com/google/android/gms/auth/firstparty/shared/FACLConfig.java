package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abmm;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FACLConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<FACLConfig> CREATOR = new abmm(1);
    final int a;
    final boolean b;
    final String c;
    final boolean d;
    final boolean e;
    final boolean f;
    final boolean g;

    public FACLConfig(int i, boolean z, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = i;
        this.b = z;
        this.c = str;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof FACLConfig) {
            FACLConfig fACLConfig = (FACLConfig) obj;
            if (this.b == fACLConfig.b && TextUtils.equals(this.c, fACLConfig.c) && this.d == fACLConfig.d && this.e == fACLConfig.e && this.f == fACLConfig.f && this.g == fACLConfig.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.h(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.h(parcel, 4, this.d);
        abhi.h(parcel, 5, this.e);
        abhi.h(parcel, 6, this.f);
        abhi.h(parcel, 7, this.g);
        abhi.g(parcel, e);
    }
}
