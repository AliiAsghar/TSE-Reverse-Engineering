package defpackage;

import android.os.Build;
import android.view.View;
import defpackage.cga;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgf extends cga.c {
    public boolean a;
    private final boolean c = true;
    public boolean b = true;

    @Override // cga.c
    public final void dQ() {
        if (this.b) {
            if (this.a) {
                csg.c("invalid sensitive content state");
            }
            cwp.g(this).p();
            this.a = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cgf)) {
            return false;
        }
        boolean z = ((cgf) obj).c;
        return true;
    }

    public final int hashCode() {
        return a.v(true);
    }

    @Override // cga.c
    public final void s() {
        if (this.a) {
            Object g = cwp.g(this);
            if (Build.VERSION.SDK_INT >= 35) {
                if (((dai) g).Q == 1) {
                    dbc.a.a((View) g, false);
                }
                r1.Q--;
            }
            this.a = false;
        }
    }

    public final String toString() {
        return "SensitiveContentNode(_isContentSensitive=true)";
    }
}
