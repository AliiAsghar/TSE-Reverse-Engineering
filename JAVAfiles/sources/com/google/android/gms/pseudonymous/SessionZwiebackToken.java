package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.acgc;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SessionZwiebackToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SessionZwiebackToken> CREATOR = new acgc(7);
    private final String a;
    private final String b;

    public SessionZwiebackToken(Parcel parcel) {
        this.a = parcel.readString();
        String readString = parcel.readString();
        abhg.m(readString);
        this.b = readString;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SessionZwiebackToken)) {
            return false;
        }
        SessionZwiebackToken sessionZwiebackToken = (SessionZwiebackToken) obj;
        if (!d.B(this.a, sessionZwiebackToken.a) || !d.B(this.b, sessionZwiebackToken.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
