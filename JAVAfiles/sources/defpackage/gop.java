package defpackage;

import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gop {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gop(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public final void a() {
        Object obj = this.b;
        exi exiVar = (exi) obj;
        boolean z = exiVar.j;
        Object obj2 = this.c;
        if (z) {
            new exl(this.a, 1).run();
            int i = ewx.a;
            return;
        }
        synchronized (exiVar.i) {
            apuv apuvVar = ((exi) obj).l;
            if (apuvVar != null) {
                ((ezc) obj2).d(new exd(obj, apuvVar, 2));
                ((exi) obj).l = null;
            }
        }
    }

    public gop(Method method, Object obj, Object obj2) {
        this.c = method;
        this.a = obj;
        this.b = obj2;
    }
}
