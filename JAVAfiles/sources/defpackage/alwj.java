package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class alwj extends alvr {
    private final StackTraceElement b;

    public alwj(StackTraceElement stackTraceElement) {
        this.b = stackTraceElement;
    }

    @Override // defpackage.alvr
    public final int a() {
        return Math.max(this.b.getLineNumber(), 0);
    }

    @Override // defpackage.alvr
    public final String b() {
        return this.b.getClassName();
    }

    @Override // defpackage.alvr
    public final String c() {
        return this.b.getFileName();
    }

    @Override // defpackage.alvr
    public final String d() {
        return this.b.getMethodName();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof alwj) && this.b.equals(((alwj) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
