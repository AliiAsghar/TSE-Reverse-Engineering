package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qlc {
    private static final alwo a = alwo.o("BugleContacts");
    private final armf b;
    private final yjv c;

    public qlc(armf armfVar, yjv yjvVar) {
        armfVar.getClass();
        yjvVar.getClass();
        this.b = armfVar;
        this.c = yjvVar;
    }

    public final boolean a() {
        int i = qlq.a;
        if (!qlq.a()) {
            ((alwl) a.g()).q("ContactsSyncFeature is not enabled.");
            return false;
        }
        if (!this.c.d()) {
            ((alwl) a.g()).q("Default SMS App is not Bugle.");
            return false;
        }
        if (!((yjf) this.b.b()).f()) {
            ((alwl) a.g()).q("App does not have read contacts permission.");
            return false;
        }
        return true;
    }
}
