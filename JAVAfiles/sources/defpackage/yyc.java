package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yyc extends yyd {
    private final String a;
    private final String b;
    private final Runnable c;

    public yyc(String str, String str2, Runnable runnable) {
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

    @Override // defpackage.yyd
    public final Runnable a() {
        return this.c;
    }

    @Override // defpackage.yyd
    public final String b() {
        return this.b;
    }

    @Override // defpackage.yyd
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yyd) {
            yyd yydVar = (yyd) obj;
            if (this.a.equals(yydVar.c()) && this.b.equals(yydVar.b()) && this.c.equals(yydVar.a())) {
                yydVar.d();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 1237;
    }

    public final String toString() {
        return "SnackbarEvent{message=" + this.a + ", actionLabel=" + this.b + ", action=" + this.c.toString() + ", runRunnableInA11y=false}";
    }

    @Override // defpackage.yyd
    public final void d() {
    }
}
