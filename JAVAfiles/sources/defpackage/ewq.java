package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ewq implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ ewq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, ezb] */
    /* JADX WARN: Type inference failed for: r0v65, types: [fdq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [fdq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [fdq, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        switch (this.c) {
            case 0:
                ((ews) this.a).b.a(esh.a((Exception) this.b));
                return;
            case 1:
                ((qdq) this.b).G(((adfg) this.a).j());
                return;
            case 2:
                ((exi) this.a).e.b(esh.a((Exception) this.b));
                return;
            case 3:
                ((exo) this.a).g.b(esh.a((Exception) this.b));
                return;
            case 4:
                eug eugVar = (eug) this.a;
                ((exo) this.b).g.d(eugVar.b, eugVar.c);
                return;
            case 5:
                ((exo) this.a).g.b(esh.a((Exception) this.b));
                return;
            case 6:
                ((exo) this.b).g.b(esh.a((Exception) this.a));
                return;
            case 7:
                ((eyk) this.a).c.b((esh) this.b);
                return;
            case 8:
                ((eyk) this.a).c.b(esh.a((Exception) this.b));
                return;
            case 9:
                ((eys) this.b).b.a.b((esh) this.a);
                return;
            case 10:
                try {
                    this.a.a();
                    return;
                } catch (Exception e) {
                    ((ezc) this.b).a(e);
                    return;
                }
            case 11:
                fad fadVar = (fad) this.a;
                int i = fadVar.n;
                fag fagVar = (fag) this.b;
                int i2 = i - fagVar.c;
                fadVar.n = i2;
                boolean z2 = true;
                if (fagVar.d) {
                    fadVar.o = fagVar.e;
                    fadVar.p = true;
                }
                if (i2 == 0) {
                    erz erzVar = fagVar.b.b;
                    if (!fadVar.A.b.q() && erzVar.q()) {
                        fadVar.B = -1;
                        fadVar.C = 0L;
                    }
                    if (!erzVar.q()) {
                        List asList = Arrays.asList(((ezd) erzVar).c);
                        if (asList.size() == fadVar.h.size()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dzg.d(z);
                        for (int i3 = 0; i3 < asList.size(); i3++) {
                            ((fac) fadVar.h.get(i3)).a = (erz) asList.get(i3);
                        }
                    }
                    long j = -9223372036854775807L;
                    if (fadVar.p) {
                        if (fagVar.b.c.equals(fadVar.A.c) && fagVar.b.e == fadVar.A.s) {
                            z2 = false;
                        }
                        if (z2) {
                            if (!erzVar.q() && !fagVar.b.c.b()) {
                                fay fayVar = fagVar.b;
                                j = fadVar.S(erzVar, fayVar.c, fayVar.e);
                            } else {
                                j = fagVar.b.e;
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    fadVar.p = false;
                    fadVar.ae(fagVar.b, 1, z2, fadVar.o, j, -1, false);
                    return;
                }
                return;
            case 12:
                Pair pair = (Pair) this.a;
                ((fau) this.b).a.j.b(((Integer) pair.first).intValue(), (fgv) pair.second);
                return;
            case 13:
                Pair pair2 = (Pair) this.a;
                ((fau) this.b).a.j.c(((Integer) pair2.first).intValue(), (fgv) pair2.second);
                return;
            case 14:
                Pair pair3 = (Pair) this.a;
                ((fau) this.b).a.j.f(((Integer) pair3.first).intValue(), (fgv) pair3.second);
                return;
            case 15:
                ((ezh) this.a).a();
                int i4 = eul.a;
                faa faaVar = (faa) ((fdx) this.b).b;
                fbt fbtVar = faaVar.a.D;
                fbtVar.F(fbtVar.D(), 1013, new fbn(8));
                fad fadVar2 = faaVar.a;
                return;
            case 16:
                fdx fdxVar = ((fcz) ((qdq) this.b).a).l;
                Object obj = fdxVar.a;
                if (obj != null) {
                    ((Handler) obj).post(new exl(fdxVar, 10));
                    return;
                }
                return;
            case 17:
                Object obj2 = this.b;
                fdm fdmVar = (fdm) obj2;
                fdn fdnVar = fdmVar.c;
                if (fdnVar.e != 0 && !fdmVar.b) {
                    Object obj3 = this.a;
                    Looper looper = fdnVar.h;
                    dzg.g(looper);
                    fdmVar.a = fdnVar.g(looper, fdmVar.d, (eqn) obj3, false);
                    fdmVar.c.c.add(obj2);
                    return;
                }
                return;
            case 18:
                this.b.c(0, (fgv) ((apuv) this.a).b);
                return;
            case 19:
                this.b.b(0, (fgv) ((apuv) this.a).b);
                return;
            default:
                this.b.f(0, (fgv) ((apuv) this.a).b);
                return;
        }
    }

    public /* synthetic */ ewq(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
