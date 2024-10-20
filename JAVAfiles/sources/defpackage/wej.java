package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class wej {
    public static final xze a = xze.g("BugleRcs", "MessagingServiceGenericMethod");
    public final wei b;
    private final anen c;
    private final waw d;

    public wej(anen anenVar, wei weiVar, waw wawVar) {
        this.c = anenVar;
        this.b = weiVar;
        this.d = wawVar;
    }

    public final akul a(Object obj) {
        wei weiVar = this.b;
        byte[] bArr = null;
        return weiVar.c(weiVar.f(obj)).h(new vqv(this, obj, 10, bArr), this.c).e(Throwable.class, new vqv(this, obj, 11, bArr), this.c);
    }

    public final akul b(Object obj) {
        akul i;
        wei weiVar = this.b;
        qeg a2 = weiVar.a(obj);
        Object e = weiVar.e(obj);
        Optional d = weiVar.d(obj);
        if (d.isEmpty()) {
            i = this.b.b(e);
        } else {
            i = this.d.a(a2, (String) d.get()).h(new weh(this, 1), this.c).i(new vfj(this, e, 16, null), this.c);
        }
        return i.h(new weh(this, 0), this.c);
    }
}
