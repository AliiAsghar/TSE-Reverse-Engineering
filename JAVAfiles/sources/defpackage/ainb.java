package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ainb extends aimm implements Cloneable {
    public aimn a;
    public aikw b;
    public String f;
    public boolean g;

    public ainb() {
        super("Via");
        this.g = true;
        this.b = new aikw();
        this.a = new aimn();
    }

    @Override // defpackage.aimh
    public final String a() {
        String str = "" + this.a.c() + " " + this.b.a();
        if (this.g && this.b.b <= 0) {
            str = str.concat(":5060");
        }
        String str2 = this.f;
        if (str2 != null) {
            str = str + "(" + str2 + ")";
        }
        if (!this.e.h()) {
            return str + ";" + this.e.c();
        }
        return str;
    }

    public final String b() {
        return super.i("branch");
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final Object clone() {
        ainb ainbVar = new ainb();
        String str = this.f;
        if (str != null) {
            ainbVar.f = str;
        }
        aila ailaVar = this.e;
        if (ailaVar != null) {
            ainbVar.e = (aila) ailaVar.clone();
        }
        aikw aikwVar = this.b;
        if (aikwVar != null) {
            ainbVar.b = new aikw(aikwVar);
        }
        aimn aimnVar = this.a;
        if (aimnVar != null) {
            ainbVar.a = (aimn) aimnVar.clone();
        }
        return ainbVar;
    }

    public final void e(String str) {
        super.k("branch", str);
    }

    @Override // defpackage.aimm, defpackage.aimh
    public final boolean equals(Object obj) {
        if (!(obj instanceof ainb)) {
            return false;
        }
        ainb ainbVar = (ainb) obj;
        if (!this.a.equals(ainbVar.a) || !this.e.equals(ainbVar.e) || !this.b.equals(ainbVar.b)) {
            return false;
        }
        return true;
    }

    public final void f() {
        super.k("keep", null);
    }

    public final void g() {
        super.k("rport", null);
    }

    @Override // defpackage.aimm, defpackage.aimh
    public final int hashCode() {
        return 123987;
    }

    public final void o() {
        super.k("server-keep", null);
    }

    public final void p(String str) {
        if (this.a == null) {
            this.a = new aimn();
        }
        this.a.c = str;
    }
}
