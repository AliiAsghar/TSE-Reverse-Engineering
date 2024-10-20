package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asgf {
    public final long a;

    public asgf(long j) {
        this.a = j;
    }

    public final aozn a() {
        long nanoTime = System.nanoTime() - this.a;
        aozy createBuilder = aozn.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        ((aozn) apagVar).b = nanoTime / 1000000000;
        long j = nanoTime % 1000000000;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((aozn) createBuilder.b).c = (int) j;
        return (aozn) createBuilder.s();
    }

    public final apct b() {
        aozy createBuilder = apct.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        long j = this.a;
        apag apagVar = createBuilder.b;
        ((apct) apagVar).b = j / 1000000000;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        ((apct) createBuilder.b).c = (int) (j % 1000000000);
        return (apct) createBuilder.s();
    }

    public asgf() {
        this.a = System.nanoTime();
    }
}
