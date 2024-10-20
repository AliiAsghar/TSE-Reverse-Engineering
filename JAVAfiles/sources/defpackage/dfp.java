package defpackage;

import android.R;
import android.view.Menu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dfp {
    public final arqg a;
    public cjp b;
    public arqg c;
    public arqg d;
    public arqg e;
    public arqg f;

    public dfp() {
        this(null, 63);
    }

    public static final void a(Menu menu, dfo dfoVar) {
        int i;
        dfo dfoVar2 = dfo.a;
        int ordinal = dfoVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        i = R.string.selectAll;
                    } else {
                        throw new armm();
                    }
                } else {
                    i = R.string.cut;
                }
            } else {
                i = R.string.paste;
            }
        } else {
            i = R.string.copy;
        }
        menu.add(0, dfoVar.e, dfoVar.f, i).setShowAsAction(1);
    }

    public static final void b(Menu menu, dfo dfoVar, arqg arqgVar) {
        if (arqgVar != null && menu.findItem(dfoVar.e) == null) {
            a(menu, dfoVar);
        } else if (arqgVar == null && menu.findItem(dfoVar.e) != null) {
            menu.removeItem(dfoVar.e);
        }
    }

    public /* synthetic */ dfp(arqg arqgVar, int i) {
        cjp cjpVar = cjp.a;
        this.a = 1 == (i & 1) ? null : arqgVar;
        this.b = cjpVar;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
