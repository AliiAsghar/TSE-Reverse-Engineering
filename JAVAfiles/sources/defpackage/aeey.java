package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<aeey> CREATOR = new adsv(13);
    public final Integer a;

    public aeey(Integer num) {
        this.a = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Integer num = this.a;
        int e = abhi.e(parcel);
        abhi.A(parcel, 1, num);
        abhi.g(parcel, e);
    }
}
