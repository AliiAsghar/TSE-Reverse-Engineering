package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qkc extends qke implements ascd {
    private final String b;
    private final ascd c;

    public qkc(String str, ascd ascdVar) {
        super(str);
        this.b = str;
        this.c = ascdVar;
    }

    @Override // defpackage.ascg, defpackage.asai
    public final Object a(asaj asajVar, arpe arpeVar) {
        return this.c.a(asajVar, arpeVar);
    }

    @Override // defpackage.ascc
    public final ascv b() {
        return this.c.b();
    }

    @Override // defpackage.ascd, defpackage.ascv
    public final Object c() {
        return this.c.c();
    }

    @Override // defpackage.ascg
    public final List d() {
        return this.c.d();
    }

    @Override // defpackage.ascc
    public final void e() {
        this.c.e();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qkc)) {
            return false;
        }
        qkc qkcVar = (qkc) obj;
        if (d.F(this.b, qkcVar.b) && d.F(this.c, qkcVar.c)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ascd
    public final void f(Object obj) {
        this.c.f(obj);
    }

    @Override // defpackage.ascc, defpackage.asaj
    public final Object fv(Object obj, arpe arpeVar) {
        return this.c.fv(obj, arpeVar);
    }

    @Override // defpackage.ascd
    public final boolean g(Object obj, Object obj2) {
        return this.c.g(obj, obj2);
    }

    @Override // defpackage.ascc
    public final boolean h(Object obj) {
        this.c.h(obj);
        return true;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    @Override // defpackage.qke
    public final String toString() {
        return "NamedMutableStateFlow(name=" + this.b + ", flow=" + this.c + ")";
    }
}
