package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class atkf extends atmu implements atkg {
    private static final long serialVersionUID = 5971755205903597024L;
    final int a;
    final int b;

    public atkf(atmu atmuVar, int i, long j) {
        super(atmuVar);
        this.a = i;
        this.b = atki.a(atmuVar.e(), j);
    }

    @Override // defpackage.atkg
    public final int a(int i) {
        return this.a - i;
    }

    @Override // defpackage.atkg
    public final boolean b() {
        if (((int) (System.currentTimeMillis() / 1000)) >= this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.atmu
    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append(" cl = ");
        stringBuffer.append(this.a);
        return stringBuffer.toString();
    }
}
