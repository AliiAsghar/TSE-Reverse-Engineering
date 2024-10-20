package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abye implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abye(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = this.a;
        aozb aozbVar = null;
        String str = null;
        byte[] bArr = null;
        aozb aozbVar2 = null;
        if (i != 0) {
            boolean z = false;
            int i2 = 0;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        int P = abhi.P(parcel);
                        int i3 = 0;
                        while (parcel.dataPosition() < P) {
                            int readInt = parcel.readInt();
                            int L = abhi.L(readInt);
                            if (L != 2) {
                                if (L != 3) {
                                    if (L != 4) {
                                        abhi.ak(parcel, readInt);
                                    } else {
                                        i3 = abhi.N(parcel, readInt);
                                    }
                                } else {
                                    str = abhi.ab(parcel, readInt);
                                }
                            } else {
                                i2 = abhi.N(parcel, readInt);
                            }
                        }
                        abhi.aj(parcel, P);
                        return new AuthenticatorErrorResponse(i2, str, i3);
                    }
                    int P2 = abhi.P(parcel);
                    byte[] bArr2 = null;
                    byte[] bArr3 = null;
                    String[] strArr = null;
                    while (parcel.dataPosition() < P2) {
                        int readInt2 = parcel.readInt();
                        int L2 = abhi.L(readInt2);
                        if (L2 != 2) {
                            if (L2 != 3) {
                                if (L2 != 4) {
                                    if (L2 != 5) {
                                        abhi.ak(parcel, readInt2);
                                    } else {
                                        strArr = abhi.as(parcel, readInt2);
                                    }
                                } else {
                                    bArr3 = abhi.am(parcel, readInt2);
                                }
                            } else {
                                bArr2 = abhi.am(parcel, readInt2);
                            }
                        } else {
                            bArr = abhi.am(parcel, readInt2);
                        }
                    }
                    abhi.aj(parcel, P2);
                    abhg.m(bArr);
                    aozb w = aozb.w(bArr);
                    abhg.m(bArr2);
                    aozb w2 = aozb.w(bArr2);
                    abhg.m(bArr3);
                    return new AuthenticatorAttestationResponse(w, w2, aozb.w(bArr3), strArr);
                }
                int P3 = abhi.P(parcel);
                byte[] bArr4 = null;
                byte[] bArr5 = null;
                byte[] bArr6 = null;
                byte[] bArr7 = null;
                byte[] bArr8 = null;
                while (parcel.dataPosition() < P3) {
                    int readInt3 = parcel.readInt();
                    int L3 = abhi.L(readInt3);
                    if (L3 != 2) {
                        if (L3 != 3) {
                            if (L3 != 4) {
                                if (L3 != 5) {
                                    if (L3 != 6) {
                                        abhi.ak(parcel, readInt3);
                                    } else {
                                        bArr8 = abhi.am(parcel, readInt3);
                                    }
                                } else {
                                    bArr7 = abhi.am(parcel, readInt3);
                                }
                            } else {
                                bArr6 = abhi.am(parcel, readInt3);
                            }
                        } else {
                            bArr5 = abhi.am(parcel, readInt3);
                        }
                    } else {
                        bArr4 = abhi.am(parcel, readInt3);
                    }
                }
                abhi.aj(parcel, P3);
                abhg.m(bArr4);
                aozb w3 = aozb.w(bArr4);
                abhg.m(bArr5);
                aozb w4 = aozb.w(bArr5);
                abhg.m(bArr6);
                aozb w5 = aozb.w(bArr6);
                abhg.m(bArr7);
                aozb w6 = aozb.w(bArr7);
                if (bArr8 != null) {
                    aozbVar2 = aozb.w(bArr8);
                }
                return new AuthenticatorAssertionResponse(w3, w4, w5, w6, aozbVar2);
            }
            int P4 = abhi.P(parcel);
            byte[] bArr9 = null;
            while (parcel.dataPosition() < P4) {
                int readInt4 = parcel.readInt();
                int L4 = abhi.L(readInt4);
                if (L4 != 1) {
                    if (L4 != 2) {
                        abhi.ak(parcel, readInt4);
                    } else {
                        bArr9 = abhi.am(parcel, readInt4);
                    }
                } else {
                    z = abhi.al(parcel, readInt4);
                }
            }
            abhi.aj(parcel, P4);
            if (bArr9 != null) {
                aozbVar = aozb.w(bArr9);
            }
            return new AuthenticationExtensionsPrfOutputs(z, aozbVar);
        }
        int P5 = abhi.P(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < P5) {
            int readInt5 = parcel.readInt();
            switch (abhi.L(readInt5)) {
                case 2:
                    str2 = abhi.ab(parcel, readInt5);
                    break;
                case 3:
                    str3 = abhi.ab(parcel, readInt5);
                    break;
                case 4:
                    str4 = abhi.ab(parcel, readInt5);
                    break;
                case 5:
                    str5 = abhi.ab(parcel, readInt5);
                    break;
                case 6:
                    str6 = abhi.ab(parcel, readInt5);
                    break;
                case 7:
                    bundle = abhi.S(parcel, readInt5);
                    break;
                default:
                    abhi.ak(parcel, readInt5);
                    break;
            }
        }
        abhi.aj(parcel, P5);
        return new AdditionalConsentConfig(str2, str3, str4, str5, str6, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        return new AuthenticatorErrorResponse[i];
                    }
                    return new AuthenticatorAttestationResponse[i];
                }
                return new AuthenticatorAssertionResponse[i];
            }
            return new AuthenticationExtensionsPrfOutputs[i];
        }
        return new AdditionalConsentConfig[i];
    }
}
