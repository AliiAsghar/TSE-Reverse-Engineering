package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jqw implements asaj {
    final /* synthetic */ jqy a;

    public jqw(jqy jqyVar) {
        this.a = jqyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.asaj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object fv(defpackage.jqt r10, defpackage.arpe r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.jqv
            if (r0 == 0) goto L13
            r0 = r11
            jqv r0 = (defpackage.jqv) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            jqv r0 = new jqv
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            java.lang.String r4 = "emit"
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/encryption/DraftEncryptor$start$1$3"
            java.lang.String r6 = "DraftEncryptor.kt"
            java.lang.String r7 = "BugleComposeRow2"
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            jqw r10 = r0.d
            defpackage.aqil.P(r11)
            goto L96
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            defpackage.aqil.P(r11)
            boolean r11 = r10.a
            boolean r10 = r10.b
            alvi r2 = defpackage.jqy.a
            alvw r2 = r2.d()
            alvz r8 = defpackage.alwp.a
            r2.X(r8, r7)
            r8 = 45
            alvw r2 = r2.h(r5, r4, r8, r6)
            alvg r2 = (defpackage.alvg) r2
            java.lang.String r8 = "DraftEncryptor isModified %b, isEncrypted %b"
            r2.I(r8, r11, r10)
            if (r11 != 0) goto L7e
            if (r10 == 0) goto Lb9
            alvi r10 = defpackage.jqy.a
            alvw r10 = r10.g()
            alvz r11 = defpackage.alwp.a
            r10.X(r11, r7)
            r11 = 48
            alvw r10 = r10.h(r5, r4, r11, r6)
            alvg r10 = (defpackage.alvg) r10
            java.lang.String r11 = "Draft isn't modified but is encrypted: removing encryption"
            r10.q(r11)
            jqy r10 = r9.a
            jxv r10 = r10.d
            jld r11 = defpackage.jld.l
            r10.e(r11)
            goto Lb9
        L7e:
            if (r10 != 0) goto Lb9
            jqy r10 = r9.a
            jjv r11 = new jjv
            ascg r10 = r10.c
            r2 = 12
            r11.<init>(r10, r2)
            r0.d = r9
            r0.c = r3
            java.lang.Object r10 = defpackage.arrn.U(r11, r0)
            if (r10 == r1) goto Lb8
            r10 = r9
        L96:
            alvi r11 = defpackage.jqy.a
            alvw r11 = r11.g()
            alvz r0 = defpackage.alwp.a
            r11.X(r0, r7)
            r0 = 57
            alvw r11 = r11.h(r5, r4, r0, r6)
            alvg r11 = (defpackage.alvg) r11
            java.lang.String r0 = "Draft is modified, not encrypted, and encryption is supported: adding encryption"
            r11.q(r0)
            jqy r10 = r10.a
            jxv r10 = r10.d
            jld r11 = defpackage.jld.m
            r10.e(r11)
            goto Lb9
        Lb8:
            return r1
        Lb9:
            arnb r10 = defpackage.arnb.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jqw.fv(jqt, arpe):java.lang.Object");
    }
}
