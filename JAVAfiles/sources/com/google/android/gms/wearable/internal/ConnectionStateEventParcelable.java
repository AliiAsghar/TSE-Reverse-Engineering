package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhi;
import defpackage.ackp;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ConnectionStateEventParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionStateEventParcelable> CREATOR = new ackp(9);
    public final int a;
    public final String b;

    public ConnectionStateEventParcelable(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConnectionStateEventParcelable)) {
            return false;
        }
        ConnectionStateEventParcelable connectionStateEventParcelable = (ConnectionStateEventParcelable) obj;
        if (this.a == connectionStateEventParcelable.a && Objects.equals(this.b, connectionStateEventParcelable.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        String str;
        int i = this.a;
        switch (i) {
            case -9:
                str = "Migration was cancelled";
                break;
            case -8:
                str = "Another migration is already in progress";
                break;
            case -7:
                str = "Connect message malformed";
                break;
            case -6:
                str = "Migration status mismatch between watch and phone";
                break;
            case -5:
                str = "Phone switching feature disabled";
                break;
            case -4:
                str = "Did not receive connect msg";
                break;
            case -3:
                str = "No bluetooth connection";
                break;
            case -2:
                str = "Accounts mismatch";
                break;
            case -1:
                str = "Unknown failure";
                break;
            case 0:
                str = "Connected";
                break;
            case 1:
                str = "Connection handshake in progress";
                break;
            case 2:
                str = "Connection handshake complete";
                break;
            case 3:
                str = "Sync with old node suspended";
                break;
            case 4:
                str = "Control plane transport connected";
                break;
            case 5:
                str = "Accounts Matched";
                break;
            case 6:
                str = "Association to watch terminated";
                break;
            default:
                str = a.bV(i, "Unrecognized state value: ");
                break;
        }
        return String.format("ConnectionStateEvent: address: %s, state: %s", this.b, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.q(parcel, 2, this.b, false);
        abhi.g(parcel, e);
    }
}
