package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abhi;
import defpackage.acgc;
import defpackage.d;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class FlagOverride extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FlagOverride> CREATOR = new acgc(2);
    public final String a;
    public final String b;
    public final Flag c;
    public final boolean d;

    public FlagOverride(String str, String str2, Flag flag, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = flag;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        this.c.d(sb);
        sb.append(", ");
        sb.append(this.d);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlagOverride)) {
            return false;
        }
        FlagOverride flagOverride = (FlagOverride) obj;
        if (d.B(this.a, flagOverride.a) && d.B(this.b, flagOverride.b) && d.B(this.c, flagOverride.c) && this.d == flagOverride.d) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 2, str, false);
        abhi.q(parcel, 3, this.b, false);
        abhi.o(parcel, 4, this.c, i, false);
        abhi.h(parcel, 5, this.d);
        abhi.g(parcel, e);
    }
}
