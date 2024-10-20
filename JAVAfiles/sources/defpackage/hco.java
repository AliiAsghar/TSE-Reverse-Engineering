package defpackage;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hco implements hcj, hcr {
    private final boolean b;
    private final hbl c;
    private final hdi d;
    private boolean e;
    private final Path a = new Path();
    private final hgi f = new hgi();

    public hco(hbl hblVar, hfw hfwVar, hfs hfsVar) {
        this.b = hfsVar.b;
        this.c = hblVar;
        hdi a = hfsVar.a.a();
        this.d = a;
        hfwVar.i(a);
        a.h(this);
    }

    @Override // defpackage.hcr
    public final void d() {
        this.e = false;
        this.c.invalidateSelf();
    }

    @Override // defpackage.hbz
    public final void f(List list, List list2) {
        ArrayList arrayList = null;
        for (int i = 0; i < list.size(); i++) {
            hbz hbzVar = (hbz) list.get(i);
            if (hbzVar instanceof hcq) {
                hcq hcqVar = (hcq) hbzVar;
                if (hcqVar.e == 1) {
                    this.f.d(hcqVar);
                    hcqVar.a(this);
                }
            }
            if (hbzVar instanceof hcn) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((hcn) hbzVar);
            }
        }
        this.d.e = arrayList;
    }

    @Override // defpackage.hbz
    public final String g() {
        throw null;
    }

    @Override // defpackage.hcj
    public final Path i() {
        if (!this.e) {
            this.a.reset();
            if (this.b) {
                this.e = true;
                return this.a;
            }
            Path path = (Path) this.d.e();
            if (path != null) {
                this.a.set(path);
                this.a.setFillType(Path.FillType.EVEN_ODD);
                this.f.e(this.a);
                this.e = true;
                return this.a;
            }
        }
        return this.a;
    }
}
