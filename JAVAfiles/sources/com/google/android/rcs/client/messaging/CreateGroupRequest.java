package com.google.android.rcs.client.messaging;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.aidg;
import defpackage.ajog;
import defpackage.alog;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class CreateGroupRequest implements Parcelable {
    public static final Parcelable.Creator<CreateGroupRequest> CREATOR = new ajog(4);

    public abstract PendingIntent a();

    public abstract alog b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.E(parcel, a());
        abhi.q(parcel, 2, d(), false);
        abhi.q(parcel, 3, e(), false);
        abhi.r(parcel, 4, b(), false);
        c().ifPresent(new aidg(parcel, 18));
        abhi.g(parcel, e);
    }
}
