package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aech extends adcx {
    public final alor a;

    public aech(alor alorVar) {
        super(null, null);
        this.a = alorVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aech) && d.F(this.a, ((aech) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
