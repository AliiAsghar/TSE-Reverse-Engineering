package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abcf extends eor implements rtt {
    private final rrb a = new rrb();
    private final eny b;

    public abcf() {
        eny enyVar = new eny();
        this.b = enyVar;
        new ArrayList();
        new ArrayList();
        new ArrayList();
        enyVar.j(new aabr());
    }

    @Override // defpackage.rtt
    public final void a(rtu rtuVar) {
        this.a.d();
        this.b.h(new aabr());
    }

    @Override // defpackage.rtt
    public final void b(rtu rtuVar) {
        boolean z = true;
        d.s(true);
        this.a.d();
        rtl rtlVar = (rtl) rtuVar;
        d.s(rtlVar.q());
        List p = rtlVar.p();
        if (p.size() != 1) {
            z = false;
        }
        albo.T(z);
        ufb ufbVar = (ufb) p.get(0);
        Uri uri = ufbVar.c;
        String str = ufbVar.d;
    }

    @Override // defpackage.eor
    public final void gi() {
        if (this.a.g()) {
            this.a.f();
        }
    }
}
