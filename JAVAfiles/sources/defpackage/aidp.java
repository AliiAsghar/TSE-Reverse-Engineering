package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aidp extends aidq {
    private final alqf a;

    public aidp(alqf alqfVar) {
        this.a = alqfVar;
    }

    @Override // defpackage.aidt
    public final int a() {
        return 1;
    }

    @Override // defpackage.aidq, defpackage.aidt
    public final alqf b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aidt) {
            aidt aidtVar = (aidt) obj;
            if (aidtVar.a() == 1 && this.a.equals(aidtVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return alzz.F(this.a);
    }

    public final String toString() {
        return "ExperimentIdsOrError{experimentIds=" + this.a.toString() + "}";
    }
}
