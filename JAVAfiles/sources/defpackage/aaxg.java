package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaxg implements yjj {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aaxg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.yjj
    public final void a() {
        if (this.b != 0) {
            itb itbVar = (itb) this.a;
            itbVar.ax = null;
            itbVar.an.l();
        }
    }

    @Override // defpackage.yjj
    public final void c() {
        if (this.b != 0) {
            xzb.j("Bugle", "User denied storage permission");
        } else {
            aaxd.a.o("User denied storage permission");
        }
    }

    @Override // defpackage.yjj
    public final void d() {
        if (this.b != 0) {
            if (((itb) this.a).aO.a() == 1) {
                rry rryVar = (rry) ((itb) this.a).aO.b().iterator().next();
                ((itb) this.a).p(rryVar.T());
                return;
            }
            itb itbVar = (itb) this.a;
            ArrayList arrayList = itbVar.ax;
            if (arrayList != null) {
                itbVar.p(arrayList);
                return;
            }
            throw new IllegalStateException("No data for selected message, failed to save attachment");
        }
        ((aaxd) this.a).j();
    }

    @Override // defpackage.yjj
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // defpackage.yjj
    public final /* synthetic */ void b() {
    }
}
