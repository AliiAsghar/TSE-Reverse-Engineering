package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qlh implements wns, wnx, wnv {
    public static final alwo a = alwo.o("BugleContacts");
    public final arwe b;
    public final armf c;
    public final yjv d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final AtomicBoolean h;
    private final armf i;
    private final armf j;
    private final armf k;
    private final armf l;

    public qlh(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, yjv yjvVar, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8) {
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        yjvVar.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        this.b = arweVar;
        this.i = armfVar;
        this.j = armfVar2;
        this.c = armfVar3;
        this.d = yjvVar;
        this.k = armfVar4;
        this.e = armfVar5;
        this.l = armfVar6;
        this.f = armfVar7;
        this.g = armfVar8;
        this.h = new AtomicBoolean(false);
    }

    @Override // defpackage.wns
    public final void a() {
        qjh.l(this.b, null, new mwv(this, (arpe) null, 11), 3);
    }

    @Override // defpackage.wnx
    public final void b() {
        qjh.l(this.b, null, new mwv(this, (arpe) null, 14, (short[]) null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0140, code lost:
    
        if (r14 != r1) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x019a, code lost:
    
        if (r13.b(r0) == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01c6, code lost:
    
        if (r13.b(r0) == r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ed, code lost:
    
        if (r14 != r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0111, code lost:
    
        if (r14 == r1) goto L83;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(boolean r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qlh.c(boolean, arpe):java.lang.Object");
    }

    @Override // defpackage.wnv
    public final akul d(boolean z) {
        if (!z) {
            ((alwl) a.g()).q("Default SMS app is not bugle.");
            qjh.l(this.b, null, new mwv(this, (arpe) null, 12, (byte[]) null), 3);
        } else {
            qjh.l(this.b, null, new mwv(this, (arpe) null, 13, (char[]) null), 3);
        }
        akul ag = aktp.ag(null);
        ag.getClass();
        return ag;
    }

    public final Object e(arpe arpeVar) {
        if (((qlc) this.k.b()).a()) {
            akct a2 = akcx.a(qle.class);
            a2.e(new akcw("ContactsSyncPeriodicImportScheduler", 3));
            gsd gsdVar = new gsd();
            gsdVar.a = true;
            a2.b(gsdVar.a());
            Object b = this.l.b();
            b.getClass();
            a2.c(new akcu(new akcv(((Number) b).longValue(), TimeUnit.HOURS), alfd.a));
            akcx a3 = a2.a();
            ((alwl) a.g()).q("Enqueueing periodic contacts import work.");
            Object F = arro.F(((aogy) this.e.b()).r(a3), arpeVar);
            if (F == arpl.a) {
                return F;
            }
        }
        return arnb.a;
    }
}
