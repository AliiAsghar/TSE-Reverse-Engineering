package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ygj extends ygk {
    private final Integer a;

    public ygj(Integer num) {
        this.a = num;
    }

    @Override // defpackage.ygk, defpackage.yge
    public final Integer b() {
        return this.a;
    }

    @Override // defpackage.yge
    public final int d() {
        return 3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yge) {
            yge ygeVar = (yge) obj;
            if (ygeVar.d() == 3 && this.a.equals(ygeVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DataSource{resourceId=" + this.a + "}";
    }
}
