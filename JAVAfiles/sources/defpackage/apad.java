package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class apad implements Comparable {
    final apal a;
    public final int b;
    public final apdf c;
    public final boolean d;
    public final boolean e;

    public apad(apal apalVar, int i, apdf apdfVar, boolean z, boolean z2) {
        this.a = apalVar;
        this.b = i;
        this.c = apdfVar;
        this.d = z;
        this.e = z2;
    }

    public final apdg a() {
        return this.c.s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.b - ((apad) obj).b;
    }
}
