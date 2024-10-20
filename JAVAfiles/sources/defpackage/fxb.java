package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fxb {
    public final fwy a;
    public final int b;
    public final erk c;
    public boolean d;

    public fxb(eqn eqnVar, fwy fwyVar) {
        this.a = fwyVar;
        this.c = eqnVar.l;
        this.b = dyf.g(eqnVar.o);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    public static String k(eqn eqnVar, List list) {
        String str = eqnVar.o;
        dzg.g(str);
        boolean j = erl.j(str);
        alpr alprVar = new alpr();
        alprVar.c(eqnVar.o);
        if (j) {
            alprVar.c("video/hevc");
            alprVar.c("video/avc");
        }
        alprVar.j(list);
        alog g = alprVar.g().g();
        for (int i = 0; i < g.size(); i++) {
            String str2 = (String) g.get(i);
            if (list.contains(str2)) {
                if (j && eqd.i(eqnVar.C)) {
                    if (!fwf.f(str2, eqnVar.C).isEmpty()) {
                        return str2;
                    }
                } else if (!fwf.e(str2).isEmpty()) {
                    return str2;
                }
            }
        }
        return null;
    }

    public abstract void d();

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean g() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract eqn p();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract ewl q();

    public abstract fwt r(fvz fvzVar, eqn eqnVar, int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void s();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean t();
}
