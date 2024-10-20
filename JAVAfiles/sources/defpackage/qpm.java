package defpackage;

import java.util.Collection;
import org.json.JSONArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qpm {
    public final String a;

    public qpm() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static qpm a(alog alogVar) {
        also alsoVar = also.a;
        alzz.E(alsoVar, alogVar);
        Object[] aU = alzz.aU(alogVar);
        alqf x = alqf.x(alsoVar, aU.length, aU);
        if (x.size() == 1) {
            return new qpm((String) ((alth) x).d.get(0));
        }
        return new qpm(new JSONArray((Collection) x).toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qpm) {
            return this.a.equals(((qpm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CacheKey{destinationKey=" + this.a + "}";
    }

    public qpm(String str) {
        if (str == null) {
            throw new NullPointerException("Null destinationKey");
        }
        this.a = str;
    }
}
