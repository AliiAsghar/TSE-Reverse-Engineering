package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ufu extends ugg {
    public final int d;

    public ufu(String str, int i, xnv xnvVar) {
        super(str, xnvVar);
        this.d = i;
    }

    public int c() {
        return this.d;
    }

    public abstract Bitmap d();

    public abstract Bitmap e();

    public abstract Drawable f(Resources resources);

    public abstract boolean i();

    public abstract byte[] j();
}
