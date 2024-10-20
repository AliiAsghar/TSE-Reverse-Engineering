package defpackage;

import android.content.res.Resources;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hrn implements hns {
    private final Resources.Theme a;
    private final Resources b;
    private final hro c;
    private final int d;
    private Object e;

    public hrn(Resources.Theme theme, Resources resources, hro hroVar, int i) {
        this.a = theme;
        this.b = resources;
        this.c = hroVar;
        this.d = i;
    }

    @Override // defpackage.hns
    public final Class a() {
        return this.c.a();
    }

    @Override // defpackage.hns
    public final void d() {
        Object obj = this.e;
        if (obj != null) {
            try {
                this.c.d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.hns
    public final void f(hlh hlhVar, hnr hnrVar) {
        try {
            Object c = this.c.c(this.a, this.b, this.d);
            this.e = c;
            hnrVar.b(c);
        } catch (Resources.NotFoundException e) {
            hnrVar.e(e);
        }
    }

    @Override // defpackage.hns
    public final int g() {
        return 1;
    }

    @Override // defpackage.hns
    public final void eX() {
    }
}
