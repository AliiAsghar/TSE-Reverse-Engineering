package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appdatasearch.SearchResults;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abjn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        String str = null;
        int[] iArr = null;
        byte[] bArr = null;
        Bundle[] bundleArr = null;
        Bundle[] bundleArr2 = null;
        Bundle[] bundleArr3 = null;
        int[] iArr2 = null;
        String[] strArr = null;
        byte[] bArr2 = null;
        double[] dArr = null;
        Bundle bundle = null;
        long[] jArr = null;
        long[] jArr2 = null;
        Bundle[] bundleArr4 = null;
        int[] iArr3 = null;
        byte[] bArr3 = null;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            switch (abhi.L(readInt)) {
                case 1:
                    str = abhi.ab(parcel, readInt);
                    break;
                case 2:
                    iArr = abhi.ap(parcel, readInt);
                    break;
                case 3:
                    bArr = abhi.am(parcel, readInt);
                    break;
                case 4:
                    bundleArr = (Bundle[]) abhi.ar(parcel, readInt, Bundle.CREATOR);
                    break;
                case 5:
                    bundleArr2 = (Bundle[]) abhi.ar(parcel, readInt, Bundle.CREATOR);
                    break;
                case 6:
                    bundleArr3 = (Bundle[]) abhi.ar(parcel, readInt, Bundle.CREATOR);
                    break;
                case 7:
                    i = abhi.N(parcel, readInt);
                    break;
                case 8:
                    iArr2 = abhi.ap(parcel, readInt);
                    break;
                case 9:
                    strArr = abhi.as(parcel, readInt);
                    break;
                case 10:
                    bArr2 = abhi.am(parcel, readInt);
                    break;
                case 11:
                    dArr = abhi.an(parcel, readInt);
                    break;
                case 12:
                    bundle = abhi.S(parcel, readInt);
                    break;
                case 13:
                    i2 = abhi.N(parcel, readInt);
                    break;
                case 14:
                    jArr = abhi.aq(parcel, readInt);
                    break;
                case 15:
                    jArr2 = abhi.aq(parcel, readInt);
                    break;
                case 16:
                    bundleArr4 = (Bundle[]) abhi.ar(parcel, readInt, Bundle.CREATOR);
                    break;
                case 17:
                    iArr3 = abhi.ap(parcel, readInt);
                    break;
                case 18:
                    bArr3 = abhi.am(parcel, readInt);
                    break;
                case 19:
                    z = abhi.al(parcel, readInt);
                    break;
                default:
                    abhi.ak(parcel, readInt);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new SearchResults(str, iArr, bArr, bundleArr, bundleArr2, bundleArr3, i, iArr2, strArr, bArr2, dArr, bundle, i2, jArr, jArr2, bundleArr4, iArr3, bArr3, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SearchResults[i];
    }
}
