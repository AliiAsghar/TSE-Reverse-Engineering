package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alqp extends alur {
    static final alur a = new alqp(new Object[0]);
    private final Object[] b;

    public alqp(Object[] objArr) {
        super(objArr.length, 0);
        this.b = objArr;
    }

    @Override // defpackage.alur
    protected final Object a(int i) {
        return this.b[i];
    }
}
