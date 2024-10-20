package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alcc implements Serializable {
    public final albx a;
    public final Map b;

    private alcc(albx albxVar, Map map) {
        this.a = albxVar;
        this.b = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static alcc a(albx albxVar, Map map) {
        alok alokVar = new alok();
        alokVar.h("Authorization", alog.r("Bearer ".concat(String.valueOf(albxVar.a))));
        alokVar.l(map);
        return new alcc(albxVar, alokVar.b());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof alcc)) {
            return false;
        }
        alcc alccVar = (alcc) obj;
        if (!Objects.equals(this.b, alccVar.b) || !Objects.equals(this.a, alccVar.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
