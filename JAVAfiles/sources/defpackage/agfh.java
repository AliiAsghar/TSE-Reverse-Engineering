package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfh implements Parcelable {
    public static final Parcelable.Creator<agfh> CREATOR = new aftg(12);
    public final agek a;
    public final agen b;
    public final arqr c;

    public agfh(agek agekVar, agen agenVar, arqr arqrVar) {
        agekVar.getClass();
        arqrVar.getClass();
        this.a = agekVar;
        this.b = agenVar;
        this.c = arqrVar;
    }

    public static /* synthetic */ agfh a(agfh agfhVar, agen agenVar, arqr arqrVar, int i) {
        agek agekVar;
        if ((i & 1) != 0) {
            agekVar = agfhVar.a;
        } else {
            agekVar = null;
        }
        if ((i & 2) != 0) {
            agenVar = agfhVar.b;
        }
        agekVar.getClass();
        return new agfh(agekVar, agenVar, arqrVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agfh)) {
            return false;
        }
        agfh agfhVar = (agfh) obj;
        if (this.a == agfhVar.a && d.F(this.b, agfhVar.b) && d.F(this.c, agfhVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        agen agenVar = this.b;
        if (agenVar == null) {
            hashCode = 0;
        } else {
            hashCode = agenVar.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "HugoScreenDisplay(category=" + this.a + ", configuration=" + this.b + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
    }

    public /* synthetic */ agfh(agek agekVar, arqr arqrVar, int i) {
        this(agekVar, (agen) null, (i & 4) != 0 ? agdl.f : arqrVar);
    }
}
