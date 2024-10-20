package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kbe implements bxh {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public kbe(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, arqg] */
    @Override // defpackage.bxh
    public final void a() {
        arqg arqgVar;
        switch (this.b) {
            case 0:
                ((kbi) this.a).a.a();
                return;
            case 1:
                ((rg) this.a).f();
                return;
            case 2:
                ((rg) this.a).f();
                return;
            case 3:
                ((rg) this.a).f();
                return;
            case 4:
                ((rg) this.a).f();
                return;
            case 5:
                ((rg) this.a).f();
                return;
            case 6:
                this.a.a();
                return;
            case 7:
                this.a.a();
                return;
            case 8:
                Object obj = this.a;
                if ((obj instanceof aeiv) && (arqgVar = ((aeiv) obj).e) != null) {
                    arqgVar.a();
                    return;
                }
                return;
            case 9:
                Object obj2 = this.a;
                if (obj2 != null) {
                    ((aeph) obj2).b.a();
                    return;
                }
                return;
            default:
                eea.c((Window) this.a, false);
                return;
        }
    }
}
