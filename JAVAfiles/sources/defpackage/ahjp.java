package defpackage;

import java.util.HashMap;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ahjp implements alhf {
    private final /* synthetic */ int a;

    public ahjp(int i) {
        this.a = i;
    }

    @Override // defpackage.alhf
    public final /* synthetic */ void a(Object obj) {
        if (this.a != 1) {
            return;
        }
        synchronized (ahiy.class) {
            Iterator it = ((HashMap) ((ahiy) obj).b).values().iterator();
            while (it.hasNext()) {
                uix uixVar = ((ahix) it.next()).c;
                xyo c = uiy.a.c();
                c.H("onPausedForConnectivity");
                c.M("url", uixVar.c);
                c.q();
            }
        }
    }
}
