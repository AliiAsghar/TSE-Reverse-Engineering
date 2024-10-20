package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhg;
import defpackage.abhi;
import defpackage.abos;
import defpackage.d;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConnectionResult extends AbstractSafeParcelable {
    final int b;
    public final int c;
    public final PendingIntent d;
    public final String e;
    public static final ConnectionResult a = new ConnectionResult(0);
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new abos(9);

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.b = i;
        this.c = i2;
        this.d = pendingIntent;
        this.e = str;
    }

    public final boolean a() {
        if (this.c != 0 && this.d != null) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        if (this.c == connectionResult.c && d.B(this.d, connectionResult.d) && d.B(this.e, connectionResult.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d, this.e});
    }

    public final String toString() {
        String str;
        ArrayList arrayList = new ArrayList();
        int i = this.c;
        if (i != 99) {
            if (i != 1500) {
                switch (i) {
                    case -1:
                        str = "UNKNOWN";
                        break;
                    case 0:
                        str = "SUCCESS";
                        break;
                    case 1:
                        str = "SERVICE_MISSING";
                        break;
                    case 2:
                        str = "SERVICE_VERSION_UPDATE_REQUIRED";
                        break;
                    case 3:
                        str = "SERVICE_DISABLED";
                        break;
                    case 4:
                        str = "SIGN_IN_REQUIRED";
                        break;
                    case 5:
                        str = "INVALID_ACCOUNT";
                        break;
                    case 6:
                        str = "RESOLUTION_REQUIRED";
                        break;
                    case 7:
                        str = "NETWORK_ERROR";
                        break;
                    case 8:
                        str = "INTERNAL_ERROR";
                        break;
                    case 9:
                        str = "SERVICE_INVALID";
                        break;
                    case 10:
                        str = "DEVELOPER_ERROR";
                        break;
                    case 11:
                        str = "LICENSE_CHECK_FAILED";
                        break;
                    default:
                        switch (i) {
                            case 13:
                                str = "CANCELED";
                                break;
                            case 14:
                                str = "TIMEOUT";
                                break;
                            case 15:
                                str = "INTERRUPTED";
                                break;
                            case 16:
                                str = "API_UNAVAILABLE";
                                break;
                            case 17:
                                str = "SIGN_IN_FAILED";
                                break;
                            case 18:
                                str = "SERVICE_UPDATING";
                                break;
                            case 19:
                                str = "SERVICE_MISSING_PERMISSION";
                                break;
                            case 20:
                                str = "RESTRICTED_PROFILE";
                                break;
                            case 21:
                                str = "API_VERSION_UPDATE_REQUIRED";
                                break;
                            case 22:
                                str = "RESOLUTION_ACTIVITY_NOT_FOUND";
                                break;
                            case 23:
                                str = "API_DISABLED";
                                break;
                            case 24:
                                str = "API_DISABLED_FOR_CONNECTION";
                                break;
                            case 25:
                                str = "API_INSTALL_REQUIRED";
                                break;
                            default:
                                str = a.cb(i, "UNKNOWN_ERROR_CODE(", ")");
                                break;
                        }
                }
            } else {
                str = "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            }
        } else {
            str = "UNFINISHED";
        }
        abhg.q("statusCode", str, arrayList);
        abhg.q("resolution", this.d, arrayList);
        abhg.q("message", this.e, arrayList);
        return abhg.p(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, this.b);
        abhi.m(parcel, 2, this.c);
        abhi.o(parcel, 3, this.d, i, false);
        abhi.q(parcel, 4, this.e, false);
        abhi.g(parcel, e);
    }

    public ConnectionResult(int i) {
        this(i, null, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, null);
    }

    public ConnectionResult(int i, PendingIntent pendingIntent, String str) {
        this(1, i, pendingIntent, str);
    }
}
