package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.credentials.internal.DeleteRequest;
import com.google.android.gms.auth.api.credentials.internal.SaveRequest;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.BrowserOptions;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialCreationOptions;
import com.google.android.gms.auth.api.fido.PublicKeyCredentialRequestOptions;
import com.google.android.gms.auth.api.fido.RegisteredCredentialData;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.auth.api.identity.AccountWithZuulKeyRetrievalIntent;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.ChromeOptions;
import com.google.android.gms.auth.api.identity.CompleteSignInResult;
import com.google.android.gms.auth.api.identity.FetchVerifiedPhoneNumbersResult;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.auth.api.identity.SigningInfoCompat;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablm implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ablm(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        String str = null;
        ArrayList arrayList = null;
        SignInCredential signInCredential = null;
        String str2 = null;
        PendingIntent pendingIntent = null;
        Account account = null;
        aozb aozbVar = null;
        UserVerificationRequirement a = null;
        AttestationConveyancePreference a2 = null;
        aozb aozbVar2 = null;
        Credential credential = null;
        Credential credential2 = null;
        switch (this.a) {
            case 0:
                int P = abhi.P(parcel);
                int i2 = 0;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                String[] strArr = null;
                CredentialPickerConfig credentialPickerConfig = null;
                CredentialPickerConfig credentialPickerConfig2 = null;
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < P) {
                    int readInt = parcel.readInt();
                    int L = abhi.L(readInt);
                    if (L != 1000) {
                        switch (L) {
                            case 1:
                                z3 = abhi.al(parcel, readInt);
                                break;
                            case 2:
                                strArr = abhi.as(parcel, readInt);
                                break;
                            case 3:
                                credentialPickerConfig = (CredentialPickerConfig) abhi.V(parcel, readInt, CredentialPickerConfig.CREATOR);
                                break;
                            case 4:
                                credentialPickerConfig2 = (CredentialPickerConfig) abhi.V(parcel, readInt, CredentialPickerConfig.CREATOR);
                                break;
                            case 5:
                                z4 = abhi.al(parcel, readInt);
                                break;
                            case 6:
                                str3 = abhi.ab(parcel, readInt);
                                break;
                            case 7:
                                str4 = abhi.ab(parcel, readInt);
                                break;
                            case 8:
                                z5 = abhi.al(parcel, readInt);
                                break;
                            default:
                                abhi.ak(parcel, readInt);
                                break;
                        }
                    } else {
                        i2 = abhi.N(parcel, readInt);
                    }
                }
                abhi.aj(parcel, P);
                return new CredentialRequest(i2, z3, strArr, credentialPickerConfig, credentialPickerConfig2, z4, str3, str4, z5);
            case 1:
                int P2 = abhi.P(parcel);
                int i3 = 0;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                int i4 = 0;
                while (parcel.dataPosition() < P2) {
                    int readInt2 = parcel.readInt();
                    int L2 = abhi.L(readInt2);
                    if (L2 != 1) {
                        if (L2 != 2) {
                            if (L2 != 3) {
                                if (L2 != 4) {
                                    if (L2 != 1000) {
                                        abhi.ak(parcel, readInt2);
                                    } else {
                                        i3 = abhi.N(parcel, readInt2);
                                    }
                                } else {
                                    i4 = abhi.N(parcel, readInt2);
                                }
                            } else {
                                z8 = abhi.al(parcel, readInt2);
                            }
                        } else {
                            z7 = abhi.al(parcel, readInt2);
                        }
                    } else {
                        z6 = abhi.al(parcel, readInt2);
                    }
                }
                abhi.aj(parcel, P2);
                return new CredentialPickerConfig(i3, z6, z7, z8, i4);
            case 2:
                int P3 = abhi.P(parcel);
                int i5 = 0;
                boolean z9 = false;
                boolean z10 = false;
                boolean z11 = false;
                CredentialPickerConfig credentialPickerConfig3 = null;
                String[] strArr2 = null;
                String str5 = null;
                String str6 = null;
                while (parcel.dataPosition() < P3) {
                    int readInt3 = parcel.readInt();
                    int L3 = abhi.L(readInt3);
                    if (L3 != 1000) {
                        switch (L3) {
                            case 1:
                                credentialPickerConfig3 = (CredentialPickerConfig) abhi.V(parcel, readInt3, CredentialPickerConfig.CREATOR);
                                break;
                            case 2:
                                z9 = abhi.al(parcel, readInt3);
                                break;
                            case 3:
                                z10 = abhi.al(parcel, readInt3);
                                break;
                            case 4:
                                strArr2 = abhi.as(parcel, readInt3);
                                break;
                            case 5:
                                z11 = abhi.al(parcel, readInt3);
                                break;
                            case 6:
                                str5 = abhi.ab(parcel, readInt3);
                                break;
                            case 7:
                                str6 = abhi.ab(parcel, readInt3);
                                break;
                            default:
                                abhi.ak(parcel, readInt3);
                                break;
                        }
                    } else {
                        i5 = abhi.N(parcel, readInt3);
                    }
                }
                abhi.aj(parcel, P3);
                return new HintRequest(i5, credentialPickerConfig3, z9, z10, strArr2, z11, str5, str6);
            case 3:
                int P4 = abhi.P(parcel);
                String str7 = null;
                while (parcel.dataPosition() < P4) {
                    int readInt4 = parcel.readInt();
                    int L4 = abhi.L(readInt4);
                    if (L4 != 1) {
                        if (L4 != 2) {
                            abhi.ak(parcel, readInt4);
                        } else {
                            str7 = abhi.ab(parcel, readInt4);
                        }
                    } else {
                        str = abhi.ab(parcel, readInt4);
                    }
                }
                abhi.aj(parcel, P4);
                return new IdToken(str, str7);
            case 4:
                int P5 = abhi.P(parcel);
                while (parcel.dataPosition() < P5) {
                    int readInt5 = parcel.readInt();
                    if (abhi.L(readInt5) != 1) {
                        abhi.ak(parcel, readInt5);
                    } else {
                        credential2 = (Credential) abhi.V(parcel, readInt5, Credential.CREATOR);
                    }
                }
                abhi.aj(parcel, P5);
                return new DeleteRequest(credential2);
            case 5:
                int P6 = abhi.P(parcel);
                while (parcel.dataPosition() < P6) {
                    int readInt6 = parcel.readInt();
                    if (abhi.L(readInt6) != 1) {
                        abhi.ak(parcel, readInt6);
                    } else {
                        credential = (Credential) abhi.V(parcel, readInt6, Credential.CREATOR);
                    }
                }
                abhi.aj(parcel, P6);
                return new SaveRequest(credential);
            case 6:
                int P7 = abhi.P(parcel);
                long j = 0;
                int i6 = 0;
                boolean z12 = false;
                PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
                String str8 = null;
                String str9 = null;
                BrowserOptions browserOptions = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < P7) {
                    int readInt7 = parcel.readInt();
                    switch (abhi.L(readInt7)) {
                        case 2:
                            publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) abhi.V(parcel, readInt7, PublicKeyCredentialRequestOptions.CREATOR);
                            break;
                        case 3:
                            str8 = abhi.ab(parcel, readInt7);
                            break;
                        case 4:
                            str9 = abhi.ab(parcel, readInt7);
                            break;
                        case 5:
                            browserOptions = (BrowserOptions) abhi.V(parcel, readInt7, BrowserOptions.CREATOR);
                            break;
                        case 6:
                            i6 = abhi.N(parcel, readInt7);
                            break;
                        case 7:
                            bundle = abhi.S(parcel, readInt7);
                            break;
                        case 8:
                            z12 = abhi.al(parcel, readInt7);
                            break;
                        case 9:
                            j = abhi.Q(parcel, readInt7);
                            break;
                        default:
                            abhi.ak(parcel, readInt7);
                            break;
                    }
                }
                abhi.aj(parcel, P7);
                return new AuthenticationOptions(publicKeyCredentialRequestOptions, str8, str9, browserOptions, i6, bundle, z12, j);
            case 7:
                int P8 = abhi.P(parcel);
                byte[] bArr = null;
                String str10 = null;
                ChromeOptions chromeOptions = null;
                while (parcel.dataPosition() < P8) {
                    int readInt8 = parcel.readInt();
                    int L5 = abhi.L(readInt8);
                    if (L5 != 2) {
                        if (L5 != 3) {
                            if (L5 != 4) {
                                abhi.ak(parcel, readInt8);
                            } else {
                                chromeOptions = (ChromeOptions) abhi.V(parcel, readInt8, ChromeOptions.CREATOR);
                            }
                        } else {
                            bArr = abhi.am(parcel, readInt8);
                        }
                    } else {
                        str10 = abhi.ab(parcel, readInt8);
                    }
                }
                abhi.aj(parcel, P8);
                if (bArr != null) {
                    aozbVar2 = aozb.w(bArr);
                }
                return new BrowserOptions(str10, aozbVar2, chromeOptions);
            case 8:
                int P9 = abhi.P(parcel);
                byte[] bArr2 = null;
                String str11 = null;
                PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
                PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
                ArrayList arrayList2 = null;
                Double d = null;
                ArrayList arrayList3 = null;
                AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
                TokenBinding tokenBinding = null;
                AuthenticationExtensions authenticationExtensions = null;
                while (parcel.dataPosition() < P9) {
                    int readInt9 = parcel.readInt();
                    switch (abhi.L(readInt9)) {
                        case 2:
                            publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) abhi.V(parcel, readInt9, PublicKeyCredentialRpEntity.CREATOR);
                            break;
                        case 3:
                            publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) abhi.V(parcel, readInt9, PublicKeyCredentialUserEntity.CREATOR);
                            break;
                        case 4:
                            bArr2 = abhi.am(parcel, readInt9);
                            break;
                        case 5:
                            arrayList2 = abhi.ah(parcel, readInt9, PublicKeyCredentialParameters.CREATOR);
                            break;
                        case 6:
                            d = abhi.X(parcel, readInt9);
                            break;
                        case 7:
                            arrayList3 = abhi.ah(parcel, readInt9, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case 8:
                            authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) abhi.V(parcel, readInt9, AuthenticatorSelectionCriteria.CREATOR);
                            break;
                        case 9:
                            tokenBinding = (TokenBinding) abhi.V(parcel, readInt9, TokenBinding.CREATOR);
                            break;
                        case 10:
                            str11 = abhi.ab(parcel, readInt9);
                            break;
                        case 11:
                            authenticationExtensions = (AuthenticationExtensions) abhi.V(parcel, readInt9, AuthenticationExtensions.CREATOR);
                            break;
                        default:
                            abhi.ak(parcel, readInt9);
                            break;
                    }
                }
                abhi.aj(parcel, P9);
                aozb w = aozb.w(bArr2);
                if (str11 != null) {
                    try {
                        a2 = AttestationConveyancePreference.a(str11);
                    } catch (abza e) {
                        throw new IllegalArgumentException(e);
                    }
                }
                return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, w, arrayList2, d, arrayList3, authenticatorSelectionCriteria, tokenBinding, a2, authenticationExtensions);
            case 9:
                int P10 = abhi.P(parcel);
                byte[] bArr3 = null;
                String str12 = null;
                Double d2 = null;
                String str13 = null;
                ArrayList arrayList4 = null;
                TokenBinding tokenBinding2 = null;
                AuthenticationExtensions authenticationExtensions2 = null;
                while (parcel.dataPosition() < P10) {
                    int readInt10 = parcel.readInt();
                    switch (abhi.L(readInt10)) {
                        case 2:
                            bArr3 = abhi.am(parcel, readInt10);
                            break;
                        case 3:
                            d2 = abhi.X(parcel, readInt10);
                            break;
                        case 4:
                            str13 = abhi.ab(parcel, readInt10);
                            break;
                        case 5:
                            arrayList4 = abhi.ah(parcel, readInt10, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case 6:
                            tokenBinding2 = (TokenBinding) abhi.V(parcel, readInt10, TokenBinding.CREATOR);
                            break;
                        case 7:
                            str12 = abhi.ab(parcel, readInt10);
                            break;
                        case 8:
                            authenticationExtensions2 = (AuthenticationExtensions) abhi.V(parcel, readInt10, AuthenticationExtensions.CREATOR);
                            break;
                        default:
                            abhi.ak(parcel, readInt10);
                            break;
                    }
                }
                abhi.aj(parcel, P10);
                aozb w2 = aozb.w(bArr3);
                if (str12 != null) {
                    try {
                        a = UserVerificationRequirement.a(str12);
                    } catch (abzk e2) {
                        throw new IllegalArgumentException(e2);
                    }
                }
                return new PublicKeyCredentialRequestOptions(w2, d2, str13, arrayList4, tokenBinding2, a, authenticationExtensions2);
            case 10:
                int P11 = abhi.P(parcel);
                byte[] bArr4 = null;
                String str14 = null;
                while (parcel.dataPosition() < P11) {
                    int readInt11 = parcel.readInt();
                    int L6 = abhi.L(readInt11);
                    if (L6 != 1) {
                        if (L6 != 2) {
                            if (L6 != 3) {
                                abhi.ak(parcel, readInt11);
                            } else {
                                z = abhi.al(parcel, readInt11);
                            }
                        } else {
                            bArr4 = abhi.am(parcel, readInt11);
                        }
                    } else {
                        str14 = abhi.ab(parcel, readInt11);
                    }
                }
                abhi.aj(parcel, P11);
                if (bArr4 != null) {
                    aozbVar = aozb.w(bArr4);
                }
                return new RegisteredCredentialData(str14, aozbVar, z);
            case 11:
                int P12 = abhi.P(parcel);
                long j2 = 0;
                int i7 = 0;
                PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
                String str15 = null;
                String str16 = null;
                BrowserOptions browserOptions2 = null;
                Account account2 = null;
                Bundle bundle2 = null;
                while (parcel.dataPosition() < P12) {
                    int readInt12 = parcel.readInt();
                    switch (abhi.L(readInt12)) {
                        case 2:
                            publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) abhi.V(parcel, readInt12, PublicKeyCredentialCreationOptions.CREATOR);
                            break;
                        case 3:
                            str15 = abhi.ab(parcel, readInt12);
                            break;
                        case 4:
                            str16 = abhi.ab(parcel, readInt12);
                            break;
                        case 5:
                            browserOptions2 = (BrowserOptions) abhi.V(parcel, readInt12, BrowserOptions.CREATOR);
                            break;
                        case 6:
                            account2 = (Account) abhi.V(parcel, readInt12, Account.CREATOR);
                            break;
                        case 7:
                            i7 = abhi.N(parcel, readInt12);
                            break;
                        case 8:
                            bundle2 = abhi.S(parcel, readInt12);
                            break;
                        case 9:
                            z2 = abhi.al(parcel, readInt12);
                            break;
                        case 10:
                            j2 = abhi.Q(parcel, readInt12);
                            break;
                        default:
                            abhi.ak(parcel, readInt12);
                            break;
                    }
                }
                abhi.aj(parcel, P12);
                return new RegistrationOptions(publicKeyCredentialCreationOptions, str15, str16, browserOptions2, account2, i7, bundle2, Boolean.valueOf(z2), j2);
            case 12:
                int P13 = abhi.P(parcel);
                PendingIntent pendingIntent2 = null;
                while (parcel.dataPosition() < P13) {
                    int readInt13 = parcel.readInt();
                    int L7 = abhi.L(readInt13);
                    if (L7 != 1) {
                        if (L7 != 2) {
                            abhi.ak(parcel, readInt13);
                        } else {
                            pendingIntent2 = (PendingIntent) abhi.V(parcel, readInt13, PendingIntent.CREATOR);
                        }
                    } else {
                        account = (Account) abhi.V(parcel, readInt13, Account.CREATOR);
                    }
                }
                abhi.aj(parcel, P13);
                return new AccountWithZuulKeyRetrievalIntent(account, pendingIntent2);
            case 13:
                int P14 = abhi.P(parcel);
                boolean z13 = false;
                boolean z14 = false;
                boolean z15 = false;
                boolean z16 = false;
                ArrayList arrayList5 = null;
                String str17 = null;
                Account account3 = null;
                String str18 = null;
                String str19 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < P14) {
                    int readInt14 = parcel.readInt();
                    switch (abhi.L(readInt14)) {
                        case 1:
                            arrayList5 = abhi.ah(parcel, readInt14, Scope.CREATOR);
                            break;
                        case 2:
                            str17 = abhi.ab(parcel, readInt14);
                            break;
                        case 3:
                            z13 = abhi.al(parcel, readInt14);
                            break;
                        case 4:
                            z14 = abhi.al(parcel, readInt14);
                            break;
                        case 5:
                            account3 = (Account) abhi.V(parcel, readInt14, Account.CREATOR);
                            break;
                        case 6:
                            str18 = abhi.ab(parcel, readInt14);
                            break;
                        case 7:
                            str19 = abhi.ab(parcel, readInt14);
                            break;
                        case 8:
                            z15 = abhi.al(parcel, readInt14);
                            break;
                        case 9:
                            bundle3 = abhi.S(parcel, readInt14);
                            break;
                        case 10:
                            z16 = abhi.al(parcel, readInt14);
                            break;
                        default:
                            abhi.ak(parcel, readInt14);
                            break;
                    }
                }
                abhi.aj(parcel, P14);
                return new AuthorizationRequest(arrayList5, str17, z13, z14, account3, str18, str19, z15, bundle3, z16);
            case 14:
                int P15 = abhi.P(parcel);
                String str20 = null;
                String str21 = null;
                String str22 = null;
                ArrayList arrayList6 = null;
                GoogleSignInAccount googleSignInAccount = null;
                PendingIntent pendingIntent3 = null;
                while (parcel.dataPosition() < P15) {
                    int readInt15 = parcel.readInt();
                    switch (abhi.L(readInt15)) {
                        case 1:
                            str20 = abhi.ab(parcel, readInt15);
                            break;
                        case 2:
                            str21 = abhi.ab(parcel, readInt15);
                            break;
                        case 3:
                            str22 = abhi.ab(parcel, readInt15);
                            break;
                        case 4:
                            arrayList6 = abhi.ag(parcel, readInt15);
                            break;
                        case 5:
                            googleSignInAccount = (GoogleSignInAccount) abhi.V(parcel, readInt15, GoogleSignInAccount.CREATOR);
                            break;
                        case 6:
                            pendingIntent3 = (PendingIntent) abhi.V(parcel, readInt15, PendingIntent.CREATOR);
                            break;
                        default:
                            abhi.ak(parcel, readInt15);
                            break;
                    }
                }
                abhi.aj(parcel, P15);
                return new AuthorizationResult(str20, str21, str22, arrayList6, googleSignInAccount, pendingIntent3);
            case 15:
                int P16 = abhi.P(parcel);
                boolean z17 = false;
                int i8 = 0;
                boolean z18 = false;
                BeginSignInRequest.PasswordRequestOptions passwordRequestOptions = null;
                BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptions = null;
                String str23 = null;
                BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptions = null;
                BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptions = null;
                while (parcel.dataPosition() < P16) {
                    int readInt16 = parcel.readInt();
                    switch (abhi.L(readInt16)) {
                        case 1:
                            passwordRequestOptions = (BeginSignInRequest.PasswordRequestOptions) abhi.V(parcel, readInt16, BeginSignInRequest.PasswordRequestOptions.CREATOR);
                            break;
                        case 2:
                            googleIdTokenRequestOptions = (BeginSignInRequest.GoogleIdTokenRequestOptions) abhi.V(parcel, readInt16, BeginSignInRequest.GoogleIdTokenRequestOptions.CREATOR);
                            break;
                        case 3:
                            str23 = abhi.ab(parcel, readInt16);
                            break;
                        case 4:
                            z17 = abhi.al(parcel, readInt16);
                            break;
                        case 5:
                            i8 = abhi.N(parcel, readInt16);
                            break;
                        case 6:
                            passkeysRequestOptions = (BeginSignInRequest.PasskeysRequestOptions) abhi.V(parcel, readInt16, BeginSignInRequest.PasskeysRequestOptions.CREATOR);
                            break;
                        case 7:
                            passkeyJsonRequestOptions = (BeginSignInRequest.PasskeyJsonRequestOptions) abhi.V(parcel, readInt16, BeginSignInRequest.PasskeyJsonRequestOptions.CREATOR);
                            break;
                        case 8:
                            z18 = abhi.al(parcel, readInt16);
                            break;
                        default:
                            abhi.ak(parcel, readInt16);
                            break;
                    }
                }
                abhi.aj(parcel, P16);
                return new BeginSignInRequest(passwordRequestOptions, googleIdTokenRequestOptions, str23, z17, i8, passkeysRequestOptions, passkeyJsonRequestOptions, z18);
            case 16:
                int P17 = abhi.P(parcel);
                while (parcel.dataPosition() < P17) {
                    int readInt17 = parcel.readInt();
                    if (abhi.L(readInt17) != 1) {
                        abhi.ak(parcel, readInt17);
                    } else {
                        pendingIntent = (PendingIntent) abhi.V(parcel, readInt17, PendingIntent.CREATOR);
                    }
                }
                abhi.aj(parcel, P17);
                return new BeginSignInResult(pendingIntent);
            case 17:
                int P18 = abhi.P(parcel);
                SigningInfoCompat signingInfoCompat = null;
                String str24 = null;
                while (parcel.dataPosition() < P18) {
                    int readInt18 = parcel.readInt();
                    int L8 = abhi.L(readInt18);
                    if (L8 != 1) {
                        if (L8 != 2) {
                            if (L8 != 3) {
                                abhi.ak(parcel, readInt18);
                            } else {
                                str24 = abhi.ab(parcel, readInt18);
                            }
                        } else {
                            signingInfoCompat = (SigningInfoCompat) abhi.V(parcel, readInt18, SigningInfoCompat.CREATOR);
                        }
                    } else {
                        str2 = abhi.ab(parcel, readInt18);
                    }
                }
                abhi.aj(parcel, P18);
                return new CallingAppInfoCompat(str2, signingInfoCompat, str24);
            case 18:
                int P19 = abhi.P(parcel);
                boolean z19 = false;
                boolean z20 = false;
                boolean z21 = false;
                boolean z22 = false;
                String str25 = null;
                String str26 = null;
                while (parcel.dataPosition() < P19) {
                    int readInt19 = parcel.readInt();
                    switch (abhi.L(readInt19)) {
                        case 1:
                            str25 = abhi.ab(parcel, readInt19);
                            break;
                        case 2:
                            str26 = abhi.ab(parcel, readInt19);
                            break;
                        case 3:
                            z19 = abhi.al(parcel, readInt19);
                            break;
                        case 4:
                            z20 = abhi.al(parcel, readInt19);
                            break;
                        case 5:
                            z21 = abhi.al(parcel, readInt19);
                            break;
                        case 6:
                            z22 = abhi.al(parcel, readInt19);
                            break;
                        default:
                            abhi.ak(parcel, readInt19);
                            break;
                    }
                }
                abhi.aj(parcel, P19);
                return new ChromeOptions(str25, str26, z19, z20, z21, z22);
            case 19:
                int P20 = abhi.P(parcel);
                while (parcel.dataPosition() < P20) {
                    int readInt20 = parcel.readInt();
                    if (abhi.L(readInt20) != 1) {
                        abhi.ak(parcel, readInt20);
                    } else {
                        signInCredential = (SignInCredential) abhi.V(parcel, readInt20, SignInCredential.CREATOR);
                    }
                }
                abhi.aj(parcel, P20);
                return new CompleteSignInResult(signInCredential);
            default:
                int P21 = abhi.P(parcel);
                String str27 = null;
                while (parcel.dataPosition() < P21) {
                    int readInt21 = parcel.readInt();
                    int L9 = abhi.L(readInt21);
                    if (L9 != 1) {
                        if (L9 != 2) {
                            if (L9 != 3) {
                                abhi.ak(parcel, readInt21);
                            } else {
                                i = abhi.N(parcel, readInt21);
                            }
                        } else {
                            str27 = abhi.ab(parcel, readInt21);
                        }
                    } else {
                        arrayList = abhi.ag(parcel, readInt21);
                    }
                }
                abhi.aj(parcel, P21);
                return new FetchVerifiedPhoneNumbersResult(arrayList, str27, i);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new CredentialRequest[i];
            case 1:
                return new CredentialPickerConfig[i];
            case 2:
                return new HintRequest[i];
            case 3:
                return new IdToken[i];
            case 4:
                return new DeleteRequest[i];
            case 5:
                return new SaveRequest[i];
            case 6:
                return new AuthenticationOptions[i];
            case 7:
                return new BrowserOptions[i];
            case 8:
                return new PublicKeyCredentialCreationOptions[i];
            case 9:
                return new PublicKeyCredentialRequestOptions[i];
            case 10:
                return new RegisteredCredentialData[i];
            case 11:
                return new RegistrationOptions[i];
            case 12:
                return new AccountWithZuulKeyRetrievalIntent[i];
            case 13:
                return new AuthorizationRequest[i];
            case 14:
                return new AuthorizationResult[i];
            case 15:
                return new BeginSignInRequest[i];
            case 16:
                return new BeginSignInResult[i];
            case 17:
                return new CallingAppInfoCompat[i];
            case 18:
                return new ChromeOptions[i];
            case 19:
                return new CompleteSignInResult[i];
            default:
                return new FetchVerifiedPhoneNumbersResult[i];
        }
    }
}
