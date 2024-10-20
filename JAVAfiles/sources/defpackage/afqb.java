package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqb implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public afqb(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z;
        switch (this.a) {
            case 0:
                parcel.getClass();
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                int readInt = parcel.readInt();
                afsk afskVar = (afsk) parcel.readParcelable(afqc.class.getClassLoader());
                if (readInt != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new afqc(readString, readString2, readString3, z, afskVar, null, null, parcel.readInt(), parcel.readInt(), 0L, null, null, 3680);
            case 1:
                parcel.getClass();
                parcel.readInt();
                return afgi.a;
            case 2:
                parcel.getClass();
                byte[] createByteArray = parcel.createByteArray();
                if (createByteArray != null) {
                    afty aftyVar = (afty) apag.parseFrom(afty.a, createByteArray);
                    aftyVar.getClass();
                    return new afqe(aftyVar);
                }
                throw new IllegalStateException("Required value was null.");
            case 3:
                parcel.getClass();
                parcel.readInt();
                return afqp.a;
            case 4:
                parcel.getClass();
                return new afqr((afsz) Enum.valueOf(afsz.class, parcel.readString()), (afsk) parcel.readParcelable(afqr.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readLong(), (afqq) parcel.readParcelable(afqr.class.getClassLoader()));
            case 5:
                parcel.getClass();
                parcel.readInt();
                return afrj.a;
            case 6:
                parcel.getClass();
                parcel.readInt();
                return afrk.a;
            case 7:
                parcel.getClass();
                parcel.readInt();
                return afrl.a;
            case 8:
                parcel.getClass();
                parcel.readInt();
                return afrm.a;
            case 9:
                parcel.getClass();
                parcel.readInt();
                return afrn.a;
            case 10:
                parcel.getClass();
                parcel.readInt();
                return afro.a;
            case 11:
                parcel.getClass();
                parcel.readInt();
                return afrp.a;
            case 12:
                parcel.getClass();
                return new afrq(parcel.readString());
            case 13:
                parcel.getClass();
                parcel.readInt();
                return afrr.a;
            case 14:
                parcel.getClass();
                parcel.readInt();
                return afrz.a;
            case 15:
                parcel.getClass();
                parcel.readInt();
                return afsa.a;
            case 16:
                parcel.getClass();
                parcel.readInt();
                return afsb.a;
            case 17:
                parcel.getClass();
                parcel.readInt();
                return afsc.a;
            case 18:
                parcel.getClass();
                parcel.readInt();
                return afsd.a;
            case 19:
                parcel.getClass();
                parcel.readInt();
                return afse.a;
            default:
                parcel.getClass();
                return new afsf(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new afqc[i];
            case 1:
                return new afgi[i];
            case 2:
                return new afqe[i];
            case 3:
                return new afqp[i];
            case 4:
                return new afqr[i];
            case 5:
                return new afrj[i];
            case 6:
                return new afrk[i];
            case 7:
                return new afrl[i];
            case 8:
                return new afrm[i];
            case 9:
                return new afrn[i];
            case 10:
                return new afro[i];
            case 11:
                return new afrp[i];
            case 12:
                return new afrq[i];
            case 13:
                return new afrr[i];
            case 14:
                return new afrz[i];
            case 15:
                return new afsa[i];
            case 16:
                return new afsb[i];
            case 17:
                return new afsc[i];
            case 18:
                return new afsd[i];
            case 19:
                return new afse[i];
            default:
                return new afsf[i];
        }
    }
}
