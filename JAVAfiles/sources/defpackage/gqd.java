package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqd {
    public final gpt a;

    public gqd() {
        this(gpt.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqd)) {
            return false;
        }
        return d.F(this.a, ((gqd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "gqd: {bounds=" + this.a + '}';
    }

    public gqd(gpt gptVar) {
        gptVar.getClass();
        this.a = gptVar;
    }
}
