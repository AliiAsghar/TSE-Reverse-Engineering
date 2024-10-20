package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aoxy implements Comparable {
    public final aoyb a;
    public final aoya b;

    public aoxy(aoyb aoybVar, aoya aoyaVar) {
        this.a = aoybVar;
        this.b = aoyaVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b.compareTo(((aoxy) obj).b);
    }

    public final String toString() {
        aoya aoyaVar = this.b;
        return "[" + String.valueOf(this.a) + ", " + String.valueOf(aoyaVar) + "]";
    }
}
