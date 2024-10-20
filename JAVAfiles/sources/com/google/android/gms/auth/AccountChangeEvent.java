package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abjj;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class AccountChangeEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEvent> CREATOR = new abjj(18);
    final int a;
    final long b;
    final String c;
    final int d;
    final int e;
    final String f;

    public AccountChangeEvent(int i, long j, String str, int i2, int i3, String str2) {
        this.a = i;
        this.b = j;
        abhg.m(str);
        this.c = str;
        this.d = i2;
        this.e = i3;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountChangeEvent)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        AccountChangeEvent accountChangeEvent = (AccountChangeEvent) obj;
        if (this.a != accountChangeEvent.a || this.b != accountChangeEvent.b || !d.B(this.c, accountChangeEvent.c) || this.d != accountChangeEvent.d || this.e != accountChangeEvent.e || !d.B(this.f, accountChangeEvent.f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), this.c, Integer.valueOf(this.d), Integer.valueOf(this.e), this.f});
    }

    public final String toString() {
        String str;
        int i = this.d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        str = "UNKNOWN";
                    } else {
                        str = "RENAMED_TO";
                    }
                } else {
                    str = "RENAMED_FROM";
                }
            } else {
                str = "REMOVED";
            }
        } else {
            str = "ADDED";
        }
        return "AccountChangeEvent {accountName = " + this.c + ", changeType = " + str + ", changeData = " + this.f + ", eventIndex = " + this.e + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.a);
        abhi.n(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.m(parcel, 4, this.d);
        abhi.m(parcel, 5, this.e);
        abhi.q(parcel, 6, this.f, false);
        abhi.g(parcel, e);
    }
}
