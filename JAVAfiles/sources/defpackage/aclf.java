package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclf implements ackb {
    private final int a;
    private final ackc b;

    /* JADX WARN: Multi-variable type inference failed */
    public aclf(ackb ackbVar) {
        this.a = ((abtp) ackbVar).gr();
        this.b = new acli(ackbVar.b());
    }

    @Override // defpackage.ackb
    public final int a() {
        return this.a;
    }

    @Override // defpackage.ackb
    public final ackc b() {
        return this.b;
    }

    public final String toString() {
        String str;
        int i = this.a;
        if (i == 1) {
            str = "changed";
        } else if (i == 2) {
            str = "deleted";
        } else {
            str = "unknown";
        }
        return "DataEventEntity{ type=" + str + ", dataitem=" + this.b.toString() + " }";
    }

    @Override // defpackage.abtr
    public final /* bridge */ /* synthetic */ Object d() {
        return this;
    }
}
