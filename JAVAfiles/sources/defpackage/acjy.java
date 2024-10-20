package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.ConnectionDelayFilters;
import com.google.android.gms.wearable.ConnectionRestrictions;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjy implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        int i4 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        ArrayList arrayList = null;
        ConnectionRestrictions connectionRestrictions = null;
        ConnectionDelayFilters connectionDelayFilters = null;
        boolean z5 = true;
        boolean z6 = true;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            switch (abhi.L(readInt)) {
                case 2:
                    str = abhi.ab(parcel, readInt);
                    break;
                case 3:
                    str2 = abhi.ab(parcel, readInt);
                    break;
                case 4:
                    i = abhi.N(parcel, readInt);
                    break;
                case 5:
                    i2 = abhi.N(parcel, readInt);
                    break;
                case 6:
                    z = abhi.al(parcel, readInt);
                    break;
                case 7:
                    z2 = abhi.al(parcel, readInt);
                    break;
                case 8:
                    str3 = abhi.ab(parcel, readInt);
                    break;
                case 9:
                    z3 = abhi.al(parcel, readInt);
                    break;
                case 10:
                    str4 = abhi.ab(parcel, readInt);
                    break;
                case 11:
                    str5 = abhi.ab(parcel, readInt);
                    break;
                case 12:
                    i3 = abhi.N(parcel, readInt);
                    break;
                case 13:
                    arrayList = abhi.ag(parcel, readInt);
                    break;
                case 14:
                    z4 = abhi.al(parcel, readInt);
                    break;
                case 15:
                    z5 = abhi.al(parcel, readInt);
                    break;
                case 16:
                    connectionRestrictions = (ConnectionRestrictions) abhi.V(parcel, readInt, ConnectionRestrictions.CREATOR);
                    break;
                case 17:
                    z6 = abhi.al(parcel, readInt);
                    break;
                case 18:
                    connectionDelayFilters = (ConnectionDelayFilters) abhi.V(parcel, readInt, ConnectionDelayFilters.CREATOR);
                    break;
                case 19:
                    i4 = abhi.N(parcel, readInt);
                    break;
                default:
                    abhi.ak(parcel, readInt);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new ConnectionConfiguration(str, str2, i, i2, z, z2, str3, z3, str4, str5, i3, arrayList, z4, z5, connectionRestrictions, z6, connectionDelayFilters, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionConfiguration[i];
    }
}
