package defpackage;

import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alge extends algf implements Serializable {
    private static final long serialVersionUID = 0;
    final algf a;

    public alge(algf algfVar) {
        this.a = algfVar;
    }

    @Override // defpackage.algf
    protected final Object a(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.algf
    protected final Object b(Object obj) {
        throw new AssertionError();
    }

    @Override // defpackage.algk
    public final boolean equals(Object obj) {
        if (obj instanceof alge) {
            return this.a.equals(((alge) obj).a);
        }
        return false;
    }

    @Override // defpackage.algf
    public final Object fq(Object obj) {
        return this.a.fu(obj);
    }

    @Override // defpackage.algf
    public final Object fu(Object obj) {
        return this.a.fq(obj);
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
