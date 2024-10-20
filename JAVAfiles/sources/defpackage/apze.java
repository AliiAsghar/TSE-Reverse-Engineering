package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class apze extends apyy {
    private final apyy b;

    public apze(apyy apyyVar) {
        this.b = apyyVar;
    }

    @Override // defpackage.apyy
    public final apyz a(Object obj) {
        try {
            return new apzf(this.b.a(obj));
        } catch (RuntimeException e) {
            apzg.b(e, this.b, obj);
            return apyz.a;
        }
    }
}
