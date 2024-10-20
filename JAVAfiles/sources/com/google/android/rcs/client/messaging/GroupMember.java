package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.advq;
import defpackage.ajog;
import defpackage.ajpi;
import defpackage.ajpu;
import defpackage.ajro;
import defpackage.ajyt;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class GroupMember implements Parcelable {
    public static final Parcelable.Creator<GroupMember> CREATOR = new ajog(11);

    public static ajyt e() {
        ajyt ajytVar = new ajyt(null, null);
        ajytVar.j("");
        ajytVar.k(false);
        return ajytVar;
    }

    public abstract ajpu a();

    public abstract Optional b();

    public abstract String c();

    public abstract boolean d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("GroupMember {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", advq.PHONE_NUMBER.c(a())), String.format("displayName=%s", advq.USER_ID.c(c())), String.format("referrer=%s", advq.PHONE_NUMBER.c(b())), String.format("isOwnUser=%s", Boolean.valueOf(d())))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 3;
        ajro.p(parcel, 1, a(), new ajpi(i2), i);
        ajro.r(parcel, 2, c());
        if (b().isPresent()) {
            ajro.p(parcel, 3, (ajpu) b().get(), new ajpi(i2), i);
        }
        ajro.o(parcel, 4, d() ? 1 : 0);
        ajro.l(parcel);
    }
}
