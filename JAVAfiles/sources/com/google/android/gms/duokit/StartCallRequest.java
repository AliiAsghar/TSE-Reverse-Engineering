package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abxj;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class StartCallRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartCallRequest> CREATOR = new abxj(2);
    public DuoId a;
    public int b;
    public boolean c;
    public String d;

    public StartCallRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartCallRequest) {
            StartCallRequest startCallRequest = (StartCallRequest) obj;
            if (d.B(this.a, startCallRequest.a) && d.B(Integer.valueOf(this.b), Integer.valueOf(startCallRequest.b)) && d.B(Boolean.valueOf(this.c), Boolean.valueOf(startCallRequest.c)) && d.B(this.d, startCallRequest.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Boolean.valueOf(this.c), this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, this.a, i, false);
        abhi.m(parcel, 2, this.b);
        abhi.h(parcel, 3, this.c);
        abhi.q(parcel, 4, this.d, false);
        abhi.g(parcel, e);
    }

    public StartCallRequest(DuoId duoId, int i, boolean z, String str) {
        this.a = duoId;
        this.b = i;
        this.c = z;
        this.d = str;
    }
}
