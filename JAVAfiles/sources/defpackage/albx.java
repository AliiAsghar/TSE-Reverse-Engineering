package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class albx implements Serializable {
    private static final long serialVersionUID = -8514239465808977353L;
    public final String a;
    public final Long b;
    private final List c;

    public albx(String str, Date date) {
        Long valueOf;
        this.a = str;
        if (date == null) {
            valueOf = null;
        } else {
            valueOf = Long.valueOf(date.getTime());
        }
        this.b = valueOf;
        this.c = new ArrayList();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof albx)) {
            return false;
        }
        albx albxVar = (albx) obj;
        if (!Objects.equals(this.a, albxVar.a) || !Objects.equals(this.b, albxVar.b) || !Objects.equals(this.c, albxVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("tokenValue", this.a);
        aj.b("expirationTimeMillis", this.b);
        aj.b("scopes", this.c);
        return aj.toString();
    }
}
