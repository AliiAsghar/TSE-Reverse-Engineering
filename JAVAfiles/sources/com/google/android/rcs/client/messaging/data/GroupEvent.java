package com.google.android.rcs.client.messaging.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.abhi;
import defpackage.ajpv;
import defpackage.alog;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class GroupEvent implements Parcelable {
    public static final Parcelable.Creator<GroupEvent> CREATOR = new ajpv(14);

    public abstract alog a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("GroupEvent {%s}", TextUtils.join(",", Arrays.asList(String.format("changedMembers=[%s]", a()))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.r(parcel, 1, a(), false);
        abhi.g(parcel, e);
    }
}
