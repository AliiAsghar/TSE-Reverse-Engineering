package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.setupcompat.logging.MetricKey;
import com.google.firebase.appindexing.internal.Thing;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajuw implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ajuw(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        int i = 0;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        String str = null;
        Status status = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        switch (this.a) {
            case 0:
                return new ajux(parcel);
            case 1:
                return new MetricKey(parcel.readString(), parcel.readString());
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                Intent intent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
                Intent intent2 = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
                int readInt4 = parcel.readInt();
                long readLong = parcel.readLong();
                d.aB(readString, "packageName cannot be null.");
                d.aB(readString2, "serviceClass cannot be null.");
                d.aB(intent, "Service intent cannot be null.");
                d.aB(intent2, "Item click intent cannot be null");
                if (readInt == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (readInt2 != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ajgk.r(z2, "Invalidate resource id of display name");
                    if (readInt3 != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ajgk.r(z3, "Invalidate resource id of display icon");
                }
                if (readInt4 == 1) {
                    z5 = true;
                }
                return new ajuy(readString, readString2, z, z5, readLong, readInt2, readInt3, intent, intent2);
            case 3:
                return ajwt.a(parcel.readInt());
            case 4:
                return new ajxb(parcel);
            case 5:
                return new ajxc(parcel);
            case 6:
                int readInt5 = parcel.readInt();
                int readInt6 = parcel.readInt();
                Intent intent3 = (Intent) parcel.readParcelable(getClass().getClassLoader());
                if (readInt5 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (readInt6 == 1) {
                    z8 = true;
                }
                return new ajyz(z4, z8, intent3);
            case 7:
                return new akbu(parcel);
            case 8:
                int readInt7 = parcel.readInt();
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Intent.CREATOR);
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z7 = true;
                }
                return new akna(readInt7, createTypedArrayList, readString3, z7);
            case 9:
                return new akuv();
            case 10:
                int P = abhi.P(parcel);
                while (parcel.dataPosition() < P) {
                    int readInt8 = parcel.readInt();
                    int L = abhi.L(readInt8);
                    if (L != 1) {
                        if (L != 2) {
                            abhi.ak(parcel, readInt8);
                        } else {
                            z6 = abhi.al(parcel, readInt8);
                        }
                    } else {
                        str = abhi.ab(parcel, readInt8);
                    }
                }
                abhi.aj(parcel, P);
                return new aoea(str, z6);
            case 11:
                int P2 = abhi.P(parcel);
                String str3 = null;
                String str4 = null;
                while (parcel.dataPosition() < P2) {
                    int readInt9 = parcel.readInt();
                    int L2 = abhi.L(readInt9);
                    if (L2 != 1) {
                        if (L2 != 2) {
                            if (L2 != 3) {
                                abhi.ak(parcel, readInt9);
                            } else {
                                str4 = abhi.ab(parcel, readInt9);
                            }
                        } else {
                            str3 = abhi.ab(parcel, readInt9);
                        }
                    } else {
                        arrayList2 = abhi.ag(parcel, readInt9);
                    }
                }
                abhi.aj(parcel, P2);
                return new aoeb(arrayList2, str3, str4);
            case 12:
                int P3 = abhi.P(parcel);
                while (parcel.dataPosition() < P3) {
                    int readInt10 = parcel.readInt();
                    if (abhi.L(readInt10) != 1) {
                        abhi.ak(parcel, readInt10);
                    } else {
                        arrayList = abhi.ah(parcel, readInt10, Thing.CREATOR);
                    }
                }
                abhi.aj(parcel, P3);
                return new aoec(arrayList);
            case 13:
                int P4 = abhi.P(parcel);
                String str5 = null;
                String str6 = null;
                String str7 = null;
                String str8 = null;
                aoed aoedVar = null;
                String str9 = null;
                Bundle bundle = null;
                while (parcel.dataPosition() < P4) {
                    int readInt11 = parcel.readInt();
                    switch (abhi.L(readInt11)) {
                        case 1:
                            str5 = abhi.ab(parcel, readInt11);
                            break;
                        case 2:
                            str6 = abhi.ab(parcel, readInt11);
                            break;
                        case 3:
                            str7 = abhi.ab(parcel, readInt11);
                            break;
                        case 4:
                            str8 = abhi.ab(parcel, readInt11);
                            break;
                        case 5:
                            aoedVar = (aoed) abhi.V(parcel, readInt11, aoed.CREATOR);
                            break;
                        case 6:
                            str9 = abhi.ab(parcel, readInt11);
                            break;
                        case 7:
                            bundle = abhi.S(parcel, readInt11);
                            break;
                        default:
                            abhi.ak(parcel, readInt11);
                            break;
                    }
                }
                abhi.aj(parcel, P4);
                return new aoee(str5, str6, str7, str8, aoedVar, str9, bundle);
            case 14:
                int P5 = abhi.P(parcel);
                while (parcel.dataPosition() < P5) {
                    int readInt12 = parcel.readInt();
                    if (abhi.L(readInt12) != 1) {
                        abhi.ak(parcel, readInt12);
                    } else {
                        i = abhi.N(parcel, readInt12);
                    }
                }
                abhi.aj(parcel, P5);
                return new aoef(i);
            case 15:
                int P6 = abhi.P(parcel);
                String str10 = null;
                while (parcel.dataPosition() < P6) {
                    int readInt13 = parcel.readInt();
                    int L3 = abhi.L(readInt13);
                    if (L3 != 1) {
                        if (L3 != 2) {
                            abhi.ak(parcel, readInt13);
                        } else {
                            str10 = abhi.ab(parcel, readInt13);
                        }
                    } else {
                        str2 = abhi.ab(parcel, readInt13);
                    }
                }
                abhi.aj(parcel, P6);
                return new aoeh(str2, str10);
            case 16:
                int P7 = abhi.P(parcel);
                Thing thing = null;
                while (parcel.dataPosition() < P7) {
                    int readInt14 = parcel.readInt();
                    int L4 = abhi.L(readInt14);
                    if (L4 != 1) {
                        if (L4 != 2) {
                            abhi.ak(parcel, readInt14);
                        } else {
                            thing = (Thing) abhi.V(parcel, readInt14, Thing.CREATOR);
                        }
                    } else {
                        status = (Status) abhi.V(parcel, readInt14, Status.CREATOR);
                    }
                }
                abhi.aj(parcel, P7);
                return new aoei(status, thing);
            case 17:
                int P8 = abhi.P(parcel);
                boolean z9 = false;
                int i2 = 0;
                String str11 = null;
                Bundle bundle2 = null;
                Bundle bundle3 = null;
                while (parcel.dataPosition() < P8) {
                    int readInt15 = parcel.readInt();
                    int L5 = abhi.L(readInt15);
                    if (L5 != 1) {
                        if (L5 != 2) {
                            if (L5 != 3) {
                                if (L5 != 4) {
                                    if (L5 != 5) {
                                        abhi.ak(parcel, readInt15);
                                    } else {
                                        bundle3 = abhi.S(parcel, readInt15);
                                    }
                                } else {
                                    bundle2 = abhi.S(parcel, readInt15);
                                }
                            } else {
                                str11 = abhi.ab(parcel, readInt15);
                            }
                        } else {
                            i2 = abhi.N(parcel, readInt15);
                        }
                    } else {
                        z9 = abhi.al(parcel, readInt15);
                    }
                }
                abhi.aj(parcel, P8);
                return new aoek(z9, i2, str11, bundle2, bundle3);
            case 18:
                int P9 = abhi.P(parcel);
                int i3 = 0;
                boolean z10 = false;
                boolean z11 = false;
                String str12 = null;
                String str13 = null;
                byte[] bArr = null;
                while (parcel.dataPosition() < P9) {
                    int readInt16 = parcel.readInt();
                    switch (abhi.L(readInt16)) {
                        case 1:
                            i3 = abhi.N(parcel, readInt16);
                            break;
                        case 2:
                            z10 = abhi.al(parcel, readInt16);
                            break;
                        case 3:
                            str12 = abhi.ab(parcel, readInt16);
                            break;
                        case 4:
                            str13 = abhi.ab(parcel, readInt16);
                            break;
                        case 5:
                            bArr = abhi.am(parcel, readInt16);
                            break;
                        case 6:
                            z11 = abhi.al(parcel, readInt16);
                            break;
                        default:
                            abhi.ak(parcel, readInt16);
                            break;
                    }
                }
                abhi.aj(parcel, P9);
                return new aoed(i3, z10, str12, str13, bArr, z11);
            case 19:
                int P10 = abhi.P(parcel);
                int i4 = 0;
                Thing[] thingArr = null;
                String[] strArr = null;
                String[] strArr2 = null;
                aoee aoeeVar = null;
                String str14 = null;
                String str15 = null;
                while (parcel.dataPosition() < P10) {
                    int readInt17 = parcel.readInt();
                    switch (abhi.L(readInt17)) {
                        case 1:
                            i4 = abhi.N(parcel, readInt17);
                            break;
                        case 2:
                            thingArr = (Thing[]) abhi.ar(parcel, readInt17, Thing.CREATOR);
                            break;
                        case 3:
                            strArr = abhi.as(parcel, readInt17);
                            break;
                        case 4:
                        default:
                            abhi.ak(parcel, readInt17);
                            break;
                        case 5:
                            strArr2 = abhi.as(parcel, readInt17);
                            break;
                        case 6:
                            aoeeVar = (aoee) abhi.V(parcel, readInt17, aoee.CREATOR);
                            break;
                        case 7:
                            str14 = abhi.ab(parcel, readInt17);
                            break;
                        case 8:
                            str15 = abhi.ab(parcel, readInt17);
                            break;
                    }
                }
                abhi.aj(parcel, P10);
                return new aoej(i4, thingArr, strArr, strArr2, aoeeVar, str14, str15);
            default:
                int P11 = abhi.P(parcel);
                int i5 = 0;
                Bundle bundle4 = null;
                aoek aoekVar = null;
                String str16 = null;
                String str17 = null;
                while (parcel.dataPosition() < P11) {
                    int readInt18 = parcel.readInt();
                    int L6 = abhi.L(readInt18);
                    if (L6 != 1) {
                        if (L6 != 2) {
                            if (L6 != 3) {
                                if (L6 != 4) {
                                    if (L6 != 1000) {
                                        abhi.ak(parcel, readInt18);
                                    } else {
                                        i5 = abhi.N(parcel, readInt18);
                                    }
                                } else {
                                    str17 = abhi.ab(parcel, readInt18);
                                }
                            } else {
                                str16 = abhi.ab(parcel, readInt18);
                            }
                        } else {
                            aoekVar = (aoek) abhi.V(parcel, readInt18, aoek.CREATOR);
                        }
                    } else {
                        bundle4 = abhi.S(parcel, readInt18);
                    }
                }
                abhi.aj(parcel, P11);
                return new Thing(i5, bundle4, aoekVar, str16, str17);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ajux[i];
            case 1:
                return new MetricKey[i];
            case 2:
                return new ajuy[i];
            case 3:
                return new ajwt[i];
            case 4:
                return new ajxb[i];
            case 5:
                return new ajxc[i];
            case 6:
                return new ajyz[i];
            case 7:
                return new akbu[i];
            case 8:
                return new akna[i];
            case 9:
                return new akuv[i];
            case 10:
                return new aoea[i];
            case 11:
                return new aoeb[i];
            case 12:
                return new aoec[i];
            case 13:
                return new aoee[i];
            case 14:
                return new aoef[i];
            case 15:
                return new aoeh[i];
            case 16:
                return new aoei[i];
            case 17:
                return new aoek[i];
            case 18:
                return new aoed[i];
            case 19:
                return new aoej[i];
            default:
                return new Thing[i];
        }
    }
}
