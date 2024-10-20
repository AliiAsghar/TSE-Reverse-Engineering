package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apdi implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public apdi(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle = null;
        if (this.a != 0) {
            int P = abhi.P(parcel);
            while (parcel.dataPosition() < P) {
                int readInt = parcel.readInt();
                if (abhi.L(readInt) != 2) {
                    abhi.ak(parcel, readInt);
                } else {
                    bundle = abhi.S(parcel, readInt);
                }
            }
            abhi.aj(parcel, P);
            return new aoiq(bundle);
        }
        byte[] bArr = new byte[parcel.readInt()];
        parcel.readByteArray(bArr);
        return new ProtoParsers$InternalDontUse(bArr, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        if (this.a != 0) {
            return new aoiq[i];
        }
        return new ProtoParsers$InternalDontUse[i];
    }
}
