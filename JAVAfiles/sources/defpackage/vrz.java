package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vrz implements alhr {
    public final /* synthetic */ long a;
    private final /* synthetic */ int b;

    public /* synthetic */ vrz(long j, int i) {
        this.b = i;
        this.a = j;
    }

    @Override // defpackage.alhr
    public final Object get() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return String.format(Locale.US, "%.1e", Double.valueOf(this.a));
                    }
                    return String.valueOf(this.a);
                }
                return Long.valueOf(this.a);
            }
            tbt tbtVar = new tbt();
            tbtVar.r(tqq.USER_CANCELED);
            return Boolean.valueOf(tbtVar.b(String.valueOf(this.a)));
        }
        snf e = sni.e();
        e.w("getConversationIdFromThreadId");
        e.f(new vmd(20));
        e.h(new rum(this.a, 6));
        return ((smr) ((sna) e.b().n()).cP()).x();
    }
}
