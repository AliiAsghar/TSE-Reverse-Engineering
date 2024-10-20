package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ascl extends asdi {
    public long a = -1;
    public arpe b;

    @Override // defpackage.asdi
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        ascj ascjVar = (ascj) obj;
        if (this.a >= 0) {
            return false;
        }
        long j = ascjVar.b;
        if (j < ascjVar.c) {
            ascjVar.c = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.asdi
    public final /* bridge */ /* synthetic */ arpe[] b(Object obj) {
        boolean z = arwh.a;
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((ascj) obj).l(j);
    }
}
