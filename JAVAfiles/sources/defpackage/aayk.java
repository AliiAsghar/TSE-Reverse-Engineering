package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aayk extends aayn {
    private final int a;

    public aayk(int i) {
        this.a = i;
    }

    @Override // defpackage.aayn
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof aayn) && this.a == ((aayn) obj).a()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        a.aS(i);
        return i ^ 1000003;
    }

    public final String toString() {
        String str;
        if (this.a != 1) {
            str = "SHOW_SUCCESS_PROMO";
        } else {
            str = "FINISH";
        }
        return a.bW(str, "RcsPromoEvent{eventId=", "}");
    }
}
