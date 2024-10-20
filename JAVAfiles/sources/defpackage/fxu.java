package defpackage;

import android.graphics.Bitmap;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fxu implements fwt {
    private final esk a;
    private final List b;
    private final AtomicLong c = new AtomicLong();

    public fxu(esk eskVar, List list) {
        this.a = eskVar;
        this.b = list;
    }

    @Override // defpackage.fxa
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.fxa
    public final Surface b() {
        return this.a.b();
    }

    @Override // defpackage.fxa
    public final /* synthetic */ ewl c() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.fwz
    public final void e(fvz fvzVar, long j, eqn eqnVar, boolean z) {
        int i;
        int i2;
        String scheme;
        int i3 = 1;
        d.s(!fvzVar.b());
        erb erbVar = fvzVar.a.b;
        boolean z2 = false;
        if (erbVar != null && (scheme = erbVar.a.getScheme()) != null) {
            z2 = scheme.equals("transformer_surface_asset");
        }
        long a = fvzVar.a(j);
        if (eqnVar != null) {
            int i4 = eqnVar.y % 180;
            if (i4 == 0) {
                i = eqnVar.v;
            } else {
                i = eqnVar.w;
            }
            if (i4 == 0) {
                i2 = eqnVar.w;
            } else {
                i2 = eqnVar.v;
            }
            eug eugVar = new eug(i, i2);
            alob alobVar = new alob();
            alobVar.j(fvzVar.g.c);
            alobVar.j(this.b);
            alog g = alobVar.g();
            esk eskVar = this.a;
            if (z2) {
                i3 = 4;
            } else {
                String str = eqnVar.o;
                dzg.g(str);
                if (erl.h(str)) {
                    i3 = 2;
                } else if (str.equals("video/raw")) {
                    i3 = 3;
                } else if (!erl.j(str)) {
                    throw new IllegalArgumentException("MIME type not supported ".concat(str));
                }
            }
            eqd eqdVar = eqnVar.C;
            dzg.g(eqdVar);
            eskVar.c(i3, g, new eqo(eqdVar, eugVar.b, eugVar.c, eqnVar.z, this.c.get()));
        }
        this.c.addAndGet(a);
    }

    @Override // defpackage.fxa
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.fxa
    public final int h(Bitmap bitmap, etl etlVar) {
        if (this.a.h(bitmap, etlVar)) {
            return 1;
        }
        return 2;
    }

    @Override // defpackage.fxa
    public final boolean i() {
        return this.a.g();
    }

    @Override // defpackage.fxa
    public final /* synthetic */ void j() {
        throw new UnsupportedOperationException();
    }
}
