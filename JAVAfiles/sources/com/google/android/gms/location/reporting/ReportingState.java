package com.google.android.gms.location.reporting;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abgj;
import defpackage.abhi;
import defpackage.acdi;
import defpackage.acex;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ReportingState extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ReportingState> CREATOR = new acdi(19);
    public final boolean a;
    public final boolean b;
    public final Integer c;
    public final boolean d;
    public final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;

    public ReportingState(int i, int i2, boolean z, boolean z2, int i3, int i4, Integer num, boolean z3, boolean z4) {
        this.f = i;
        this.g = i2;
        this.a = z;
        this.b = z2;
        this.h = i3;
        this.i = i4;
        this.c = num;
        this.d = z3;
        this.e = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ReportingState)) {
            return false;
        }
        ReportingState reportingState = (ReportingState) obj;
        if (this.f != reportingState.f || this.g != reportingState.g || this.a != reportingState.a || this.b != reportingState.b || this.h != reportingState.h || this.i != reportingState.i || !d.B(this.c, reportingState.c) || this.d != reportingState.d || this.e != reportingState.e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), Integer.valueOf(this.g), Boolean.valueOf(this.a), Boolean.valueOf(this.b), Integer.valueOf(this.h), Integer.valueOf(this.i), this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        String str;
        Integer num = this.c;
        if (num != null) {
            if (Log.isLoggable("GCoreUlr", 2)) {
                str = num.toString();
            } else {
                str = "tag#" + (num.intValue() % 20);
            }
        } else {
            str = "(hidden-from-unauthorized-caller)";
        }
        return "ReportingState{reportingEnabled=" + this.f + ", historyEnabled=" + this.g + ", allowed=" + this.a + ", active=" + this.b + ", expectedOptInResult=" + this.h + ", expectedOptInResultAssumingLocationEnabled=" + this.i + ", deviceTag=" + str + ", canAccessSettings=" + this.d + ", hasMigratedToOdlh=" + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 2, acex.h(this.f));
        abhi.m(parcel, 3, acex.h(this.g));
        abhi.h(parcel, 4, this.a);
        abhi.h(parcel, 5, this.b);
        abhi.m(parcel, 7, abgj.h(this.h));
        abhi.A(parcel, 8, this.c);
        abhi.m(parcel, 9, abgj.h(this.i));
        abhi.h(parcel, 10, this.d);
        abhi.h(parcel, 11, this.e);
        abhi.g(parcel, e);
    }
}
