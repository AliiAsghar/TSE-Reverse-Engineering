package defpackage;

import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class akk {
    public static final /* synthetic */ int a = 0;
    private static final cue b;

    static {
        ajw.e eVar = ajw.c;
        int i = cfq.a;
        b = new akl(eVar, cfq.a.m);
    }

    public static final cue a(ajw.e eVar, cfq.b bVar, bwj bwjVar, int i) {
        boolean z;
        cue cueVar;
        bwjVar.y(-1789954967);
        if (d.F(eVar, ajw.c)) {
            int i2 = cfq.a;
            if (d.F(bVar, cfq.a.m)) {
                cueVar = b;
                bwjVar.q();
                return cueVar;
            }
        }
        boolean z2 = false;
        if ((((i & 14) ^ 6) > 4 && bwjVar.G(eVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) > 32 && bwjVar.G(bVar)) || (i & 48) == 32) {
            z2 = true;
        }
        boolean z3 = z | z2;
        Object h = bwjVar.h();
        if (z3 || h == bwj.a.a) {
            h = new akl(eVar, bVar);
            bwjVar.B(h);
        }
        cueVar = (akl) h;
        bwjVar.q();
        return cueVar;
    }
}
