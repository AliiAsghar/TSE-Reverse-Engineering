package com.google.android.gms.feedback;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.abhi;
import defpackage.abyq;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ServiceDumpRequest extends AbstractSafeParcelable {
    public static final abyq CREATOR = new abyq();
    public final String a;
    public final String[] b;
    public final int c;
    public final boolean d;

    public ServiceDumpRequest(String str, String[] strArr, int i, boolean z) {
        str.getClass();
        this.a = str;
        this.b = strArr;
        if (i != 2 && i != 1) {
            throw new IllegalArgumentException(a.bV(i, "Unknown expected output format="));
        }
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ServiceDumpRequest serviceDumpRequest = (ServiceDumpRequest) obj;
            if (this.d == serviceDumpRequest.d && this.c == serviceDumpRequest.c && this.a.equals(serviceDumpRequest.a) && Arrays.equals(this.b, serviceDumpRequest.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(this.a, Boolean.valueOf(this.d), Integer.valueOf(this.c)) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "ServiceDumpRequest{service='" + this.a + "', dumpsysFlags=" + Arrays.toString(this.b) + ", expectedOutputFormat=" + this.c + ", showOutputToUser=" + this.d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.F(parcel, 3, this.b);
        abhi.m(parcel, 4, this.c);
        abhi.h(parcel, 5, this.d);
        abhi.g(parcel, e);
    }
}
