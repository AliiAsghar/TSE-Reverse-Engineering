package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahig implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public ahig(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str;
        Integer num;
        Integer num2;
        String str2 = null;
        String str3 = null;
        Instant instant = null;
        String str4 = null;
        switch (this.a) {
            case 0:
                return new ahih(parcel);
            case 1:
                return new agrs(parcel);
            case 2:
                return new ahyy((aiav) parcel.readParcelable(ahyt.class.getClassLoader()), (aiav) parcel.readParcelable(ahyt.class.getClassLoader()), (aiav) parcel.readParcelable(ahyt.class.getClassLoader()), (aiav) parcel.readParcelable(ahyt.class.getClassLoader()));
            case 3:
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    str2 = parcel.readString();
                }
                return new ahyz(readString, str2, parcel.readArrayList(ahyu.class.getClassLoader()));
            case 4:
                return new ahza(parcel.readArrayList(ahyv.class.getClassLoader()));
            case 5:
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    str = parcel.readString();
                } else {
                    str = null;
                }
                if (parcel.readInt() == 0) {
                    str4 = parcel.readString();
                }
                return new ahzb(readString2, str, str4);
            case 6:
                return new ahzc(parcel.readArrayList(ahyx.class.getClassLoader()));
            case 7:
                aiae aiaeVar = (aiae) parcel.readParcelable(aiab.class.getClassLoader());
                Double valueOf = Double.valueOf(parcel.readDouble());
                Integer valueOf2 = Integer.valueOf(parcel.readInt());
                if (parcel.readInt() == 0) {
                    num = Integer.valueOf(parcel.readInt());
                } else {
                    num = null;
                }
                if (parcel.readInt() == 0) {
                    num2 = Integer.valueOf(parcel.readInt());
                } else {
                    num2 = null;
                }
                if (parcel.readInt() == 0) {
                    instant = (Instant) parcel.readSerializable();
                }
                return new ahzd(aiaeVar, valueOf, valueOf2, num, num2, instant);
            case 8:
                return new ahze(Integer.valueOf(parcel.readInt()), parcel.readArrayList(aiad.class.getClassLoader()));
            case 9:
                return new ahzf(parcel.readArrayList(aiaf.class.getClassLoader()));
            case 10:
                return new ahzg((aiag) parcel.readParcelable(aiah.class.getClassLoader()), (aiam) parcel.readParcelable(aiah.class.getClassLoader()), (Instant) parcel.readSerializable());
            case 11:
                return new ahzh((Duration) parcel.readSerializable(), parcel.readInt());
            case 12:
                return new ahzi(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 13:
                return new ahzj(parcel.readInt(), parcel.readInt());
            case 14:
                return new ahzk(parcel.readString(), Long.valueOf(parcel.readLong()), Integer.valueOf(parcel.readInt()));
            case 15:
                return new ahzl((aian) parcel.readParcelable(aiao.class.getClassLoader()), parcel.readArrayList(aiao.class.getClassLoader()), parcel.readArrayList(aiao.class.getClassLoader()), parcel.readArrayList(aiao.class.getClassLoader()));
            case 16:
                return new ahzm((aiav) parcel.readParcelable(aiaq.class.getClassLoader()), (aiav) parcel.readParcelable(aiaq.class.getClassLoader()), (aiav) parcel.readParcelable(aiaq.class.getClassLoader()), (aiav) parcel.readParcelable(aiaq.class.getClassLoader()), (aiav) parcel.readParcelable(aiaq.class.getClassLoader()), (aiav) parcel.readParcelable(aiaq.class.getClassLoader()), (aiav) parcel.readParcelable(aiaq.class.getClassLoader()));
            case 17:
                return new ahzn((aiav) parcel.readParcelable(aiar.class.getClassLoader()), (aiav) parcel.readParcelable(aiar.class.getClassLoader()), (aiav) parcel.readParcelable(aiar.class.getClassLoader()), (aiav) parcel.readParcelable(aiar.class.getClassLoader()));
            case 18:
                return new ahzo((aibi) parcel.readParcelable(aias.class.getClassLoader()), (aibi) parcel.readParcelable(aias.class.getClassLoader()));
            case 19:
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                String readString4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    str3 = parcel.readString();
                }
                return new ahzp(readString3, readInt, readInt2, readString4, str3, (ahyx) parcel.readParcelable(aiau.class.getClassLoader()));
            default:
                return new ahzs((aiba) parcel.readParcelable(aibb.class.getClassLoader()), parcel.readDouble());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ahih[i];
            case 1:
                return new agrs[i];
            case 2:
                return new ahyy[i];
            case 3:
                return new ahyz[i];
            case 4:
                return new ahza[i];
            case 5:
                return new ahzb[i];
            case 6:
                return new ahzc[i];
            case 7:
                return new ahzd[i];
            case 8:
                return new ahze[i];
            case 9:
                return new ahzf[i];
            case 10:
                return new ahzg[i];
            case 11:
                return new ahzh[i];
            case 12:
                return new ahzi[i];
            case 13:
                return new ahzj[i];
            case 14:
                return new ahzk[i];
            case 15:
                return new ahzl[i];
            case 16:
                return new ahzm[i];
            case 17:
                return new ahzn[i];
            case 18:
                return new ahzo[i];
            case 19:
                return new ahzp[i];
            default:
                return new ahzs[i];
        }
    }
}
