package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgb extends hfw {
    private final hca j;
    private final hfx k;

    public hgb(hbl hblVar, hfz hfzVar, hfx hfxVar, hbb hbbVar) {
        super(hblVar, hfzVar);
        this.k = hfxVar;
        hca hcaVar = new hca(hblVar, this, new hfr("__container", hfzVar.a, false), hbbVar);
        this.j = hcaVar;
        hcaVar.f(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.hfw, defpackage.hcb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.j.c(rectF, this.a, z);
    }

    @Override // defpackage.hfw
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.j.b(canvas, matrix, i);
    }

    @Override // defpackage.hfw
    public final void l(heo heoVar, int i, List list, heo heoVar2) {
        this.j.e(heoVar, i, list, heoVar2);
    }

    @Override // defpackage.hfw
    public final hgi q() {
        hgi q = super.q();
        if (q != null) {
            return q;
        }
        return this.k.q();
    }

    @Override // defpackage.hfw
    public final ifq r() {
        ifq r = super.r();
        if (r != null) {
            return r;
        }
        return this.k.r();
    }
}
