package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aedc extends aeda {
    public final List a;
    public final List b;
    public final aozb c;
    public final List d;
    private final arqr e;

    public aedc() {
        this(null);
    }

    @Override // defpackage.aeda
    public final aozb cw() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aedc)) {
            return false;
        }
        aedc aedcVar = (aedc) obj;
        arqr arqrVar = aedcVar.e;
        if (d.F(null, null) && d.F(this.a, aedcVar.a) && d.F(this.b, aedcVar.b) && d.F(this.c, aedcVar.c) && d.F(this.d, aedcVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + 992) * 31) + 1;
    }

    public /* synthetic */ aedc(byte[] bArr) {
        arnv arnvVar = arnv.a;
        aozb aozbVar = aozb.b;
        arnv arnvVar2 = arnv.a;
        aozbVar.getClass();
        this.e = null;
        this.a = arnvVar;
        this.b = arnvVar;
        this.c = aozbVar;
        this.d = arnvVar2;
    }
}
