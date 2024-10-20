package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.abhi;
import defpackage.advq;
import defpackage.ajgk;
import defpackage.ajpv;
import defpackage.ajqh;
import defpackage.ajqi;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class GroupMember implements Parcelable {
    public static final Parcelable.Creator<GroupMember> CREATOR = new ajpv(16);

    public static ajqh f() {
        ajqh ajqhVar = new ajqh((byte[]) null);
        ajqhVar.b("");
        ajqhVar.d(false);
        ajqhVar.f(ajqi.UNKNOWN);
        return ajqhVar;
    }

    public abstract ajqi a();

    public abstract RcsDestinationId b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract boolean e();

    public final String toString() {
        return String.format("GroupMember {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", advq.PHONE_NUMBER.c(b())), String.format("displayName=%s", advq.USER_ID.c(d())), String.format("referrer=%s", advq.PHONE_NUMBER.c(c())), String.format("isOwnUser=%s", Boolean.valueOf(e())), String.format("status=%s", a()))));
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [android.os.Parcelable, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, b(), i, false);
        abhi.q(parcel, 2, d(), false);
        if (c().isPresent()) {
            abhi.o(parcel, 3, c().get(), i, false);
        }
        abhi.h(parcel, 4, e());
        ajgk.C(parcel, 5, a());
        abhi.g(parcel, e);
    }
}
