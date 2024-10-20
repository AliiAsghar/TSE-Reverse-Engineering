package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcn implements aerg {
    final /* synthetic */ kcr a;

    public kcn(kcr kcrVar) {
        this.a = kcrVar;
    }

    @Override // defpackage.aerg
    public final void a(Uri uri, int i, int i2) {
        this.a.i.a(uri, i, i2);
    }

    @Override // defpackage.aerg
    public final void b(hpp hppVar, Object obj) {
        ascd ascdVar;
        this.a.i.b(hppVar, obj);
        if (this.a.k.a() && (obj instanceof Uri) && (ascdVar = (ascd) this.a.p.get(obj)) != null) {
            ascdVar.f(true);
        }
        this.a.j.a(hppVar, obj, 1);
        if (this.a.m.a()) {
            this.a.l.b(hppVar, obj);
        }
    }

    @Override // defpackage.aerg
    public final void c(Uri uri) {
        if (this.a.m.a()) {
            this.a.l.c(uri);
        }
    }

    @Override // defpackage.aerg
    public final void d(Drawable drawable, Object obj) {
        this.a.i.d(drawable, obj);
        if (this.a.m.a()) {
            this.a.l.d(drawable, obj);
        }
    }
}
