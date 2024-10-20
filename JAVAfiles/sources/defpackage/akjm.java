package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akjm implements akix {
    private final AtomicReference a;

    public akjm(Map map, akja akjaVar) {
        this.a = new AtomicReference(new akjl(map, akjaVar, false));
    }

    @Override // defpackage.akix
    public final akja a() {
        return ((akjl) this.a.get()).a;
    }

    @Override // defpackage.akix
    public final void b() {
        throw new UnsupportedOperationException("Can't change observed values");
    }

    @Override // defpackage.akix
    public final boolean c() {
        return false;
    }

    @Override // defpackage.akix
    public final boolean d(Map map, akja akjaVar) {
        akjl akjlVar;
        akjl akjlVar2 = null;
        do {
            akjlVar = (akjl) this.a.get();
            if (akjlVar.b) {
                return false;
            }
            if (akjlVar2 == null) {
                akjlVar2 = new akjl(map, akjaVar, false);
            }
        } while (!a.bC(this.a, akjlVar, akjlVar2));
        return true;
    }

    @Override // defpackage.akix
    public final apuv e(String str, arqr arqrVar) {
        akjl akjlVar;
        akjl akjlVar2 = null;
        while (true) {
            akjlVar = (akjl) this.a.get();
            if (akjlVar.b) {
                break;
            }
            if (akjlVar2 == null) {
                akjlVar2 = new akjl(akjlVar.c, akjlVar.a, true);
            } else {
                alor alorVar = akjlVar.c;
                alorVar.getClass();
                akjlVar2.c = alorVar;
                akja akjaVar = akjlVar.a;
                akjaVar.getClass();
                akjlVar2.a = akjaVar;
            }
            if (a.bC(this.a, akjlVar, akjlVar2)) {
                if (!akjlVar.b) {
                    arqrVar.a(akjlVar.a);
                }
                akjlVar = akjlVar2;
            }
        }
        Object l = aqjn.l(akjlVar.c, str);
        l.getClass();
        return (apuv) l;
    }
}
