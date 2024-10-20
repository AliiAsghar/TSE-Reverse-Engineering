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
public final class StartGroupCreationFlowRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StartGroupCreationFlowRequest> CREATOR = new abxj(4);
    public DuoId[] a;
    public String b;
    public boolean c;

    public StartGroupCreationFlowRequest() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartGroupCreationFlowRequest) {
            StartGroupCreationFlowRequest startGroupCreationFlowRequest = (StartGroupCreationFlowRequest) obj;
            if (Arrays.equals(this.a, startGroupCreationFlowRequest.a) && d.B(this.b, startGroupCreationFlowRequest.b) && d.B(Boolean.valueOf(this.c), Boolean.valueOf(startGroupCreationFlowRequest.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Boolean.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.H(parcel, 1, this.a, i);
        abhi.q(parcel, 2, this.b, false);
        abhi.h(parcel, 3, this.c);
        abhi.g(parcel, e);
    }

    public StartGroupCreationFlowRequest(DuoId[] duoIdArr, String str, boolean z) {
        this.a = duoIdArr;
        this.b = str;
        this.c = z;
    }
}
