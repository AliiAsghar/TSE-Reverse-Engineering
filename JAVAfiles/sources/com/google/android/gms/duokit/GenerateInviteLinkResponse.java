package com.google.android.gms.duokit;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.abuz;
import defpackage.d;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GenerateInviteLinkResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GenerateInviteLinkResponse> CREATOR = new abuz(16);
    public String a;
    public String b;
    public int c;

    public GenerateInviteLinkResponse() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GenerateInviteLinkResponse) {
            GenerateInviteLinkResponse generateInviteLinkResponse = (GenerateInviteLinkResponse) obj;
            if (d.B(this.a, generateInviteLinkResponse.a) && d.B(this.b, generateInviteLinkResponse.b) && d.B(Integer.valueOf(this.c), Integer.valueOf(generateInviteLinkResponse.c))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, this.a, false);
        abhi.q(parcel, 2, this.b, false);
        abhi.m(parcel, 3, this.c);
        abhi.g(parcel, e);
    }

    public GenerateInviteLinkResponse(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }
}
