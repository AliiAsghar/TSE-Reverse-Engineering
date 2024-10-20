package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxm implements aerg, kkl {
    private static final ahka a = new ahka("GlideLoadLatency");
    private final ahqr b;
    private final ConcurrentHashMap c;

    public jxm(ahqr ahqrVar) {
        ahqrVar.getClass();
        this.b = ahqrVar;
        this.c = new ConcurrentHashMap();
    }

    @Override // defpackage.aerg
    public final void b(hpp hppVar, Object obj) {
        if ((obj instanceof Uri) && this.c.containsKey(obj)) {
            this.b.f((ahqq) this.c.remove(obj), a, null, ahqp.ERROR);
        }
    }

    @Override // defpackage.aerg
    public final void c(Uri uri) {
        if (uri != null) {
            this.c.put(uri, this.b.d());
        }
    }

    @Override // defpackage.kkl, java.lang.AutoCloseable
    public final void close() {
        for (Object obj : this.c.values()) {
            obj.getClass();
            this.b.f((ahqq) obj, a, null, ahqp.CANCEL);
        }
        this.c.clear();
    }

    @Override // defpackage.aerg
    public final void d(Drawable drawable, Object obj) {
        if ((obj instanceof Uri) && this.c.containsKey(obj)) {
            this.b.f((ahqq) this.c.remove(obj), a, null, ahqp.SUCCESS);
        }
    }

    @Override // defpackage.aerg
    public final /* synthetic */ void a(Uri uri, int i, int i2) {
    }
}
