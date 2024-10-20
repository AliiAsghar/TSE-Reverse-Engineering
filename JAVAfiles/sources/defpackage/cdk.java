package defpackage;

import defpackage.bwj;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdk {
    public static final int a(int i, int i2) {
        return i << ((i2 * 3) + 1);
    }

    public static final int b(int i) {
        return a(2, i);
    }

    public static final int c(int i) {
        return a(1, i);
    }

    public static final boolean d(bze bzeVar, bze bzeVar2) {
        if (bzeVar == null) {
            return true;
        }
        if (!(bzeVar instanceof bzf)) {
            return false;
        }
        bzf bzfVar = (bzf) bzeVar;
        if (!bzfVar.m() || d.F(bzeVar, bzeVar2) || d.F(bzfVar.c, ((bzf) bzeVar2).c)) {
            return true;
        }
        return false;
    }

    public static final cdi e(int i, Object obj, bwj bwjVar) {
        Object h = bwjVar.h();
        if (h == bwj.a.a) {
            h = new cdj(i, true, obj);
            bwjVar.B(h);
        }
        cdj cdjVar = (cdj) h;
        if (!d.F(cdjVar.b, obj)) {
            Object obj2 = cdjVar.b;
            cdjVar.b = obj;
            if (obj2 != null && cdjVar.a) {
                bze bzeVar = cdjVar.c;
                if (bzeVar != null) {
                    bzeVar.a();
                    cdjVar.c = null;
                }
                List list = cdjVar.d;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((bze) list.get(i2)).a();
                    }
                    list.clear();
                }
            }
        }
        return cdjVar;
    }
}
