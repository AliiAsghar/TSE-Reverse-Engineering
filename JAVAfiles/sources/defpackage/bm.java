package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bm {
    public final du a;

    public bm(du duVar) {
        this.a = duVar;
    }

    public final boolean b() {
        int i;
        View view = this.a.a.Q;
        if (view != null) {
            i = a.bs(view);
        } else {
            i = 0;
        }
        int i2 = this.a.h;
        if (i != i2 && (i == 2 || i2 == 2)) {
            return false;
        }
        return true;
    }
}
