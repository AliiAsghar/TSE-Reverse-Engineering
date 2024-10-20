package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i = 0;
        int i2 = 0;
        float f7 = 1.0f;
        float f8 = 0.5f;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            switch (abhi.L(readInt)) {
                case 2:
                    latLng = (LatLng) abhi.V(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = abhi.ab(parcel, readInt);
                    break;
                case 4:
                    str2 = abhi.ab(parcel, readInt);
                    break;
                case 5:
                    iBinder = abhi.T(parcel, readInt);
                    break;
                case 6:
                    f = abhi.K(parcel, readInt);
                    break;
                case 7:
                    f2 = abhi.K(parcel, readInt);
                    break;
                case 8:
                    z = abhi.al(parcel, readInt);
                    break;
                case 9:
                    z2 = abhi.al(parcel, readInt);
                    break;
                case 10:
                    z3 = abhi.al(parcel, readInt);
                    break;
                case 11:
                    f3 = abhi.K(parcel, readInt);
                    break;
                case 12:
                    f8 = abhi.K(parcel, readInt);
                    break;
                case 13:
                    f4 = abhi.K(parcel, readInt);
                    break;
                case 14:
                    f7 = abhi.K(parcel, readInt);
                    break;
                case 15:
                    f5 = abhi.K(parcel, readInt);
                    break;
                case 16:
                default:
                    abhi.ak(parcel, readInt);
                    break;
                case 17:
                    i = abhi.N(parcel, readInt);
                    break;
                case 18:
                    iBinder2 = abhi.T(parcel, readInt);
                    break;
                case 19:
                    i2 = abhi.N(parcel, readInt);
                    break;
                case 20:
                    str3 = abhi.ab(parcel, readInt);
                    break;
                case 21:
                    f6 = abhi.K(parcel, readInt);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new MarkerOptions(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f8, f4, f7, f5, i, iBinder2, i2, str3, f6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MarkerOptions[i];
    }
}
