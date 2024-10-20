package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class duc {
    public final dva a;
    private int b;
    private final ArrayList c;
    private qdq d;

    public duc() {
        this((byte[]) null);
    }

    public static cga c(cga cgaVar, dtz dtzVar, arqr arqrVar) {
        return cgaVar.a(new due(dtzVar, arqrVar));
    }

    public final dtz a() {
        int i = this.b;
        this.b = i + 1;
        dtz dtzVar = (dtz) aqjn.aa(this.c, i);
        if (dtzVar == null) {
            dtz dtzVar2 = new dtz(Integer.valueOf(this.b));
            this.c.add(dtzVar2);
            return dtzVar2;
        }
        return dtzVar;
    }

    public final void b() {
        ((duv) this.a).a.clear();
        this.b = 0;
    }

    public final qdq d() {
        qdq qdqVar = this.d;
        if (qdqVar == null) {
            qdq qdqVar2 = new qdq(this, null);
            this.d = qdqVar2;
            return qdqVar2;
        }
        return qdqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof duc) {
            return d.F(this.a, ((duc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public duc(byte[] bArr) {
        new ArrayList();
        this.a = new dva(new char[0]);
    }

    public duc(char[] cArr) {
        this((byte[]) null);
        this.b = 0;
        this.c = new ArrayList();
    }
}
