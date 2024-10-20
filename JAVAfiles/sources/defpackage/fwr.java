package defpackage;

import j$.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fwr {
    public final ety a;
    public final fxh b;
    public final AtomicInteger c = new AtomicInteger();
    public final hka d;
    private final etu e;
    private fxh f;

    public fwr(hka hkaVar, ety etyVar, etu etuVar, fxh fxhVar) {
        this.d = hkaVar;
        this.a = etyVar;
        this.e = etuVar;
        this.b = fxhVar;
        this.f = fxhVar;
    }

    public final synchronized void a(fxh fxhVar) {
        boolean z;
        if (this.c.getAndDecrement() > 0) {
            z = true;
        } else {
            z = false;
        }
        dzg.d(z);
        fxg fxgVar = new fxg(this.f);
        if (!Objects.equals(fxhVar.b, this.b.b)) {
            fxgVar.b(fxhVar.b);
        }
        if (!Objects.equals(fxhVar.c, this.b.c)) {
            fxgVar.c(fxhVar.c);
        }
        int i = fxhVar.a;
        fxh fxhVar2 = this.b;
        if (i != fxhVar2.a) {
            fxgVar.a = i;
        }
        int i2 = fxhVar.d;
        if (i2 != fxhVar2.d) {
            fxgVar.b = i2;
        }
        this.f = fxgVar.a();
        if (this.c.get() == 0 && !this.b.equals(this.f)) {
            this.e.b(new fhg(this, 15));
        }
    }
}
