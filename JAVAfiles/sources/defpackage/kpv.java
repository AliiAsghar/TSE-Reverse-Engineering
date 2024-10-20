package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kpv implements ajyk {
    public static final xze a = xze.g("BugleGaia", "AccountChangedLoggingCallbacks");
    public final armf b;
    public final armf c;
    private final armf d;
    private final armf e;
    private final armf f;
    private final armf g;
    private Optional h = Optional.empty();

    public kpv(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        this.d = armfVar;
        this.b = armfVar2;
        this.e = armfVar3;
        this.c = armfVar4;
        this.f = armfVar5;
        this.g = armfVar6;
    }

    @Override // defpackage.ajyk
    public final void a() {
        ((mbl) this.e.b()).c("Bugle.Account.Loading.Count");
    }

    @Override // defpackage.ajyk
    public final void b(ajxt ajxtVar) {
        ((mbl) this.e.b()).c("Bugle.Account.Error.Count");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b0  */
    @Override // defpackage.ajyk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.agxw r9) {
        /*
            r8 = this;
            java.lang.String r0 = r9.o()
            j$.util.Optional r1 = r8.h
            boolean r1 = r1.isPresent()
            java.lang.String r2 = "google"
            r3 = 19
            if (r1 == 0) goto L4d
            j$.util.Optional r1 = r8.h
            java.lang.Object r1 = r1.get()
            agxw r1 = (defpackage.agxw) r1
            java.lang.String r1 = r1.o()
            boolean r4 = r1.equals(r0)
            if (r4 == 0) goto L24
            goto Laa
        L24:
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L4d
            armf r1 = r8.c
            java.lang.Object r1 = r1.b()
            uwu r1 = (defpackage.uwu) r1
            wul r4 = r1.b
            uhw r5 = new uhw
            r5.<init>(r3)
            akul r4 = r4.j(r5)
            ult r5 = new ult
            r6 = 18
            r5.<init>(r1, r6)
            anen r1 = r1.c
            akul r1 = r4.h(r5, r1)
            defpackage.qiu.h(r1)
        L4d:
            boolean r0 = r0.equals(r2)
            armf r1 = r8.d
            java.lang.Object r1 = r1.b()
            xnv r1 = (defpackage.xnv) r1
            j$.time.Instant r1 = r1.f()
            long r1 = r1.toEpochMilli()
            armf r4 = r8.c
            java.lang.Object r4 = r4.b()
            uwu r4 = (defpackage.uwu) r4
            wul r5 = r4.b
            uam r6 = new uam
            r7 = 2
            r6.<init>(r0, r7)
            akul r0 = r5.j(r6)
            ult r5 = new ult
            r5.<init>(r4, r3)
            anen r4 = r4.c
            akul r0 = r0.h(r5, r4)
            mfj r4 = new mfj
            r5 = 1
            r4.<init>(r8, r1, r5)
            armf r1 = r8.g
            java.lang.Object r1 = r1.b()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            akul r0 = r0.i(r4, r1)
            its r1 = new its
            r2 = 11
            r1.<init>(r2)
            armf r2 = r8.f
            java.lang.Object r2 = r2.b()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.lang.Class<java.lang.Exception> r4 = java.lang.Exception.class
            akul r0 = r0.e(r4, r1, r2)
            defpackage.qiu.h(r0)
        Laa:
            boolean r0 = defpackage.kpt.a()
            if (r0 == 0) goto Lc0
            j$.util.Optional r0 = r8.h
            ilf r1 = new ilf
            r1.<init>(r8, r9, r3)
            r0.ifPresent(r1)
            j$.util.Optional r9 = j$.util.Optional.of(r9)
            r8.h = r9
        Lc0:
            armf r9 = r8.e
            java.lang.Object r9 = r9.b()
            mbl r9 = (defpackage.mbl) r9
            java.lang.String r0 = "Bugle.Account.Changed.Count"
            r9.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpv.d(agxw):void");
    }

    @Override // defpackage.ajyk
    public final /* synthetic */ void c() {
    }
}
