package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gza extends gil {
    public gza(gid gidVar) {
        super(gidVar);
    }

    @Override // defpackage.gil
    public final String c() {
        return "UPDATE workspec SET generation=generation+1 WHERE id=?";
    }
}
