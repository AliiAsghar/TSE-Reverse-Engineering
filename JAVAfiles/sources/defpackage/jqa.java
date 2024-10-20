package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jqa extends arrd implements arqv {
    public static final jqa a = new jqa();

    public jqa() {
        super(2, sph.class, "setIsEncrypted", "setIsEncrypted(Z)Lcom/google/android/apps/messaging/shared/datamodel/databasegen/tabledefinitions/DraftsTable$UpdateBuilder;", 8);
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        Integer valueOf;
        Integer valueOf2;
        sph sphVar = (sph) obj;
        Boolean bool = (Boolean) obj2;
        bool.booleanValue();
        sphVar.getClass();
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        valueOf2 = Integer.valueOf(a.bp().c());
        int intValue2 = valueOf2.intValue();
        if (intValue2 < 59720) {
            agnc.t("is_encrypted", intValue2);
        }
        if (intValue >= 59720) {
            sphVar.a.put("is_encrypted", bool);
        }
        return arnb.a;
    }
}
