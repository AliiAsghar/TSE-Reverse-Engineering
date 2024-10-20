package com.google.android.gms.libs.identity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acbp;
import defpackage.alog;
import defpackage.alsx;
import defpackage.alzz;
import defpackage.arsd;
import defpackage.d;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ClientIdentity extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new acbp(8);
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final ClientIdentity f;

    static {
        Process.myUid();
        Process.myPid();
    }

    public ClientIdentity(int i, String str, String str2, String str3, List list, ClientIdentity clientIdentity) {
        if (clientIdentity != null && clientIdentity.a()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.a = i;
        this.b = str;
        this.c = str2;
        if (str3 == null) {
            if (clientIdentity != null) {
                str3 = clientIdentity.d;
            } else {
                str3 = null;
            }
        }
        this.d = str3;
        if (list == null) {
            list = clientIdentity != null ? clientIdentity.e : null;
            if (list == null) {
                int i2 = alog.d;
                list = alsx.a;
                list.getClass();
            }
        }
        this.e = alzz.aZ(list);
        this.f = clientIdentity;
    }

    public final boolean a() {
        if (this.f != null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (this.a == clientIdentity.a && d.F(this.b, clientIdentity.b) && d.F(this.c, clientIdentity.c) && d.F(this.d, clientIdentity.d) && d.F(this.f, clientIdentity.f) && d.F(this.e, clientIdentity.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.f});
    }

    public final String toString() {
        int i;
        String str = this.c;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        StringBuilder sb = new StringBuilder(this.b.length() + 18 + i);
        sb.append(this.a);
        sb.append("/");
        sb.append(this.b);
        String str2 = this.c;
        if (str2 != null) {
            sb.append("[");
            if (arsd.z(str2, this.b, false)) {
                String str3 = this.b;
                sb.append((CharSequence) str2, str3.length(), str2.length());
            } else {
                sb.append(str2);
            }
            sb.append("]");
        }
        if (this.d != null) {
            sb.append("/");
            sb.append(Integer.toHexString(this.d.hashCode()));
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.q(parcel, 3, this.b, false);
        abhi.q(parcel, 4, this.c, false);
        abhi.q(parcel, 6, this.d, false);
        abhi.o(parcel, 7, this.f, i, false);
        abhi.r(parcel, 8, this.e, false);
        abhi.g(parcel, e);
    }
}
