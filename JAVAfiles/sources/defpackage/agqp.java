package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agqp extends ance {
    Object a;

    public agqp(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.ance
    public final String gs() {
        Object obj = this.a;
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // defpackage.ance
    protected final void gt() {
        this.a = null;
    }
}
