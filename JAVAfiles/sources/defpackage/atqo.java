package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atqo {
    public final asmm a;
    public final Object b;

    public atqo(asmm asmmVar, Object obj) {
        this.a = asmmVar;
        this.b = obj;
    }

    public static atqo b(Object obj, asmm asmmVar) {
        if (asmmVar.a()) {
            return new atqo(asmmVar, obj);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final int a() {
        return this.a.d;
    }

    public final boolean c() {
        return this.a.a();
    }

    public final String toString() {
        return this.a.toString();
    }
}
