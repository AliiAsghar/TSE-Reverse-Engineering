package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqvb {
    public final aqwa a;
    public final aqrm b;
    public final aquz c;

    public aqvb(aqwa aqwaVar, aqrm aqrmVar, aquz aquzVar) {
        this.a = aqwaVar;
        aqrmVar.getClass();
        this.b = aqrmVar;
        this.c = aquzVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aqvb)) {
            return false;
        }
        aqvb aqvbVar = (aqvb) obj;
        if (!d.B(this.a, aqvbVar.a) || !d.B(this.b, aqvbVar.b) || !d.B(this.c, aqvbVar.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        algv aj = albo.aj(this);
        aj.b("addressesOrError", this.a.toString());
        aj.b("attributes", this.b);
        aj.b("serviceConfigOrError", this.c);
        return aj.toString();
    }
}
