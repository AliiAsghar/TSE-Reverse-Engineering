package defpackage;

import android.util.SparseArray;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ewt implements ezb {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ewt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [exw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v46, types: [exw, java.lang.Object] */
    @Override // defpackage.ezb
    public final void a() {
        switch (this.b) {
            case 0:
                ewv ewvVar = (ewv) this.a;
                if (ewvVar.a.isEmpty()) {
                    eyn eynVar = ewvVar.b;
                    dzg.g(eynVar);
                    eynVar.i();
                    int i = ewx.a;
                    return;
                }
                ewvVar.e = true;
                return;
            case 1:
                ewv ewvVar2 = (ewv) this.a;
                ewvVar2.d++;
                ewvVar2.c();
                return;
            case 2:
                ewv ewvVar3 = (ewv) this.a;
                eqq eqqVar = ewvVar3.c;
                if (eqqVar != null) {
                    eqqVar.a();
                }
                ewvVar3.a.clear();
                return;
            case 3:
                this.a.c();
                return;
            case 4:
                exc excVar = (exc) this.a;
                excVar.d = ett.h();
                excVar.c = excVar.a.a(excVar.d, 2, ett.a);
                excVar.e = ett.j(excVar.c, excVar.d);
                return;
            case 5:
                Object obj = this.a;
                try {
                    try {
                        try {
                            Object obj2 = ((exc) obj).g.c;
                            if (obj2 != null) {
                                ((etr) obj2).e();
                            }
                        } catch (ets e) {
                            eub.d("CompositorGlProgram", "Error releasing GL Program", e);
                        }
                        ((exc) obj).f.l();
                        ett.s(((exc) obj).d, ((exc) obj).e);
                    } catch (ets e2) {
                        eub.d("DefaultVideoCompositor", "Error releasing GL resources", e2);
                    }
                    try {
                        return;
                    } catch (ets e3) {
                        return;
                    }
                } finally {
                    try {
                        dzg.g(((exc) obj).d);
                    } catch (ets e32) {
                        eub.d("DefaultVideoCompositor", "Error releasing GL objects", e32);
                    }
                }
            case 6:
                ((exc) this.a).a();
                return;
            case 7:
                ((CountDownLatch) this.a).countDown();
                return;
            case 8:
                ((exo) this.a).c();
                return;
            case 9:
                Object obj3 = this.a;
                try {
                    try {
                        eyb eybVar = ((exi) obj3).c;
                        for (int i2 = 0; i2 < eybVar.f.size(); i2++) {
                            SparseArray sparseArray = eybVar.f;
                            eya eyaVar = (eya) sparseArray.get(sparseArray.keyAt(i2));
                            if (!eyaVar.e) {
                                eyaVar.e = true;
                                eyaVar.a.e();
                                exj exjVar = eyaVar.b;
                                if (exjVar != null) {
                                    exjVar.e();
                                }
                            }
                        }
                        for (int i3 = 0; i3 < ((exi) obj3).h.size(); i3++) {
                            ((exw) ((exi) obj3).h.get(i3)).e();
                        }
                        ((exi) obj3).g.e();
                    } catch (Throwable th) {
                        try {
                            ((exi) obj3).a.e(((exi) obj3).b);
                        } catch (ets e4) {
                            eub.d("DefaultFrameProcessor", "Error releasing GL objects", e4);
                        }
                        throw th;
                    }
                } catch (Exception e5) {
                    eub.d("DefaultFrameProcessor", "Error releasing shader program", e5);
                }
                try {
                    ((exi) obj3).a.e(((exi) obj3).b);
                    return;
                } catch (ets e6) {
                    eub.d("DefaultFrameProcessor", "Error releasing GL objects", e6);
                    return;
                }
            case 10:
                exm exmVar = (exm) this.a;
                if (exmVar.d.isEmpty() && exmVar.h == null) {
                    exj exjVar2 = exmVar.b;
                    dzg.g(exjVar2);
                    exjVar2.i();
                    int i4 = ewx.a;
                    exmVar.j();
                    return;
                }
                exmVar.g = true;
                exmVar.p();
                return;
            case 11:
                ((exm) this.a).j = false;
                return;
            case 12:
                int i5 = ewx.a;
                exm exmVar2 = (exm) this.a;
                if (exmVar2.j) {
                    exmVar2.c.updateTexImage();
                    exmVar2.d.poll();
                    if (exmVar2.i != null && exmVar2.d.isEmpty()) {
                        exmVar2.i.countDown();
                    }
                    eub.f("ExtTexMgr", "Dropping frame received on SurfaceTexture: " + (exmVar2.c.getTimestamp() / 1000));
                    return;
                }
                if (exmVar2.g) {
                    exmVar2.p();
                }
                exmVar2.f++;
                exmVar2.l();
                return;
            case 13:
                Object obj4 = this.a;
                try {
                    ((exm) obj4).o();
                    return;
                } catch (RuntimeException e7) {
                    exm exmVar3 = (exm) obj4;
                    exmVar3.k = e7;
                    eub.d("ExtTexMgr", "Failed to remove texture frames", e7);
                    CountDownLatch countDownLatch = exmVar3.i;
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                        return;
                    }
                    return;
                }
            case 14:
                exm exmVar4 = (exm) this.a;
                if (exmVar4.f == exmVar4.d.size()) {
                    return;
                }
                eub.f("ExtTexMgr", eul.G("Forcing EOS after missing %d frames for %d ms, with available frame count: %d", Integer.valueOf(exmVar4.d.size()), Long.valueOf(exm.a), Integer.valueOf(exmVar4.f)));
                exmVar4.g = false;
                exmVar4.h = null;
                exmVar4.j = true;
                exmVar4.o();
                exmVar4.d.clear();
                exmVar4.g();
                return;
            case 15:
                exm exmVar5 = (exm) this.a;
                exmVar5.h = null;
                if (exmVar5.g && exmVar5.d.isEmpty()) {
                    exmVar5.g = false;
                    exj exjVar3 = exmVar5.b;
                    dzg.g(exjVar3);
                    exjVar3.i();
                    int i6 = ewx.a;
                    exmVar5.j();
                    return;
                }
                exmVar5.l();
                return;
            case 16:
                exm exmVar6 = (exm) this.a;
                exmVar6.e++;
                exmVar6.l();
                return;
            case 17:
                this.a.i();
                return;
            case 18:
                exq exqVar = ((eyv) this.a).a;
                dzg.g(exqVar);
                exqVar.f();
                int i7 = ewx.a;
                return;
            case 19:
                ((exq) this.a).d();
                return;
            default:
                ((eyw) this.a).b();
                return;
        }
    }
}
