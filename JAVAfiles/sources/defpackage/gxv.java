package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxv extends ghp {
    public gxv(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.ghp
    protected final /* bridge */ /* synthetic */ void b(gkp gkpVar, Object obj) {
        gxt gxtVar = (gxt) obj;
        gkpVar.g(1, gxtVar.a);
        gkpVar.e(2, gxtVar.b.longValue());
    }

    @Override // defpackage.gil
    protected final String c() {
        return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
    }
}
