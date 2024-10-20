package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjf implements atje {
    public final atje a;

    private atjf(atje atjeVar) {
        this.a = atjeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static atjf b(atje atjeVar) {
        if (atjeVar instanceof atjb) {
            return ((atjb) atjeVar).a;
        }
        if (atjeVar instanceof atjf) {
            return (atjf) atjeVar;
        }
        if (atjeVar == null) {
            return null;
        }
        return new atjf(atjeVar);
    }

    @Override // defpackage.atje
    public final int a() {
        return this.a.a();
    }

    @Override // defpackage.atje
    public final int c(atja atjaVar, CharSequence charSequence, int i) {
        return this.a.c(atjaVar, charSequence, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atjf) {
            return this.a.equals(((atjf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
