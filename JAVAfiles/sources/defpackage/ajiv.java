package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ajiv {
    public final int a;
    public final int b;
    public int[] c;
    public int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;

    /* JADX INFO: Access modifiers changed from: protected */
    public ajiv(Context context, AttributeSet attributeSet) {
        this.c = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray a = ajig.a(context, attributeSet, ajjs.a, R.attr.circularProgressIndicatorStyle, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        int c = ajki.c(context, a, 9, dimensionPixelSize);
        this.a = c;
        this.b = Math.min(ajki.c(context, a, 8, 0), Math.round(c / 2.0f));
        this.e = a.getInt(5, 0);
        this.f = a.getInt(1, 0);
        this.g = a.getDimensionPixelSize(3, 0);
        int abs = Math.abs(a.getDimensionPixelSize(12, 0));
        this.h = Math.abs(a.getDimensionPixelSize(13, abs));
        this.i = Math.abs(a.getDimensionPixelSize(14, abs));
        this.j = Math.abs(a.getDimensionPixelSize(10, 0));
        this.k = a.getDimensionPixelSize(11, 0);
        if (!a.hasValue(2)) {
            this.c = new int[]{ahnz.e(context, R.attr.colorPrimary, -1)};
        } else if (a.peekValue(2).type != 1) {
            this.c = new int[]{a.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(a.getResourceId(2, -1));
            this.c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (a.hasValue(7)) {
            this.d = a.getColor(7, -1);
        } else {
            this.d = this.c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.d = ahnz.c(this.d, (int) (f * 255.0f));
        }
        a.recycle();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (this.g >= 0) {
        } else {
            throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
        }
    }

    public final boolean b(boolean z) {
        if (this.j <= 0) {
            return false;
        }
        if (!z) {
            if (this.i <= 0) {
                return false;
            }
            return true;
        }
        if (this.h <= 0) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (this.f != 0) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        if (this.e != 0) {
            return true;
        }
        return false;
    }
}
