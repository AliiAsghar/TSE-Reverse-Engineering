package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aima extends aimh implements Cloneable {
    public int a;

    public aima() {
        super("Content-Length");
    }

    @Override // defpackage.aimh
    public final String a() {
        return String.valueOf(this.a);
    }

    public final void b(int i) {
        if (i >= 0) {
            this.a = i;
            this.d = String.valueOf(i);
            return;
        }
        throw new IllegalArgumentException("parameter is <0");
    }

    @Override // defpackage.aimh, defpackage.aiku
    public final Object clone() {
        aima aimaVar = new aima();
        aimaVar.a = this.a;
        return aimaVar;
    }

    @Override // defpackage.aimh
    public final aila d() {
        return null;
    }
}
