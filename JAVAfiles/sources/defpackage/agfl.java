package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agfl implements agfm {
    public static final Parcelable.Creator<agfl> CREATOR = new aftg(16);
    public final List a;
    public final agek b;
    public final String c;
    private final afwa d;

    public agfl(List list, agek agekVar, String str) {
        list.getClass();
        agekVar.getClass();
        this.a = list;
        this.b = agekVar;
        this.c = str;
        this.d = null;
    }

    public static /* synthetic */ agfl a(agfl agflVar, List list, agek agekVar, int i) {
        if ((i & 1) != 0) {
            list = agflVar.a;
        }
        if ((i & 2) != 0) {
            agekVar = agflVar.b;
        }
        String str = agflVar.c;
        afwa afwaVar = agflVar.d;
        list.getClass();
        agekVar.getClass();
        return new agfl(list, agekVar, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agfl)) {
            return false;
        }
        agfl agflVar = (agfl) obj;
        if (!d.F(this.a, agflVar.a) || this.b != agflVar.b || !d.F(this.c, agflVar.c)) {
            return false;
        }
        afwa afwaVar = agflVar.d;
        if (d.F(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((hashCode2 * 31) + hashCode) * 31;
    }

    public final String toString() {
        return "ScreenWithSearch(screens=" + this.a + ", currentCategory=" + this.b + ", currentSearchTerm=" + this.c + ", configuration=null)";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.a;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((agfh) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.b.name());
        parcel.writeString(this.c);
    }

    public /* synthetic */ agfl(List list, agek agekVar, String str, int i) {
        this(list, (i & 2) != 0 ? ((agfh) aqjn.X(list)).a : agekVar, (i & 4) != 0 ? null : str);
    }
}
