package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class igg extends igi {
    private final ihf a;

    public igg(ihf ihfVar) {
        this.a = ihfVar;
    }

    @Override // defpackage.igi, defpackage.ihd
    public final ihf a() {
        return this.a;
    }

    @Override // defpackage.ihd
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ihd) {
            ihd ihdVar = (ihd) obj;
            if (ihdVar.b() == 2 && this.a.equals(ihdVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DialogTarget{lighterConversationTarget=" + this.a.toString() + "}";
    }
}
