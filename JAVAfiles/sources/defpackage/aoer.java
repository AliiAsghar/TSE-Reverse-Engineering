package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aoer implements aohf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aoer(Context context, String str, int i) {
        this.c = i;
        this.b = context;
        this.a = str;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [aoeo, java.lang.Object] */
    @Override // defpackage.aohf
    public final Object a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                return new aojh((Context) this.b, (String) this.a);
            }
            aodi aodiVar = (aodi) this.a;
            aoet aoetVar = aodiVar.c;
            String f = aodiVar.f();
            return new aoia((Context) this.b, f);
        }
        aoen aoenVar = (aoen) this.b;
        return aoenVar.f.a(new aofi(aoenVar, this.a));
    }

    public /* synthetic */ aoer(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
