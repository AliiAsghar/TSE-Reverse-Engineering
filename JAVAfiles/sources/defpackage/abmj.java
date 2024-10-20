package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;
import com.google.android.gms.auth.firstparty.shared.FACLConfig;
import com.google.android.gms.auth.firstparty.shared.PACLConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        Bundle bundle = new Bundle();
        boolean z = true;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i = 0;
        boolean z6 = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        FACLConfig fACLConfig = null;
        PACLConfig pACLConfig = null;
        AppDescription appDescription = null;
        CaptchaSolution captchaSolution = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        long j = 0;
        String str8 = "com.google";
        String str9 = "UNKNOWN";
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
                    bundle = abhi.S(parcel, readInt);
                    break;
                case 5:
                    fACLConfig = (FACLConfig) abhi.V(parcel, readInt, FACLConfig.CREATOR);
                    break;
                case 6:
                    pACLConfig = (PACLConfig) abhi.V(parcel, readInt, PACLConfig.CREATOR);
                    break;
                case 7:
                    z3 = abhi.al(parcel, readInt);
                    break;
                case 8:
                    z4 = abhi.al(parcel, readInt);
                    break;
                case 9:
                    str9 = abhi.ab(parcel, readInt);
                    break;
                case 10:
                    appDescription = (AppDescription) abhi.V(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 11:
                    captchaSolution = (CaptchaSolution) abhi.V(parcel, readInt, CaptchaSolution.CREATOR);
                    break;
                case 12:
                default:
                    abhi.ak(parcel, readInt);
                    break;
                case 13:
                    z5 = abhi.al(parcel, readInt);
                    break;
                case 14:
                    z = abhi.al(parcel, readInt);
                    break;
                case 15:
                    str8 = abhi.ab(parcel, readInt);
                    break;
                case 16:
                    i = abhi.N(parcel, readInt);
                    break;
                case 17:
                    str3 = abhi.ab(parcel, readInt);
                    break;
                case 18:
                    str4 = abhi.ab(parcel, readInt);
                    break;
                case 19:
                    str5 = abhi.ab(parcel, readInt);
                    break;
                case 20:
                    j = abhi.Q(parcel, readInt);
                    break;
                case 21:
                    z6 = abhi.al(parcel, readInt);
                    break;
                case 22:
                    str6 = abhi.ab(parcel, readInt);
                    break;
                case 23:
                    str7 = abhi.ab(parcel, readInt);
                    break;
                case 24:
                    i2 = abhi.N(parcel, readInt);
                    break;
                case 25:
                    z2 = abhi.al(parcel, readInt);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new TokenRequest(str, str2, bundle, fACLConfig, pACLConfig, z3, z4, str9, appDescription, captchaSolution, z5, z, str8, i, str3, str4, str5, j, z6, str6, str7, i2, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenRequest[i];
    }
}
