package defpackage;

import android.net.Uri;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsd {
    public boolean a;
    public boolean b;
    public boolean c;
    private boolean g;
    private gzu f = new gzu((byte[]) null);
    private int i = 1;
    public long d = -1;
    public long e = -1;
    private final Set h = new LinkedHashSet();

    public final gsf a() {
        Set aE = aqjn.aE(this.h);
        return new gsf(this.f, this.i, this.a, this.b, this.g, this.c, this.d, this.e, aE);
    }

    public final void b(Uri uri, boolean z) {
        uri.getClass();
        this.h.add(new gse(uri, z));
    }

    public final void c(int i) {
        this.i = i;
        this.f = new gzu((byte[]) null);
    }

    public final void d() {
        this.g = true;
    }
}
