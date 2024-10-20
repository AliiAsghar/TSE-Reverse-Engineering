package defpackage;

import android.util.Log;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gum extends arpw implements arqx {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ long c;

    public gum(arpe arpeVar) {
        super(4, arpeVar);
    }

    @Override // defpackage.arqx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        gum gumVar = new gum((arpe) obj4);
        gumVar.b = (Throwable) obj2;
        gumVar.c = longValue;
        return gumVar.b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        arpl arplVar = arpl.a;
        int i = this.a;
        aqil.P(obj);
        if (i == 0) {
            Object obj2 = this.b;
            long j = this.c;
            gsy.a();
            Log.e(guo.a, "Cannot check for unfinished work", (Throwable) obj2);
            long min = Math.min(j * 30000, guo.b);
            this.a = 1;
            if (arwi.m(min, this) == arplVar) {
                return arplVar;
            }
        }
        return true;
    }
}
