package defpackage;

import defpackage.ajw;
import defpackage.bwj;
import defpackage.cfq;
import defpackage.dqs;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amq {
    private static final cue a;

    static {
        ajw.b bVar = ajw.a;
        int i = cfq.a;
        a = new amr(bVar, cfq.a.j);
    }

    public static final cue a(ajw.b bVar, cfq.c cVar, bwj bwjVar, int i) {
        boolean z;
        cue cueVar;
        bwjVar.y(-1828505005);
        if (d.F(bVar, ajw.a)) {
            int i2 = cfq.a;
            if (d.F(cVar, cfq.a.j)) {
                cueVar = a;
                bwjVar.q();
                return cueVar;
            }
        }
        boolean z2 = false;
        if ((((i & 14) ^ 6) > 4 && bwjVar.G(bVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        if ((((i & 112) ^ 48) > 32 && bwjVar.G(cVar)) || (i & 48) == 32) {
            z2 = true;
        }
        boolean z3 = z | z2;
        Object h = bwjVar.h();
        if (z3 || h == bwj.a.a) {
            h = new amr(bVar, cVar);
            bwjVar.B(h);
        }
        cueVar = (amr) h;
        bwjVar.q();
        return cueVar;
    }

    public static final long b(boolean z, int i, int i2, int i3) {
        if (!z) {
            return dqt.d(i, i2, 0, i3);
        }
        return dqs.a.b(i, i2, 0, i3);
    }
}
