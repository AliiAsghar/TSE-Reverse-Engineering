package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmw implements dnd {
    public final int a;
    private final dhv b;

    public dmw(dhv dhvVar, int i) {
        this.b = dhvVar;
        this.a = i;
    }

    @Override // defpackage.dnd
    public final void a(dnh dnhVar) {
        int length;
        if (dnhVar.k()) {
            dnhVar.h(dnhVar.c, dnhVar.d, b());
        } else {
            dnhVar.h(dnhVar.a, dnhVar.b, b());
        }
        int b = dnhVar.b();
        int i = this.a;
        int i2 = b + i;
        if (i > 0) {
            length = i2 - 1;
        } else {
            length = i2 - b().length();
        }
        int u = arrn.u(length, 0, dnhVar.c());
        dnhVar.j(u, u);
    }

    public final String b() {
        return this.b.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmw)) {
            return false;
        }
        dmw dmwVar = (dmw) obj;
        if (d.F(b(), dmwVar.b()) && this.a == dmwVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "CommitTextCommand(text='" + b() + "', newCursorPosition=" + this.a + ')';
    }

    public dmw(String str, int i) {
        this(new dhv(str), i);
    }
}
