package defpackage;

import androidx.compose.animation.SharedBoundsNodeElement;
import defpackage.abt;
import defpackage.bwj;
import defpackage.yg;

/* compiled from: PG */
/* loaded from: classes.dex */
final class yn extends arrp implements arqw<cga, bwj, Integer, cga> {
    final /* synthetic */ yg.d a;
    final /* synthetic */ abt b;
    final /* synthetic */ arqr c;
    final /* synthetic */ yi d;
    final /* synthetic */ yg.b e;
    final /* synthetic */ yg.a f;
    final /* synthetic */ wm g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(yg.d dVar, abt abtVar, arqr arqrVar, yi yiVar, yg.b bVar, yg.a aVar, wm wmVar) {
        super(3);
        this.a = dVar;
        this.b = abtVar;
        this.c = arqrVar;
        this.d = yiVar;
        this.e = bVar;
        this.f = aVar;
        this.g = wmVar;
    }

    @Override // defpackage.arqw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        abt b;
        boolean z;
        boolean z2;
        cga cgaVar = (cga) obj;
        bwj bwjVar = (bwj) obj2;
        ((Number) obj3).intValue();
        bwjVar.y(-1843478929);
        Object obj4 = this.a.a;
        bwjVar.x(-359668628, obj4);
        Object h = bwjVar.h();
        if (h == bwj.a.a) {
            yi yiVar = this.d;
            yd ydVar = (yd) yiVar.i.a(obj4);
            if (ydVar == null) {
                ydVar = new yd(yiVar);
                yiVar.i.j(obj4, ydVar);
            }
            h = ydVar;
            bwjVar.B(h);
        }
        yd ydVar2 = (yd) h;
        bwjVar.x(-359664815, this.b);
        if (this.b != null) {
            bwjVar.y(1735343744);
            abt abtVar = this.b;
            arqr arqrVar = this.c;
            boolean G = bwjVar.G(abtVar);
            Object h2 = bwjVar.h();
            if (G || h2 == bwj.a.a) {
                h2 = abtVar.e();
                bwjVar.B(h2);
            }
            if (abtVar.t()) {
                h2 = abtVar.e();
            }
            bwjVar.y(1329676753);
            Boolean bool = (Boolean) arqrVar.a(h2);
            bool.booleanValue();
            bwjVar.q();
            Object f = abtVar.f();
            bwjVar.y(1329676753);
            Boolean bool2 = (Boolean) arqrVar.a(f);
            bool2.booleanValue();
            bwjVar.q();
            b = aby.a(abtVar, bool, bool2, (String) obj4, bwjVar, 0);
            bwjVar.q();
        } else {
            bwjVar.y(1735594379);
            arqr arqrVar2 = this.c;
            arsd.g(arqrVar2, 1);
            Boolean bool3 = (Boolean) arqrVar2.a(arnb.a);
            boolean booleanValue = bool3.booleanValue();
            Object h3 = bwjVar.h();
            if (h3 == bwj.a.a) {
                if (ydVar2.a() != null) {
                    if (!booleanValue) {
                        booleanValue = true;
                    } else {
                        booleanValue = false;
                    }
                }
                h3 = new abd(Boolean.valueOf(booleanValue));
                bwjVar.B(h3);
            }
            abd abdVar = (abd) h3;
            abdVar.d(bool3);
            b = aby.b(abdVar, null, bwjVar, 0, 2);
            bwjVar.q();
        }
        bwjVar.x(-359602162, Boolean.valueOf(this.d.a()));
        abt.a f2 = aby.f(b, aci.i, bwjVar, 0);
        bwjVar.o();
        boolean G2 = bwjVar.G(b);
        yi yiVar2 = this.d;
        wm wmVar = this.g;
        Object h4 = bwjVar.h();
        if (G2 || h4 == bwj.a.a) {
            h4 = new wk(yiVar2, b, f2, wmVar);
            bwjVar.B(h4);
        }
        wm wmVar2 = this.g;
        wk wkVar = (wk) h4;
        if (!d.F(wkVar.a(), f2)) {
            wkVar.b.h(f2);
            wkVar.e(null);
            wkVar.d = wl.a;
        }
        wkVar.c.h(wmVar2);
        bwjVar.o();
        yg.b bVar = this.e;
        yg.d dVar = this.a;
        yg.a aVar = this.f;
        Object h5 = bwjVar.h();
        if (h5 == bwj.a.a) {
            z = false;
            z2 = true;
            h5 = new ye(ydVar2, wkVar, bVar, aVar, dVar);
            bwjVar.B(h5);
        } else {
            z = false;
            z2 = true;
        }
        ye yeVar = (ye) h5;
        dVar.b.h(yeVar);
        yeVar.c.h(ydVar2);
        yeVar.f.h(Boolean.valueOf(z));
        yeVar.d.h(wkVar);
        yeVar.e.h(bVar);
        yeVar.g.h(aVar);
        yeVar.a.d(brg.a);
        yeVar.b.h(Boolean.valueOf(z2));
        yeVar.h.h(dVar);
        bwjVar.o();
        cga a = cgaVar.a(new SharedBoundsNodeElement(yeVar));
        bwjVar.q();
        return a;
    }
}
