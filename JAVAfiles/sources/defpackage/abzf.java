package defpackage;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialType;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.SimpleTransactionAuthorizationExtension;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.fido.sourcedevice.SourceStartDirectTransferOptions;
import com.google.android.gms.fido.targetdevice.TargetDirectTransferResult;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserRegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzf implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abzf(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        SignRequestParams signRequestParams = null;
        RegisterRequestParams registerRequestParams = null;
        String str3 = null;
        Status status = null;
        ArrayList arrayList = null;
        String str4 = null;
        String str5 = null;
        byte[] bArr = null;
        switch (this.a) {
            case 0:
                int P = abhi.P(parcel);
                String str6 = null;
                String str7 = null;
                while (parcel.dataPosition() < P) {
                    int readInt = parcel.readInt();
                    int L = abhi.L(readInt);
                    if (L != 2) {
                        if (L != 3) {
                            if (L != 4) {
                                abhi.ak(parcel, readInt);
                            } else {
                                str7 = abhi.ab(parcel, readInt);
                            }
                        } else {
                            str6 = abhi.ab(parcel, readInt);
                        }
                    } else {
                        str = abhi.ab(parcel, readInt);
                    }
                }
                abhi.aj(parcel, P);
                return new PublicKeyCredentialRpEntity(str, str6, str7);
            case 1:
                int P2 = abhi.P(parcel);
                byte[] bArr2 = null;
                Double d = null;
                String str8 = null;
                ArrayList arrayList2 = null;
                Integer num = null;
                TokenBinding tokenBinding = null;
                String str9 = null;
                AuthenticationExtensions authenticationExtensions = null;
                Long l = null;
                String str10 = null;
                ResultReceiver resultReceiver = null;
                while (parcel.dataPosition() < P2) {
                    int readInt2 = parcel.readInt();
                    switch (abhi.L(readInt2)) {
                        case 2:
                            bArr2 = abhi.am(parcel, readInt2);
                            break;
                        case 3:
                            d = abhi.X(parcel, readInt2);
                            break;
                        case 4:
                            str8 = abhi.ab(parcel, readInt2);
                            break;
                        case 5:
                            arrayList2 = abhi.ah(parcel, readInt2, PublicKeyCredentialDescriptor.CREATOR);
                            break;
                        case 6:
                            num = abhi.Z(parcel, readInt2);
                            break;
                        case 7:
                            tokenBinding = (TokenBinding) abhi.V(parcel, readInt2, TokenBinding.CREATOR);
                            break;
                        case 8:
                            str9 = abhi.ab(parcel, readInt2);
                            break;
                        case 9:
                            authenticationExtensions = (AuthenticationExtensions) abhi.V(parcel, readInt2, AuthenticationExtensions.CREATOR);
                            break;
                        case 10:
                            l = abhi.aa(parcel, readInt2);
                            break;
                        case 11:
                            str10 = abhi.ab(parcel, readInt2);
                            break;
                        case 12:
                            resultReceiver = (ResultReceiver) abhi.V(parcel, readInt2, ResultReceiver.CREATOR);
                            break;
                        default:
                            abhi.ak(parcel, readInt2);
                            break;
                    }
                }
                abhi.aj(parcel, P2);
                return new PublicKeyCredentialRequestOptions(bArr2, d, str8, arrayList2, num, tokenBinding, str9, authenticationExtensions, l, str10, resultReceiver);
            case 2:
                try {
                    return PublicKeyCredentialType.a(parcel.readString());
                } catch (abzg e) {
                    throw new RuntimeException(e);
                }
            case 3:
                int P3 = abhi.P(parcel);
                String str11 = null;
                String str12 = null;
                String str13 = null;
                while (parcel.dataPosition() < P3) {
                    int readInt3 = parcel.readInt();
                    int L2 = abhi.L(readInt3);
                    if (L2 != 2) {
                        if (L2 != 3) {
                            if (L2 != 4) {
                                if (L2 != 5) {
                                    abhi.ak(parcel, readInt3);
                                } else {
                                    str13 = abhi.ab(parcel, readInt3);
                                }
                            } else {
                                str12 = abhi.ab(parcel, readInt3);
                            }
                        } else {
                            str11 = abhi.ab(parcel, readInt3);
                        }
                    } else {
                        bArr = abhi.am(parcel, readInt3);
                    }
                }
                abhi.aj(parcel, P3);
                return new PublicKeyCredentialUserEntity(bArr, str11, str12, str13);
            case 4:
                String readString = parcel.readString();
                if (readString == null) {
                    readString = "";
                }
                try {
                    return ResidentKeyRequirement.a(readString);
                } catch (abzi e2) {
                    throw new RuntimeException(e2);
                }
            case 5:
                int P4 = abhi.P(parcel);
                while (parcel.dataPosition() < P4) {
                    int readInt4 = parcel.readInt();
                    if (abhi.L(readInt4) != 1) {
                        abhi.ak(parcel, readInt4);
                    } else {
                        str5 = abhi.ab(parcel, readInt4);
                    }
                }
                abhi.aj(parcel, P4);
                return new SimpleTransactionAuthorizationExtension(str5);
            case 6:
                try {
                    return TokenBinding.TokenBindingStatus.a(parcel.readString());
                } catch (abzj e3) {
                    throw new RuntimeException(e3);
                }
            case 7:
                int P5 = abhi.P(parcel);
                String str14 = null;
                while (parcel.dataPosition() < P5) {
                    int readInt5 = parcel.readInt();
                    int L3 = abhi.L(readInt5);
                    if (L3 != 2) {
                        if (L3 != 3) {
                            abhi.ak(parcel, readInt5);
                        } else {
                            str14 = abhi.ab(parcel, readInt5);
                        }
                    } else {
                        str4 = abhi.ab(parcel, readInt5);
                    }
                }
                abhi.aj(parcel, P5);
                return new TokenBinding(str4, str14);
            case 8:
                int P6 = abhi.P(parcel);
                while (parcel.dataPosition() < P6) {
                    int readInt6 = parcel.readInt();
                    if (abhi.L(readInt6) != 1) {
                        abhi.ak(parcel, readInt6);
                    } else {
                        z = abhi.al(parcel, readInt6);
                    }
                }
                abhi.aj(parcel, P6);
                return new UserVerificationMethodExtension(z);
            case 9:
                try {
                    return UserVerificationRequirement.a(parcel.readString());
                } catch (abzk e4) {
                    throw new RuntimeException(e4);
                }
            case 10:
                int P7 = abhi.P(parcel);
                while (parcel.dataPosition() < P7) {
                    int readInt7 = parcel.readInt();
                    if (abhi.L(readInt7) != 1) {
                        abhi.ak(parcel, readInt7);
                    } else {
                        arrayList = abhi.ah(parcel, readInt7, UvmEntry.CREATOR);
                    }
                }
                abhi.aj(parcel, P7);
                return new UvmEntries(arrayList);
            case 11:
                int P8 = abhi.P(parcel);
                short s = 0;
                short s2 = 0;
                while (parcel.dataPosition() < P8) {
                    int readInt8 = parcel.readInt();
                    int L4 = abhi.L(readInt8);
                    if (L4 != 1) {
                        if (L4 != 2) {
                            if (L4 != 3) {
                                abhi.ak(parcel, readInt8);
                            } else {
                                s2 = abhi.ai(parcel, readInt8);
                            }
                        } else {
                            s = abhi.ai(parcel, readInt8);
                        }
                    } else {
                        i2 = abhi.N(parcel, readInt8);
                    }
                }
                abhi.aj(parcel, P8);
                return new UvmEntry(i2, s, s2);
            case 12:
                int P9 = abhi.P(parcel);
                int i3 = 0;
                boolean z2 = false;
                boolean z3 = false;
                ArrayList arrayList3 = null;
                String str15 = null;
                while (parcel.dataPosition() < P9) {
                    int readInt9 = parcel.readInt();
                    int L5 = abhi.L(readInt9);
                    if (L5 != 1) {
                        if (L5 != 2) {
                            if (L5 != 3) {
                                if (L5 != 4) {
                                    if (L5 != 5) {
                                        abhi.ak(parcel, readInt9);
                                    } else {
                                        str15 = abhi.ab(parcel, readInt9);
                                    }
                                } else {
                                    z3 = abhi.al(parcel, readInt9);
                                }
                            } else {
                                arrayList3 = abhi.ah(parcel, readInt9, Account.CREATOR);
                            }
                        } else {
                            z2 = abhi.al(parcel, readInt9);
                        }
                    } else {
                        i3 = abhi.N(parcel, readInt9);
                    }
                }
                abhi.aj(parcel, P9);
                return new SourceStartDirectTransferOptions(i3, z2, arrayList3, z3, str15);
            case 13:
                int P10 = abhi.P(parcel);
                ArrayList arrayList4 = null;
                while (parcel.dataPosition() < P10) {
                    int readInt10 = parcel.readInt();
                    int L6 = abhi.L(readInt10);
                    if (L6 != 1) {
                        if (L6 != 2) {
                            abhi.ak(parcel, readInt10);
                        } else {
                            arrayList4 = abhi.ah(parcel, readInt10, PublicKeyCredential.CREATOR);
                        }
                    } else {
                        status = (Status) abhi.V(parcel, readInt10, Status.CREATOR);
                    }
                }
                abhi.aj(parcel, P10);
                return new TargetDirectTransferResult(status, arrayList4);
            case 14:
                try {
                    return StateUpdate.Type.a(parcel.readString());
                } catch (abzm e5) {
                    throw new RuntimeException(e5);
                }
            case 15:
                int P11 = abhi.P(parcel);
                String str16 = null;
                while (parcel.dataPosition() < P11) {
                    int readInt11 = parcel.readInt();
                    int L7 = abhi.L(readInt11);
                    if (L7 != 2) {
                        if (L7 != 3) {
                            abhi.ak(parcel, readInt11);
                        } else {
                            str16 = abhi.ab(parcel, readInt11);
                        }
                    } else {
                        str3 = abhi.ab(parcel, readInt11);
                    }
                }
                abhi.aj(parcel, P11);
                return new StateUpdate(str3, str16);
            case 16:
                int P12 = abhi.P(parcel);
                Uri uri = null;
                while (parcel.dataPosition() < P12) {
                    int readInt12 = parcel.readInt();
                    int L8 = abhi.L(readInt12);
                    if (L8 != 2) {
                        if (L8 != 3) {
                            abhi.ak(parcel, readInt12);
                        } else {
                            uri = (Uri) abhi.V(parcel, readInt12, Uri.CREATOR);
                        }
                    } else {
                        registerRequestParams = (RegisterRequestParams) abhi.V(parcel, readInt12, RegisterRequestParams.CREATOR);
                    }
                }
                abhi.aj(parcel, P12);
                return new BrowserRegisterRequestParams(registerRequestParams, uri);
            case 17:
                int P13 = abhi.P(parcel);
                Uri uri2 = null;
                while (parcel.dataPosition() < P13) {
                    int readInt13 = parcel.readInt();
                    int L9 = abhi.L(readInt13);
                    if (L9 != 2) {
                        if (L9 != 3) {
                            abhi.ak(parcel, readInt13);
                        } else {
                            uri2 = (Uri) abhi.V(parcel, readInt13, Uri.CREATOR);
                        }
                    } else {
                        signRequestParams = (SignRequestParams) abhi.V(parcel, readInt13, SignRequestParams.CREATOR);
                    }
                }
                abhi.aj(parcel, P13);
                return new BrowserSignRequestParams(signRequestParams, uri2);
            case 18:
                try {
                    return ChannelIdValue.a(parcel.readInt());
                } catch (abzn e6) {
                    throw new RuntimeException(e6);
                }
            case 19:
                int P14 = abhi.P(parcel);
                String str17 = null;
                while (parcel.dataPosition() < P14) {
                    int readInt14 = parcel.readInt();
                    int L10 = abhi.L(readInt14);
                    if (L10 != 2) {
                        if (L10 != 3) {
                            if (L10 != 4) {
                                abhi.ak(parcel, readInt14);
                            } else {
                                str17 = abhi.ab(parcel, readInt14);
                            }
                        } else {
                            str2 = abhi.ab(parcel, readInt14);
                        }
                    } else {
                        i = abhi.N(parcel, readInt14);
                    }
                }
                abhi.aj(parcel, P14);
                return new ChannelIdValue(i, str2, str17);
            default:
                return ErrorCode.a(parcel.readInt());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new PublicKeyCredentialRpEntity[i];
            case 1:
                return new PublicKeyCredentialRequestOptions[i];
            case 2:
                return new PublicKeyCredentialType[i];
            case 3:
                return new PublicKeyCredentialUserEntity[i];
            case 4:
                return new ResidentKeyRequirement[i];
            case 5:
                return new SimpleTransactionAuthorizationExtension[i];
            case 6:
                return new TokenBinding.TokenBindingStatus[i];
            case 7:
                return new TokenBinding[i];
            case 8:
                return new UserVerificationMethodExtension[i];
            case 9:
                return new UserVerificationRequirement[i];
            case 10:
                return new UvmEntries[i];
            case 11:
                return new UvmEntry[i];
            case 12:
                return new SourceStartDirectTransferOptions[i];
            case 13:
                return new TargetDirectTransferResult[i];
            case 14:
                return new StateUpdate.Type[i];
            case 15:
                return new StateUpdate[i];
            case 16:
                return new BrowserRegisterRequestParams[i];
            case 17:
                return new BrowserSignRequestParams[i];
            case 18:
                return new ChannelIdValue.ChannelIdValueType[i];
            case 19:
                return new ChannelIdValue[i];
            default:
                return new ErrorCode[i];
        }
    }
}
