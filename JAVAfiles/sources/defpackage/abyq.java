package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ServiceDumpRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyq implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        int i = 0;
        String str = null;
        String[] strArr = null;
        boolean z = false;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            int L = abhi.L(readInt);
            if (L != 2) {
                if (L != 3) {
                    if (L != 4) {
                        if (L != 5) {
                            abhi.ak(parcel, readInt);
                        } else {
                            z = abhi.al(parcel, readInt);
                        }
                    } else {
                        i = abhi.N(parcel, readInt);
                    }
                } else {
                    strArr = abhi.as(parcel, readInt);
                }
            } else {
                str = abhi.ab(parcel, readInt);
            }
        }
        abhi.aj(parcel, P);
        return new ServiceDumpRequest(str, strArr, i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ServiceDumpRequest[i];
    }
}
