package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyc extends ghp {
    public gyc(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.ghp
    protected final /* bridge */ /* synthetic */ void b(gkp gkpVar, Object obj) {
        gkpVar.g(1, ((gya) obj).a);
        gkpVar.e(2, r5.b);
        gkpVar.e(3, r5.c);
    }

    @Override // defpackage.gil
    protected final String c() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }
}
