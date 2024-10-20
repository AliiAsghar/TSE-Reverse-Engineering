package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class akri {
    private static final akri a = new akri(3, null, true);
    private static final akri b = new akri(2, null, true);
    private final Object c;
    private boolean d;
    private final int e;

    public akri(int i, Object obj, boolean z) {
        this.e = i;
        this.c = obj;
        this.d = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static akri d(int i) {
        if (i - 1 != 1) {
            return a;
        }
        return b;
    }

    public final Object a() {
        if (this.d && this.e == 1) {
            return this.c;
        }
        throw new IllegalStateException("Calling get() without checking if the extra is present is an error");
    }

    public final boolean b() {
        this.d = true;
        if (this.e == 1) {
            return true;
        }
        return false;
    }

    public final int c() {
        this.d = true;
        return this.e;
    }
}
