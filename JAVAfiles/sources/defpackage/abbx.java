package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class abbx implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ abbx(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((agvz) ((agwf) this.b).e.a).c(this.a, 3);
                return;
            }
            fyf fyfVar = (fyf) this.b;
            int i2 = fyfVar.e;
            int i3 = this.a;
            if (i3 != i2) {
                fyj fyjVar = fyfVar.f;
                float f = fyfVar.d[i3];
                ert ertVar = fyjVar.D;
                if (ertVar != null && ertVar.l(13)) {
                    ert ertVar2 = fyjVar.D;
                    ero a = ertVar2.F().a(f);
                    fad fadVar = (fad) ertVar2;
                    fadVar.ag();
                    if (!fadVar.A.o.equals(a)) {
                        fay d = fadVar.A.d(a);
                        fadVar.n++;
                        fadVar.e.d.g(4, a).f();
                        fadVar.ae(d, 0, false, 5, -9223372036854775807L, -1, false);
                    }
                }
            }
            fyfVar.f.g.dismiss();
            return;
        }
        int i4 = this.a;
        abby abbyVar = (abby) this.b;
        if (abbyVar.a.isGroupExpanded(i4)) {
            abbyVar.a.collapseGroup(i4);
        } else {
            abbyVar.a.expandGroup(i4);
        }
    }
}
