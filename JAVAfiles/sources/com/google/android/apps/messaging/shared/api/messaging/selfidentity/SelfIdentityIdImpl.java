package com.google.android.apps.messaging.shared.api.messaging.selfidentity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import defpackage.aozy;
import defpackage.armg;
import defpackage.arrj;
import defpackage.d;
import defpackage.hgi;
import defpackage.lga;
import defpackage.ltv;
import defpackage.mpv;
import defpackage.ngd;
import defpackage.qin;
import defpackage.qwe;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SelfIdentityIdImpl implements SelfIdentityId {
    public static final Parcelable.Creator<SelfIdentityIdImpl> CREATOR = new ltv(14);
    public final String a;
    private final Optional b;

    public SelfIdentityIdImpl(String str, Optional<qwe> optional) {
        str.getClass();
        optional.getClass();
        this.a = str;
        this.b = optional;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId
    @armg
    public final String b() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelfIdentityId)) {
            return false;
        }
        return d.F(this.a, ((SelfIdentityId) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        hgi aF = lga.aF(ngd.a.createBuilder());
        aozy aozyVar = (aozy) aF.a;
        if (!aozyVar.b.isMutable()) {
            aozyVar.u();
        }
        String str = this.a;
        ngd ngdVar = (ngd) aozyVar.b;
        ngdVar.b |= 1;
        ngdVar.c = str;
        this.b.ifPresent(new mpv(new qin(aF, 1), 15));
        parcel.writeParcelable(new ProtoParsers$InternalDontUse(null, aF.x()), 0);
    }

    public /* synthetic */ SelfIdentityIdImpl(String str, Optional optional, int i, arrj arrjVar) {
        this(str, (i & 2) != 0 ? Optional.empty() : optional);
    }
}
