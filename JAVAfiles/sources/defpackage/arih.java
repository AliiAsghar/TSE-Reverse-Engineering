package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class arih extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public arih(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        boolean z;
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        iig iigVar = (iig) arsd.k((Optional) ((apxx) ((atsg) this.a).g).a);
                        if (iigVar != null) {
                            z = iigVar.a();
                        } else {
                            z = false;
                        }
                        return Boolean.valueOf(z);
                    }
                    return this.a;
                }
                return this.a.iterator();
            }
            return Boolean.valueOf(((aqru) this.a).k());
        }
        return Boolean.valueOf(((aqvr) this.a).e());
    }
}
