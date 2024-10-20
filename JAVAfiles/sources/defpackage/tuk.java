package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tuk {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/EtouffeeSessionSetupImpl");
    public final apwt b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final arpi i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final qei m;
    private final armf n;
    private final arpi o;
    private final arpi p;
    private final ConversationIdType q;

    public tuk(apwt apwtVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, arpi arpiVar, arpi arpiVar2, arpi arpiVar3, armf armfVar8, armf armfVar9, armf armfVar10, qei qeiVar, ConversationIdType conversationIdType) {
        apwtVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        arpiVar3.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        qeiVar.getClass();
        conversationIdType.getClass();
        this.b = apwtVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar4;
        this.g = armfVar5;
        this.h = armfVar6;
        this.n = armfVar7;
        this.o = arpiVar;
        this.i = arpiVar2;
        this.p = arpiVar3;
        this.j = armfVar8;
        this.k = armfVar9;
        this.l = armfVar10;
        this.m = qeiVar;
        this.q = conversationIdType;
        String str = qeiVar.d;
        str.getClass();
        if (!arsd.M(str)) {
        } else {
            throw new IllegalStateException("Self identity is blank.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.alpt r11, defpackage.amkd r12, defpackage.arpe r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.tuj
            if (r0 == 0) goto L13
            r0 = r13
            tuj r0 = (defpackage.tuj) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            tuj r0 = new tuj
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r13)
            goto L48
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.aqil.P(r13)
            arpi r13 = r10.i
            qka r2 = new qka
            r8 = 0
            r9 = 7
            r4 = r2
            r5 = r10
            r6 = r11
            r7 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            r0.c = r3
            java.lang.Object r13 = defpackage.arro.q(r13, r2, r0)
            if (r13 != r1) goto L48
            return r1
        L48:
            r13.getClass()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tuk.a(alpt, amkd, arpe):java.lang.Object");
    }

    public final Object b(alpt alptVar, amkd amkdVar, arpe arpeVar) {
        if (alptVar.isEmpty()) {
            return new gsw();
        }
        return arro.q(this.o, new qka(this, alptVar, amkdVar, (arpe) null, 8, (byte[]) null), arpeVar);
    }

    public final Object c(int i, uax uaxVar, arpe arpeVar) {
        Object q = arro.q(this.p, new psl(this, i, uaxVar, (arpe) null, 4), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    public final void d(qei qeiVar, boolean z, amkd amkdVar) {
        qeiVar.getClass();
        amkdVar.getClass();
        ((tvr) this.d.b()).e(this.m, qeiVar, qeiVar.d, z, amkdVar);
    }

    public final void e(int i, uax uaxVar) {
        ((tsa) this.n.b()).i(this.m, this.q, i, uaxVar);
    }
}
