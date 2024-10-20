package defpackage;

import j$.util.Objects;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fve {
    public final eso b;
    public boolean d;
    public boolean e;
    public int g;
    public final List a = new ArrayList();
    public final fvo h = new fvo();
    public esp c = esp.a;
    public ByteBuffer f = esr.a;

    public fve(alog alogVar) {
        this.b = new eso(alogVar);
    }

    public static boolean b(esp espVar) {
        if (espVar.d == -1 || espVar.b == -1 || espVar.c == -1) {
            return false;
        }
        return true;
    }

    public final fvg a(fvz fvzVar, eqn eqnVar) {
        boolean z;
        if (eqnVar.F != -1) {
            z = true;
        } else {
            z = false;
        }
        d.s(z);
        try {
            fvg fvgVar = new fvg(this.c, fvzVar, eqnVar);
            if (Objects.equals(this.c, esp.a)) {
                esp espVar = fvgVar.a;
                this.c = espVar;
                this.b.a(espVar);
                this.b.c();
            }
            this.a.add(new asnn(fvgVar));
            int i = ewx.a;
            return fvgVar;
        } catch (esq e) {
            throw fwo.a(e, "Error while registering input " + this.a.size());
        }
    }

    public final boolean c() {
        if (!this.f.hasRemaining() && this.g >= this.a.size() && this.h.c()) {
            return true;
        }
        return false;
    }
}
