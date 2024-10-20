package defpackage;

import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fhg implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ fhg(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [fhx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v10, types: [fkn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [fkn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    /* JADX WARN: Type inference failed for: r0v9, types: [fkn, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 2;
        int i2 = 0;
        switch (this.b) {
            case 0:
                ?? r0 = this.a;
                fhm fhmVar = (fhm) r0;
                if (!fhmVar.u) {
                    fgs fgsVar = fhmVar.g;
                    dzg.g(fgsVar);
                    fgsVar.b(r0);
                    return;
                }
                return;
            case 1:
                ((fhm) this.a).s();
                return;
            case 2:
                this.a.shutdown();
                return;
            case 3:
                fkd fkdVar = (fkd) this.a;
                int i3 = fkdVar.n - 1;
                fkdVar.n = i3;
                if (i3 > 0) {
                    return;
                }
                if (i3 >= 0) {
                    fkdVar.e.a();
                    return;
                }
                throw new IllegalStateException(String.valueOf(i3));
            case 4:
                this.a.d();
                return;
            case 5:
                this.a.b();
                return;
            case 6:
                this.a.c();
                return;
            case 7:
                int i4 = eul.a;
                fbt fbtVar = ((faa) ((fvq) this.a).b).a.D;
                fbtVar.F(fbtVar.E(), 1016, new fbr(0));
                return;
            case 8:
                int i5 = eul.a;
                fbt fbtVar2 = ((faa) ((fvq) this.a).b).a.D;
                fbtVar2.F(fbtVar2.D(), 1018, new fbn(0));
                return;
            case 9:
                int i6 = eul.a;
                fbt fbtVar3 = ((faa) ((fvq) this.a).b).a.D;
                fbtVar3.F(fbtVar3.D(), 1021, new fbn(6));
                return;
            case 10:
                int i7 = eul.a;
                fbt fbtVar4 = ((faa) ((fvq) this.a).b).a.D;
                fbtVar4.F(fbtVar4.E(), 1030, new ezz(12));
                return;
            case 11:
                int i8 = eul.a;
                fbt fbtVar5 = ((faa) ((fvq) this.a).b).a.D;
                fbtVar5.F(fbtVar5.E(), 1015, new fbn(18));
                return;
            case 12:
                int i9 = eul.a;
                fbt fbtVar6 = ((faa) ((fvq) this.a).b).a.D;
                fbtVar6.F(fbtVar6.E(), 1017, new fbn(13));
                return;
            case 13:
                int i10 = eul.a;
                fbt fbtVar7 = ((faa) ((fvq) this.a).b).a.D;
                fbtVar7.F(fbtVar7.E(), 1019, new fbn(1));
                return;
            case 14:
                fky fkyVar = (fky) this.a;
                Surface surface = fkyVar.e;
                if (surface != null) {
                    Iterator it = fkyVar.a.iterator();
                    while (it.hasNext()) {
                        ((faa) it.next()).a.ac(null);
                    }
                }
                fky.a(fkyVar.d, surface);
                fkyVar.d = null;
                fkyVar.e = null;
                return;
            case 15:
                Object obj = this.a;
                ((fwr) obj).a.f(-1, new fbq(obj, i));
                return;
            case 16:
                fwy fwyVar = (fwy) this.a;
                if (fwyVar.o) {
                    return;
                }
                fwyVar.o = true;
                qdq qdqVar = fwyVar.t;
                fwo fwoVar = new fwo("Muxer error", new IllegalStateException(eul.G("Abort: no output sample written in the last %d milliseconds. DebugTrace: %s", Long.valueOf(fwyVar.f), ewx.a())), 7002);
                fxn fxnVar = ((fxj) qdqVar.a).f;
                dzg.g(fxnVar);
                fxnVar.b(fwoVar);
                return;
            case 17:
                ((fxd) this.a).a();
                return;
            case 18:
                Object obj2 = this.a;
                try {
                    if (((fxe) obj2).c.l) {
                        return;
                    }
                    ((fxe) obj2).c.j();
                    ((fxe) obj2).b += ((fxe) obj2).c.m;
                    ((fxe) obj2).c.i.f();
                    fxf fxfVar = ((fxe) obj2).c;
                    fxfVar.g = false;
                    int i11 = fxfVar.h + 1;
                    fxfVar.h = i11;
                    List list = fxfVar.a;
                    if (i11 == ((alsx) list).c) {
                        fxfVar.h = 0;
                        fxfVar.k++;
                    } else {
                        i2 = i11;
                    }
                    fvz fvzVar = (fvz) list.get(i2);
                    fxf fxfVar2 = ((fxe) obj2).c;
                    fvb fvbVar = fxfVar2.b;
                    Looper myLooper = Looper.myLooper();
                    dzg.g(myLooper);
                    fxf fxfVar3 = ((fxe) obj2).c;
                    fxfVar2.i = fvbVar.a(fvzVar, myLooper, fxfVar3, fxfVar3.p);
                    ((fxe) obj2).c.i.g();
                    return;
                } catch (RuntimeException e) {
                    ((fxe) obj2).c.b(new fwo("Asset loader error", e, 1000));
                    return;
                }
            case 19:
                ((HandlerThread) this.a).quitSafely();
                return;
            default:
                ((fyb) this.a).c(false);
                return;
        }
    }
}
