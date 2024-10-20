package com.google.android.gms.mdh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acfd;
import defpackage.acfg;
import defpackage.acfj;
import defpackage.d;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class MdhFootprintsReadResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MdhFootprintsReadResult> CREATOR = new acfj(new acfd(19));
    public final List a;
    public final SyncStatus b;

    public MdhFootprintsReadResult(List list, SyncStatus syncStatus) {
        this.a = list;
        this.b = syncStatus;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MdhFootprintsReadResult mdhFootprintsReadResult = (MdhFootprintsReadResult) obj;
            if (d.B(this.a, mdhFootprintsReadResult.a) && d.B(this.b, mdhFootprintsReadResult.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return String.format(Locale.ENGLISH, "MdhFootprintsReadResult{mdhFootprints=%s, syncStatus=%s}", this.a, this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        acfj.a(this, parcel, new acfg(i, 1));
    }
}
