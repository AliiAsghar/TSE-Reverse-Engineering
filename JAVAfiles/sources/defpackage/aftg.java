package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aftg implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public aftg(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[], arqr] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        Map map = 0;
        LinkedHashMap linkedHashMap = null;
        LinkedHashMap linkedHashMap2 = null;
        switch (this.a) {
            case 0:
                parcel.getClass();
                return new afth(parcel.readString());
            case 1:
                parcel.getClass();
                parcel.readInt();
                return afte.a;
            case 2:
                parcel.getClass();
                parcel.readInt();
                return afti.a;
            case 3:
                parcel.getClass();
                parcel.readInt();
                return aftj.a;
            case 4:
                parcel.getClass();
                parcel.readInt();
                return aftl.a;
            case 5:
                parcel.getClass();
                parcel.readInt();
                return aftk.a;
            case 6:
                parcel.getClass();
                afrs afrsVar = (afrs) parcel.readParcelable(aftn.class.getClassLoader());
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    map = new LinkedHashMap(readInt);
                    while (i != readInt) {
                        map.put(parcel.readString(), parcel.readString());
                        i++;
                    }
                }
                return new aftn(afrsVar, readString, map, parcel.readString(), parcel.readLong(), (Instant) parcel.readSerializable(), (afcp) parcel.readParcelable(aftn.class.getClassLoader()), (Duration) parcel.readSerializable(), (aggp) aowt.b(parcel, aggp.a, aozs.a()));
            case 7:
                parcel.getClass();
                afsk afskVar = (afsk) parcel.readParcelable(afto.class.getClassLoader());
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt2 = parcel.readInt();
                    linkedHashMap2 = new LinkedHashMap(readInt2);
                    while (i != readInt2) {
                        linkedHashMap2.put(parcel.readString(), parcel.readString());
                        i++;
                    }
                }
                return new afto(afskVar, readString2, linkedHashMap2, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), (Instant) parcel.readSerializable(), (afcp) parcel.readParcelable(afto.class.getClassLoader()));
            case 8:
                parcel.getClass();
                aftm aftmVar = (aftm) parcel.readParcelable(aftq.class.getClassLoader());
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt3 = parcel.readInt();
                    linkedHashMap = new LinkedHashMap(readInt3);
                    while (i != readInt3) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                        i++;
                    }
                }
                return new aftq(aftmVar, readString3, linkedHashMap, parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), (Instant) parcel.readSerializable(), (afcp) parcel.readParcelable(aftq.class.getClassLoader()), (Duration) parcel.readSerializable());
            case 9:
                parcel.getClass();
                return (afvs) Enum.valueOf(afvs.class, parcel.readString());
            case 10:
                parcel.getClass();
                parcel.readInt();
                return afxq.a;
            case 11:
                parcel.getClass();
                parcel.readInt();
                return agfg.a;
            case 12:
                parcel.getClass();
                return new agfh(agek.a(parcel.readString()), (arqr) map, 6);
            case 13:
                parcel.getClass();
                return new agfi(parcel.readInt(), null);
            case 14:
                parcel.getClass();
                return new agfj((byte[]) map);
            case 15:
                parcel.getClass();
                return new agfk(agfh.CREATOR.createFromParcel(parcel));
            case 16:
                parcel.getClass();
                int readInt4 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt4);
                while (i != readInt4) {
                    arrayList.add(agfh.CREATOR.createFromParcel(parcel));
                    i++;
                }
                return new agfl(arrayList, agek.a(parcel.readString()), parcel.readString(), 8);
            case 17:
                parcel.getClass();
                parcel.readInt();
                return aggr.a;
            case 18:
                return new agqo(parcel);
            case 19:
                return new agri(parcel);
            default:
                return new agrp(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new afth[i];
            case 1:
                return new afte[i];
            case 2:
                return new afti[i];
            case 3:
                return new aftj[i];
            case 4:
                return new aftl[i];
            case 5:
                return new aftk[i];
            case 6:
                return new aftn[i];
            case 7:
                return new afto[i];
            case 8:
                return new aftq[i];
            case 9:
                return new afvs[i];
            case 10:
                return new afxq[i];
            case 11:
                return new agfg[i];
            case 12:
                return new agfh[i];
            case 13:
                return new agfi[i];
            case 14:
                return new agfj[i];
            case 15:
                return new agfk[i];
            case 16:
                return new agfl[i];
            case 17:
                return new aggr[i];
            case 18:
                return new agqo[i];
            case 19:
                return new agri[i];
            default:
                return new agrp[i];
        }
    }
}
