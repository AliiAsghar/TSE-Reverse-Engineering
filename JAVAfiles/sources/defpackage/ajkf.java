package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajkf implements ajkg {
    private final float a;

    public ajkf(float f) {
        this.a = f;
    }

    @Override // defpackage.ajkg
    public final float a(RectF rectF) {
        return dze.b(this.a, brg.a, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ajkf) && this.a == ((ajkf) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
