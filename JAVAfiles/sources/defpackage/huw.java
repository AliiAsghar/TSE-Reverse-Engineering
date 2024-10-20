package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huw implements hpt {
    private final /* synthetic */ int a;
    private final Object b;

    public huw(Bitmap bitmap, int i) {
        this.a = i;
        this.b = bitmap;
    }

    @Override // defpackage.hpt
    public final int a() {
        int intrinsicWidth;
        int intrinsicHeight;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                Object obj = this.b;
                intrinsicWidth = cok$$ExternalSyntheticApiModelOutline0.m137m(obj).getIntrinsicWidth();
                intrinsicHeight = cok$$ExternalSyntheticApiModelOutline0.m137m(obj).getIntrinsicHeight();
                int c = intrinsicWidth * intrinsicHeight * hyv.c(Bitmap.Config.ARGB_8888);
                return c + c;
            }
            return hyv.a((Bitmap) this.b);
        }
        return ((byte[]) this.b).length;
    }

    @Override // defpackage.hpt
    public final Class b() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return Drawable.class;
            }
            return Bitmap.class;
        }
        return byte[].class;
    }

    @Override // defpackage.hpt
    public final /* synthetic */ Object c() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return this.b;
            }
            return this.b;
        }
        return this.b;
    }

    @Override // defpackage.hpt
    public final void e() {
        int i = this.a;
        if (i != 0 && i != 1) {
            cok$$ExternalSyntheticApiModelOutline0.m137m(this.b).stop();
            cok$$ExternalSyntheticApiModelOutline0.m137m(this.b).clearAnimationCallbacks();
        }
    }

    public huw(AnimatedImageDrawable animatedImageDrawable, int i) {
        this.a = i;
        this.b = animatedImageDrawable;
    }

    public huw(byte[] bArr, int i) {
        this.a = i;
        hwr.i(bArr);
        this.b = bArr;
    }
}
