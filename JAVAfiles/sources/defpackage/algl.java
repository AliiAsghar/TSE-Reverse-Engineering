package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class algl extends algj implements Serializable {
    private static final long serialVersionUID = 0;
    private final algk a;
    private final algj b;

    public algl(algk algkVar, algj algjVar) {
        this.a = algkVar;
        this.b = algjVar;
    }

    @Override // defpackage.algj
    protected final int a(Object obj) {
        return this.b.c(this.a.apply(obj));
    }

    @Override // defpackage.algj
    protected final boolean b(Object obj, Object obj2) {
        algk algkVar = this.a;
        return this.b.d(algkVar.apply(obj), algkVar.apply(obj2));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof algl) {
            algl alglVar = (algl) obj;
            if (this.a.equals(alglVar.a) && this.b.equals(alglVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        algk algkVar = this.a;
        return this.b.toString() + ".onResultOf(" + algkVar.toString() + ")";
    }
}
