package com.google.android.gms.mdh;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acfd;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdhBroadcastListenerKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MdhBroadcastListenerKey> CREATOR = new acfd(16);
    public final String a;
    public final Account b;
    public final byte[] c;

    public MdhBroadcastListenerKey(String str, Account account, byte[] bArr) {
        this.a = str;
        this.b = account;
        this.c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdhBroadcastListenerKey)) {
            return false;
        }
        MdhBroadcastListenerKey mdhBroadcastListenerKey = (MdhBroadcastListenerKey) obj;
        if (d.B(this.a, mdhBroadcastListenerKey.a) && d.B(this.b, mdhBroadcastListenerKey.b) && d.B(this.c, mdhBroadcastListenerKey.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        byte[] bArr = this.c;
        return "MdhBroadcastListenerKey{action='" + this.a + "', account=" + String.valueOf(this.b) + ", channelId=" + Arrays.toString(bArr) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.o(parcel, 2, this.b, i, false);
        abhi.j(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
