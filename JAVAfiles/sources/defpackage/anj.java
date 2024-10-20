package defpackage;

import defpackage.anf;
import defpackage.bwj;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anj extends arrp implements arqw<cga, bwj, Integer, cga> {
    public anj() {
        super(3);
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(359872873);
        WeakHashMap weakHashMap = anf.a;
        anf b = anf.a.b(bwjVar);
        boolean G = bwjVar.G(b);
        Object h = bwjVar.h();
        if (G || h == bwj.a.a) {
            h = new als(b.e);
            bwjVar.B(h);
        }
        als alsVar = (als) h;
        bwjVar.q();
        return alsVar;
    }
}
