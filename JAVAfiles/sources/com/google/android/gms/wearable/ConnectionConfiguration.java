package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acjy;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConnectionConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ConnectionConfiguration> CREATOR = new acjy();
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public volatile String g;
    public final boolean h;
    public final String i;
    public final String j;
    public final int k;
    public final List l;
    public final boolean m;
    public final boolean n;
    public final ConnectionRestrictions o;
    public final boolean p;
    public final ConnectionDelayFilters q;
    public final int r;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4, String str5, int i3, List list, boolean z4, boolean z5, ConnectionRestrictions connectionRestrictions, boolean z6, ConnectionDelayFilters connectionDelayFilters, int i4) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
        this.g = str3;
        this.h = z3;
        this.i = str4;
        this.j = str5;
        this.k = i3;
        this.l = list;
        this.m = z4;
        this.n = z5;
        this.o = connectionRestrictions;
        this.p = z6;
        this.q = connectionDelayFilters;
        this.r = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        if (!d.B(this.a, connectionConfiguration.a) || !d.B(this.b, connectionConfiguration.b) || !d.B(Integer.valueOf(this.c), Integer.valueOf(connectionConfiguration.c)) || !d.B(Integer.valueOf(this.d), Integer.valueOf(connectionConfiguration.d)) || !d.B(Boolean.valueOf(this.e), Boolean.valueOf(connectionConfiguration.e)) || !d.B(Boolean.valueOf(this.h), Boolean.valueOf(connectionConfiguration.h)) || !d.B(Boolean.valueOf(this.m), Boolean.valueOf(connectionConfiguration.m)) || !d.B(Boolean.valueOf(this.n), Boolean.valueOf(connectionConfiguration.n))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Boolean.valueOf(this.h), Boolean.valueOf(this.m), Boolean.valueOf(this.n)});
    }

    public final String toString() {
        return "ConnectionConfiguration[ Name=" + this.a + ", Address=" + this.b + ", Type=" + this.c + ", Role=" + this.d + ", Enabled=" + this.e + ", IsConnected=" + this.f + ", PeerNodeId=" + this.g + ", BtlePriority=" + this.h + ", NodeId=" + this.i + ", PackageName=" + this.j + ", ConnectionRetryStrategy=" + this.k + ", allowedConfigPackages=" + this.l + ", Migrating=" + this.m + ", DataItemSyncEnabled=" + this.n + ", ConnectionRestrictions=" + this.o + ", removeConnectionWhenBondRemovedByUser=" + this.p + ", maxSupportedRemoteAndroidSdkVersion=" + this.r + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.m(parcel, 4, this.c);
        abhi.m(parcel, 5, this.d);
        abhi.h(parcel, 6, this.e);
        abhi.h(parcel, 7, this.f);
        abhi.q(parcel, 8, this.g, false);
        abhi.h(parcel, 9, this.h);
        abhi.q(parcel, 10, this.i, false);
        abhi.q(parcel, 11, this.j, false);
        abhi.m(parcel, 12, this.k);
        abhi.G(parcel, 13, this.l);
        abhi.h(parcel, 14, this.m);
        abhi.h(parcel, 15, this.n);
        abhi.o(parcel, 16, this.o, i, false);
        abhi.h(parcel, 17, this.p);
        abhi.o(parcel, 18, this.q, i, false);
        abhi.m(parcel, 19, this.r);
        abhi.g(parcel, e);
    }
}
