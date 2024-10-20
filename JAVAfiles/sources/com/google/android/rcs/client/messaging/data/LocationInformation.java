package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.abhi;
import defpackage.advq;
import defpackage.ajgk;
import defpackage.ajpv;
import defpackage.ajqv;
import defpackage.ajqz;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class LocationInformation implements Parcelable, ajqz {
    public static final Parcelable.Creator<LocationInformation> CREATOR = new ajpv(20);

    public abstract double a();

    public abstract double b();

    public abstract Optional c();

    public abstract Optional d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    @Override // defpackage.ajqz
    public final void gU(ajqv ajqvVar) {
        ajqvVar.f(this);
    }

    public abstract Optional h();

    public abstract String i();

    public final String toString() {
        return String.format("LocationInformation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", i()), String.format("timestamp=%s", h()), String.format("label=%s", advq.LOCATION.c(e())), String.format("location=%s", advq.LOCATION.c(f())), String.format("longitude=%s", advq.LOCATION.c(Double.valueOf(b()))), String.format("latitude=%s", advq.LOCATION.c(Double.valueOf(a()))), String.format("radius=%s", advq.LOCATION.c(g())), String.format("entity=%s", advq.LOCATION.c(c())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, i(), false);
        if (h().isPresent()) {
            ajgk.D(parcel, 2, (Instant) h().get());
        }
        if (d().isPresent()) {
            ajgk.D(parcel, 3, (Instant) d().get());
        }
        if (e().isPresent()) {
            abhi.q(parcel, 4, (String) e().get(), false);
        }
        if (f().isPresent()) {
            abhi.q(parcel, 5, (String) f().get(), false);
        }
        abhi.k(parcel, 6, b());
        abhi.k(parcel, 7, a());
        if (g().isPresent()) {
            abhi.k(parcel, 8, ((Double) g().get()).doubleValue());
        }
        if (c().isPresent()) {
            abhi.q(parcel, 9, (String) c().get(), false);
        }
        abhi.g(parcel, e);
    }
}
