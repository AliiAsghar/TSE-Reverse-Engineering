package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wnl extends wnn implements utv, acys {
    private final /* synthetic */ int a;

    public wnl(int i, byte[] bArr) {
        this.a = i;
    }

    @Override // defpackage.utv
    public final void a() {
        if (this.a != 0) {
            e();
        } else {
            e();
        }
    }

    @Override // defpackage.wnn
    protected final String b() {
        if (this.a != 0) {
            return (String) acpq.E().p().a();
        }
        return (String) acpq.E().B().a();
    }

    @Override // defpackage.utv
    public final boolean fN() {
        return true;
    }

    @Override // defpackage.acys
    public final void onCsLibPhenotypeUpdated() {
        if (this.a != 0) {
            e();
        } else {
            e();
        }
    }

    public wnl(int i) {
        this.a = i;
    }
}
