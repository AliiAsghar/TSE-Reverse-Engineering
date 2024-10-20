package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.ackd;
import defpackage.ackp;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class DataItemAssetParcelable extends AbstractSafeParcelable implements ReflectedParcelable, ackd {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new ackp(12);
    public final String a;
    public final String b;

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.ackd
    public final String e() {
        return this.b;
    }

    @Override // defpackage.ackd
    public final String f() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.a);
        }
        sb.append(", key=");
        sb.append(this.b);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }

    public DataItemAssetParcelable(ackd ackdVar) {
        String f = ackdVar.f();
        abhg.m(f);
        this.a = f;
        String e = ackdVar.e();
        abhg.m(e);
        this.b = e;
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
