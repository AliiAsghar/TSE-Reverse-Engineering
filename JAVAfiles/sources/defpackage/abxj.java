package defpackage;

import android.accounts.Account;
import android.app.ApplicationErrorReport;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import com.google.android.gms.duokit.DuoId;
import com.google.android.gms.duokit.SetupDuoRequest;
import com.google.android.gms.duokit.SetupDuoResponse;
import com.google.android.gms.duokit.StartCallRequest;
import com.google.android.gms.duokit.StartCallResponse;
import com.google.android.gms.duokit.StartGroupCreationFlowRequest;
import com.google.android.gms.duokit.StartGroupCreationFlowResponse;
import com.google.android.gms.feedback.AdditionalConsentConfig;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ServiceDump;
import com.google.android.gms.feedback.ServiceDumpRequest;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;
import com.google.android.gms.fido.credentialstore.KeyMetadata;
import com.google.android.gms.fido.fido2.api.StateUpdate;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsDevicePublicKeyOutputs;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsPrfOutputs;
import com.google.android.gms.fido.fido2.api.common.CableAuthenticationExtension;
import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyExtension;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleMultiAssertionExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSessionIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleSilentVerificationExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleTunnelServerIdExtension;
import com.google.android.gms.fido.fido2.api.common.HmacSecretExtension;
import com.google.android.gms.fido.fido2.api.common.PaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PrfExtension;
import com.google.android.gms.fido.fido2.api.common.SimpleTransactionAuthorizationExtension;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abxj implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abxj(int i) {
        this.a = i;
    }

    public static final ErrorReport a(Parcel parcel) {
        int P = abhi.P(parcel);
        ApplicationErrorReport applicationErrorReport = null;
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
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String[] strArr = null;
        String[] strArr2 = null;
        String[] strArr3 = null;
        String str14 = null;
        String str15 = null;
        byte[] bArr = null;
        String str16 = null;
        String str17 = null;
        String str18 = null;
        Bundle bundle = null;
        String str19 = null;
        String str20 = null;
        String str21 = null;
        String str22 = null;
        String str23 = null;
        String str24 = null;
        String str25 = null;
        String str26 = null;
        String str27 = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str28 = null;
        FileTeleporter[] fileTeleporterArr = null;
        String[] strArr4 = null;
        String str29 = null;
        ThemeSettings themeSettings = null;
        LogOptions logOptions = null;
        String str30 = null;
        Bundle bundle2 = null;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        String str31 = null;
        ArrayList arrayList2 = null;
        String[] strArr5 = null;
        String[] strArr6 = null;
        String[] strArr7 = null;
        String str32 = null;
        AdditionalConsentConfig additionalConsentConfig = null;
        ServiceDump[] serviceDumpArr = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        boolean z2 = false;
        int i9 = 0;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i10 = 0;
        int i11 = 0;
        boolean z6 = false;
        boolean z7 = false;
        while (parcel.dataPosition() < P) {
            int M = abhi.M(parcel);
            switch (abhi.L(M)) {
                case 2:
                    applicationErrorReport = (ApplicationErrorReport) abhi.V(parcel, M, ApplicationErrorReport.CREATOR);
                    break;
                case 3:
                    str = abhi.ab(parcel, M);
                    break;
                case 4:
                    i = abhi.N(parcel, M);
                    break;
                case 5:
                    str2 = abhi.ab(parcel, M);
                    break;
                case 6:
                    str3 = abhi.ab(parcel, M);
                    break;
                case 7:
                    str4 = abhi.ab(parcel, M);
                    break;
                case 8:
                    str5 = abhi.ab(parcel, M);
                    break;
                case 9:
                    str6 = abhi.ab(parcel, M);
                    break;
                case 10:
                    str7 = abhi.ab(parcel, M);
                    break;
                case 11:
                    str8 = abhi.ab(parcel, M);
                    break;
                case 12:
                    i2 = abhi.N(parcel, M);
                    break;
                case 13:
                    str9 = abhi.ab(parcel, M);
                    break;
                case 14:
                    str10 = abhi.ab(parcel, M);
                    break;
                case 15:
                    str11 = abhi.ab(parcel, M);
                    break;
                case 16:
                    str12 = abhi.ab(parcel, M);
                    break;
                case 17:
                    str13 = abhi.ab(parcel, M);
                    break;
                case 18:
                    strArr = abhi.as(parcel, M);
                    break;
                case 19:
                    strArr2 = abhi.as(parcel, M);
                    break;
                case 20:
                    strArr3 = abhi.as(parcel, M);
                    break;
                case 21:
                    str14 = abhi.ab(parcel, M);
                    break;
                case 22:
                    str15 = abhi.ab(parcel, M);
                    break;
                case 23:
                    bArr = abhi.am(parcel, M);
                    break;
                case 24:
                    i3 = abhi.N(parcel, M);
                    break;
                case 25:
                    i4 = abhi.N(parcel, M);
                    break;
                case 26:
                    i5 = abhi.N(parcel, M);
                    break;
                case 27:
                    i6 = abhi.N(parcel, M);
                    break;
                case 28:
                    str16 = abhi.ab(parcel, M);
                    break;
                case ahby.ERROR_VENDOR_IMS_NOT_FOUND /* 29 */:
                    str17 = abhi.ab(parcel, M);
                    break;
                case 30:
                    str18 = abhi.ab(parcel, M);
                    break;
                case 31:
                    bundle = abhi.S(parcel, M);
                    break;
                case 32:
                    z = abhi.al(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLOUD_SAVE_SERVICE /* 33 */:
                    i7 = abhi.N(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_UDC_SERVICE /* 34 */:
                    i8 = abhi.N(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SEARCH_CORPORA_SERVICE /* 35 */:
                    z2 = abhi.al(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_MANAGER_SERVICE /* 36 */:
                    str19 = abhi.ab(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_PSEUDONYMOUS_ID_SERVICE /* 37 */:
                    str20 = abhi.ab(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_REMINDERS_SERVICE /* 38 */:
                    i9 = abhi.N(parcel, M);
                    break;
                case 39:
                    str21 = abhi.ab(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_COMMON_SERVICE /* 40 */:
                    str22 = abhi.ab(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_CLEARCUT_LOGGER_SERVICE /* 41 */:
                    str23 = abhi.ab(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_WALLET_SERVICE_WITH_PACKAGE /* 42 */:
                    str24 = abhi.ab(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_USAGE_REPORTING_SERVICE /* 43 */:
                    str25 = abhi.ab(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_DEVICE_CONNECTION_SERVICE /* 44 */:
                    str26 = abhi.ab(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_KIDS_SERVICE /* 45 */:
                    str27 = abhi.ab(parcel, M);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_GET_SERVICE /* 46 */:
                    bitmapTeleporter = (BitmapTeleporter) abhi.V(parcel, M, BitmapTeleporter.CREATOR);
                    break;
                case IGmsServiceBroker.Stub.TRANSACTION_VALIDATE_ACCOUNT /* 47 */:
                    str28 = abhi.ab(parcel, M);
                    break;
                case 48:
                    fileTeleporterArr = (FileTeleporter[]) abhi.ar(parcel, M, FileTeleporter.CREATOR);
                    break;
                case 49:
                    strArr4 = abhi.as(parcel, M);
                    break;
                case 50:
                    z3 = abhi.al(parcel, M);
                    break;
                case 51:
                    str29 = abhi.ab(parcel, M);
                    break;
                case 52:
                    themeSettings = (ThemeSettings) abhi.V(parcel, M, ThemeSettings.CREATOR);
                    break;
                case 53:
                    logOptions = (LogOptions) abhi.V(parcel, M, LogOptions.CREATOR);
                    break;
                case 54:
                    str30 = abhi.ab(parcel, M);
                    break;
                case 55:
                    z4 = abhi.al(parcel, M);
                    break;
                case 56:
                    bundle2 = abhi.S(parcel, M);
                    break;
                case 57:
                    arrayList = abhi.ah(parcel, M, RectF.CREATOR);
                    break;
                case 58:
                    z5 = abhi.al(parcel, M);
                    break;
                case 59:
                    bitmap = (Bitmap) abhi.V(parcel, M, Bitmap.CREATOR);
                    break;
                case 60:
                    str31 = abhi.ab(parcel, M);
                    break;
                case 61:
                    arrayList2 = abhi.ag(parcel, M);
                    break;
                case 62:
                    i10 = abhi.N(parcel, M);
                    break;
                case 63:
                    i11 = abhi.N(parcel, M);
                    break;
                case 64:
                    strArr5 = abhi.as(parcel, M);
                    break;
                case 65:
                    strArr6 = abhi.as(parcel, M);
                    break;
                case 66:
                    strArr7 = abhi.as(parcel, M);
                    break;
                case 67:
                    z6 = abhi.al(parcel, M);
                    break;
                case 68:
                    z7 = abhi.al(parcel, M);
                    break;
                case 69:
                    str32 = abhi.ab(parcel, M);
                    break;
                case 70:
                    additionalConsentConfig = (AdditionalConsentConfig) abhi.V(parcel, M, AdditionalConsentConfig.CREATOR);
                    break;
                case 71:
                    serviceDumpArr = (ServiceDump[]) abhi.ar(parcel, M, ServiceDump.CREATOR);
                    break;
                default:
                    abhi.ak(parcel, M);
                    break;
            }
        }
        abhi.aj(parcel, P);
        return new ErrorReport(applicationErrorReport, str, i, str2, str3, str4, str5, str6, str7, str8, i2, str9, str10, str11, str12, str13, strArr, strArr2, strArr3, str14, str15, bArr, i3, i4, i5, i6, str16, str17, str18, bundle, z, i7, i8, z2, str19, str20, i9, str21, str22, str23, str24, str25, str26, str27, bitmapTeleporter, str28, fileTeleporterArr, strArr4, z3, str29, themeSettings, logOptions, str30, z4, bundle2, arrayList, z5, bitmap, str31, arrayList2, i10, i11, strArr5, strArr6, strArr7, z6, z7, str32, additionalConsentConfig, serviceDumpArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        aozb w;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        DuoId[] duoIdArr = null;
        aozb aozbVar = null;
        String str = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        DuoId[] duoIdArr2 = null;
        DuoId duoId = null;
        switch (this.a) {
            case 0:
                int P = abhi.P(parcel);
                while (parcel.dataPosition() < P) {
                    abhi.ak(parcel, parcel.readInt());
                }
                abhi.aj(parcel, P);
                return new SetupDuoResponse();
            case 1:
                int P2 = abhi.P(parcel);
                while (parcel.dataPosition() < P2) {
                    int readInt = parcel.readInt();
                    if (abhi.L(readInt) != 1) {
                        abhi.ak(parcel, readInt);
                    } else {
                        duoIdArr = (DuoId[]) abhi.ar(parcel, readInt, DuoId.CREATOR);
                    }
                }
                abhi.aj(parcel, P2);
                return new SetupDuoRequest(duoIdArr);
            case 2:
                int P3 = abhi.P(parcel);
                boolean z3 = false;
                String str2 = null;
                while (parcel.dataPosition() < P3) {
                    int readInt2 = parcel.readInt();
                    int L = abhi.L(readInt2);
                    if (L != 1) {
                        if (L != 2) {
                            if (L != 3) {
                                if (L != 4) {
                                    abhi.ak(parcel, readInt2);
                                } else {
                                    str2 = abhi.ab(parcel, readInt2);
                                }
                            } else {
                                z3 = abhi.al(parcel, readInt2);
                            }
                        } else {
                            i = abhi.N(parcel, readInt2);
                        }
                    } else {
                        duoId = (DuoId) abhi.V(parcel, readInt2, DuoId.CREATOR);
                    }
                }
                abhi.aj(parcel, P3);
                return new StartCallRequest(duoId, i, z3, str2);
            case 3:
                int P4 = abhi.P(parcel);
                while (parcel.dataPosition() < P4) {
                    abhi.ak(parcel, parcel.readInt());
                }
                abhi.aj(parcel, P4);
                return new StartCallResponse();
            case 4:
                int P5 = abhi.P(parcel);
                String str3 = null;
                while (parcel.dataPosition() < P5) {
                    int readInt3 = parcel.readInt();
                    int L2 = abhi.L(readInt3);
                    if (L2 != 1) {
                        if (L2 != 2) {
                            if (L2 != 3) {
                                abhi.ak(parcel, readInt3);
                            } else {
                                z2 = abhi.al(parcel, readInt3);
                            }
                        } else {
                            str3 = abhi.ab(parcel, readInt3);
                        }
                    } else {
                        duoIdArr2 = (DuoId[]) abhi.ar(parcel, readInt3, DuoId.CREATOR);
                    }
                }
                abhi.aj(parcel, P5);
                return new StartGroupCreationFlowRequest(duoIdArr2, str3, z2);
            case 5:
                int P6 = abhi.P(parcel);
                while (parcel.dataPosition() < P6) {
                    abhi.ak(parcel, parcel.readInt());
                }
                abhi.aj(parcel, P6);
                return new StartGroupCreationFlowResponse();
            case 6:
                return a(parcel);
            case 7:
                int P7 = abhi.P(parcel);
                String str4 = null;
                String str5 = null;
                while (parcel.dataPosition() < P7) {
                    int readInt4 = parcel.readInt();
                    int L3 = abhi.L(readInt4);
                    if (L3 != 2) {
                        if (L3 != 3) {
                            if (L3 != 4) {
                                abhi.ak(parcel, readInt4);
                            } else {
                                str5 = abhi.ab(parcel, readInt4);
                            }
                        } else {
                            str4 = abhi.ab(parcel, readInt4);
                        }
                    } else {
                        parcelFileDescriptor = (ParcelFileDescriptor) abhi.V(parcel, readInt4, ParcelFileDescriptor.CREATOR);
                    }
                }
                abhi.aj(parcel, P7);
                return new FileTeleporter(parcelFileDescriptor, str4, str5);
            case 8:
                int P8 = abhi.P(parcel);
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                String str6 = null;
                ServiceDumpRequest[] serviceDumpRequestArr = null;
                while (parcel.dataPosition() < P8) {
                    int readInt5 = parcel.readInt();
                    switch (abhi.L(readInt5)) {
                        case 2:
                            str6 = abhi.ab(parcel, readInt5);
                            break;
                        case 3:
                            z4 = abhi.al(parcel, readInt5);
                            break;
                        case 4:
                            z5 = abhi.al(parcel, readInt5);
                            break;
                        case 5:
                            z6 = abhi.al(parcel, readInt5);
                            break;
                        case 6:
                            z7 = abhi.al(parcel, readInt5);
                            break;
                        case 7:
                            serviceDumpRequestArr = (ServiceDumpRequest[]) abhi.ar(parcel, readInt5, ServiceDumpRequest.CREATOR);
                            break;
                        default:
                            abhi.ak(parcel, readInt5);
                            break;
                    }
                }
                abhi.aj(parcel, P8);
                return new LogOptions(str6, z4, z5, z6, z7, serviceDumpRequestArr);
            case 9:
                int P9 = abhi.P(parcel);
                int i3 = 0;
                while (parcel.dataPosition() < P9) {
                    int readInt6 = parcel.readInt();
                    int L4 = abhi.L(readInt6);
                    if (L4 != 2) {
                        if (L4 != 3) {
                            abhi.ak(parcel, readInt6);
                        } else {
                            i3 = abhi.N(parcel, readInt6);
                        }
                    } else {
                        i2 = abhi.N(parcel, readInt6);
                    }
                }
                abhi.aj(parcel, P9);
                return new ThemeSettings(i2, i3);
            case 10:
                try {
                    return Transport.a(parcel.readString());
                } catch (abyv e) {
                    throw new RuntimeException(e);
                }
            case 11:
                int P10 = abhi.P(parcel);
                boolean z8 = false;
                int i4 = 0;
                boolean z9 = false;
                boolean z10 = false;
                String str7 = null;
                int[] iArr = null;
                byte[] bArr = null;
                String str8 = null;
                String str9 = null;
                Account account = null;
                while (parcel.dataPosition() < P10) {
                    int readInt7 = parcel.readInt();
                    switch (abhi.L(readInt7)) {
                        case 1:
                            str7 = abhi.ab(parcel, readInt7);
                            break;
                        case 2:
                            z8 = abhi.al(parcel, readInt7);
                            break;
                        case 3:
                            i4 = abhi.N(parcel, readInt7);
                            break;
                        case 4:
                            iArr = abhi.ap(parcel, readInt7);
                            break;
                        case 5:
                            bArr = abhi.am(parcel, readInt7);
                            break;
                        case 6:
                            str8 = abhi.ab(parcel, readInt7);
                            break;
                        case 7:
                            str9 = abhi.ab(parcel, readInt7);
                            break;
                        case 8:
                            account = (Account) abhi.V(parcel, readInt7, Account.CREATOR);
                            break;
                        case 9:
                            z9 = abhi.al(parcel, readInt7);
                            break;
                        case 10:
                            z10 = abhi.al(parcel, readInt7);
                            break;
                        default:
                            abhi.ak(parcel, readInt7);
                            break;
                    }
                }
                abhi.aj(parcel, P10);
                return new KeyCreationRequestOptions(str7, z8, i4, iArr, bArr, str8, str9, account, z9, z10);
            case 12:
                int P11 = abhi.P(parcel);
                boolean z11 = false;
                byte[] bArr2 = null;
                String str10 = null;
                String str11 = null;
                Bitmap bitmap = null;
                while (parcel.dataPosition() < P11) {
                    int readInt8 = parcel.readInt();
                    int L5 = abhi.L(readInt8);
                    if (L5 != 1) {
                        if (L5 != 2) {
                            if (L5 != 3) {
                                if (L5 != 4) {
                                    if (L5 != 5) {
                                        abhi.ak(parcel, readInt8);
                                    } else {
                                        bitmap = (Bitmap) abhi.V(parcel, readInt8, Bitmap.CREATOR);
                                    }
                                } else {
                                    z11 = abhi.al(parcel, readInt8);
                                }
                            } else {
                                str11 = abhi.ab(parcel, readInt8);
                            }
                        } else {
                            str10 = abhi.ab(parcel, readInt8);
                        }
                    } else {
                        bArr2 = abhi.am(parcel, readInt8);
                    }
                }
                abhi.aj(parcel, P11);
                return new KeyMetadata(bArr2, str10, str11, z11, bitmap);
            case 13:
                try {
                    return StateUpdate.Type.a(parcel.readString());
                } catch (abyx e2) {
                    throw new IllegalArgumentException(e2);
                }
            case 14:
                int P12 = abhi.P(parcel);
                String str12 = null;
                while (parcel.dataPosition() < P12) {
                    int readInt9 = parcel.readInt();
                    int L6 = abhi.L(readInt9);
                    if (L6 != 2) {
                        if (L6 != 3) {
                            abhi.ak(parcel, readInt9);
                        } else {
                            str12 = abhi.ab(parcel, readInt9);
                        }
                    } else {
                        str = abhi.ab(parcel, readInt9);
                    }
                }
                abhi.aj(parcel, P12);
                return new StateUpdate(str, str12);
            case 15:
                try {
                    return Attachment.a(parcel.readString());
                } catch (abyz e3) {
                    throw new RuntimeException(e3);
                }
            case 16:
                try {
                    return AttestationConveyancePreference.a(parcel.readString());
                } catch (abza e4) {
                    throw new RuntimeException(e4);
                }
            case 17:
                int P13 = abhi.P(parcel);
                UvmEntries uvmEntries = null;
                AuthenticationExtensionsDevicePublicKeyOutputs authenticationExtensionsDevicePublicKeyOutputs = null;
                AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
                AuthenticationExtensionsPrfOutputs authenticationExtensionsPrfOutputs = null;
                String str13 = null;
                while (parcel.dataPosition() < P13) {
                    int readInt10 = parcel.readInt();
                    int L7 = abhi.L(readInt10);
                    if (L7 != 1) {
                        if (L7 != 2) {
                            if (L7 != 3) {
                                if (L7 != 4) {
                                    if (L7 != 5) {
                                        abhi.ak(parcel, readInt10);
                                    } else {
                                        str13 = abhi.ab(parcel, readInt10);
                                    }
                                } else {
                                    authenticationExtensionsPrfOutputs = (AuthenticationExtensionsPrfOutputs) abhi.V(parcel, readInt10, AuthenticationExtensionsPrfOutputs.CREATOR);
                                }
                            } else {
                                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) abhi.V(parcel, readInt10, AuthenticationExtensionsCredPropsOutputs.CREATOR);
                            }
                        } else {
                            authenticationExtensionsDevicePublicKeyOutputs = (AuthenticationExtensionsDevicePublicKeyOutputs) abhi.V(parcel, readInt10, AuthenticationExtensionsDevicePublicKeyOutputs.CREATOR);
                        }
                    } else {
                        uvmEntries = (UvmEntries) abhi.V(parcel, readInt10, UvmEntries.CREATOR);
                    }
                }
                abhi.aj(parcel, P13);
                return new AuthenticationExtensionsClientOutputs(uvmEntries, authenticationExtensionsDevicePublicKeyOutputs, authenticationExtensionsCredPropsOutputs, authenticationExtensionsPrfOutputs, str13);
            case 18:
                int P14 = abhi.P(parcel);
                FidoAppIdExtension fidoAppIdExtension = null;
                CableAuthenticationExtension cableAuthenticationExtension = null;
                UserVerificationMethodExtension userVerificationMethodExtension = null;
                GoogleMultiAssertionExtension googleMultiAssertionExtension = null;
                GoogleSessionIdExtension googleSessionIdExtension = null;
                GoogleSilentVerificationExtension googleSilentVerificationExtension = null;
                DevicePublicKeyExtension devicePublicKeyExtension = null;
                GoogleTunnelServerIdExtension googleTunnelServerIdExtension = null;
                GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
                PrfExtension prfExtension = null;
                SimpleTransactionAuthorizationExtension simpleTransactionAuthorizationExtension = null;
                HmacSecretExtension hmacSecretExtension = null;
                PaymentExtension paymentExtension = null;
                while (parcel.dataPosition() < P14) {
                    int readInt11 = parcel.readInt();
                    switch (abhi.L(readInt11)) {
                        case 2:
                            fidoAppIdExtension = (FidoAppIdExtension) abhi.V(parcel, readInt11, FidoAppIdExtension.CREATOR);
                            break;
                        case 3:
                            cableAuthenticationExtension = (CableAuthenticationExtension) abhi.V(parcel, readInt11, CableAuthenticationExtension.CREATOR);
                            break;
                        case 4:
                            userVerificationMethodExtension = (UserVerificationMethodExtension) abhi.V(parcel, readInt11, UserVerificationMethodExtension.CREATOR);
                            break;
                        case 5:
                            googleMultiAssertionExtension = (GoogleMultiAssertionExtension) abhi.V(parcel, readInt11, GoogleMultiAssertionExtension.CREATOR);
                            break;
                        case 6:
                            googleSessionIdExtension = (GoogleSessionIdExtension) abhi.V(parcel, readInt11, GoogleSessionIdExtension.CREATOR);
                            break;
                        case 7:
                            googleSilentVerificationExtension = (GoogleSilentVerificationExtension) abhi.V(parcel, readInt11, GoogleSilentVerificationExtension.CREATOR);
                            break;
                        case 8:
                            devicePublicKeyExtension = (DevicePublicKeyExtension) abhi.V(parcel, readInt11, DevicePublicKeyExtension.CREATOR);
                            break;
                        case 9:
                            googleTunnelServerIdExtension = (GoogleTunnelServerIdExtension) abhi.V(parcel, readInt11, GoogleTunnelServerIdExtension.CREATOR);
                            break;
                        case 10:
                            googleThirdPartyPaymentExtension = (GoogleThirdPartyPaymentExtension) abhi.V(parcel, readInt11, GoogleThirdPartyPaymentExtension.CREATOR);
                            break;
                        case 11:
                            prfExtension = (PrfExtension) abhi.V(parcel, readInt11, PrfExtension.CREATOR);
                            break;
                        case 12:
                            simpleTransactionAuthorizationExtension = (SimpleTransactionAuthorizationExtension) abhi.V(parcel, readInt11, SimpleTransactionAuthorizationExtension.CREATOR);
                            break;
                        case 13:
                            hmacSecretExtension = (HmacSecretExtension) abhi.V(parcel, readInt11, HmacSecretExtension.CREATOR);
                            break;
                        case 14:
                            paymentExtension = (PaymentExtension) abhi.V(parcel, readInt11, PaymentExtension.CREATOR);
                            break;
                        default:
                            abhi.ak(parcel, readInt11);
                            break;
                    }
                }
                abhi.aj(parcel, P14);
                return new AuthenticationExtensions(fidoAppIdExtension, cableAuthenticationExtension, userVerificationMethodExtension, googleMultiAssertionExtension, googleSessionIdExtension, googleSilentVerificationExtension, devicePublicKeyExtension, googleTunnelServerIdExtension, googleThirdPartyPaymentExtension, prfExtension, simpleTransactionAuthorizationExtension, hmacSecretExtension, paymentExtension);
            case 19:
                int P15 = abhi.P(parcel);
                while (parcel.dataPosition() < P15) {
                    int readInt12 = parcel.readInt();
                    if (abhi.L(readInt12) != 1) {
                        abhi.ak(parcel, readInt12);
                    } else {
                        z = abhi.al(parcel, readInt12);
                    }
                }
                abhi.aj(parcel, P15);
                return new AuthenticationExtensionsCredPropsOutputs(z);
            default:
                int P16 = abhi.P(parcel);
                byte[] bArr3 = null;
                byte[] bArr4 = null;
                while (parcel.dataPosition() < P16) {
                    int readInt13 = parcel.readInt();
                    int L8 = abhi.L(readInt13);
                    if (L8 != 1) {
                        if (L8 != 2) {
                            abhi.ak(parcel, readInt13);
                        } else {
                            bArr4 = abhi.am(parcel, readInt13);
                        }
                    } else {
                        bArr3 = abhi.am(parcel, readInt13);
                    }
                }
                abhi.aj(parcel, P16);
                if (bArr3 == null) {
                    w = null;
                } else {
                    w = aozb.w(bArr3);
                }
                if (bArr4 != null) {
                    aozbVar = aozb.w(bArr4);
                }
                return new AuthenticationExtensionsDevicePublicKeyOutputs(w, aozbVar);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new SetupDuoResponse[i];
            case 1:
                return new SetupDuoRequest[i];
            case 2:
                return new StartCallRequest[i];
            case 3:
                return new StartCallResponse[i];
            case 4:
                return new StartGroupCreationFlowRequest[i];
            case 5:
                return new StartGroupCreationFlowResponse[i];
            case 6:
                return new ErrorReport[i];
            case 7:
                return new FileTeleporter[i];
            case 8:
                return new LogOptions[i];
            case 9:
                return new ThemeSettings[i];
            case 10:
                return new Transport[i];
            case 11:
                return new KeyCreationRequestOptions[i];
            case 12:
                return new KeyMetadata[i];
            case 13:
                return new StateUpdate.Type[i];
            case 14:
                return new StateUpdate[i];
            case 15:
                return new Attachment[i];
            case 16:
                return new AttestationConveyancePreference[i];
            case 17:
                return new AuthenticationExtensionsClientOutputs[i];
            case 18:
                return new AuthenticationExtensions[i];
            case 19:
                return new AuthenticationExtensionsCredPropsOutputs[i];
            default:
                return new AuthenticationExtensionsDevicePublicKeyOutputs[i];
        }
    }
}
