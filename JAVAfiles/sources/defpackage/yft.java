package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yft {
    public static final /* synthetic */ int a = 0;
    private static final utz b = uuh.k(uuh.b, "launch_conversation_recipient_string_max_length", 100);
    private final armf c;

    public yft(armf armfVar) {
        this.c = armfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.util.Optional a(android.content.Intent r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L7
            j$.util.Optional r7 = j$.util.Optional.empty()
            return r7
        L7:
            android.net.Uri r0 = r7.getData()
            alvi r1 = defpackage.ydk.a
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L13
        L11:
            r0 = r2
            goto L53
        L13:
            java.util.Set r3 = defpackage.ydk.b
            java.lang.String r4 = r0.getScheme()
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L20
            goto L11
        L20:
            r3 = 63
            anna r3 = defpackage.anna.e(r3)
            java.lang.String r0 = r0.getSchemeSpecificPart()
            java.util.List r0 = r3.c(r0)
            java.lang.Object r3 = r0.get(r1)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L3b
            goto L11
        L3b:
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = defpackage.d.ap(r0)
            r3 = 59
            r4 = 44
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.String r3 = ","
            java.lang.String[] r0 = r0.split(r3)
        L53:
            if (r0 != 0) goto L78
            java.lang.String r3 = "address"
            java.lang.String r3 = r7.getStringExtra(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r5 = "[,;]"
            if (r4 != 0) goto L68
            java.lang.String[] r0 = r3.split(r5)
            goto L78
        L68:
            java.lang.String r3 = "android.intent.extra.EMAIL"
            java.lang.String r7 = r7.getStringExtra(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 != 0) goto L78
            java.lang.String[] r0 = r7.split(r5)
        L78:
            if (r0 != 0) goto L7b
            goto Lbb
        L7b:
            alob r7 = new alob
            r7.<init>()
        L80:
            int r3 = r0.length
            if (r1 >= r3) goto L9d
            r3 = r0[r1]
            int r4 = r3.length()
            utz r5 = defpackage.yft.b
            java.lang.Object r5 = r5.e()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r4 >= r5) goto L9a
            r7.h(r3)
        L9a:
            int r1 = r1 + 1
            goto L80
        L9d:
            alog r7 = r7.g()
            r0 = r7
            alsx r0 = (defpackage.alsx) r0
            int r0 = r0.c
            if (r0 != 0) goto La9
            goto Lbb
        La9:
            j$.util.stream.Stream r7 = j$.util.Collection.EL.stream(r7)
            mlo r0 = new mlo
            r1 = 20
            r0.<init>(r1)
            java.lang.Object[] r7 = r7.toArray(r0)
            r2 = r7
            java.lang.String[] r2 = (java.lang.String[]) r2
        Lbb:
            if (r2 == 0) goto Ld3
            int r7 = r2.length
        Lbe:
            int r7 = r7 + (-1)
            if (r7 < 0) goto Ld3
            armf r0 = r6.c
            java.lang.Object r0 = r0.b()
            xca r0 = (defpackage.xca) r0
            r1 = r2[r7]
            java.lang.String r0 = r0.f(r1)
            r2[r7] = r0
            goto Lbe
        Ld3:
            j$.util.Optional r7 = j$.util.Optional.ofNullable(r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yft.a(android.content.Intent):j$.util.Optional");
    }
}
