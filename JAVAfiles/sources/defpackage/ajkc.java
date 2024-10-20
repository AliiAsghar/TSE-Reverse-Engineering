package defpackage;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajkc {
    public static final int[] a = new int[3];
    public static final float[] b = {brg.a, 0.5f, 1.0f};
    public static final int[] c = new int[4];
    public static final float[] d = {brg.a, brg.a, 0.5f, 1.0f};
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public int h;
    public int i;
    public int j;
    public final Path k = new Path();
    public final Paint l;

    public ajkc() {
        Paint paint = new Paint();
        this.l = paint;
        this.e = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.g = new Paint(paint2);
    }

    public final void a(int i) {
        this.h = eap.h(i, 68);
        this.i = eap.h(i, 20);
        this.j = eap.h(i, 0);
        this.e.setColor(this.h);
    }
}
