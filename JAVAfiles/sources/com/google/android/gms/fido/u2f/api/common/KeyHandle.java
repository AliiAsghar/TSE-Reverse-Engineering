package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abhn;
import defpackage.abzo;
import defpackage.abzp;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public class KeyHandle extends AbstractSafeParcelable {
    public static final Parcelable.Creator<KeyHandle> CREATOR = new abzo(0);
    public final int a;
    public final byte[] b;
    public final ProtocolVersion c;
    public final List d;

    public KeyHandle(int i, byte[] bArr, String str, List list) {
        this.a = i;
        this.b = bArr;
        try {
            this.c = ProtocolVersion.a(str);
            this.d = list;
        } catch (abzp e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.b, keyHandle.b) || !this.c.equals(keyHandle.c)) {
            return false;
        }
        List list2 = this.d;
        if (list2 == null && keyHandle.d == null) {
            return true;
        }
        if (list2 != null && (list = keyHandle.d) != null && list2.containsAll(list) && keyHandle.d.containsAll(this.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d});
    }

    public final String toString() {
        String obj;
        List list = this.d;
        if (list == null) {
            obj = "null";
        } else {
            obj = list.toString();
        }
        return String.format("{keyHandle: %s, version: %s, transports: %s}", abhn.e(this.b), this.c, obj);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, i2);
        abhi.j(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c.d, false);
        abhi.r(parcel, 4, this.d, false);
        abhi.g(parcel, e);
    }
}
