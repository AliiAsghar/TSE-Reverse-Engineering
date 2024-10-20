package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajke implements ajkg {
    private final ajkg a;
    private final float b;

    public ajke(float f, ajkg ajkgVar) {
        while (ajkgVar instanceof ajke) {
            ajkgVar = ((ajke) ajkgVar).a;
            f += ((ajke) ajkgVar).b;
        }
        this.a = ajkgVar;
        this.b = f;
    }

    @Override // defpackage.ajkg
    public final float a(RectF rectF) {
        return Math.max(brg.a, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajke)) {
            return false;
        }
        ajke ajkeVar = (ajke) obj;
        if (this.a.equals(ajkeVar.a) && this.b == ajkeVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
