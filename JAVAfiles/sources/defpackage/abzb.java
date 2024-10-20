package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.BrowserPublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationData;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyExtension;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleMultiAssertionExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSessionIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSilentVerificationExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleTunnelServerIdExtension;
import com.google.android.gms.fido.fido2.api.common.HmacSecretExtension;
import com.google.android.gms.fido.fido2.api.common.PaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PrfExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzb implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abzb(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        aozb w;
        aozb w2;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        boolean z3 = false;
        boolean z4 = false;
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = null;
        String str = null;
        String str2 = null;
        aozb aozbVar = null;
        byte[][] bArr = null;
        aozb aozbVar2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList arrayList = null;
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = null;
        String str5 = null;
        switch (this.a) {
            case 0:
                int P = abhi.P(parcel);
                Uri uri = null;
                byte[] bArr2 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < P) {
                    int readInt = parcel.readInt();
                    int L = abhi.L(readInt);
                    if (L != 2) {
                        if (L != 3) {
                            if (L != 4) {
                                if (L != 5) {
                                    abhi.ak(parcel, readInt);
                                } else {
                                    bundle = abhi.S(parcel, readInt);
                                }
                            } else {
                                bArr2 = abhi.am(parcel, readInt);
                            }
                        } else {
                            uri = (Uri) abhi.V(parcel, readInt, Uri.CREATOR);
                        }
                    } else {
                        publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) abhi.V(parcel, readInt, PublicKeyCredentialCreationOptions.CREATOR);
                    }
                }
                abhi.aj(parcel, P);
                return new BrowserPublicKeyCredentialCreationOptions(publicKeyCredentialCreationOptions, uri, bArr2, bundle);
            case 1:
                int P2 = abhi.P(parcel);
                Boolean bool = null;
                String str6 = null;
                String str7 = null;
                while (parcel.dataPosition() < P2) {
                    int readInt2 = parcel.readInt();
                    int L2 = abhi.L(readInt2);
                    if (L2 != 2) {
                        if (L2 != 3) {
                            if (L2 != 4) {
                                if (L2 != 5) {
                                    abhi.ak(parcel, readInt2);
                                } else {
                                    str7 = abhi.ab(parcel, readInt2);
                                }
                            } else {
                                str6 = abhi.ab(parcel, readInt2);
                            }
                        } else {
                            bool = abhi.W(parcel, readInt2);
                        }
                    } else {
                        str5 = abhi.ab(parcel, readInt2);
                    }
                }
                abhi.aj(parcel, P2);
                return new AuthenticatorSelectionCriteria(str5, bool, str6, str7);
            case 2:
                int P3 = abhi.P(parcel);
                Uri uri2 = null;
                byte[] bArr3 = null;
                while (parcel.dataPosition() < P3) {
                    int readInt3 = parcel.readInt();
                    int L3 = abhi.L(readInt3);
                    if (L3 != 2) {
                        if (L3 != 3) {
                            if (L3 != 4) {
                                abhi.ak(parcel, readInt3);
                            } else {
                                bArr3 = abhi.am(parcel, readInt3);
                            }
                        } else {
                            uri2 = (Uri) abhi.V(parcel, readInt3, Uri.CREATOR);
                        }
                    } else {
                        publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) abhi.V(parcel, readInt3, PublicKeyCredentialRequestOptions.CREATOR);
                    }
                }
                abhi.aj(parcel, P3);
                return new BrowserPublicKeyCredentialRequestOptions(publicKeyCredentialRequestOptions, uri2, bArr3);
            case 3:
                int readInt4 = parcel.readInt();
                try {
                    Integer.valueOf(readInt4).getClass();
                    return COSEAlgorithmIdentifier.a(readInt4);
                } catch (abzc e) {
                    throw new RuntimeException(e);
                }
            case 4:
                int P4 = abhi.P(parcel);
                long j2 = 0;
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                while (parcel.dataPosition() < P4) {
                    int readInt5 = parcel.readInt();
                    int L4 = abhi.L(readInt5);
                    if (L4 != 1) {
                        if (L4 != 2) {
                            if (L4 != 3) {
                                if (L4 != 4) {
                                    abhi.ak(parcel, readInt5);
                                } else {
                                    bArr6 = abhi.am(parcel, readInt5);
                                }
                            } else {
                                bArr5 = abhi.am(parcel, readInt5);
                            }
                        } else {
                            bArr4 = abhi.am(parcel, readInt5);
                        }
                    } else {
                        j2 = abhi.Q(parcel, readInt5);
                    }
                }
                abhi.aj(parcel, P4);
                return new CableAuthenticationData(j2, bArr4, bArr5, bArr6);
            case 5:
                int P5 = abhi.P(parcel);
                while (parcel.dataPosition() < P5) {
                    int readInt6 = parcel.readInt();
                    if (abhi.L(readInt6) != 1) {
                        abhi.ak(parcel, readInt6);
                    } else {
                        arrayList = abhi.ah(parcel, readInt6, CableAuthenticationData.CREATOR);
                    }
                }
                abhi.aj(parcel, P5);
                return new CableAuthenticationExtension(arrayList);
            case 6:
                int P6 = abhi.P(parcel);
                while (parcel.dataPosition() < P6) {
                    int readInt7 = parcel.readInt();
                    if (abhi.L(readInt7) != 1) {
                        abhi.ak(parcel, readInt7);
                    } else {
                        abhi.al(parcel, readInt7);
                    }
                }
                abhi.aj(parcel, P6);
                return new DevicePublicKeyExtension();
            case 7:
                try {
                    return ErrorCode.a(parcel.readInt());
                } catch (abze e2) {
                    throw new IllegalArgumentException(e2);
                }
            case 8:
                int P7 = abhi.P(parcel);
                while (parcel.dataPosition() < P7) {
                    int readInt8 = parcel.readInt();
                    if (abhi.L(readInt8) != 2) {
                        abhi.ak(parcel, readInt8);
                    } else {
                        str4 = abhi.ab(parcel, readInt8);
                    }
                }
                abhi.aj(parcel, P7);
                return new FidoAppIdExtension(str4);
            case 9:
                int P8 = abhi.P(parcel);
                while (parcel.dataPosition() < P8) {
                    int readInt9 = parcel.readInt();
                    if (abhi.L(readInt9) != 1) {
                        abhi.ak(parcel, readInt9);
                    } else {
                        z = abhi.al(parcel, readInt9);
                    }
                }
                abhi.aj(parcel, P8);
                return new GoogleMultiAssertionExtension(z);
            case 10:
                int P9 = abhi.P(parcel);
                while (parcel.dataPosition() < P9) {
                    int readInt10 = parcel.readInt();
                    if (abhi.L(readInt10) != 1) {
                        abhi.ak(parcel, readInt10);
                    } else {
                        j = abhi.Q(parcel, readInt10);
                    }
                }
                abhi.aj(parcel, P9);
                return new GoogleSessionIdExtension(j);
            case 11:
                int P10 = abhi.P(parcel);
                while (parcel.dataPosition() < P10) {
                    int readInt11 = parcel.readInt();
                    if (abhi.L(readInt11) != 1) {
                        abhi.ak(parcel, readInt11);
                    } else {
                        z4 = abhi.al(parcel, readInt11);
                    }
                }
                abhi.aj(parcel, P10);
                return new GoogleSilentVerificationExtension(z4);
            case 12:
                int P11 = abhi.P(parcel);
                while (parcel.dataPosition() < P11) {
                    int readInt12 = parcel.readInt();
                    if (abhi.L(readInt12) != 1) {
                        abhi.ak(parcel, readInt12);
                    } else {
                        z3 = abhi.al(parcel, readInt12);
                    }
                }
                abhi.aj(parcel, P11);
                return new GoogleThirdPartyPaymentExtension(z3);
            case 13:
                int P12 = abhi.P(parcel);
                while (parcel.dataPosition() < P12) {
                    int readInt13 = parcel.readInt();
                    if (abhi.L(readInt13) != 1) {
                        abhi.ak(parcel, readInt13);
                    } else {
                        str3 = abhi.ab(parcel, readInt13);
                    }
                }
                abhi.aj(parcel, P12);
                return new GoogleTunnelServerIdExtension(str3);
            case 14:
                int P13 = abhi.P(parcel);
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                byte[] bArr9 = null;
                while (parcel.dataPosition() < P13) {
                    int readInt14 = parcel.readInt();
                    int L5 = abhi.L(readInt14);
                    if (L5 != 1) {
                        if (L5 != 2) {
                            if (L5 != 3) {
                                if (L5 != 4) {
                                    abhi.ak(parcel, readInt14);
                                } else {
                                    i = abhi.N(parcel, readInt14);
                                }
                            } else {
                                bArr9 = abhi.am(parcel, readInt14);
                            }
                        } else {
                            bArr8 = abhi.am(parcel, readInt14);
                        }
                    } else {
                        bArr7 = abhi.am(parcel, readInt14);
                    }
                }
                abhi.aj(parcel, P13);
                if (bArr7 == null) {
                    w = null;
                } else {
                    w = aozb.w(bArr7);
                }
                if (bArr8 == null) {
                    w2 = null;
                } else {
                    w2 = aozb.w(bArr8);
                }
                if (bArr9 != null) {
                    aozbVar2 = aozb.w(bArr9);
                }
                return new HmacSecretExtension(w, w2, aozbVar2, i);
            case 15:
                int P14 = abhi.P(parcel);
                while (parcel.dataPosition() < P14) {
                    int readInt15 = parcel.readInt();
                    if (abhi.L(readInt15) != 1) {
                        abhi.ak(parcel, readInt15);
                    } else {
                        z2 = abhi.al(parcel, readInt15);
                    }
                }
                abhi.aj(parcel, P14);
                return new PaymentExtension(z2);
            case 16:
                int P15 = abhi.P(parcel);
                while (parcel.dataPosition() < P15) {
                    int readInt16 = parcel.readInt();
                    if (abhi.L(readInt16) != 1) {
                        abhi.ak(parcel, readInt16);
                    } else {
                        bArr = abhi.at(parcel, readInt16);
                    }
                }
                abhi.aj(parcel, P15);
                return new PrfExtension(bArr);
            case 17:
                int P16 = abhi.P(parcel);
                PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
                PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
                byte[] bArr10 = null;
                ArrayList arrayList2 = null;
                Double d = null;
                ArrayList arrayList3 = null;
                AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
                Integer num = null;
                TokenBinding tokenBinding = null;
                String str8 = null;
                AuthenticationExtensions authenticationExtensions = null;
                String str9 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < P16) {
                    int readInt17 = parcel.readInt();
                    switch (abhi.L(readInt17)) {
                        case 2:
                            publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) abhi.V(parcel, readInt17, PublicKeyCredentialRpEntity.CREATOR);
                            break;
                        case 3:
                            publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) abhi.V(parcel, readInt17, PublicKeyCredentialUserEntity.CREATOR);
                            break;
                        case 4:
                            bArr10 = abhi.am(parcel, readInt17);
                            break;
                        case 5:
                            arrayList2 = abhi.ah(parcel, readInt17, PublicKeyCredentialParameters.CREATOR);
                            break;
                        case 6:
                            d = abhi.X(parcel, readInt17);
                            break;
                        case 7:
                            arrayList3 = abhi.ah(parcel, readInt17, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case 8:
                            authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) abhi.V(parcel, readInt17, AuthenticatorSelectionCriteria.CREATOR);
                            break;
                        case 9:
                            num = abhi.Z(parcel, readInt17);
                            break;
                        case 10:
                            tokenBinding = (TokenBinding) abhi.V(parcel, readInt17, TokenBinding.CREATOR);
                            break;
                        case 11:
                            str8 = abhi.ab(parcel, readInt17);
                            break;
                        case 12:
                            authenticationExtensions = (AuthenticationExtensions) abhi.V(parcel, readInt17, AuthenticationExtensions.CREATOR);
                            break;
                        case 13:
                            str9 = abhi.ab(parcel, readInt17);
                            break;
                        case 14:
                            resultReceiver = (ResultReceiver) abhi.V(parcel, readInt17, ResultReceiver.CREATOR);
                            break;
                        default:
                            abhi.ak(parcel, readInt17);
                            break;
                    }
                }
                abhi.aj(parcel, P16);
                return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr10, arrayList2, d, arrayList3, authenticatorSelectionCriteria, num, tokenBinding, str8, authenticationExtensions, str9, resultReceiver);
            case 18:
                int P17 = abhi.P(parcel);
                byte[] bArr11 = null;
                String str10 = null;
                String str11 = null;
                AuthenticatorAttestationResponse authenticatorAttestationResponse = null;
                AuthenticatorAssertionResponse authenticatorAssertionResponse = null;
                AuthenticatorErrorResponse authenticatorErrorResponse = null;
                AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = null;
                String str12 = null;
                while (parcel.dataPosition() < P17) {
                    int readInt18 = parcel.readInt();
                    switch (abhi.L(readInt18)) {
                        case 1:
                            str10 = abhi.ab(parcel, readInt18);
                            break;
                        case 2:
                            str11 = abhi.ab(parcel, readInt18);
                            break;
                        case 3:
                            bArr11 = abhi.am(parcel, readInt18);
                            break;
                        case 4:
                            authenticatorAttestationResponse = (AuthenticatorAttestationResponse) abhi.V(parcel, readInt18, AuthenticatorAttestationResponse.CREATOR);
                            break;
                        case 5:
                            authenticatorAssertionResponse = (AuthenticatorAssertionResponse) abhi.V(parcel, readInt18, AuthenticatorAssertionResponse.CREATOR);
                            break;
                        case 6:
                            authenticatorErrorResponse = (AuthenticatorErrorResponse) abhi.V(parcel, readInt18, AuthenticatorErrorResponse.CREATOR);
                            break;
                        case 7:
                            authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) abhi.V(parcel, readInt18, AuthenticationExtensionsClientOutputs.CREATOR);
                            break;
                        case 8:
                            str12 = abhi.ab(parcel, readInt18);
                            break;
                        case 9:
                            abhi.ab(parcel, readInt18);
                            break;
                        default:
                            abhi.ak(parcel, readInt18);
                            break;
                    }
                }
                abhi.aj(parcel, P17);
                if (bArr11 != null) {
                    aozbVar = aozb.w(bArr11);
                }
                return new PublicKeyCredential(str10, str11, aozbVar, authenticatorAttestationResponse, authenticatorAssertionResponse, authenticatorErrorResponse, authenticationExtensionsClientOutputs, str12);
            case 19:
                int P18 = abhi.P(parcel);
                byte[] bArr12 = null;
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < P18) {
                    int readInt19 = parcel.readInt();
                    int L6 = abhi.L(readInt19);
                    if (L6 != 2) {
                        if (L6 != 3) {
                            if (L6 != 4) {
                                abhi.ak(parcel, readInt19);
                            } else {
                                arrayList4 = abhi.ah(parcel, readInt19, Transport.CREATOR);
                            }
                        } else {
                            bArr12 = abhi.am(parcel, readInt19);
                        }
                    } else {
                        str2 = abhi.ab(parcel, readInt19);
                    }
                }
                abhi.aj(parcel, P18);
                return new PublicKeyCredentialDescriptor(str2, bArr12, arrayList4);
            default:
                int P19 = abhi.P(parcel);
                Integer num2 = null;
                while (parcel.dataPosition() < P19) {
                    int readInt20 = parcel.readInt();
                    int L7 = abhi.L(readInt20);
                    if (L7 != 2) {
                        if (L7 != 3) {
                            abhi.ak(parcel, readInt20);
                        } else {
                            num2 = abhi.Z(parcel, readInt20);
                        }
                    } else {
                        str = abhi.ab(parcel, readInt20);
                    }
                }
                abhi.aj(parcel, P19);
                return new PublicKeyCredentialParameters(str, num2.intValue());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new BrowserPublicKeyCredentialCreationOptions[i];
            case 1:
                return new AuthenticatorSelectionCriteria[i];
            case 2:
                return new BrowserPublicKeyCredentialRequestOptions[i];
            case 3:
                return new COSEAlgorithmIdentifier[i];
            case 4:
                return new CableAuthenticationData[i];
            case 5:
                return new CableAuthenticationExtension[i];
            case 6:
                return new DevicePublicKeyExtension[i];
            case 7:
                return new ErrorCode[i];
            case 8:
                return new FidoAppIdExtension[i];
            case 9:
                return new GoogleMultiAssertionExtension[i];
            case 10:
                return new GoogleSessionIdExtension[i];
            case 11:
                return new GoogleSilentVerificationExtension[i];
            case 12:
                return new GoogleThirdPartyPaymentExtension[i];
            case 13:
                return new GoogleTunnelServerIdExtension[i];
            case 14:
                return new HmacSecretExtension[i];
            case 15:
                return new PaymentExtension[i];
            case 16:
                return new PrfExtension[i];
            case 17:
                return new PublicKeyCredentialCreationOptions[i];
            case 18:
                return new PublicKeyCredential[i];
            case 19:
                return new PublicKeyCredentialDescriptor[i];
            default:
                return new PublicKeyCredentialParameters[i];
        }
    }
}
