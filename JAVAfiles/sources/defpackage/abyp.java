package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ServiceDumpRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abyp implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        ServiceDumpRequest serviceDumpRequest = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            int L = abhi.L(readInt);
            if (L != 2) {
                if (L != 3) {
                    abhi.ak(parcel, readInt);
                } else {
                    bArr = abhi.am(parcel, readInt);
                }
            } else {
                serviceDumpRequest = (ServiceDumpRequest) abhi.V(parcel, readInt, ServiceDumpRequest.CREATOR);
            }
        }
        abhi.aj(parcel, P);
        return new ServiceDump(serviceDumpRequest, bArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ServiceDump[i];
    }
}
