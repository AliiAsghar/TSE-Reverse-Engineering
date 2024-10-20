package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class fav implements fas {
    public final fgq a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public fav(fgx fgxVar, boolean z) {
        this.a = new fgq(fgxVar, z);
    }

    @Override // defpackage.fas
    public final erz a() {
        return this.a.d;
    }

    @Override // defpackage.fas
    public final Object b() {
        return this.b;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}
