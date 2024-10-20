package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erp {
    public static final /* synthetic */ int b = 0;
    public final eql a;

    static {
        dzf.f(new apvo((char[]) null));
        eul.M(0);
    }

    public erp(eql eqlVar) {
        this.a = eqlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erp)) {
            return false;
        }
        return this.a.equals(((erp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
