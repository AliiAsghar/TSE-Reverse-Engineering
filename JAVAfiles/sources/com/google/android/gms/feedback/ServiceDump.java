package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abyp;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ServiceDump extends AbstractSafeParcelable {
    public static final abyp CREATOR = new abyp();
    public final ServiceDumpRequest a;
    public final byte[] b;

    public ServiceDump(ServiceDumpRequest serviceDumpRequest, byte[] bArr) {
        serviceDumpRequest.getClass();
        this.a = serviceDumpRequest;
        bArr.getClass();
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ServiceDump serviceDump = (ServiceDump) obj;
            if (this.a.equals(serviceDump.a) && Arrays.equals(this.b, serviceDump.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String obj = this.a.toString();
        String arrays = Arrays.toString(bArr);
        if (arrays.length() > 20) {
            arrays = String.valueOf(arrays.substring(0, 17)).concat("...");
        }
        return "ServiceDump{serviceDumpRequest=" + obj + ", dumpOutput=\"" + String.format(arrays, new Object[0]) + "\"}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 2, this.a, i, false);
        abhi.j(parcel, 3, this.b, false);
        abhi.g(parcel, e);
    }
}
