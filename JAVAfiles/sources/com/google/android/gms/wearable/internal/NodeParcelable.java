package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acll;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class NodeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<NodeParcelable> CREATOR = new acll(4);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public NodeParcelable(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NodeParcelable)) {
            return false;
        }
        return ((NodeParcelable) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Node{" + this.b + ", id=" + this.a + ", hops=" + this.c + ", isNearby=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.m(parcel, 4, this.c);
        abhi.h(parcel, 5, this.d);
        abhi.g(parcel, e);
    }
}
