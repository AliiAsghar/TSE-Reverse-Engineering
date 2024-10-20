package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimj extends aimh {
    protected int a;

    public aimj() {
        super("Max-Forwards");
    }

    @Override // defpackage.aimh
    public final String a() {
        int i = this.a;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        return sb.toString();
    }

    public final void b(int i) {
        if (i >= 0 && i <= 255) {
            this.a = i;
            return;
        }
        throw new IllegalArgumentException(a.bV(i, "bad max forwards value "));
    }

    @Override // defpackage.aimh
    public final aila d() {
        return null;
    }
}
