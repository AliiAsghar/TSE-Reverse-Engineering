package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pwj extends pwm {
    private final pwr a;

    public pwj(pwr pwrVar) {
        this.a = pwrVar;
    }

    @Override // defpackage.pwu
    public final int b() {
        return 4;
    }

    @Override // defpackage.pwm, defpackage.pwu
    public final pwr c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pwu) {
            pwu pwuVar = (pwu) obj;
            if (pwuVar.b() == 4 && this.a.equals(pwuVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventContext{finishWithFailure=" + this.a.toString() + "}";
    }
}
