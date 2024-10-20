package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoek extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aoek> CREATOR = new ajuw(17);
    public final boolean a;
    public final int b;
    public final String c;
    public final Bundle d;
    public final Bundle e;

    public aoek(boolean z, int i, String str, Bundle bundle, Bundle bundle2) {
        this.a = z;
        this.b = i;
        this.c = str;
        this.d = bundle == null ? new Bundle() : bundle;
        bundle2 = bundle2 == null ? new Bundle() : bundle2;
        this.e = bundle2;
        ClassLoader classLoader = getClass().getClassLoader();
        albo.C(classLoader);
        bundle2.setClassLoader(classLoader);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoek)) {
            return false;
        }
        aoek aoekVar = (aoek) obj;
        if (d.B(Boolean.valueOf(this.a), Boolean.valueOf(aoekVar.a))) {
            if (d.B(Integer.valueOf(this.b), Integer.valueOf(aoekVar.b)) && d.B(this.c, aoekVar.c) && Thing.c(this.d, aoekVar.d) && Thing.c(this.e, aoekVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Integer.valueOf(this.b), this.c, Integer.valueOf(Thing.a(this.d)), Integer.valueOf(Thing.a(this.e))});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("worksOffline: ");
        sb.append(this.a);
        sb.append(", score: ");
        sb.append(this.b);
        if (!this.c.isEmpty()) {
            sb.append(", accountEmail: ");
            sb.append(this.c);
        }
        if (!this.d.isEmpty()) {
            sb.append(", Properties { ");
            Thing.b(this.d, sb);
            sb.append("}");
        }
        if (!this.e.isEmpty()) {
            sb.append(", embeddingProperties { ");
            Thing.b(this.e, sb);
            sb.append("}");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int e = abhi.e(parcel);
        abhi.h(parcel, 1, z);
        abhi.m(parcel, 2, this.b);
        abhi.q(parcel, 3, this.c, false);
        abhi.t(parcel, 4, this.d);
        abhi.t(parcel, 5, this.e);
        abhi.g(parcel, e);
    }
}
