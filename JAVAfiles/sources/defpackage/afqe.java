package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afqe implements aftp {
    public static final Parcelable.Creator<afqe> CREATOR = new afqb(2);
    public static final afqe a;
    public static final afqe b;
    public final afty c;

    static {
        aozy createBuilder = afty.a.createBuilder();
        createBuilder.getClass();
        aozy createBuilder2 = aftx.a.createBuilder();
        createBuilder2.getClass();
        afwv.p(afwv.m(createBuilder2), createBuilder);
        a = new afqe(afwv.n(createBuilder));
        aozy createBuilder3 = afty.a.createBuilder();
        createBuilder3.getClass();
        aozy createBuilder4 = aftw.a.createBuilder();
        createBuilder4.getClass();
        afwv.o(afwv.E(createBuilder4), createBuilder3);
        b = new afqe(afwv.n(createBuilder3));
    }

    public afqe(afty aftyVar) {
        this.c = aftyVar;
    }

    public final boolean a() {
        if (this.c.b == 100) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof afqe) && d.F(this.c, ((afqe) obj).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "EmotifySource(customStickerSource=" + this.c + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeByteArray(this.c.toByteArray());
    }
}
