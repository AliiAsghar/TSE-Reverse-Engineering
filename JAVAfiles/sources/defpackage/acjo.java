package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.LoyaltyWalletObject;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        ArrayList arrayList6 = arrayList3;
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        TimeInterval timeInterval = null;
        String str11 = null;
        String str12 = null;
        LoyaltyPoints loyaltyPoints = null;
        int i = 0;
        boolean z = false;
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
                    str3 = abhi.ab(parcel, readInt);
                    break;
                case 5:
                    str4 = abhi.ab(parcel, readInt);
                    break;
                case 6:
                    str5 = abhi.ab(parcel, readInt);
                    break;
                case 7:
                    str6 = abhi.ab(parcel, readInt);
                    break;
                case 8:
                    str7 = abhi.ab(parcel, readInt);
                    break;
                case 9:
                    str8 = abhi.ab(parcel, readInt);
                    break;
                case 10:
                    str9 = abhi.ab(parcel, readInt);
                    break;
                case 11:
                    str10 = abhi.ab(parcel, readInt);
                    break;
                case 12:
                    i = abhi.N(parcel, readInt);
                    break;
                case 13:
                    arrayList4 = abhi.ah(parcel, readInt, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) abhi.V(parcel, readInt, TimeInterval.CREATOR);
                    break;
                case 15:
                    arrayList5 = abhi.ah(parcel, readInt, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = abhi.ab(parcel, readInt);
                    break;
                case 17:
                    str12 = abhi.ab(parcel, readInt);
                    break;
                case 18:
                    arrayList6 = abhi.ah(parcel, readInt, LabelValueRow.CREATOR);
                    break;
                case 19:
                    z = abhi.al(parcel, readInt);
                    break;
                case 20:
                    arrayList7 = abhi.ah(parcel, readInt, UriData.CREATOR);
                    break;
                case 21:
                    arrayList8 = abhi.ah(parcel, readInt, TextModuleData.CREATOR);
                    break;
                case 22:
                    arrayList9 = abhi.ah(parcel, readInt, UriData.CREATOR);
                    break;
                case 23:
                    loyaltyPoints = (LoyaltyPoints) abhi.V(parcel, readInt, LoyaltyPoints.CREATOR);
                    break;
                default:
                    abhi.ak(parcel, readInt);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new LoyaltyWalletObject(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, arrayList4, timeInterval, arrayList5, str11, str12, arrayList6, z, arrayList7, arrayList8, arrayList9, loyaltyPoints);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
