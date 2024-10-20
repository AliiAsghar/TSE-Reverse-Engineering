package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agi {
    private final byn a;

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public abstract class a {

        /* compiled from: PG */
        /* renamed from: agi$a$a, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public final class C0004a extends a {
            public static final C0004a a = new C0004a();

            private C0004a() {
            }

            public final String toString() {
                return "Closed";
            }
        }

        /* compiled from: PG */
        /* loaded from: classes.dex */
        public final class b extends a {
            public final long a;

            public b(long j) {
                this.a = j;
                if ((j & 9223372034707292159L) != 9205357640488583168L) {
                    return;
                }
                aju.d("ContextMenuState.Status should never be open with an unspecified offset. Use ContextMenuState.Status.Closed instead.");
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                return defpackage.a.bB(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return defpackage.a.A(this.a);
            }

            public final String toString() {
                return "Open(offset=" + ((Object) cjn.f(this.a)) + ')';
            }
        }
    }

    public agi() {
        this(null);
    }

    public final a a() {
        return (a) this.a.a();
    }

    public final void b(a aVar) {
        this.a.h(aVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agi)) {
            return false;
        }
        return d.F(((agi) obj).a(), a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "ContextMenuState(status=" + a() + ')';
    }

    public /* synthetic */ agi(byte[] bArr) {
        this.a = new byu(a.C0004a.a, cav.a);
    }
}
