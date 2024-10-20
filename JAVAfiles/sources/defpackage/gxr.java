package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxr extends ghp {
    public gxr(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.ghp
    protected final /* bridge */ /* synthetic */ void b(gkp gkpVar, Object obj) {
        ico icoVar = (ico) obj;
        gkpVar.g(1, (String) icoVar.b);
        gkpVar.g(2, (String) icoVar.a);
    }

    @Override // defpackage.gil
    protected final String c() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}
