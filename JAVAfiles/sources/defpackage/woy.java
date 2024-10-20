package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class woy {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/satelliteapi/conversation/EmergencyConversationOperations");
    public final qpj b;
    public final armf c;
    public final xnv d;
    public final qoz e;
    private final arpi f;
    private final nds g;
    private final armf h;

    public woy(arpi arpiVar, nds ndsVar, armf armfVar, qpj qpjVar, armf armfVar2, qoz qozVar, xnv xnvVar) {
        arpiVar.getClass();
        ndsVar.getClass();
        armfVar.getClass();
        qpjVar.getClass();
        armfVar2.getClass();
        qozVar.getClass();
        xnvVar.getClass();
        this.f = arpiVar;
        this.g = ndsVar;
        this.h = armfVar;
        this.b = qpjVar;
        this.c = armfVar2;
        this.e = qozVar;
        this.d = xnvVar;
    }

    public static final boolean g(msh mshVar) {
        return lgc.C(mshVar.m());
    }

    private static final boolean h(wrw wrwVar) {
        int aU = a.aU(wrwVar.c);
        if (aU != 0 && aU == 4) {
            return true;
        }
        return false;
    }

    private static final boolean i(msh mshVar) {
        return lgc.D(mshVar.m());
    }

    public final ParticipantsTable.BindData a(msh mshVar) {
        mshVar.getClass();
        if (mshVar.B()) {
            ParticipantsTable.BindData a2 = this.g.a(mshVar);
            ((rxq) this.h.b()).g(a2);
            a2.getClass();
            return a2;
        }
        throw new IllegalArgumentException("Only satellite identities are supported");
    }

    public final Object b(int i, arpe arpeVar) {
        Object q = arro.q(this.f, new uxn(this, i, (arpe) null, 3), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    public final Object c(arpe arpeVar) {
        Object q = arro.q(this.f, new vck(this, (arpe) null, 9), arpeVar);
        if (q == arpl.a) {
            return q;
        }
        return arnb.a;
    }

    public final Object d(arpe arpeVar) {
        Object b = b(9, arpeVar);
        if (b == arpl.a) {
            return b;
        }
        return arnb.a;
    }

    public final Object e(msh mshVar, wrw wrwVar, arpe arpeVar) {
        int aU;
        if (mshVar.B()) {
            if (!g(mshVar) && (!i(mshVar) || !h(wrwVar))) {
                throw new IllegalArgumentException("Emergency demo conversation is supported only when the active session is in demo mode");
            }
            int i = 0;
            if ((!g(mshVar) || (aU = a.aU(wrwVar.c)) == 0 || aU != 6) && (!i(mshVar) || !h(wrwVar))) {
                i = 9;
            }
            return f(mshVar, i, arpeVar);
        }
        throw new IllegalArgumentException("Only satellite identities are supported");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(defpackage.msh r11, int r12, defpackage.arpe r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.wox
            if (r0 == 0) goto L13
            r0 = r13
            wox r0 = (defpackage.wox) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wox r0 = new wox
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
            arpi r13 = r10.f
            aggm r2 = new aggm
            r8 = 0
            r9 = 1
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.woy.f(msh, int, arpe):java.lang.Object");
    }
}
