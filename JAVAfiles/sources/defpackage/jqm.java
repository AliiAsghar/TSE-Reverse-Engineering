package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jqm extends arrd implements arqv {
    public static final jqm a = new jqm();

    public jqm() {
        super(2, sph.class, "setSubject", "setSubject(Ljava/lang/String;)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        Integer valueOf;
        Integer valueOf2;
        sph sphVar = (sph) obj;
        String str = (String) obj2;
        sphVar.getClass();
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59170) {
            agnc.t("subject", intValue2);
        }
        if (intValue >= 59170) {
            agnc.r(sphVar.a, "subject", str);
        }
        return arnb.a;
    }
}
