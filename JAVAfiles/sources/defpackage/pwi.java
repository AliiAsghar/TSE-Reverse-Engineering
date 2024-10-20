package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class pwi extends pwm {
    private final pxe a;

    public pwi(pxe pxeVar) {
        this.a = pxeVar;
    }

    @Override // defpackage.pwm, defpackage.pwu
    public final pxe a() {
        return this.a;
    }

    @Override // defpackage.pwu
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pwu) {
            pwu pwuVar = (pwu) obj;
            if (pwuVar.b() == 2 && this.a.equals(pwuVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "EventContext{executeHttpRequest=" + this.a.toString() + "}";
    }
}
