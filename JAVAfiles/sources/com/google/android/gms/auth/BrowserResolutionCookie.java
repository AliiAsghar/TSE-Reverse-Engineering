package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abkq;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BrowserResolutionCookie extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BrowserResolutionCookie> CREATOR = new abkq(0);
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public boolean f;
    public boolean g;

    private BrowserResolutionCookie() {
        this.d = "/";
        this.e = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BrowserResolutionCookie) {
            BrowserResolutionCookie browserResolutionCookie = (BrowserResolutionCookie) obj;
            if (d.B(this.a, browserResolutionCookie.a) && d.B(this.b, browserResolutionCookie.b) && d.B(this.c, browserResolutionCookie.c) && d.B(this.d, browserResolutionCookie.d) && d.B(Long.valueOf(this.e), Long.valueOf(browserResolutionCookie.e)) && d.B(Boolean.valueOf(this.f), Boolean.valueOf(browserResolutionCookie.f)) && d.B(Boolean.valueOf(this.g), Boolean.valueOf(browserResolutionCookie.g))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.g)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.q(parcel, 4, this.d, false);
        abhi.n(parcel, 5, this.e);
        abhi.h(parcel, 6, this.f);
        abhi.h(parcel, 7, this.g);
        abhi.g(parcel, e);
    }

    public BrowserResolutionCookie(String str, String str2, String str3, String str4, long j, boolean z, boolean z2) {
        this.d = "/";
        this.e = -1L;
        abhg.k(str);
        this.a = str;
        abhg.k(str2);
        this.b = str2;
        abhg.k(str3);
        this.c = str3;
        abhg.k(str4);
        this.d = str4;
        this.e = j;
        this.f = z;
        this.g = z2;
    }
}
