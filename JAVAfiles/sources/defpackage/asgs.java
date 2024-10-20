package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asgs extends aseo {
    public final atoi c;

    public asgs(long j, asgs asgsVar, int i) {
        super(j, asgsVar, i);
        this.c = new atoi(asgr.f);
    }

    @Override // defpackage.aseo
    public final int a() {
        return asgr.f;
    }

    @Override // defpackage.aseo
    public final void l(int i) {
        atoi atoiVar = this.c;
        atoiVar.a(i).c(asgr.e);
        s();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.b + ", hashCode=" + hashCode() + "]";
    }
}
