package defpackage;

import com.google.android.apps.messaging.ui.rcs.setup.manual.CountryCodePickerActivity;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazm {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public aazm(armf armfVar, armf armfVar2, apwt apwtVar, anen anenVar) {
        this.c = armfVar;
        this.b = armfVar2;
        this.a = apwtVar;
        this.d = anenVar;
    }

    public final ListenableFuture a(Executor executor, ancr ancrVar) {
        return albo.bM(akto.k(new aakf(this, akto.c(ancrVar), 18, null)), executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x019f, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x01a0, code lost:
    
        r14 = r3.f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x01c1, code lost:
    
        if (r3.f.compareAndSet(r14, defpackage.agkv.i(r14, false, false, true, 0, 0, 0, 123)) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x01c5, code lost:
    
        if (r3.c == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x01c7, code lost:
    
        r4 = defpackage.agkv.d(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x01d2, code lost:
    
        r5 = r0.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01da, code lost:
    
        if (defpackage.agks.c(r5) != false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01e0, code lost:
    
        if (defpackage.agks.b(r5) > r4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ef, code lost:
    
        if (r0.compareAndSet(r5, defpackage.agks.e(r5, r4, true, false, 4)) == false) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01f1, code lost:
    
        r5 = r0.a;
        r11 = defpackage.agku.b(r4, r0.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01fb, code lost:
    
        if (r5.c == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01fd, code lost:
    
        r13 = r5.f.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x020d, code lost:
    
        if (defpackage.agkv.e(r13) != defpackage.agku.c(r11)) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0215, code lost:
    
        if (defpackage.agkv.a(r13) == (-21)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x021f, code lost:
    
        if (defpackage.agkv.a(r13) <= defpackage.agku.a(r11)) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0221, code lost:
    
        r13 = defpackage.agkv.i(r13, false, false, false, 0, defpackage.agku.a(r11), 0, 95);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x023a, code lost:
    
        if (defpackage.agkv.g(r13) == false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0244, code lost:
    
        if (r5.f.compareAndSet(r13, r13) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0254, code lost:
    
        if (defpackage.agkv.d(r13) != defpackage.agkv.d(r13)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x025c, code lost:
    
        if (r5.f.compareAndSet(r13, r13) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0279, code lost:
    
        if (r5.f.compareAndSet(r13, defpackage.agkv.i(r13, false, true, false, 0, 0, 0, 125)) == false) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x027b, code lost:
    
        r5.a(defpackage.agkv.d(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0282, code lost:
    
        java.util.concurrent.locks.LockSupport.park(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x028d, code lost:
    
        if (r0.c.get() != defpackage.agkp.a) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x029f, code lost:
    
        r7 = r7 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x028f, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0292, code lost:
    
        if (r7 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0294, code lost:
    
        r3.a.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01cc, code lost:
    
        r4 = android.os.Process.getThreadPriority(r3.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02a5, code lost:
    
        r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02a8, code lost:
    
        if (r7 != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02aa, code lost:
    
        r3.a.interrupt();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x02af, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x005e, code lost:
    
        continue;
     */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.Queue] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.util.concurrent.Executor, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.ancr r36) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aazm.b(ancr):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Queue] */
    public final void c(Runnable runnable) {
        runnable.getClass();
        this.d.add(runnable);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, arqr] */
    public final void d(agdz agdzVar) {
        agdzVar.getClass();
        if (((CopyOnWriteArraySet) this.d).add(agdzVar) && !this.d.isEmpty() && this.e == null) {
            Object a = this.a.a(new agdx(this, 0));
            this.c.a(a);
            this.e = a;
        }
    }

    public aazm(CountryCodePickerActivity countryCodePickerActivity, armf armfVar, armf armfVar2, armf armfVar3) {
        this.a = countryCodePickerActivity;
        this.b = armfVar;
        this.c = armfVar2;
        this.d = armfVar3;
    }

    public aazm(arqr arqrVar, arqr arqrVar2, arqr arqrVar3) {
        this.a = arqrVar;
        this.c = arqrVar2;
        this.b = arqrVar3;
        this.d = new CopyOnWriteArraySet();
    }

    public aazm(Executor executor) {
        executor.getClass();
        this.c = executor;
        this.b = new AtomicReference();
        this.d = new ConcurrentLinkedQueue();
        this.a = new agkt();
    }
}
