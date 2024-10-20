package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qyo {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/shared/datamodel/accounts/LinkedAccountManager");
    public final agnq b;
    public final mbl c;
    public final agxw d;
    public final ahiy e;
    private final anen f;

    public qyo(agxw agxwVar, anen anenVar, agnq agnqVar, ahiy ahiyVar, mbl mblVar) {
        this.d = agxwVar;
        this.f = anenVar;
        this.b = agnqVar;
        this.e = ahiyVar;
        this.c = mblVar;
    }

    public static final int b() {
        Object apply;
        sta staVar = new sta(stb.a);
        staVar.w("getStoredAccountId");
        boolean z = true;
        apply = new qxo(20).apply(stb.d);
        ssx[] ssxVarArr = {(ssx) apply};
        int c = a.bp().c();
        Integer.valueOf(c).getClass();
        int i = -1;
        if (((Integer) stb.b.getOrDefault(ssxVarArr[0].toString(), -1)).intValue() > c) {
            agnc.t("columnReference.toString()", c);
        }
        staVar.m(ssxVarArr);
        ssy ssyVar = (ssy) staVar.b().n();
        try {
            if (ssyVar.moveToFirst()) {
                int count = ssyVar.getCount();
                if (count > 1) {
                    z = false;
                }
                albo.V(z, "Expected 0 or 1 linked accounts but found %s", count);
                i = ssyVar.c();
            }
            ssyVar.close();
            return i;
        } catch (Throwable th) {
            try {
                ssyVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final akul a() {
        return aktp.ai(new kli(11), this.f).i(new qdl(this, new xya(), 9), andi.a);
    }
}
