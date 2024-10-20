package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abjj;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RegisterSectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RegisterSectionInfo> CREATOR = new abjj(4);
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final boolean e;
    public final String f;
    public final Feature[] g;
    public final String h;
    public final ScoringConfig i;

    public RegisterSectionInfo(String str, String str2, boolean z, int i, boolean z2, String str3, Feature[] featureArr, String str4, ScoringConfig scoringConfig) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = z2;
        this.f = str3;
        this.g = featureArr;
        this.h = str4;
        this.i = scoringConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegisterSectionInfo)) {
            return false;
        }
        RegisterSectionInfo registerSectionInfo = (RegisterSectionInfo) obj;
        if (this.c == registerSectionInfo.c && this.d == registerSectionInfo.d && this.e == registerSectionInfo.e && d.B(this.a, registerSectionInfo.a) && d.B(this.b, registerSectionInfo.b) && d.B(this.f, registerSectionInfo.f) && d.B(this.h, registerSectionInfo.h) && d.B(this.i, registerSectionInfo.i) && Arrays.equals(this.g, registerSectionInfo.g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Boolean.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), this.f, Integer.valueOf(Arrays.hashCode(this.g)), this.h, this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.h(parcel, 3, this.c);
        abhi.m(parcel, 4, this.d);
        abhi.h(parcel, 5, this.e);
        abhi.q(parcel, 6, this.f, false);
        abhi.H(parcel, 7, this.g, i);
        abhi.q(parcel, 11, this.h, false);
        abhi.o(parcel, 12, this.i, i, false);
        abhi.g(parcel, e);
    }
}
