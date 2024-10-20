package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfx extends hfw {
    public boolean j;
    private hcw k;
    private final List l;
    private final RectF m;
    private final RectF n;

    public hfx(hbl hblVar, hfz hfzVar, List list, hbb hbbVar) {
        super(hblVar, hfzVar);
        hfw hfwVar;
        hfw hfxVar;
        String str;
        this.l = new ArrayList();
        this.m = new RectF();
        this.n = new RectF();
        new Paint();
        this.j = true;
        heu heuVar = hfzVar.q;
        if (heuVar != null) {
            hcw a = heuVar.a();
            this.k = a;
            i(a);
            this.k.h(this);
        } else {
            this.k = null;
        }
        uj ujVar = new uj(hbbVar.g.size());
        int size = list.size() - 1;
        hfw hfwVar2 = null;
        while (true) {
            if (size >= 0) {
                hfz hfzVar2 = (hfz) list.get(size);
                int i = hfzVar2.t;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4) {
                                        if (i2 != 5) {
                                            switch (i) {
                                                case 1:
                                                    str = "PRE_COMP";
                                                    break;
                                                case 2:
                                                    str = "SOLID";
                                                    break;
                                                case 3:
                                                    str = "IMAGE";
                                                    break;
                                                case 4:
                                                    str = "NULL";
                                                    break;
                                                case 5:
                                                    str = "SHAPE";
                                                    break;
                                                case 6:
                                                    str = "TEXT";
                                                    break;
                                                default:
                                                    str = "UNKNOWN";
                                                    break;
                                            }
                                            hhw.a("Unknown layer type ".concat(str));
                                            hfxVar = null;
                                        } else {
                                            hfxVar = new hgf(hblVar, hfzVar2);
                                        }
                                    } else {
                                        hfxVar = new hgb(hblVar, hfzVar2, this, hbbVar);
                                    }
                                } else {
                                    hfxVar = new hga(hblVar, hfzVar2);
                                }
                            } else {
                                hfxVar = new hfy(hblVar, hfzVar2);
                            }
                        } else {
                            hfxVar = new hgc(hblVar, hfzVar2);
                        }
                    } else {
                        hfxVar = new hfx(hblVar, hfzVar2, (List) hbbVar.a.get(hfzVar2.f), hbbVar);
                    }
                    if (hfxVar != null) {
                        ujVar.h(hfxVar.c.d, hfxVar);
                        if (hfwVar2 != null) {
                            hfwVar2.e = hfxVar;
                            hfwVar2 = null;
                        } else {
                            this.l.add(0, hfxVar);
                            int i3 = hfzVar2.u;
                            int i4 = i3 - 1;
                            if (i3 != 0) {
                                if (i4 == 1 || i4 == 2) {
                                    hfwVar2 = hfxVar;
                                }
                            } else {
                                throw null;
                            }
                        }
                    }
                    size--;
                } else {
                    throw null;
                }
            } else {
                for (int i5 = 0; i5 < ujVar.b(); i5++) {
                    hfw hfwVar3 = (hfw) ujVar.d(ujVar.c(i5));
                    if (hfwVar3 != null && (hfwVar = (hfw) ujVar.d(hfwVar3.c.e)) != null) {
                        hfwVar3.f = hfwVar;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.hfw, defpackage.hep
    public final void a(Object obj, hig higVar) {
        super.a(obj, higVar);
        if (obj == hbq.E) {
            if (higVar == null) {
                hcw hcwVar = this.k;
                if (hcwVar != null) {
                    hcwVar.d = null;
                    return;
                }
                return;
            }
            hdn hdnVar = new hdn(higVar);
            this.k = hdnVar;
            hdnVar.h(this);
            i(this.k);
        }
    }

    @Override // defpackage.hfw, defpackage.hcb
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        int size = this.l.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.m.set(brg.a, brg.a, brg.a, brg.a);
                ((hfw) this.l.get(size)).c(this.m, this.a, true);
                rectF.union(this.m);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.hfw
    public final void j(Canvas canvas, Matrix matrix, int i) {
        hfz hfzVar = this.c;
        this.n.set(brg.a, brg.a, hfzVar.n, hfzVar.o);
        matrix.mapRect(this.n);
        canvas.save();
        int size = this.l.size();
        while (true) {
            size--;
            if (size >= 0) {
                if ((!this.j && "__container".equals(this.c.c)) || this.n.isEmpty() || canvas.clipRect(this.n)) {
                    ((hfw) this.l.get(size)).b(canvas, matrix, i);
                }
            } else {
                canvas.restore();
                hav.a();
                return;
            }
        }
    }

    @Override // defpackage.hfw
    public final void l(heo heoVar, int i, List list, heo heoVar2) {
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            ((hfw) this.l.get(i2)).e(heoVar, i, list, heoVar2);
        }
    }

    @Override // defpackage.hfw
    public final void m(float f) {
        super.m(f);
        if (this.k != null) {
            f = ((((Float) this.k.e()).floatValue() * this.c.b.k) - this.c.b.i) / (this.b.a.b() + 0.01f);
        }
        if (this.k == null) {
            hfz hfzVar = this.c;
            f -= hfzVar.m / hfzVar.b.b();
        }
        hfz hfzVar2 = this.c;
        if (hfzVar2.l != brg.a && !"__container".equals(hfzVar2.c)) {
            f /= this.c.l;
        }
        int size = this.l.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((hfw) this.l.get(size)).m(f);
            } else {
                return;
            }
        }
    }
}
