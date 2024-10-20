package defpackage;

import android.view.View;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class eyr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ eyr(int i, View view, int i2, int i3) {
        this.d = i3;
        this.a = i;
        this.c = view;
        this.b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                aalt aaltVar = (aalt) this.c;
                                yjy yjyVar = (yjy) aaltVar.D.b();
                                String str = "1234567654321" + this.b;
                                StringBuilder sb = new StringBuilder("Fake sim ");
                                int i2 = this.a;
                                sb.append(i2);
                                yjyVar.s(i2, str, i2, sb.toString(), a.bV(i2, "Fake carrier "), ((msk) aaltVar.aC.b()).c("425-555-1212", new xyn(19)), i2, Optional.empty());
                                ((uhc) aaltVar.X.b()).b();
                                return;
                            }
                            zri zriVar = (zri) this.c;
                            if (zriVar.y.g()) {
                                int i3 = this.b;
                                int i4 = this.a;
                                if (i4 <= 0 && i3 > 0) {
                                    zri.a.p("Hiding attachment container and subject view.");
                                    zriVar.e.E().g();
                                    if (zriVar.o.hasFocus()) {
                                        zriVar.A();
                                        return;
                                    } else {
                                        zriVar.z();
                                        return;
                                    }
                                }
                                if (i3 <= zriVar.c() && i4 > zriVar.c()) {
                                    if (zriVar.ad()) {
                                        zri.a.p("Showing subject view.");
                                        zriVar.P(false);
                                    }
                                    if (zriVar.y.g() && uvl.m((rsr) zriVar.y.a())) {
                                        zri.a.p("Showing attachment container.");
                                        zriVar.e.E().j();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        maq maqVar = (maq) ((rye) this.c).b.b();
                        amfq amfqVar = (amfq) amfr.a.createBuilder();
                        aozy createBuilder = amhk.a.createBuilder();
                        if (!createBuilder.b.isMutable()) {
                            createBuilder.u();
                        }
                        int i5 = this.a;
                        apag apagVar = createBuilder.b;
                        amhk amhkVar = (amhk) apagVar;
                        amhkVar.c = i5 - 1;
                        amhkVar.b |= 1;
                        if (!apagVar.isMutable()) {
                            createBuilder.u();
                        }
                        int i6 = this.b;
                        amhk amhkVar2 = (amhk) createBuilder.b;
                        amhkVar2.d = i6 - 1;
                        amhkVar2.b = 2 | amhkVar2.b;
                        if (!amfqVar.b.isMutable()) {
                            amfqVar.u();
                        }
                        amfr amfrVar = (amfr) amfqVar.b;
                        amhk amhkVar3 = (amhk) createBuilder.s();
                        amhkVar3.getClass();
                        amfrVar.G = amhkVar3;
                        amfrVar.b |= Integer.MIN_VALUE;
                        amfp amfpVar = amfp.BUGLE_PARTICIPANTS_TABLE;
                        if (!amfqVar.b.isMutable()) {
                            amfqVar.u();
                        }
                        amfr amfrVar2 = (amfr) amfqVar.b;
                        amfrVar2.i = amfpVar.dg;
                        amfrVar2.b = 1 | amfrVar2.b;
                        maqVar.k(amfqVar, amrs.BUGLE_PARTICIPANTS_TABLE);
                        return;
                    }
                    int i7 = this.b;
                    int i8 = this.a;
                    rph rphVar = (rph) this.c;
                    rphVar.a(a.cb(i8, "batch ", " inner time"), rjt.c("BatchedRestoreTableWriter::restoreTable#innerTime", new rpg(rphVar, i8, i7, 1)));
                    return;
                }
                int i9 = this.a;
                Object obj = this.c;
                if (i9 != 0) {
                    ((View) obj).setTranslationX(brg.a);
                }
                if (this.b != 0) {
                    ((View) obj).setTranslationY(brg.a);
                    return;
                }
                return;
            }
            ((eyh) this.c).a.c.d(this.a, this.b);
            return;
        }
        ((eys) this.c).b.a.d(this.a, this.b);
    }

    public /* synthetic */ eyr(Object obj, int i, int i2, int i3) {
        this.d = i3;
        this.c = obj;
        this.a = i;
        this.b = i2;
    }
}
