package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class urq implements uns {
    final uni a;
    public final unu b;
    final /* synthetic */ upr c;
    final /* synthetic */ String d;
    final /* synthetic */ alog e;
    final /* synthetic */ unx f;
    final /* synthetic */ urr g;

    public urq(urr urrVar, upr uprVar, String str, alog alogVar, unx unxVar) {
        this.c = uprVar;
        this.d = str;
        this.e = alogVar;
        this.f = unxVar;
        this.g = urrVar;
        this.a = urrVar.n.a(uprVar);
        this.b = unu.a(str, alogVar);
    }

    @Override // defpackage.uns
    public final unu a() {
        return this.b;
    }

    @Override // defpackage.uns
    public final boolean b() {
        return this.a.d(unh.CANCELLED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uns
    public final boolean c() {
        int i = this.f.a().e;
        if (this.f instanceof unl) {
            alog alogVar = this.e;
            int size = alogVar.size();
            int i2 = 0;
            while (i2 < size) {
                int h = ((upr) alogVar.get(i2)).h() + 1;
                i2++;
                if (h < i) {
                    return true;
                }
            }
            return false;
        }
        if (this.c.h() + 1 >= i) {
            return false;
        }
        return true;
    }
}
