package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jeo implements asai {
    final /* synthetic */ asai a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public jeo(asai asaiVar, Context context, armf armfVar, lgd lgdVar, int i) {
        this.e = i;
        this.a = asaiVar;
        this.b = context;
        this.d = armfVar;
        this.c = lgdVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [armf, java.lang.Object] */
    @Override // defpackage.asai
    public final Object a(asaj asajVar, arpe arpeVar) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    Object obj = this.d;
                    Object a = this.a.a(new jen(asajVar, this.b, this.c, obj, 3), arpeVar);
                    if (a == arpl.a) {
                        return a;
                    }
                    return arnb.a;
                }
                Object obj2 = this.c;
                Object a2 = this.a.a(new jen(asajVar, (Context) this.b, (armf) this.d, (lgd) obj2, 2), arpeVar);
                if (a2 == arpl.a) {
                    return a2;
                }
                return arnb.a;
            }
            Object obj3 = this.d;
            Object a3 = this.a.a(new jen(asajVar, this.b, this.c, obj3, 1), arpeVar);
            if (a3 == arpl.a) {
                return a3;
            }
            return arnb.a;
        }
        Object obj4 = this.d;
        Object a4 = this.a.a(new jen(asajVar, this.b, this.c, obj4, 0), arpeVar);
        if (a4 == arpl.a) {
            return a4;
        }
        return arnb.a;
    }

    public jeo(asai asaiVar, Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.a = asaiVar;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
