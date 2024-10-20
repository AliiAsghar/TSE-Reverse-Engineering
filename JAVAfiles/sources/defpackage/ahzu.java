package defpackage;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahzu implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ahzu(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z = false;
        String str7 = null;
        switch (this.a) {
            case 0:
                if (parcel.readInt() == 0) {
                    str = parcel.readString();
                } else {
                    str = null;
                }
                if (parcel.readInt() == 0) {
                    str2 = parcel.readString();
                } else {
                    str2 = null;
                }
                if (parcel.readInt() == 0) {
                    str3 = parcel.readString();
                } else {
                    str3 = null;
                }
                if (parcel.readInt() == 0) {
                    str4 = parcel.readString();
                } else {
                    str4 = null;
                }
                if (parcel.readInt() == 0) {
                    str5 = parcel.readString();
                } else {
                    str5 = null;
                }
                Double valueOf = Double.valueOf(parcel.readDouble());
                ahyw ahywVar = (ahyw) parcel.readParcelable(aibd.class.getClassLoader());
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    str7 = parcel.readString();
                }
                return new ahzv(str, str2, str3, str4, str5, valueOf, ahywVar, readString, str7);
            case 1:
                if (parcel.readInt() == 0) {
                    str6 = parcel.readString();
                } else {
                    str6 = null;
                }
                if (parcel.readInt() == 0) {
                    str7 = parcel.readString();
                }
                return new ahzt(str6, str7);
            case 2:
                return new ahzw(parcel.readArrayList(aibe.class.getClassLoader()));
            case 3:
                aiaj aiajVar = (aiaj) parcel.readParcelable(aibg.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    z = true;
                }
                return new ahzx(aiajVar, z);
            case 4:
                return new ahzy(parcel.readString(), parcel.readString());
            case 5:
                aiaj aiajVar2 = (aiaj) parcel.readParcelable(aibi.class.getClassLoader());
                aiac aiacVar = (aiac) parcel.readParcelable(aibi.class.getClassLoader());
                aiak aiakVar = (aiak) parcel.readParcelable(aibi.class.getClassLoader());
                if (parcel.readInt() == 1) {
                    z = true;
                }
                return new ahzz(aiajVar2, aiacVar, aiakVar, z);
            case 6:
                String readString2 = parcel.readString();
                readString2.getClass();
                return (aiac) Enum.valueOf(aiac.class, readString2);
            case 7:
                String readString3 = parcel.readString();
                readString3.getClass();
                return (aiae) Enum.valueOf(aiae.class, readString3);
            case 8:
                String readString4 = parcel.readString();
                readString4.getClass();
                return (aiag) Enum.valueOf(aiag.class, readString4);
            case 9:
                String readString5 = parcel.readString();
                readString5.getClass();
                return (aian) Enum.valueOf(aian.class, readString5);
            case 10:
                String readString6 = parcel.readString();
                readString6.getClass();
                return (aiav) Enum.valueOf(aiav.class, readString6);
            case 11:
                String readString7 = parcel.readString();
                readString7.getClass();
                return (aiax) Enum.valueOf(aiax.class, readString7);
            case 12:
                String readString8 = parcel.readString();
                readString8.getClass();
                return (aiay) Enum.valueOf(aiay.class, readString8);
            case 13:
                String readString9 = parcel.readString();
                readString9.getClass();
                return (aiaz) Enum.valueOf(aiaz.class, readString9);
            case 14:
                return new aiqb(parcel);
            case 15:
                return new airf(parcel);
            case 16:
                return new aiyt(parcel);
            case 17:
                return new aiza(parcel);
            case 18:
                return new aizb(parcel);
            case 19:
                try {
                    return new aizc(parcel);
                } catch (apba e) {
                    throw new BadParcelableException(e);
                }
            default:
                return new ajfp(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ahzv[i];
            case 1:
                return new ahzt[i];
            case 2:
                return new ahzw[i];
            case 3:
                return new ahzx[i];
            case 4:
                return new ahzy[i];
            case 5:
                return new ahzz[i];
            case 6:
                return new aiac[i];
            case 7:
                return new aiae[i];
            case 8:
                return new aiag[i];
            case 9:
                return new aian[i];
            case 10:
                return new aiav[i];
            case 11:
                return new aiax[i];
            case 12:
                return new aiay[i];
            case 13:
                return new aiaz[i];
            case 14:
                return new aiqb[i];
            case 15:
                return new airf[i];
            case 16:
                return new aiyt[i];
            case 17:
                return new aiza[i];
            case 18:
                return new aizb[i];
            case 19:
                return new aizc[i];
            default:
                return new ajfp[i];
        }
    }
}
