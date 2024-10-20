package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class tsv extends tsx {
    private final pwh a;

    public tsv(pwh pwhVar) {
        this.a = pwhVar;
    }

    @Override // defpackage.tsx, defpackage.tvf
    public final pwh a() {
        return this.a;
    }

    @Override // defpackage.tvf
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof tvf) {
            tvf tvfVar = (tvf) obj;
            if (tvfVar.b() == 1 && this.a.equals(tvfVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResultOrSkipped{result=" + this.a.toString() + "}";
    }
}
