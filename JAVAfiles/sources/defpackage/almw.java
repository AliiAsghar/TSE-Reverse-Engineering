package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class almw implements Iterable {
    private final algw a;

    /* JADX INFO: Access modifiers changed from: protected */
    public almw() {
        this.a = alfd.a;
    }

    public static almw a(Iterable iterable, Iterable iterable2) {
        Iterable[] iterableArr = {iterable, iterable2};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new almv(iterableArr);
    }

    public static almw b(Iterable iterable) {
        if (iterable instanceof almw) {
            return (almw) iterable;
        }
        return new almt(iterable, iterable);
    }

    public final Iterable c() {
        return (Iterable) this.a.d(this);
    }

    public final String toString() {
        return alzz.aR(c());
    }

    public almw(Iterable iterable) {
        this.a = algw.i(iterable);
    }
}
