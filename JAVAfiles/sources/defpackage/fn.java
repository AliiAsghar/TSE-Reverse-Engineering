package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fn implements iu {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public fn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.iu
    public final void a(ij ijVar, boolean z) {
        ij ijVar2;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (ijVar instanceof jc) {
                    ijVar.a().i(false);
                }
                iu iuVar = ((hz) this.a).e;
                if (iuVar != null) {
                    iuVar.a(ijVar, z);
                    return;
                }
                return;
            }
            ((fo) this.a).A(ijVar);
            return;
        }
        ij a = ijVar.a();
        if (a != ijVar) {
            ijVar2 = a;
        } else {
            ijVar2 = ijVar;
        }
        fm v = ((fo) this.a).v(ijVar2);
        if (v != null) {
            if (a != ijVar) {
                ((fo) this.a).z(v.a, v, a);
                ((fo) this.a).B(v, true);
                return;
            }
            ((fo) this.a).B(v, z);
        }
    }

    @Override // defpackage.iu
    public final boolean b(ij ijVar) {
        Window.Callback w;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.a;
                if (ijVar != ((jq) obj).c) {
                    im imVar = ((jc) ijVar).l;
                    iu iuVar = ((hz) obj).e;
                    if (iuVar != null) {
                        return iuVar.b(ijVar);
                    }
                    return false;
                }
                return false;
            }
            Window.Callback w2 = ((fo) this.a).w();
            if (w2 != null) {
                w2.onMenuOpened(108, ijVar);
            }
            return true;
        }
        if (ijVar == ijVar.a()) {
            fo foVar = (fo) this.a;
            if (foVar.z && (w = foVar.w()) != null && !((fo) this.a).G) {
                w.onMenuOpened(108, ijVar);
            }
        }
        return true;
    }
}
