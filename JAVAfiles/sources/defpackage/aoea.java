package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoea extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aoea> CREATOR = new ajuw(10);
    public final String a;
    public final boolean b;

    public aoea(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int e = abhi.e(parcel);
        abhi.q(parcel, 1, str, false);
        abhi.h(parcel, 2, this.b);
        abhi.g(parcel, e);
    }
}
