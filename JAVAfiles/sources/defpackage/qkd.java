package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qkd extends qke implements ascv {
    private final String b;
    private final ascv c;

    public qkd(String str, ascv ascvVar) {
        super(str);
        this.b = str;
        this.c = ascvVar;
    }

    @Override // defpackage.ascg, defpackage.asai
    public final Object a(asaj asajVar, arpe arpeVar) {
        return this.c.a(asajVar, arpeVar);
    }

    @Override // defpackage.ascv
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.ascg
    public final List d() {
        return this.c.d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkd)) {
            return false;
        }
        qkd qkdVar = (qkd) obj;
        if (d.F(this.b, qkdVar.b) && d.F(this.c, qkdVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.qke
    public final String toString() {
        return "NamedStateFlow(name=" + this.b + ", flow=" + this.c + ")";
    }
}
