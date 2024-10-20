package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aexe implements aexg {
    private final aexn a;

    public aexe(aexn aexnVar) {
        this.a = aexnVar;
    }

    @Override // defpackage.aexg
    public final aexn a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aexe) && d.F(this.a, ((aexe) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HorizontalRichCardMedia(media=" + this.a + ")";
    }
}
