package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibq implements ahys {
    public final List a;
    private final List b;
    private final adae c;

    public aibq() {
        throw null;
    }

    @Override // defpackage.ahys
    public final adae a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibq) {
            aibq aibqVar = (aibq) obj;
            if (this.b.equals(aibqVar.b) && this.a.equals(aibqVar.a)) {
                adae adaeVar = this.c;
                adae adaeVar2 = aibqVar.c;
                if (adaeVar != null ? adaeVar.equals(adaeVar2) : adaeVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.b.hashCode() ^ (-429739981)) * 583896283) ^ this.a.hashCode();
        adae adaeVar = this.c;
        if (adaeVar == null) {
            hashCode = 0;
        } else {
            hashCode = adaeVar.hashCode();
        }
        return (hashCode2 * 583896283) ^ hashCode;
    }

    public final String toString() {
        adae adaeVar = this.c;
        List list = this.a;
        return "FindAutocompletePredictionsRequest{query=null, locationBias=null, locationRestriction=null, origin=null, countries=" + String.valueOf(this.b) + ", sessionToken=null, typeFilter=null, typesFilter=" + String.valueOf(list) + ", inputOffset=null, regionCode=null, cancellationToken=" + String.valueOf(adaeVar) + "}";
    }

    public aibq(List list, List list2, adae adaeVar) {
        this.b = list;
        this.a = list2;
        this.c = adaeVar;
    }
}
