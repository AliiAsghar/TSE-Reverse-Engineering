package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gzp extends ghp {
    public gzp(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.ghp
    protected final /* bridge */ /* synthetic */ void b(gkp gkpVar, Object obj) {
        ico icoVar = (ico) obj;
        gkpVar.g(1, (String) icoVar.a);
        gkpVar.g(2, (String) icoVar.b);
    }

    @Override // defpackage.gil
    protected final String c() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
