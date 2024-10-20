package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hqb implements hqa {
    @Override // defpackage.hqa
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.hqa
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.hqa
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.hqa
    public final void c() {
    }

    @Override // defpackage.hqa
    public final void e(float f) {
    }

    @Override // defpackage.hqa
    public final void f(int i) {
    }
}
