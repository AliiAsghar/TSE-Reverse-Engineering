package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eel implements ecj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ eel(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ecj
    public final Object a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Object obj = this.a;
                    saw c = sax.c();
                    rrt rrtVar = (rrt) obj;
                    int ordinal = rrtVar.c.ordinal();
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            c.b = true;
                        } else {
                            c.c = true;
                        }
                    } else {
                        c.a = true;
                    }
                    c.e = Boolean.valueOf(rrtVar.j());
                    if (uzz.g() && rrtVar.j()) {
                        c.b(true);
                    }
                    if (rrtVar.d.isPresent()) {
                        ((Boolean) rrtVar.d.get()).booleanValue();
                        c.d = true;
                    }
                    return c.a().a();
                }
                Object obj2 = this.a;
                saw c2 = sak.c();
                rrt rrtVar2 = (rrt) obj2;
                int ordinal2 = rrtVar2.c.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 != 2) {
                        c2.b = true;
                    } else {
                        c2.c = true;
                    }
                } else {
                    c2.a = true;
                }
                c2.e = Boolean.valueOf(rrtVar2.j());
                if (uzz.g() && rrtVar2.j()) {
                    c2.d(true);
                }
                if (rrtVar2.d.isPresent()) {
                    ((Boolean) rrtVar2.d.get()).booleanValue();
                    c2.d = true;
                }
                return c2.c().a();
            }
            return Integer.valueOf(((ViewConfiguration) this.a).getScaledMaximumFlingVelocity());
        }
        return Integer.valueOf(((ViewConfiguration) this.a).getScaledMinimumFlingVelocity());
    }
}
