package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aina extends aiku implements Cloneable {
    protected String a;

    public aina() {
    }

    @Override // defpackage.aiku
    public final String c() {
        return this.a;
    }

    @Override // defpackage.aiku
    public final Object clone() {
        aina ainaVar = new aina();
        ainaVar.a = this.a;
        return ainaVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (!obj.getClass().equals(getClass()) || this.a.compareTo(((aina) obj).a) != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public aina(String str) {
        this.a = str;
    }
}
