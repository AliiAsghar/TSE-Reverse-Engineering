package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibl implements ahys {
    public final String a;
    public final List b;
    public final adae c;

    public aibl() {
        throw null;
    }

    public static arbj b(String str, List list) {
        arbj arbjVar = new arbj();
        if (str != null) {
            arbjVar.c = str;
            arbjVar.Y(list);
            return arbjVar;
        }
        throw new NullPointerException("Null placeId");
    }

    @Override // defpackage.ahys
    public final adae a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibl) {
            aibl aiblVar = (aibl) obj;
            if (this.a.equals(aiblVar.a) && this.b.equals(aiblVar.b)) {
                adae adaeVar = this.c;
                adae adaeVar2 = aiblVar.c;
                if (adaeVar != null ? adaeVar.equals(adaeVar2) : adaeVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        adae adaeVar = this.c;
        if (adaeVar == null) {
            hashCode = 0;
        } else {
            hashCode = adaeVar.hashCode();
        }
        return ((hashCode2 * (-721379959)) ^ hashCode) * 1000003;
    }

    public final String toString() {
        adae adaeVar = this.c;
        return "FetchPlaceRequest{placeId=" + this.a + ", placeFields=" + String.valueOf(this.b) + ", sessionToken=null, cancellationToken=" + String.valueOf(adaeVar) + ", regionCode=null}";
    }

    public aibl(String str, List list, adae adaeVar) {
        this.a = str;
        this.b = list;
        this.c = adaeVar;
    }
}
