package com.google.android.rcs.client.messaging;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import defpackage.advq;
import defpackage.ajog;
import defpackage.ajpi;
import defpackage.ajpu;
import defpackage.ajro;
import java.util.Arrays;

/* compiled from: PG */
@Deprecated
/* loaded from: classes4.dex */
public abstract class Conversation implements Parcelable {
    public static final Parcelable.Creator<Conversation> CREATOR = new ajog(3);

    public abstract ajpu a();

    public abstract String b();

    public abstract int c();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        String format = String.format("id=%s", b());
        String format2 = String.format("destination=%s", advq.PHONE_NUMBER.c(a()));
        if (c() != 1) {
            str = "GROUP";
        } else {
            str = "ONE_TO_ONE";
        }
        return String.format("Conversation {%s}", TextUtils.join(",", Arrays.asList(format, format2, String.format("type=%s", str))));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ajro.o(parcel, 1, c() - 1);
        ajro.r(parcel, 2, b());
        ajro.p(parcel, 3, a(), new ajpi(1), i);
        ajro.l(parcel);
    }
}
