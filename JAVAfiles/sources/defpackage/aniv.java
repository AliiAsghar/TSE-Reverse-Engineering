package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class aniv extends Exception {
    public final anit a;
    public final int b;

    public aniv(String str) {
        this(str, null, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aniv(String str, anit anitVar, int i, Throwable th) {
        super(str + ", " + anitVar, th);
        anitVar.getClass();
        if (i != 0) {
            this.a = anitVar;
            this.b = i;
            return;
        }
        throw null;
    }

    public /* synthetic */ aniv(String str, Throwable th, int i) {
        this(str, (i & 2) != 0 ? anit.a : null, (i & 4) != 0 ? 4 : 0, (i & 8) != 0 ? null : th);
    }

    public aniv(String str, Throwable th) {
        this(str, anit.a, 4, th);
    }
}
