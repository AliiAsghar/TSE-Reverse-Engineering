package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class arex {
    public final aqtw a;
    public aqsd b;
    public boolean c = false;
    public aqse d = aqse.a(aqsd.IDLE);

    public arex(aqtw aqtwVar, aqsd aqsdVar) {
        this.a = aqtwVar;
        this.b = aqsdVar;
    }

    public final aqsd a() {
        return this.d.a;
    }

    public final void b(aqsd aqsdVar) {
        boolean z;
        this.b = aqsdVar;
        if (aqsdVar != aqsd.READY && aqsdVar != aqsd.TRANSIENT_FAILURE) {
            if (aqsdVar == aqsd.IDLE) {
                z = false;
            } else {
                return;
            }
        } else {
            z = true;
        }
        this.c = z;
    }
}
