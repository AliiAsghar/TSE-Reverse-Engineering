package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aicb implements ahys {
    public final List a;
    public final List b;
    public final List c;
    public final List d;
    public final aial e;
    public final List f;
    public final adae g;

    public aicb() {
        throw null;
    }

    @Override // defpackage.ahys
    public final adae a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aicb) {
            aicb aicbVar = (aicb) obj;
            List list = this.a;
            if (list != null ? list.equals(aicbVar.a) : aicbVar.a == null) {
                List list2 = this.b;
                if (list2 != null ? list2.equals(aicbVar.b) : aicbVar.b == null) {
                    List list3 = this.c;
                    if (list3 != null ? list3.equals(aicbVar.c) : aicbVar.c == null) {
                        List list4 = this.d;
                        if (list4 != null ? list4.equals(aicbVar.d) : aicbVar.d == null) {
                            if (this.e.equals(aicbVar.e) && this.f.equals(aicbVar.f)) {
                                adae adaeVar = this.g;
                                adae adaeVar2 = aicbVar.g;
                                if (adaeVar != null ? adaeVar.equals(adaeVar2) : adaeVar2 == null) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        List list = this.a;
        int i = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        List list2 = this.b;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i2 = hashCode ^ (-721379959);
        List list3 = this.c;
        if (list3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list3.hashCode();
        }
        int i3 = (i2 * 1000003) ^ hashCode2;
        List list4 = this.d;
        if (list4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list4.hashCode();
        }
        int hashCode5 = ((((((((i3 * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * (-721379959)) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003;
        adae adaeVar = this.g;
        if (adaeVar != null) {
            i = adaeVar.hashCode();
        }
        return ((hashCode5 ^ i) * 583896283) ^ 1237;
    }

    public final String toString() {
        adae adaeVar = this.g;
        List list = this.f;
        aial aialVar = this.e;
        List list2 = this.d;
        List list3 = this.c;
        List list4 = this.b;
        return "SearchNearbyRequest{regionCode=null, includedTypes=" + String.valueOf(this.a) + ", excludedTypes=" + String.valueOf(list4) + ", includedPrimaryTypes=" + String.valueOf(list3) + ", excludedPrimaryTypes=" + String.valueOf(list2) + ", maxResultCount=null, locationRestriction=" + String.valueOf(aialVar) + ", placeFields=" + String.valueOf(list) + ", cancellationToken=" + String.valueOf(adaeVar) + ", rankPreference=null, routingParameters=null, routingSummariesIncluded=false}";
    }

    public aicb(List list, List list2, List list3, List list4, aial aialVar, List list5, adae adaeVar) {
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = aialVar;
        this.f = list5;
        this.g = adaeVar;
    }
}
