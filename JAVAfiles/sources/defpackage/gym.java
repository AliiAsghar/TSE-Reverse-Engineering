package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gym extends gil {
    public gym(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "DELETE from WorkProgress where work_spec_id=?";
    }
}
