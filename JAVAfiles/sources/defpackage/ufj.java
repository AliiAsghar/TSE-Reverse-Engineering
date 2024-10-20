package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.android.apps.messaging.R;
import defpackage.ufi;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ufj {
    public final Paint a;
    public final Rect b;
    public int c;
    private final int f;
    private static final String e = new StringBuilder().appendCodePoint(128522).toString();
    public static final ugc d = new ugc();

    public ufj(Context context) {
        Paint paint = new Paint(1);
        this.a = paint;
        this.b = new Rect();
        int color = context.getColor(R.color.google_grey900);
        this.f = color;
        ((ufi.a) akec.w(context, ufi.a.class)).b();
        paint.setColor(color);
    }

    private final void b(int i) {
        this.a.setTextSize(i);
        String str = e;
        this.a.getTextBounds(str, 0, str.length(), this.b);
    }

    public final synchronized void a(int i) {
        if (i == this.c) {
            return;
        }
        this.c = i;
        int i2 = i + 1;
        int i3 = 0;
        while (i2 - i3 > 1) {
            int i4 = (i3 + i2) / 2;
            b(i4);
            float measureText = this.a.measureText(e);
            int height = this.b.height();
            int i5 = this.c;
            if (height <= i5 && measureText <= i5) {
                i3 = i4;
            }
            i2 = i4;
        }
        b(i3);
    }
}
