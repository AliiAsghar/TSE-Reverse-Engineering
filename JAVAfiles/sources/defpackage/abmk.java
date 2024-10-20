package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.AuthzenBeginTxData;
import com.google.android.gms.auth.ResolutionData;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.PostSignInData;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.shared.CaptchaChallenge;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int P = abhi.P(parcel);
        ArrayList arrayList = new ArrayList();
        Bundle bundle = new Bundle();
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i2 = 0;
        boolean z6 = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        CaptchaChallenge captchaChallenge = null;
        String str9 = null;
        String str10 = null;
        PostSignInData postSignInData = null;
        Account account = null;
        String str11 = null;
        TokenData tokenData = null;
        String str12 = null;
        ResolutionData resolutionData = null;
        AuthzenBeginTxData authzenBeginTxData = null;
        while (parcel.dataPosition() < P) {
            int readInt = parcel.readInt();
            switch (abhi.L(readInt)) {
                case 1:
                    i = abhi.N(parcel, readInt);
                    break;
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
                    z = abhi.al(parcel, readInt);
                    break;
                case 11:
                    z2 = abhi.al(parcel, readInt);
                    break;
                case 12:
                    z3 = abhi.al(parcel, readInt);
                    break;
                case 13:
                    z4 = abhi.al(parcel, readInt);
                    break;
                case 14:
                    captchaChallenge = (CaptchaChallenge) abhi.V(parcel, readInt, CaptchaChallenge.CREATOR);
                    break;
                case 15:
                    arrayList = abhi.ah(parcel, readInt, ScopeDetail.CREATOR);
                    break;
                case 16:
                    str9 = abhi.ab(parcel, readInt);
                    break;
                case 17:
                    str10 = abhi.ab(parcel, readInt);
                    break;
                case 18:
                case 23:
                case 24:
                case 25:
                default:
                    abhi.ak(parcel, readInt);
                    break;
                case 19:
                    z5 = abhi.al(parcel, readInt);
                    break;
                case 20:
                    i2 = abhi.N(parcel, readInt);
                    break;
                case 21:
                    postSignInData = (PostSignInData) abhi.V(parcel, readInt, PostSignInData.CREATOR);
                    break;
                case 22:
                    account = (Account) abhi.V(parcel, readInt, Account.CREATOR);
                    break;
                case 26:
                    str11 = abhi.ab(parcel, readInt);
                    break;
                case 27:
                    tokenData = (TokenData) abhi.V(parcel, readInt, TokenData.CREATOR);
                    break;
                case 28:
                    bundle = abhi.S(parcel, readInt);
                    break;
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                    str12 = abhi.ab(parcel, readInt);
                    break;
                case 30:
                    resolutionData = (ResolutionData) abhi.V(parcel, readInt, ResolutionData.CREATOR);
                    break;
                case 31:
                    authzenBeginTxData = (AuthzenBeginTxData) abhi.V(parcel, readInt, AuthzenBeginTxData.CREATOR);
                    break;
                case 32:
                    z6 = abhi.al(parcel, readInt);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new TokenResponse(i, str, str2, str3, str4, str5, str6, str7, str8, z, z2, z3, z4, captchaChallenge, arrayList, str9, str10, z5, i2, postSignInData, account, str11, tokenData, bundle, str12, resolutionData, authzenBeginTxData, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new TokenResponse[i];
    }
}
