package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eri implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public eri(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                return new erk(parcel);
            case 1:
                return new eqi(parcel);
            case 2:
                return new eum(parcel);
            case 3:
                return new euq(parcel);
            case 4:
                return new eur(parcel);
            case 5:
                String readString = parcel.readString();
                dzg.g(readString);
                return new fnw(parcel.readInt(), readString);
            case 6:
                return new fny(parcel);
            case 7:
                return new foa(parcel);
            case 8:
                return new fob(parcel);
            case 9:
                return new fod(parcel);
            case 10:
                return new foe(parcel);
            case 11:
                return new fof(parcel);
            case 12:
                return new fog(parcel);
            case 13:
                return new foh(parcel);
            case 14:
                return new foi(parcel);
            case 15:
                return new foj(parcel);
            case 16:
                return new fok(parcel);
            case 17:
                return new foo(parcel);
            case 18:
                return new fop(parcel);
            case 19:
                return new foq(parcel);
            default:
                String readString2 = parcel.readString();
                dzg.g(readString2);
                String readString3 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                dzg.g(createStringArray);
                return new Cfor(readString2, readString3, alog.p(createStringArray));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new erk[i];
            case 1:
                return new eqi[i];
            case 2:
                return new eum[i];
            case 3:
                return new euq[i];
            case 4:
                return new eur[i];
            case 5:
                return new fnw[i];
            case 6:
                return new fny[i];
            case 7:
                return new foa[i];
            case 8:
                return new fob[i];
            case 9:
                return new fod[i];
            case 10:
                return new foe[i];
            case 11:
                return new fof[i];
            case 12:
                return new fog[i];
            case 13:
                return new foh[i];
            case 14:
                return new foi[i];
            case 15:
                return new foj[i];
            case 16:
                return new fok[i];
            case 17:
                return new foo[i];
            case 18:
                return new fop[i];
            case 19:
                return new foq[i];
            default:
                return new Cfor[i];
        }
    }
}
