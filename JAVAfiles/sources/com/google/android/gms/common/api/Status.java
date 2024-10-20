package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abgj;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abos;
import defpackage.abrm;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable, abrm {
    public final int f;
    public final String g;
    public final PendingIntent h;
    public final ConnectionResult i;
    public static final Status a = new Status(0);
    public static final Status b = new Status(14);
    public static final Status c = new Status(8);
    public static final Status d = new Status(15);
    public static final Status e = new Status(16);
    public static final Parcelable.Creator<Status> CREATOR = new abos(17);

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.f = i;
        this.g = str;
        this.h = pendingIntent;
        this.i = connectionResult;
    }

    public final String b() {
        String str = this.g;
        if (str != null) {
            return str;
        }
        return abgj.f(this.f);
    }

    public final boolean c() {
        if (this.f <= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.f != status.f || !d.B(this.g, status.g) || !d.B(this.h, status.h) || !d.B(this.i, status.i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f), this.g, this.h, this.i});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        abhg.q("statusCode", b(), arrayList);
        abhg.q("resolution", this.h, arrayList);
        return abhg.p(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.f;
        int e2 = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.q(parcel, 2, this.g, false);
        abhi.o(parcel, 3, this.h, i, false);
        abhi.o(parcel, 4, this.i, i, false);
        abhi.g(parcel, e2);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, String str) {
        this(i, str, null);
    }

    public Status(int i, String str, byte[] bArr) {
        this(i, str, null, null);
    }

    @Override // defpackage.abrm
    public final Status a() {
        return this;
    }
}
