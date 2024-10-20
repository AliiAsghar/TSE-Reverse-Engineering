package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aime extends aimh {
    protected Integer a;

    public aime() {
        super("Expires");
    }

    @Override // defpackage.aimh
    public final String a() {
        return this.a.toString();
    }

    public final int b() {
        return this.a.intValue();
    }

    @Override // defpackage.aimh
    public final aila d() {
        return null;
    }

    public final void e(int i) {
        if (i >= 0) {
            this.a = Integer.valueOf(i);
            return;
        }
        throw new IllegalArgumentException(a.bV(i, "bad argument "));
    }
}
