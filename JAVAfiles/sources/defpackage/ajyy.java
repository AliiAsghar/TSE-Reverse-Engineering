package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajyy implements emx {
    public final akbn a;
    public ajyo b;
    private final List c;
    private final aklj d;

    public ajyy(aklj akljVar) {
        akljVar.getClass();
        this.d = akljVar;
        this.a = new akbn("KeepStateCallbacksHandler");
        this.c = new ArrayList();
        akljVar.N().c(this);
        akljVar.aK().c("tiktok_keep_state_callback_handler", new cp(this, 9));
    }

    public final int a(ajyx ajyxVar) {
        return this.a.a(ajyxVar);
    }

    public final ajyx b(int i) {
        return (ajyx) this.a.b(i);
    }

    public final void c() {
        aiut.c();
        ajyo ajyoVar = this.b;
        if (ajyoVar == null) {
            return;
        }
        if (ajyoVar.b == 1) {
            ((ajyx) this.a.b(ajyoVar.a)).a();
        }
        this.b = null;
    }

    @Override // defpackage.emx
    public final void d(enm enmVar) {
        Bundle bundle;
        ajyo ajyoVar = null;
        if (this.d.aK().e()) {
            bundle = this.d.aK().b("tiktok_keep_state_callback_handler");
        } else {
            bundle = null;
        }
        if (bundle != null) {
            this.a.e(bundle);
            if (!bundle.containsKey("KSCH$AC$callbacks_id")) {
                if (bundle.containsKey("KSCH$AC$callbacks_state")) {
                    throw new IllegalStateException("Check failed.");
                }
            } else if (bundle.containsKey("KSCH$AC$callbacks_state")) {
                ajyoVar = new ajyo(bundle.getInt("KSCH$AC$callbacks_id"), bundle.getInt("KSCH$AC$callbacks_state"));
            } else {
                throw new IllegalStateException("Check failed.");
            }
            this.b = ajyoVar;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            this.a.d((ajyx) it.next());
        }
        this.c.clear();
    }

    public final void j(ajxt ajxtVar) {
        ajxtVar.getClass();
        aiut.c();
        ajyo ajyoVar = this.b;
        ajyoVar.getClass();
        int i = ajyoVar.a;
        int i2 = ajyoVar.b;
        ajyx ajyxVar = (ajyx) this.a.b(i);
        if (i2 == 1) {
            ajyxVar.a();
        }
        ajyxVar.c();
        this.b = null;
    }

    public final void k() {
        aiut.c();
        ajyo ajyoVar = this.b;
        ajyoVar.getClass();
        if (ajyoVar.b == 1) {
            return;
        }
        ajyoVar.b = 1;
        ((ajyx) this.a.b(ajyoVar.a)).b();
    }

    public final void l(ajyx ajyxVar) {
        aiut.c();
        c();
        this.b = new ajyo(this.a.a(ajyxVar), 0);
    }

    @Override // defpackage.emx
    public final /* synthetic */ void f(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gF(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void gG(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void h(enm enmVar) {
    }

    @Override // defpackage.emx
    public final /* synthetic */ void i(enm enmVar) {
    }
}
