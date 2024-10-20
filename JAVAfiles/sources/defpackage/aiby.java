package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiby implements ahys {
    public final List a;
    public final List b;
    public final String c;
    public final adae d;

    public aiby() {
        throw null;
    }

    @Override // defpackage.ahys
    public final adae a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aiby) {
            aiby aibyVar = (aiby) obj;
            adae adaeVar = this.d;
            if (adaeVar != null ? adaeVar.equals(aibyVar.d) : aibyVar.d == null) {
                if (this.a.equals(aibyVar.a) && this.b.equals(aibyVar.b) && this.c.equals(aibyVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        adae adaeVar = this.d;
        if (adaeVar == null) {
            hashCode = 0;
        } else {
            hashCode = adaeVar.hashCode();
        }
        return ((((((((((((hashCode ^ 1000003) * 272515929) ^ 1237) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.b.hashCode()) * 583896283) ^ 1237) * 1000003) ^ this.c.hashCode()) * 1525764945) ^ 1237;
    }

    public final String toString() {
        List list = this.b;
        List list2 = this.a;
        return "SearchByTextRequest{cancellationToken=" + String.valueOf(this.d) + ", includedType=null, locationBias=null, locationRestriction=null, maxResultCount=null, minRating=null, openNow=false, placeFields=" + String.valueOf(list2) + ", priceLevels=" + String.valueOf(list) + ", rankPreference=null, regionCode=null, strictTypeFiltering=false, textQuery=" + this.c + ", evSearchOptions=null, routingParameters=null, searchAlongRouteParameters=null, routingSummariesIncluded=false}";
    }

    public aiby(adae adaeVar, List list, List list2, String str) {
        this.d = adaeVar;
        this.a = list;
        this.b = list2;
        this.c = str;
    }
}
