package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aimg extends ailq {
    static {
        new aimg();
    }

    public aimg() {
        super("From");
    }

    public final void e(String str) {
        super.k("tag", str);
    }

    @Override // defpackage.ailq, defpackage.aimm, defpackage.aimh
    public final boolean equals(Object obj) {
        if (obj != null && this.a != null) {
            if (obj.getClass().equals(getClass())) {
                return super.equals(obj);
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ailq, defpackage.aimm, defpackage.aimh
    public final int hashCode() {
        return 5678;
    }
}
