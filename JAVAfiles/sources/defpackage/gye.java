package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gye extends gil {
    public gye(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "DELETE FROM SystemIdInfo where work_spec_id=?";
    }
}
