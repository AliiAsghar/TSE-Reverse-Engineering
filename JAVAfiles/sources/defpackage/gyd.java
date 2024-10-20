package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyd extends gil {
    public gyd(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
    }
}
