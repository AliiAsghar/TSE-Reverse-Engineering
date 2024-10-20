package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pwk extends pwm {
    private final pwt a;

    public pwk(pwt pwtVar) {
        this.a = pwtVar;
    }

    @Override // defpackage.pwu
    public final int b() {
        return 3;
    }

    @Override // defpackage.pwm, defpackage.pwu
    public final pwt d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pwu) {
            pwu pwuVar = (pwu) obj;
            if (pwuVar.b() == 3 && this.a.equals(pwuVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventContext{finishWithHttpResponse=" + this.a.toString() + "}";
    }
}
