package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.abhi;
import defpackage.ajgk;
import defpackage.ajpv;
import defpackage.ajqc;
import defpackage.ajqd;
import defpackage.aozb;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class FileInformation implements Parcelable {
    public static final Parcelable.Creator<FileInformation> CREATOR = new ajpv(12);

    public abstract int a();

    public abstract ContentType b();

    public abstract ajqc c();

    public abstract Instant d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Optional e();

    @Deprecated
    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract String i();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        if (h().isPresent()) {
            abhi.q(parcel, 1, (String) h().get(), false);
        }
        abhi.m(parcel, 2, a());
        abhi.o(parcel, 3, b(), i, false);
        abhi.q(parcel, 4, i(), false);
        ajgk.D(parcel, 5, d());
        if (g().isPresent()) {
            abhi.m(parcel, 6, ((ajqd) g().get()).ordinal());
        }
        if (f().isPresent()) {
            abhi.j(parcel, 7, ((aozb) f().get()).H(), false);
        }
        if (e().isPresent()) {
            abhi.n(parcel, 8, ((Duration) e().get()).getSeconds());
        }
        abhi.g(parcel, e);
    }
}
