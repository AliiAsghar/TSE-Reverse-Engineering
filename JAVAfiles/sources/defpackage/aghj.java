package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aghj implements aghk {
    public final aftn a;

    public aghj(aftn aftnVar) {
        this.a = aftnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aghj) && d.F(this.a, ((aghj) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Stopped(audioFile=" + this.a + ")";
    }
}
