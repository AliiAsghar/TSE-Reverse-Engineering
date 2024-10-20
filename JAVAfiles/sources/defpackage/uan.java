package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.E2eeInfo;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uan {
    public final E2eeInfo a;
    public final Map b;
    public final nfw c;

    public uan(E2eeInfo e2eeInfo, Map map, nfw nfwVar) {
        e2eeInfo.getClass();
        this.a = e2eeInfo;
        this.b = map;
        this.c = nfwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uan)) {
            return false;
        }
        uan uanVar = (uan) obj;
        if (d.F(this.a, uanVar.a) && d.F(this.b, uanVar.b) && d.F(this.c, uanVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.a.hashCode() * 31) + this.b.hashCode();
        nfw nfwVar = this.c;
        if (nfwVar == null) {
            hashCode = 0;
        } else {
            hashCode = nfwVar.hashCode();
        }
        return (hashCode2 * 31) + hashCode;
    }

    public final String toString() {
        return "DetailsPageE2eeInfoResult(selfE2eeInfo=" + this.a + ", e2eeInfoMap=" + this.b + ", selfIdentity=" + this.c + ")";
    }
}
