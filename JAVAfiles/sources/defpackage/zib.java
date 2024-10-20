package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zib {
    public static final akfc a = new akgc("CHAT_IDENTITY_SETTINGS_SELECTION_DATASERVICE_KEY");
    public final arwe b;
    private final Context c;
    private final armf d;
    private final armf e;

    public zib(Context context, arwe arweVar, armf armfVar, armf armfVar2) {
        context.getClass();
        arweVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.c = context;
        this.b = arweVar;
        this.d = armfVar;
        this.e = armfVar2;
    }

    private final zie b(String str, String str2, String str3) {
        Intent k = ((lzv) this.d.b()).k(this.c, str.hashCode(), str2);
        k.getClass();
        return new zie(str, str2, str3, k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.util.Collection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.zia
            if (r0 == 0) goto L13
            r0 = r7
            zia r0 = (defpackage.zia) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            zia r0 = new zia
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zib r0 = r0.d
            defpackage.aqil.P(r7)
            goto L52
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L31:
            defpackage.aqil.P(r7)
            armf r7 = r6.e
            java.lang.Object r7 = r7.b()
            nfx r7 = (defpackage.nfx) r7
            ncq r7 = r7.a()
            akul r7 = r7.b()
            r7.getClass()
            r0.d = r6
            r0.c = r3
            java.lang.Object r7 = defpackage.arro.F(r7, r0)
            if (r7 == r1) goto Ld7
            r0 = r6
        L52:
            alog r7 = (defpackage.alog) r7
            r7.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.aqjn.J(r7, r2)
            r1.<init>(r2)
            java.util.Iterator r7 = r7.iterator()
        L66:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Lb8
            java.lang.Object r2 = r7.next()
            nfw r2 = (defpackage.nfw) r2
            r2.getClass()
            java.lang.String r3 = r2.j()
            if (r3 == 0) goto L81
            int r4 = r3.length()
            if (r4 != 0) goto L8d
        L81:
            android.content.Context r3 = r0.c
            r4 = 2132021464(0x7f1410d8, float:1.968132E38)
            java.lang.String r3 = r3.getString(r4)
            r3.getClass()
        L8d:
            java.lang.String r4 = r2.k()
            int r4 = r4.length()
            if (r4 != 0) goto La4
            android.content.Context r4 = r0.c
            r5 = 2132021463(0x7f1410d7, float:1.9681318E38)
            java.lang.String r4 = r4.getString(r5)
            r4.getClass()
            goto La8
        La4:
            java.lang.String r4 = r2.k()
        La8:
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r2 = r2.f()
            com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl r2 = (com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl) r2
            java.lang.String r2 = r2.a
            zie r2 = r0.b(r2, r4, r3)
            r1.add(r2)
            goto L66
        Lb8:
            boolean r7 = r1.isEmpty()
            if (r7 == 0) goto Ld7
            android.content.Context r7 = r0.c
            r1 = 2132017350(0x7f1400c6, float:1.9672976E38)
            java.lang.String r7 = r7.getString(r1)
            r7.getClass()
            java.lang.String r1 = ""
            java.lang.String r2 = "0"
            zie r7 = r0.b(r2, r7, r1)
            java.util.List r7 = defpackage.aqjn.y(r7)
            return r7
        Ld7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zib.a(arpe):java.lang.Object");
    }
}
