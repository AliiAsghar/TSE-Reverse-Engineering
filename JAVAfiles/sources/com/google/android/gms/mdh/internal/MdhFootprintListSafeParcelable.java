package com.google.android.gms.mdh.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acfe;
import defpackage.acff;
import defpackage.acfj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdhFootprintListSafeParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MdhFootprintListSafeParcelable> CREATOR = new acfj(new acfe(7));
    public final List a;

    public MdhFootprintListSafeParcelable(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MdhFootprintListSafeParcelable)) {
            return false;
        }
        return this.a.equals(((MdhFootprintListSafeParcelable) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final String toString() {
        return "MdhFootprintListSafeParcelable{mdhFootprints=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        acfj.a(this, parcel, new acff(2));
    }
}
