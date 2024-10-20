package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.firstparty.dataservice.GoogleAccountSetupRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.CaptchaSolution;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        Bundle bundle = new Bundle();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        AppDescription appDescription = null;
        AccountCredentials accountCredentials = null;
        CaptchaSolution captchaSolution = null;
        String str6 = null;
        String str7 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            switch (abhi.L(readInt)) {
                case 1:
                    i = abhi.N(parcel, readInt);
                    break;
                case 2:
                    bundle = abhi.S(parcel, readInt);
                    break;
                case 3:
                    z = abhi.al(parcel, readInt);
                    break;
                case 4:
                    z2 = abhi.al(parcel, readInt);
                    break;
                case 5:
                    z3 = abhi.al(parcel, readInt);
                    break;
                case 6:
                    str = abhi.ab(parcel, readInt);
                    break;
                case 7:
                    str2 = abhi.ab(parcel, readInt);
                    break;
                case 8:
                    str3 = abhi.ab(parcel, readInt);
                    break;
                case 9:
                    str4 = abhi.ab(parcel, readInt);
                    break;
                case 10:
                    z4 = abhi.al(parcel, readInt);
                    break;
                case 11:
                    z5 = abhi.al(parcel, readInt);
                    break;
                case 12:
                    z6 = abhi.al(parcel, readInt);
                    break;
                case 13:
                    str5 = abhi.ab(parcel, readInt);
                    break;
                case 14:
                    appDescription = (AppDescription) abhi.V(parcel, readInt, AppDescription.CREATOR);
                    break;
                case 15:
                    accountCredentials = (AccountCredentials) abhi.V(parcel, readInt, AccountCredentials.CREATOR);
                    break;
                case 16:
                    captchaSolution = (CaptchaSolution) abhi.V(parcel, readInt, CaptchaSolution.CREATOR);
                    break;
                case 17:
                    str6 = abhi.ab(parcel, readInt);
                    break;
                case 18:
                    str7 = abhi.ab(parcel, readInt);
                    break;
                default:
                    abhi.ak(parcel, readInt);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new GoogleAccountSetupRequest(i, bundle, z, z2, z3, str, str2, str3, str4, z4, z5, z6, str5, appDescription, accountCredentials, captchaSolution, str6, str7);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleAccountSetupRequest[i];
    }
}
