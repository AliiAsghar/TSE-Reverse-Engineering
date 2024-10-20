package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zwh extends zwn {
    private final String a;
    private final String b;
    private final Runnable c;

    public zwh(String str, String str2, Runnable runnable) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = runnable;
                return;
            }
            throw new NullPointerException("Null actionLabel");
        }
        throw new NullPointerException("Null message");
    }

    @Override // defpackage.zwn
    public final Runnable a() {
        return this.c;
    }

    @Override // defpackage.zwn
    public final String b() {
        return this.b;
    }

    @Override // defpackage.zwn
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zwn) {
            zwn zwnVar = (zwn) obj;
            if (this.a.equals(zwnVar.c()) && this.b.equals(zwnVar.b()) && this.c.equals(zwnVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "UnblockUnspamSnackbarEvent{message=" + this.a + ", actionLabel=" + this.b + ", action=" + this.c.toString() + "}";
    }
}
