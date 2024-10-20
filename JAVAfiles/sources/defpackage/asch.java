package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class asch implements arwu {
    public final ascj a;
    public final long b;
    public final Object c;
    public final arpe d;

    public asch(ascj ascjVar, long j, Object obj, arpe arpeVar) {
        this.a = ascjVar;
        this.b = j;
        this.c = obj;
        this.d = arpeVar;
    }

    @Override // defpackage.arwu
    public final void hd() {
        ascj ascjVar = this.a;
        synchronized (ascjVar) {
            if (this.b < ascjVar.f()) {
                return;
            }
            Object[] objArr = ascjVar.a;
            objArr.getClass();
            if (asck.a(objArr, this.b) != this) {
                return;
            }
            asck.b(objArr, this.b, asck.a);
            ascjVar.k();
        }
    }
}
