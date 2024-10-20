package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ajku extends ajla {
    final /* synthetic */ List a;
    final /* synthetic */ Matrix b;

    public ajku(List list, Matrix matrix) {
        this.a = list;
        this.b = matrix;
    }

    @Override // defpackage.ajla
    public final void a(Matrix matrix, ajkc ajkcVar, int i, Canvas canvas) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ajla) it.next()).a(this.b, ajkcVar, i, canvas);
        }
    }
}
