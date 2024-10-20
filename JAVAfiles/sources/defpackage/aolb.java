package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aolb implements armf {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aolb(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    @Override // defpackage.armf, defpackage.arme
    public final Object b() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    return alog.r((alog) this.a.b());
                }
                return alog.s(new aolc(((atii) this.a).c, 1), new aolt());
            }
            alob alobVar = new alob();
            Iterator it = ((atii) this.a).d.iterator();
            while (it.hasNext()) {
                alobVar.h(((aoju) it.next()).a());
            }
            return alobVar.g();
        }
        return alog.r(new aolc(this.a, 0));
    }
}
