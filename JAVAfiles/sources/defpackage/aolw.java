package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aolw extends apsd {
    private final Object a;
    private aolv b;
    private final aolu c;

    public aolw(aolu aoluVar) {
        super(null);
        this.a = new Object();
        this.c = aoluVar;
    }

    @Override // defpackage.apsd
    public final aqrx b() {
        synchronized (this.a) {
            if (this.b != null) {
                return new aqrx();
            }
            aolv aolvVar = new aolv(this.c);
            this.b = aolvVar;
            return aolvVar;
        }
    }
}
