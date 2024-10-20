package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class doh implements dnd {
    public final int a;
    private final dhv b;

    public doh(String str, int i) {
        this.b = new dhv(str);
        this.a = i;
    }

    @Override // defpackage.dnd
    public final void a(dnh dnhVar) {
        int length;
        if (dnhVar.k()) {
            int i = dnhVar.c;
            dnhVar.h(i, dnhVar.d, b());
            if (b().length() > 0) {
                dnhVar.i(i, b().length() + i);
            }
        } else {
            int i2 = dnhVar.a;
            dnhVar.h(i2, dnhVar.b, b());
            if (b().length() > 0) {
                dnhVar.i(i2, b().length() + i2);
            }
        }
        int b = dnhVar.b();
        int i3 = this.a;
        int i4 = b + i3;
        if (i3 > 0) {
            length = i4 - 1;
        } else {
            length = i4 - b().length();
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
        if (!(obj instanceof doh)) {
            return false;
        }
        doh dohVar = (doh) obj;
        if (d.F(b(), dohVar.b()) && this.a == dohVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (b().hashCode() * 31) + this.a;
    }

    public final String toString() {
        return "SetComposingTextCommand(text='" + b() + "', newCursorPosition=" + this.a + ')';
    }
}
