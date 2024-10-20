package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huh implements hpt, hpq {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;

    public huh(Bitmap bitmap, hqa hqaVar, int i) {
        this.a = i;
        d.aB(bitmap, "Bitmap must not be null");
        this.b = bitmap;
        d.aB(hqaVar, "BitmapPool must not be null");
        this.c = hqaVar;
    }

    public static hpt f(Resources resources, hpt hptVar) {
        if (hptVar == null) {
            return null;
        }
        return new huh(resources, hptVar, 0);
    }

    public static huh g(Bitmap bitmap, hqa hqaVar) {
        if (bitmap == null) {
            return null;
        }
        return new huh(bitmap, hqaVar, 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, hpt] */
    @Override // defpackage.hpt
    public final int a() {
        if (this.a != 0) {
            return hyv.a((Bitmap) this.b);
        }
        return this.c.a();
    }

    @Override // defpackage.hpt
    public final Class b() {
        if (this.a != 0) {
            return Bitmap.class;
        }
        return BitmapDrawable.class;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, hpt] */
    @Override // defpackage.hpt
    public final /* synthetic */ Object c() {
        if (this.a != 0) {
            return this.b;
        }
        return new BitmapDrawable((Resources) this.b, (Bitmap) this.c.c());
    }

    @Override // defpackage.hpq
    public final void d() {
        if (this.a != 0) {
            ((Bitmap) this.b).prepareToDraw();
            return;
        }
        Object obj = this.c;
        if (obj instanceof hpq) {
            ((hpq) obj).d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, hpt] */
    /* JADX WARN: Type inference failed for: r0v2, types: [hqa, java.lang.Object] */
    @Override // defpackage.hpt
    public final void e() {
        if (this.a != 0) {
            this.c.d((Bitmap) this.b);
        } else {
            this.c.e();
        }
    }

    private huh(Resources resources, hpt hptVar, int i) {
        this.a = i;
        hwr.i(resources);
        this.b = resources;
        hwr.i(hptVar);
        this.c = hptVar;
    }
}
