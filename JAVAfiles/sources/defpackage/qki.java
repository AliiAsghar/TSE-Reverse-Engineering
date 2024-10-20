package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qki implements qkg {
    public final Object a;
    private final /* synthetic */ int b;
    private final asai c;

    public qki(asai asaiVar, Object obj, int i) {
        this.b = i;
        this.c = asaiVar;
        this.a = obj;
        if (asaiVar instanceof ascg) {
            throw new IllegalArgumentException("Shared flows are not allowed here. Consider `InitialValuedStateFlow` for state flows.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    @Override // defpackage.asai
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.asaj r5, defpackage.arpe r6) {
        /*
            r4 = this;
            int r0 = r4.b
            if (r0 == 0) goto L1f
            lfn r0 = new lfn
            r1 = 0
            r2 = 7
            r0.<init>(r4, r1, r2)
            asai r1 = r4.c
            akee r2 = new akee
            r3 = 4
            r2.<init>(r0, r1, r3)
            java.lang.Object r5 = r2.a(r5, r6)
            arpl r6 = defpackage.arpl.a
            if (r5 != r6) goto L1c
            return r5
        L1c:
            arnb r5 = defpackage.arnb.a
            return r5
        L1f:
            boolean r0 = r6 instanceof defpackage.qkh
            if (r0 == 0) goto L32
            r0 = r6
            qkh r0 = (defpackage.qkh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L32
            int r1 = r1 - r2
            r0.c = r1
            goto L37
        L32:
            qkh r0 = new qkh
            r0.<init>(r4, r6)
        L37:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L4e
            if (r2 == r3) goto L4a
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L4a:
            defpackage.aqil.P(r6)
            goto L5c
        L4e:
            defpackage.aqil.P(r6)
            asai r6 = r4.c
            r0.c = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            armj r5 = new armj
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qki.a(asaj, arpe):java.lang.Object");
    }

    @Override // defpackage.qkg
    public final Object b() {
        if (this.b != 0) {
            return this.a;
        }
        return this.a;
    }

    public qki(ascv ascvVar, int i) {
        this.b = i;
        this.c = ascvVar;
        this.a = ascvVar.c();
    }
}
