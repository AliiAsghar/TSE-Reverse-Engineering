package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afsh implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public afsh(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.getClass();
                parcel.readInt();
                return afsi.a;
            case 1:
                parcel.getClass();
                parcel.readInt();
                return afsg.a;
            case 2:
                parcel.getClass();
                parcel.readInt();
                return afsj.a;
            case 3:
                parcel.getClass();
                parcel.readInt();
                return afta.a;
            case 4:
                parcel.getClass();
                parcel.readInt();
                return aftb.a;
            case 5:
                parcel.getClass();
                parcel.readInt();
                return aftc.a;
            case 6:
                parcel.getClass();
                parcel.readInt();
                return aftd.a;
            default:
                parcel.getClass();
                parcel.readInt();
                return aftf.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new afsi[i];
            case 1:
                return new afsg[i];
            case 2:
                return new afsj[i];
            case 3:
                return new afta[i];
            case 4:
                return new aftb[i];
            case 5:
                return new aftc[i];
            case 6:
                return new aftd[i];
            default:
                return new aftf[i];
        }
    }
}
