package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.Flag;
import com.google.android.gms.phenotype.FlagOverride;
import com.google.android.gms.phenotype.FlagOverrides;
import com.google.android.gms.phenotype.GenericDimension;
import com.google.android.gms.phenotype.RegistrationInfo;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.android.gms.pseudonymous.SessionZwiebackToken;
import com.google.android.gms.search.GoogleNowAuthState;
import com.google.android.gms.search.administration.AppIndexingErrorInfo;
import com.google.android.gms.search.administration.AppIndexingUserActionInfo;
import com.google.android.gms.search.administration.BundleResponse;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Request;
import com.google.android.gms.search.administration.ClearDebugUiCacheCall$Response;
import com.google.android.gms.search.administration.CorpusConfigParcelable;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackageDetailsCall$Response;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Request;
import com.google.android.gms.search.administration.GetAppIndexingPackagesCall$Response;
import com.google.android.gms.search.administration.GetStorageStatsCall$PackageStats;
import com.google.android.gms.search.administration.GetStorageStatsCall$Request;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgc implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public acgc(int i) {
        this.a = i;
    }

    public static boolean a(int i) {
        if (i == 0) {
            return true;
        }
        return false;
    }

    public static boolean b(Object obj) {
        if (obj == null) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        long j = 0;
        boolean z = false;
        int i = 0;
        String str = null;
        Status status = null;
        String str2 = null;
        String str3 = null;
        Status status2 = null;
        String str4 = null;
        Status status3 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        ArrayList arrayList = null;
        switch (this.a) {
            case 0:
                int P = abhi.P(parcel);
                double d = 0.0d;
                long j2 = 0;
                boolean z2 = false;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                String str8 = null;
                String str9 = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < P) {
                    int readInt = parcel.readInt();
                    switch (abhi.L(readInt)) {
                        case 2:
                            str8 = abhi.ab(parcel, readInt);
                            break;
                        case 3:
                            j2 = abhi.Q(parcel, readInt);
                            break;
                        case 4:
                            z2 = abhi.al(parcel, readInt);
                            break;
                        case 5:
                            d = abhi.J(parcel, readInt);
                            break;
                        case 6:
                            str9 = abhi.ab(parcel, readInt);
                            break;
                        case 7:
                            bArr = abhi.am(parcel, readInt);
                            break;
                        case 8:
                            i2 = abhi.N(parcel, readInt);
                            break;
                        case 9:
                            i3 = abhi.N(parcel, readInt);
                            break;
                        case 10:
                            i4 = abhi.N(parcel, readInt);
                            break;
                        default:
                            abhi.ak(parcel, readInt);
                            break;
                    }
                }
                abhi.aj(parcel, P);
                return new Flag(str8, j2, z2, d, str9, bArr, i2, i3, i4);
            case 1:
                int P2 = abhi.P(parcel);
                String str10 = null;
                byte[] bArr2 = null;
                byte[][] bArr3 = null;
                byte[][] bArr4 = null;
                byte[][] bArr5 = null;
                byte[][] bArr6 = null;
                int[] iArr = null;
                byte[][] bArr7 = null;
                int[] iArr2 = null;
                byte[][] bArr8 = null;
                while (parcel.dataPosition() < P2) {
                    int readInt2 = parcel.readInt();
                    switch (abhi.L(readInt2)) {
                        case 2:
                            str10 = abhi.ab(parcel, readInt2);
                            break;
                        case 3:
                            bArr2 = abhi.am(parcel, readInt2);
                            break;
                        case 4:
                            bArr3 = abhi.at(parcel, readInt2);
                            break;
                        case 5:
                            bArr4 = abhi.at(parcel, readInt2);
                            break;
                        case 6:
                            bArr5 = abhi.at(parcel, readInt2);
                            break;
                        case 7:
                            bArr6 = abhi.at(parcel, readInt2);
                            break;
                        case 8:
                            iArr = abhi.ap(parcel, readInt2);
                            break;
                        case 9:
                            bArr7 = abhi.at(parcel, readInt2);
                            break;
                        case 10:
                            iArr2 = abhi.ap(parcel, readInt2);
                            break;
                        case 11:
                            bArr8 = abhi.at(parcel, readInt2);
                            break;
                        default:
                            abhi.ak(parcel, readInt2);
                            break;
                    }
                }
                abhi.aj(parcel, P2);
                return new ExperimentTokens(str10, bArr2, bArr3, bArr4, bArr5, bArr6, iArr, bArr7, iArr2, bArr8);
            case 2:
                int P3 = abhi.P(parcel);
                String str11 = null;
                Flag flag = null;
                while (parcel.dataPosition() < P3) {
                    int readInt3 = parcel.readInt();
                    int L = abhi.L(readInt3);
                    if (L != 2) {
                        if (L != 3) {
                            if (L != 4) {
                                if (L != 5) {
                                    abhi.ak(parcel, readInt3);
                                } else {
                                    z = abhi.al(parcel, readInt3);
                                }
                            } else {
                                flag = (Flag) abhi.V(parcel, readInt3, Flag.CREATOR);
                            }
                        } else {
                            str11 = abhi.ab(parcel, readInt3);
                        }
                    } else {
                        str = abhi.ab(parcel, readInt3);
                    }
                }
                abhi.aj(parcel, P3);
                return new FlagOverride(str, str11, flag, z);
            case 3:
                int P4 = abhi.P(parcel);
                while (parcel.dataPosition() < P4) {
                    int readInt4 = parcel.readInt();
                    if (abhi.L(readInt4) != 2) {
                        abhi.ak(parcel, readInt4);
                    } else {
                        arrayList = abhi.ah(parcel, readInt4, FlagOverride.CREATOR);
                    }
                }
                abhi.aj(parcel, P4);
                return new FlagOverrides(arrayList);
            case 4:
                int P5 = abhi.P(parcel);
                int i5 = 0;
                while (parcel.dataPosition() < P5) {
                    int readInt5 = parcel.readInt();
                    int L2 = abhi.L(readInt5);
                    if (L2 != 1) {
                        if (L2 != 2) {
                            abhi.ak(parcel, readInt5);
                        } else {
                            i5 = abhi.N(parcel, readInt5);
                        }
                    } else {
                        i = abhi.N(parcel, readInt5);
                    }
                }
                abhi.aj(parcel, P5);
                return new GenericDimension(i, i5);
            case 5:
                int P6 = abhi.P(parcel);
                int i6 = 0;
                boolean z3 = false;
                int i7 = 0;
                int i8 = 0;
                String str12 = null;
                String[] strArr = null;
                byte[] bArr9 = null;
                int[] iArr3 = null;
                String str13 = null;
                byte[] bArr10 = null;
                while (parcel.dataPosition() < P6) {
                    int readInt6 = parcel.readInt();
                    switch (abhi.L(readInt6)) {
                        case 1:
                            str12 = abhi.ab(parcel, readInt6);
                            break;
                        case 2:
                            i6 = abhi.N(parcel, readInt6);
                            break;
                        case 3:
                            strArr = abhi.as(parcel, readInt6);
                            break;
                        case 4:
                            bArr9 = abhi.am(parcel, readInt6);
                            break;
                        case 5:
                            z3 = abhi.al(parcel, readInt6);
                            break;
                        case 6:
                            iArr3 = abhi.ap(parcel, readInt6);
                            break;
                        case 7:
                            str13 = abhi.ab(parcel, readInt6);
                            break;
                        case 8:
                            bArr10 = abhi.am(parcel, readInt6);
                            break;
                        case 9:
                            i7 = abhi.N(parcel, readInt6);
                            break;
                        case 10:
                            i8 = abhi.N(parcel, readInt6);
                            break;
                        default:
                            abhi.ak(parcel, readInt6);
                            break;
                    }
                }
                abhi.aj(parcel, P6);
                return new RegistrationInfo(str12, i6, strArr, bArr9, z3, iArr3, str13, bArr10, i7, i8);
            case 6:
                int P7 = abhi.P(parcel);
                while (parcel.dataPosition() < P7) {
                    int readInt7 = parcel.readInt();
                    if (abhi.L(readInt7) != 2) {
                        abhi.ak(parcel, readInt7);
                    } else {
                        str7 = abhi.ab(parcel, readInt7);
                    }
                }
                abhi.aj(parcel, P7);
                return new PseudonymousIdToken(str7);
            case 7:
                return new SessionZwiebackToken(parcel);
            case 8:
                int P8 = abhi.P(parcel);
                String str14 = null;
                while (parcel.dataPosition() < P8) {
                    int readInt8 = parcel.readInt();
                    int L3 = abhi.L(readInt8);
                    if (L3 != 1) {
                        if (L3 != 2) {
                            if (L3 != 3) {
                                abhi.ak(parcel, readInt8);
                            } else {
                                j = abhi.Q(parcel, readInt8);
                            }
                        } else {
                            str14 = abhi.ab(parcel, readInt8);
                        }
                    } else {
                        str6 = abhi.ab(parcel, readInt8);
                    }
                }
                abhi.aj(parcel, P8);
                return new GoogleNowAuthState(str6, str14, j);
            case 9:
                int P9 = abhi.P(parcel);
                long j3 = 0;
                int i9 = 0;
                int i10 = 0;
                String str15 = null;
                String str16 = null;
                Thing thing = null;
                aoee aoeeVar = null;
                while (parcel.dataPosition() < P9) {
                    int readInt9 = parcel.readInt();
                    switch (abhi.L(readInt9)) {
                        case 1:
                            str15 = abhi.ab(parcel, readInt9);
                            break;
                        case 2:
                            i9 = abhi.N(parcel, readInt9);
                            break;
                        case 3:
                            i10 = abhi.N(parcel, readInt9);
                            break;
                        case 4:
                            str16 = abhi.ab(parcel, readInt9);
                            break;
                        case 5:
                            j3 = abhi.Q(parcel, readInt9);
                            break;
                        case 6:
                            thing = (Thing) abhi.V(parcel, readInt9, Thing.CREATOR);
                            break;
                        case 7:
                            aoeeVar = (aoee) abhi.V(parcel, readInt9, aoee.CREATOR);
                            break;
                        default:
                            abhi.ak(parcel, readInt9);
                            break;
                    }
                }
                abhi.aj(parcel, P9);
                return new AppIndexingErrorInfo(str15, i9, i10, str16, j3, thing, aoeeVar);
            case 10:
                int P10 = abhi.P(parcel);
                aoee aoeeVar2 = null;
                while (parcel.dataPosition() < P10) {
                    int readInt10 = parcel.readInt();
                    int L4 = abhi.L(readInt10);
                    if (L4 != 1) {
                        if (L4 != 2) {
                            if (L4 != 3) {
                                abhi.ak(parcel, readInt10);
                            } else {
                                aoeeVar2 = (aoee) abhi.V(parcel, readInt10, aoee.CREATOR);
                            }
                        } else {
                            j = abhi.Q(parcel, readInt10);
                        }
                    } else {
                        str5 = abhi.ab(parcel, readInt10);
                    }
                }
                abhi.aj(parcel, P10);
                return new AppIndexingUserActionInfo(str5, j, aoeeVar2);
            case 11:
                int P11 = abhi.P(parcel);
                Bundle bundle = null;
                while (parcel.dataPosition() < P11) {
                    int readInt11 = parcel.readInt();
                    int L5 = abhi.L(readInt11);
                    if (L5 != 1) {
                        if (L5 != 2) {
                            abhi.ak(parcel, readInt11);
                        } else {
                            bundle = abhi.S(parcel, readInt11);
                        }
                    } else {
                        status3 = (Status) abhi.V(parcel, readInt11, Status.CREATOR);
                    }
                }
                abhi.aj(parcel, P11);
                return new BundleResponse(status3, bundle);
            case 12:
                int P12 = abhi.P(parcel);
                while (parcel.dataPosition() < P12) {
                    int readInt12 = parcel.readInt();
                    if (abhi.L(readInt12) != 1) {
                        abhi.ak(parcel, readInt12);
                    } else {
                        str4 = abhi.ab(parcel, readInt12);
                    }
                }
                abhi.aj(parcel, P12);
                return new ClearDebugUiCacheCall$Request(str4);
            case 13:
                int P13 = abhi.P(parcel);
                while (parcel.dataPosition() < P13) {
                    int readInt13 = parcel.readInt();
                    if (abhi.L(readInt13) != 1) {
                        abhi.ak(parcel, readInt13);
                    } else {
                        status2 = (Status) abhi.V(parcel, readInt13, Status.CREATOR);
                    }
                }
                abhi.aj(parcel, P13);
                return new ClearDebugUiCacheCall$Response(status2);
            case 14:
                int P14 = abhi.P(parcel);
                String str17 = null;
                String str18 = null;
                while (parcel.dataPosition() < P14) {
                    int readInt14 = parcel.readInt();
                    int L6 = abhi.L(readInt14);
                    if (L6 != 1) {
                        if (L6 != 2) {
                            if (L6 != 3) {
                                abhi.ak(parcel, readInt14);
                            } else {
                                str18 = abhi.ab(parcel, readInt14);
                            }
                        } else {
                            str17 = abhi.ab(parcel, readInt14);
                        }
                    } else {
                        str3 = abhi.ab(parcel, readInt14);
                    }
                }
                abhi.aj(parcel, P14);
                return new CorpusConfigParcelable(str3, str17, str18);
            case 15:
                int P15 = abhi.P(parcel);
                while (parcel.dataPosition() < P15) {
                    int readInt15 = parcel.readInt();
                    if (abhi.L(readInt15) != 1) {
                        abhi.ak(parcel, readInt15);
                    } else {
                        str2 = abhi.ab(parcel, readInt15);
                    }
                }
                abhi.aj(parcel, P15);
                return new GetAppIndexingPackageDetailsCall$Request(str2);
            case 16:
                int P16 = abhi.P(parcel);
                long j4 = 0;
                boolean z4 = false;
                boolean z5 = false;
                Status status4 = null;
                CorpusConfigParcelable[] corpusConfigParcelableArr = null;
                AppIndexingErrorInfo[] appIndexingErrorInfoArr = null;
                AppIndexingUserActionInfo[] appIndexingUserActionInfoArr = null;
                while (parcel.dataPosition() < P16) {
                    int readInt16 = parcel.readInt();
                    switch (abhi.L(readInt16)) {
                        case 1:
                            status4 = (Status) abhi.V(parcel, readInt16, Status.CREATOR);
                            break;
                        case 2:
                            corpusConfigParcelableArr = (CorpusConfigParcelable[]) abhi.ar(parcel, readInt16, CorpusConfigParcelable.CREATOR);
                            break;
                        case 3:
                            j4 = abhi.Q(parcel, readInt16);
                            break;
                        case 4:
                            appIndexingErrorInfoArr = (AppIndexingErrorInfo[]) abhi.ar(parcel, readInt16, AppIndexingErrorInfo.CREATOR);
                            break;
                        case 5:
                            appIndexingUserActionInfoArr = (AppIndexingUserActionInfo[]) abhi.ar(parcel, readInt16, AppIndexingUserActionInfo.CREATOR);
                            break;
                        case 6:
                            z4 = abhi.al(parcel, readInt16);
                            break;
                        case 7:
                            z5 = abhi.al(parcel, readInt16);
                            break;
                        default:
                            abhi.ak(parcel, readInt16);
                            break;
                    }
                }
                abhi.aj(parcel, P16);
                return new GetAppIndexingPackageDetailsCall$Response(status4, corpusConfigParcelableArr, j4, appIndexingErrorInfoArr, appIndexingUserActionInfoArr, z4, z5);
            case 17:
                int P17 = abhi.P(parcel);
                while (parcel.dataPosition() < P17) {
                    abhi.ak(parcel, parcel.readInt());
                }
                abhi.aj(parcel, P17);
                return new GetAppIndexingPackagesCall$Request();
            case 18:
                int P18 = abhi.P(parcel);
                String[] strArr2 = null;
                String[] strArr3 = null;
                while (parcel.dataPosition() < P18) {
                    int readInt17 = parcel.readInt();
                    int L7 = abhi.L(readInt17);
                    if (L7 != 1) {
                        if (L7 != 2) {
                            if (L7 != 3) {
                                abhi.ak(parcel, readInt17);
                            } else {
                                strArr3 = abhi.as(parcel, readInt17);
                            }
                        } else {
                            strArr2 = abhi.as(parcel, readInt17);
                        }
                    } else {
                        status = (Status) abhi.V(parcel, readInt17, Status.CREATOR);
                    }
                }
                abhi.aj(parcel, P18);
                return new GetAppIndexingPackagesCall$Response(status, strArr2, strArr3);
            case 19:
                int P19 = abhi.P(parcel);
                long j5 = 0;
                long j6 = 0;
                boolean z6 = false;
                String str19 = null;
                while (parcel.dataPosition() < P19) {
                    int readInt18 = parcel.readInt();
                    int L8 = abhi.L(readInt18);
                    if (L8 != 1) {
                        if (L8 != 2) {
                            if (L8 != 3) {
                                if (L8 != 4) {
                                    abhi.ak(parcel, readInt18);
                                } else {
                                    j6 = abhi.Q(parcel, readInt18);
                                }
                            } else {
                                z6 = abhi.al(parcel, readInt18);
                            }
                        } else {
                            j5 = abhi.Q(parcel, readInt18);
                        }
                    } else {
                        str19 = abhi.ab(parcel, readInt18);
                    }
                }
                abhi.aj(parcel, P19);
                return new GetStorageStatsCall$PackageStats(str19, j5, z6, j6);
            default:
                int P20 = abhi.P(parcel);
                while (parcel.dataPosition() < P20) {
                    abhi.ak(parcel, parcel.readInt());
                }
                abhi.aj(parcel, P20);
                return new GetStorageStatsCall$Request();
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new Flag[i];
            case 1:
                return new ExperimentTokens[i];
            case 2:
                return new FlagOverride[i];
            case 3:
                return new FlagOverrides[i];
            case 4:
                return new GenericDimension[i];
            case 5:
                return new RegistrationInfo[i];
            case 6:
                return new PseudonymousIdToken[i];
            case 7:
                return new SessionZwiebackToken[i];
            case 8:
                return new GoogleNowAuthState[i];
            case 9:
                return new AppIndexingErrorInfo[i];
            case 10:
                return new AppIndexingUserActionInfo[i];
            case 11:
                return new BundleResponse[i];
            case 12:
                return new ClearDebugUiCacheCall$Request[i];
            case 13:
                return new ClearDebugUiCacheCall$Response[i];
            case 14:
                return new CorpusConfigParcelable[i];
            case 15:
                return new GetAppIndexingPackageDetailsCall$Request[i];
            case 16:
                return new GetAppIndexingPackageDetailsCall$Response[i];
            case 17:
                return new GetAppIndexingPackagesCall$Request[i];
            case 18:
                return new GetAppIndexingPackagesCall$Response[i];
            case 19:
                return new GetStorageStatsCall$PackageStats[i];
            default:
                return new GetStorageStatsCall$Request[i];
        }
    }
}
