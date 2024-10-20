package defpackage;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class abls extends abrc {
    static int a = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public abls(android.content.Context r5, com.google.android.gms.auth.api.signin.GoogleSignInOptions r6) {
        /*
            r4 = this;
            aaoc r0 = defpackage.abli.a
            adxq r1 = new adxq
            r1.<init>()
            aodm r2 = new aodm
            r3 = 1
            r2.<init>(r3)
            r1.b = r2
            abrb r1 = r1.j()
            r4.<init>(r5, r0, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abls.<init>(android.content.Context, com.google.android.gms.auth.api.signin.GoogleSignInOptions):void");
    }

    public final synchronized int a() {
        int i;
        i = a;
        if (i == 1) {
            Context context = this.c;
            abqa abqaVar = abqa.a;
            int h = abqaVar.h(context, 12451000);
            if (h == 0) {
                i = 4;
                a = 4;
            } else if (abqaVar.i(context, h, null) == null && DynamiteModule.a(context, "com.google.android.gms.auth.api.fallback") != 0) {
                i = 3;
                a = 3;
            } else {
                i = 2;
                a = 2;
            }
        }
        return i;
    }
}
