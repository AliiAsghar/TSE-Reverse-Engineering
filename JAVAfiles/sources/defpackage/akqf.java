package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akqf {
    public aktr a;
    public aktr b;
    private final cg c;
    private int d = 0;

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        aksr a();
    }

    public akqf(cg cgVar) {
        this.c = cgVar;
    }

    private final aksa l(String str) {
        if (akqj.u()) {
            return aktp.e(str);
        }
        cj fe = this.c.fe();
        fe.getClass();
        return aktp.i(fe).b(str);
    }

    private final aksa m(String str) {
        Object b;
        akqj.r();
        if (akqj.u()) {
            b = aktp.e(str);
        } else {
            b = ((a) akec.w(this.c.x(), a.class)).a().b(str);
        }
        return new akpo(akqj.k(), b, 5, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void n(aktr aktrVar, cg cgVar, boolean z) {
        if (cgVar.x() != null) {
            for (cg cgVar2 : cgVar.G().l()) {
                if (cgVar2 instanceof akrw) {
                    ((akrw) cgVar2).aY(aktrVar, z);
                } else {
                    n(aktrVar, cgVar2, z);
                }
            }
        }
    }

    public final aksa a() {
        try {
            return b();
        } finally {
            this.a = null;
            this.b = null;
            this.d = 0;
        }
    }

    public final aksa b() {
        aktr aktrVar = this.b;
        if (aktrVar != null) {
            return aktrVar.a();
        }
        aktr aktrVar2 = this.a;
        if (aktrVar2 != null) {
            return aktrVar2.a();
        }
        return akqj.j();
    }

    public final aksa c() {
        aksa j = akqj.j();
        if (this.d > 0) {
            e(aktr.b(), false);
        }
        return j;
    }

    public final void d() {
        cg cgVar = this.c;
        cgVar.G().af(new aksp(((a) akec.w(cgVar.x(), a.class)).a()));
    }

    public final void e(aktr aktrVar, boolean z) {
        if (z) {
            if (aktrVar == null) {
                int i = this.d - 1;
                if (i < 0) {
                    i = 0;
                }
                this.d = i;
                if (i == 0) {
                    this.a = null;
                    return;
                }
                return;
            }
            this.d++;
        }
        this.a = aktrVar;
        n(aktrVar, this.c, z);
    }

    public final aksa f() {
        return l("Fragment:onActivityResult");
    }

    public final aksa g() {
        return m("DialogFragment:onCancel");
    }

    public final aksa h(int i, int i2) {
        aksa j = akqj.j();
        if (i != 0 || i2 != 0) {
            e(aktr.b(), true);
        }
        return j;
    }

    public final aksa i() {
        return m("DialogFragment:onDismiss");
    }

    public final aksa j() {
        return l("Fragment:onOptionsItemSelected");
    }

    public final void k() {
        akqj.z();
        if (this.d > 0) {
            e(aktr.b(), false);
        }
    }
}
