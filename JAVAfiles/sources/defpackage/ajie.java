package defpackage;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajie {
    public final TextPaint a = new TextPaint(1);
    public final ajka b = new ajic(this);
    public boolean c = true;
    public WeakReference d;
    public ajjz e;
    private float f;

    public ajie(ajid ajidVar) {
        this.d = new WeakReference(null);
        this.d = new WeakReference(ajidVar);
    }

    public final float a(String str) {
        float measureText;
        if (this.c) {
            if (str == null) {
                measureText = brg.a;
            } else {
                measureText = this.a.measureText((CharSequence) str, 0, str.length());
            }
            this.f = measureText;
            if (str != null) {
                Math.abs(this.a.getFontMetrics().ascent);
            }
            this.c = false;
            return this.f;
        }
        return this.f;
    }
}
