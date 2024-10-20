package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apzf extends apyz {
    private final apyz b;

    public apzf(apyz apyzVar) {
        this.b = apyzVar;
    }

    @Override // defpackage.apyz
    public final apyu a(apyv apyvVar) {
        try {
            return new apzd(this.b.a(apyvVar));
        } catch (RuntimeException e) {
            apzg.d(e, this.b, apyvVar);
            return apyu.a;
        }
    }
}
