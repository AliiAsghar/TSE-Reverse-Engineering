package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class alxr {
    private static final alxr a = new alxl();

    public static alxr g(alxa alxaVar, alxa alxaVar2) {
        int b = alxaVar.b() + alxaVar2.b();
        if (b == 0) {
            return a;
        }
        if (b <= 28) {
            return new alxp(alxaVar, alxaVar2);
        }
        return new alxq(alxaVar, alxaVar2);
    }

    public abstract int a();

    public abstract Object b(alvz alvzVar);

    public abstract Set c();

    public abstract void d(alxh alxhVar, Object obj);
}
