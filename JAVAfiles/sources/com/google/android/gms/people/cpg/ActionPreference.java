package com.google.android.gms.people.cpg;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfp;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ActionPreference extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ActionPreference> CREATOR = new acfp(16);
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final String e;
    public final int f;
    public final long g;

    public ActionPreference(String str, int i, int i2, String str2, String str3, int i3, long j) {
        this.b = i;
        this.a = str;
        this.c = i2;
        this.d = str2;
        this.e = str3;
        this.f = i3;
        this.g = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionPreference)) {
            return false;
        }
        ActionPreference actionPreference = (ActionPreference) obj;
        if (this.b == actionPreference.b && this.c == actionPreference.c && d.B(this.d, actionPreference.d) && d.B(this.a, actionPreference.a) && d.B(this.e, actionPreference.e) && this.f == actionPreference.f && this.g == actionPreference.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), this.a, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.m(parcel, 2, this.b);
        abhi.m(parcel, 3, this.c);
        abhi.q(parcel, 4, this.d, false);
        abhi.q(parcel, 5, this.e, false);
        abhi.m(parcel, 6, this.f);
        abhi.n(parcel, 7, this.g);
        abhi.g(parcel, e);
    }
}
