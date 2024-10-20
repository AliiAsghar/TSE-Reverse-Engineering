package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.advq;
import defpackage.ajog;
import defpackage.ajpx;
import defpackage.ajro;
import defpackage.alog;
import defpackage.wog;
import j$.util.Collection;
import j$.util.Optional;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class GroupInformation implements Parcelable {
    public static final Parcelable.Creator<GroupInformation> CREATOR = new ajog(10);

    public abstract alog a();

    public abstract Optional b();

    public abstract Optional c();

    public abstract String d();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public abstract String e();

    public abstract String f();

    public final String toString() {
        return String.format("GroupInformation {%s}", TextUtils.join(",", Arrays.asList(String.format("id=%s", e()), String.format("subject=%s", advq.MESSAGE_CONTENT.c(f())), String.format("conferenceUri=%s", d()), String.format("groupMembers=%s", a()), String.format("groupRemoteCapabilities=%s", b()), String.format("subjectExtension=%s", c()))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ajro.r(parcel, 1, e());
        ajro.r(parcel, 2, f());
        ajro.r(parcel, 3, d());
        alog a = a();
        int i2 = 4;
        parcel.writeInt(4);
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(0);
        int dataPosition2 = parcel.dataPosition();
        parcel.writeInt(a.size());
        if (Parcelable.class.isAssignableFrom(GroupMember.class)) {
            Collection.EL.stream(a).forEach(new wog(parcel, i, 6));
        } else if (String.class.equals(GroupMember.class)) {
            Collection.EL.stream(a).forEach(new ajpx(parcel, 9));
        } else if (Integer.class.equals(GroupMember.class)) {
            Collection.EL.stream(a).forEach(new ajpx(parcel, 10));
        }
        ajro.k(parcel, dataPosition, dataPosition2);
        b().ifPresent(new wog(parcel, i, i2));
        c().ifPresent(new wog(parcel, i, 5));
        ajro.l(parcel);
    }
}
