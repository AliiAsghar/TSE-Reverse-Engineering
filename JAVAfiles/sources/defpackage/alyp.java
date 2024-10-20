package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class alyp extends alxu {
    private final alyn a;
    private final alyt b;
    private final alyo c;
    private final alxt d;

    public alyp() {
        alyn alynVar = (alyn) p(alyn.class, "flogger.backend_factory");
        this.a = alynVar == null ? alyq.a : alynVar;
        alyt alytVar = (alyt) p(alyt.class, "flogger.logging_context");
        this.b = alytVar == null ? alzb.a : alytVar;
        alyo alyoVar = (alyo) p(alyo.class, "flogger.clock");
        this.c = alyoVar == null ? alys.a : alyoVar;
        this.d = alyr.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b8 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.Object p(java.lang.Class r16, java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alyp.p(java.lang.Class, java.lang.String):java.lang.Object");
    }

    @Override // defpackage.alxu
    protected final long c() {
        return this.c.a();
    }

    @Override // defpackage.alxu
    protected final alww e(String str) {
        return this.a.a(str);
    }

    @Override // defpackage.alxu
    protected final alxt h() {
        return this.d;
    }

    @Override // defpackage.alxu
    protected final alyt j() {
        return this.b;
    }

    @Override // defpackage.alxu
    protected final String m() {
        return "Platform: " + getClass().getName() + "\nBackendFactory: " + this.a.toString() + "\nClock: " + this.c.toString() + "\nContextDataProvider: " + String.valueOf(this.b) + "\nLogCallerFinder: Default stack-based caller finder\n";
    }
}
