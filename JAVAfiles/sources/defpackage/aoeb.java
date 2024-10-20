package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoeb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aoeb> CREATOR = new ajuw(11);
    public final List a;
    public final String b;
    public final String c;

    public aoeb(List list, String str, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int e = abhi.e(parcel);
        abhi.G(parcel, 1, list);
        abhi.q(parcel, 2, this.b, false);
        abhi.q(parcel, 3, this.c, false);
        abhi.g(parcel, e);
    }
}
