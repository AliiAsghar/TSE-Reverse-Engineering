package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aibs implements ahys {
    public final List a;
    public final adae b;

    public aibs() {
        throw null;
    }

    @Override // defpackage.ahys
    public final adae a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aibs) {
            aibs aibsVar = (aibs) obj;
            if (this.a.equals(aibsVar.a)) {
                adae adaeVar = this.b;
                adae adaeVar2 = aibsVar.b;
                if (adaeVar != null ? adaeVar.equals(adaeVar2) : adaeVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() ^ 1000003;
        adae adaeVar = this.b;
        if (adaeVar == null) {
            hashCode = 0;
        } else {
            hashCode = adaeVar.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    public final String toString() {
        adae adaeVar = this.b;
        return "FindCurrentPlaceRequest{placeFields=" + String.valueOf(this.a) + ", cancellationToken=" + String.valueOf(adaeVar) + "}";
    }

    public aibs(List list, adae adaeVar) {
        this.a = list;
        this.b = adaeVar;
    }
}
