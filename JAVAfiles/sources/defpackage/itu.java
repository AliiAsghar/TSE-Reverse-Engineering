package defpackage;

import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itu {
    public static final alwo a = alwo.o("Bugle");
    public final mbl b;
    public final nct c;
    public final armf d;
    public final armf e;
    public long f = 0;
    public long g = 0;
    private final anen h;
    private final anen i;
    private final armf j;
    private final eoy k;

    public itu(anen anenVar, anen anenVar2, mbl mblVar, nct nctVar, eoy eoyVar, armf armfVar, armf armfVar2, armf armfVar3) {
        this.h = anenVar;
        this.i = anenVar2;
        this.b = mblVar;
        this.c = nctVar;
        this.k = eoyVar;
        this.d = armfVar;
        this.e = armfVar2;
        this.j = armfVar3;
    }

    public final akul a(rry rryVar, int i, Consumer consumer) {
        akul h;
        boolean n = rvx.n(rryVar.f());
        akul ai = aktp.ai(new haw(this, rryVar.t(), 7), this.h);
        int i2 = 1;
        int i3 = 0;
        if (((okf) this.j.b()).a()) {
            h = ((iks) this.k.a(iks.class)).b().b().h(new its(i2), this.i);
        } else {
            h = ((iks) this.k.a(iks.class)).a().b().h(new its(i3), this.i);
        }
        return aktp.an(ai, h).h(new agwx(ai, h, rryVar, i, n, consumer, 1), this.i);
    }
}
