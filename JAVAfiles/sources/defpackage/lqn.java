package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lqn {
    public final Object a;

    public lqn(Object obj) {
        this.a = obj;
    }

    public static lqn e(ComponentName componentName, String str) {
        lqn lqnVar = new lqn();
        ((Intent) lqnVar.a).setComponent(componentName);
        lqnVar.b(str);
        return lqnVar;
    }

    public static lqn f(Context context, Class cls, String str) {
        lqn lqnVar = new lqn();
        ((Intent) lqnVar.a).setClass(context, cls);
        lqnVar.b(str);
        return lqnVar;
    }

    public static lqn g(String str) {
        lqn lqnVar = new lqn();
        lqnVar.b(str);
        return lqnVar;
    }

    public static Uri i(msh mshVar) {
        Optional e = mshVar.e();
        if (e.isPresent()) {
            return j((qei) e.get());
        }
        String h = mshVar.h(true);
        if (h != null) {
            return Uri.parse("tel:".concat(h));
        }
        throw new IllegalArgumentException("No rcs identifier found in messaging identity");
    }

    public static Uri j(qei qeiVar) {
        if ((qeiVar.b & 2) != 0) {
            String str = qeiVar.d;
            qeh b = qeh.b(qeiVar.c);
            if (b == null) {
                b = qeh.UNKNOWN_TYPE;
            }
            int ordinal = b.ordinal();
            if (ordinal != 1) {
                if (ordinal != 3) {
                    qeh b2 = qeh.b(qeiVar.c);
                    if (b2 == null) {
                        b2 = qeh.UNKNOWN_TYPE;
                    }
                    throw new IllegalArgumentException("Unsupported endpoint type: ".concat(String.valueOf(b2.name())));
                }
                xze xzeVar = xca.a;
                if (msx.g(str)) {
                    return Uri.parse("sip:".concat(String.valueOf(str)));
                }
            }
            return Uri.parse("tel:".concat(String.valueOf(str)));
        }
        throw new IllegalArgumentException("No rcs identifier found in ChatEndpoint");
    }

    public static msz m(msh mshVar) {
        aozy createBuilder = msz.a.createBuilder();
        msy a = mshVar.a();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((msz) createBuilder.b).c = a.a();
        String n = mshVar.n();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        ((msz) createBuilder.b).h = n;
        String m = mshVar.m();
        if (m != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((msz) createBuilder.b).k = m;
        }
        String str = mshVar.F().a;
        if (str != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((msz) createBuilder.b).f = str;
        }
        String i = mshVar.i();
        if (i != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((msz) createBuilder.b).d = i;
        }
        String l = mshVar.l(true);
        if (l != null) {
            if (!createBuilder.b.isMutable()) {
                createBuilder.u();
            }
            ((msz) createBuilder.b).e = l;
        }
        Optional c = mshVar.c();
        createBuilder.getClass();
        c.ifPresent(new mpv(createBuilder, 2));
        mshVar.b().map(new mqm(15)).ifPresent(new mpv(createBuilder, 3));
        mshVar.f().ifPresent(new mpv(createBuilder, 4));
        mshVar.e().ifPresent(new mpv(createBuilder, 5));
        return (msz) createBuilder.s();
    }

    public static apdj n(msh mshVar) {
        return new ProtoParsers$InternalDontUse(null, m(mshVar));
    }

    public final Intent a() {
        return (Intent) ((Intent) this.a).clone();
    }

    public final void b(String str) {
        d.t(!str.isEmpty(), "The action of intent should not be set to empty. (go/responsible-api-intent-issues)");
        ((Intent) this.a).setAction(str);
    }

    public final void c(String str) {
        d.t(!str.isEmpty(), "The package of intent should not be set to empty.");
        ((Intent) this.a).setPackage(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void d() {
        ((uof) this.a.b()).f("vendor_ims_call");
    }

    public final akul h(ahqq ahqqVar, akul akulVar, ahka ahkaVar) {
        return akulVar.h(new kxr(this, ahqqVar, ahkaVar, 4), andi.a).f(Throwable.class, new mhv(this, ahqqVar, ahkaVar, 1, (char[]) null), andi.a);
    }

    public final msh k(apdj apdjVar) {
        return l((msz) apdjVar.a(msz.a, aozs.a()));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Type inference failed for: r7v1, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.msh l(defpackage.msz r20) {
        /*
            r19 = this;
            r0 = r20
            qei r1 = r0.i
            if (r1 != 0) goto L8
            qei r1 = defpackage.qei.a
        L8:
            int r1 = r1.b
            r1 = r1 & 2
            r2 = 1
            if (r1 == 0) goto L25
            qei r1 = r0.i
            if (r1 != 0) goto L16
            qei r3 = defpackage.qei.a
            goto L17
        L16:
            r3 = r1
        L17:
            int r3 = r3.b
            r3 = r3 & r2
            if (r3 == 0) goto L25
            if (r1 != 0) goto L20
            qei r1 = defpackage.qei.a
        L20:
            j$.util.Optional r1 = j$.util.Optional.of(r1)
            goto L29
        L25:
            j$.util.Optional r1 = j$.util.Optional.empty()
        L29:
            java.lang.String r3 = r0.g
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L36
            j$.util.Optional r3 = j$.util.Optional.empty()
            goto L3c
        L36:
            java.lang.String r3 = r0.g
            j$.util.Optional r3 = j$.util.Optional.of(r3)
        L3c:
            java.lang.String r4 = r0.j
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L49
            j$.util.Optional r4 = j$.util.Optional.empty()
            goto L58
        L49:
            yjt r4 = new yjt
            java.lang.String r5 = r0.j
            int r5 = java.lang.Integer.parseInt(r5)
            r4.<init>(r5)
            j$.util.Optional r4 = j$.util.Optional.of(r4)
        L58:
            java.lang.String r5 = r0.l
            j$.util.Optional r5 = j$.util.Optional.of(r5)
            mmd r6 = new mmd
            r7 = 10
            r6.<init>(r7)
            j$.util.Optional r5 = r5.filter(r6)
            r6 = r19
            java.lang.Object r7 = r6.a
            java.lang.Object r7 = r7.b()
            r8 = r7
            lxe r8 = (defpackage.lxe) r8
            r20.getClass()
            mse r9 = new mse
            r7 = 16
            r9.<init>(r0, r7)
            mse r10 = new mse
            r7 = 17
            r10.<init>(r0, r7)
            mse r11 = new mse
            r7 = 18
            r11.<init>(r3, r7)
            mse r12 = new mse
            r3 = 19
            r12.<init>(r0, r3)
            mse r13 = new mse
            r3 = 20
            r13.<init>(r0, r3)
            msi r14 = new msi
            r14.<init>(r1, r2)
            msi r15 = new msi
            r1 = 0
            r15.<init>(r0, r1)
            mse r1 = new mse
            r2 = 13
            r1.<init>(r0, r2)
            mse r0 = new mse
            r2 = 14
            r0.<init>(r4, r2)
            mse r2 = new mse
            r3 = 15
            r2.<init>(r5, r3)
            r16 = r1
            r17 = r0
            r18 = r2
            msg r0 = r8.j(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqn.l(msz):msh");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void o(int i, int i2) {
        maq maqVar = (maq) this.a.b();
        amfq amfqVar = (amfq) amfr.a.createBuilder();
        amfp amfpVar = amfp.BUGLE_CONVERSATION_READ_STATUS_EVENT;
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar = (amfr) amfqVar.b;
        amfrVar.i = amfpVar.dg;
        amfrVar.b |= 1;
        aozy createBuilder = amwa.a.createBuilder();
        if (!createBuilder.b.isMutable()) {
            createBuilder.u();
        }
        apag apagVar = createBuilder.b;
        amwa amwaVar = (amwa) apagVar;
        amwaVar.d = 2;
        amwaVar.b = 2 | amwaVar.b;
        if (!apagVar.isMutable()) {
            createBuilder.u();
        }
        apag apagVar2 = createBuilder.b;
        amwa amwaVar2 = (amwa) apagVar2;
        amwaVar2.c = i - 1;
        amwaVar2.b |= 1;
        if (!apagVar2.isMutable()) {
            createBuilder.u();
        }
        amwa amwaVar3 = (amwa) createBuilder.b;
        amwaVar3.b |= 4;
        amwaVar3.e = i2;
        amwa amwaVar4 = (amwa) createBuilder.s();
        if (!amfqVar.b.isMutable()) {
            amfqVar.u();
        }
        amfr amfrVar2 = (amfr) amfqVar.b;
        amwaVar4.getClass();
        amfrVar2.bl = amwaVar4;
        amfrVar2.g |= 256;
        maqVar.j(amfqVar);
    }

    public lqn(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public lqn(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public lqn(armf armfVar, short[] sArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public lqn(MessageCoreData messageCoreData) {
        this.a = messageCoreData.y().j();
    }

    private lqn() {
        this.a = new Intent();
    }

    public lqn(armf armfVar, char[] cArr, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public lqn(arwe arweVar) {
        arweVar.getClass();
        this.a = arweVar;
    }

    public lqn(armf armfVar, char[] cArr) {
        this.a = new mip(new msl(1), armfVar);
    }
}
