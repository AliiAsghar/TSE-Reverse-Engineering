package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ufh extends ufu {
    public static final xze a = xze.g("Bugle", "DecodedImageResource");
    public boolean b;
    public final yfo c;
    private Bitmap j;

    public ufh(String str, Bitmap bitmap, int i, xnv xnvVar, yfo yfoVar) {
        super(str, i, xnvVar);
        this.b = true;
        this.j = bitmap;
        this.c = yfoVar;
    }

    @Override // defpackage.ugg
    public final int a() {
        o();
        try {
            xyl.l(this.j);
            return this.j.getAllocationByteCount();
        } finally {
            r();
        }
    }

    @Override // defpackage.ugg
    protected final void b() {
        o();
        try {
            Bitmap bitmap = this.j;
            if (bitmap != null) {
                bitmap.recycle();
                this.j = null;
            }
        } finally {
            r();
        }
    }

    @Override // defpackage.ufu
    public final int c() {
        return this.d;
    }

    @Override // defpackage.ufu
    public final Bitmap d() {
        o();
        try {
            return this.j;
        } finally {
            r();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0021, code lost:
    
        throw r0;
     */
    @Override // defpackage.ufu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap e() {
        /*
            r2 = this;
            r2.o()
            r2.o()     // Catch: java.lang.Throwable -> L1d
            int r0 = r2.f     // Catch: java.lang.Throwable -> L18
            r1 = 1
            defpackage.xyl.a(r1, r0)     // Catch: java.lang.Throwable -> L18
            r2.r()     // Catch: java.lang.Throwable -> L1d
            android.graphics.Bitmap r0 = r2.j     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            r2.j = r1     // Catch: java.lang.Throwable -> L1d
            r2.r()
            return r0
        L18:
            r0 = move-exception
            r2.r()     // Catch: java.lang.Throwable -> L1d
            throw r0     // Catch: java.lang.Throwable -> L1d
        L1d:
            r0 = move-exception
            r2.r()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ufh.e():android.graphics.Bitmap");
    }

    @Override // defpackage.ufu
    public final Drawable f(Resources resources) {
        Drawable bitmapDrawable;
        o();
        try {
            int i = this.d;
            Bitmap bitmap = this.j;
            bitmap.getClass();
            if (i != 1 && i != 0) {
                bitmapDrawable = new yth(i, resources, bitmap);
                return bitmapDrawable;
            }
            bitmapDrawable = new BitmapDrawable(resources, bitmap);
            return bitmapDrawable;
        } finally {
            r();
        }
    }

    @Override // defpackage.ugg
    public final ufw g(ufw ufwVar) {
        xyl.f(false);
        Bitmap d = d();
        d.getClass();
        if (d.hasAlpha()) {
            return null;
        }
        return new ufg(this, ufwVar);
    }

    @Override // defpackage.ugg
    public final boolean h() {
        return this.b;
    }

    @Override // defpackage.ufu
    public final boolean i() {
        return true;
    }

    @Override // defpackage.ufu
    public final byte[] j() {
        byte[] bArr;
        o();
        try {
            try {
                bArr = this.c.m(this.j, 100);
            } catch (Exception e) {
                a.n("Error trying to get the bitmap bytes.", e);
                bArr = null;
            }
            return bArr;
        } finally {
            r();
        }
    }
}
