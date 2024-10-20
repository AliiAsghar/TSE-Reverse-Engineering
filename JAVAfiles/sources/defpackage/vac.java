package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vac implements rwt, rwo {
    private static final alwo b = alwo.o("BugleCaption");
    public final Optional a;
    private final armf c;
    private final rtb d;
    private final mlu e;
    private final arml f;

    public vac(armf armfVar, rtb rtbVar, mlu mluVar, Optional optional) {
        armfVar.getClass();
        rtbVar.getClass();
        mluVar.getClass();
        this.c = armfVar;
        this.d = rtbVar;
        this.e = mluVar;
        this.a = optional;
        this.f = armd.a(new vnq(this, 1));
    }

    private final String i() {
        return (String) this.f.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.rwt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r6, java.util.List r7, defpackage.arpe r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.vaa
            if (r0 == 0) goto L13
            r0 = r8
            vaa r0 = (defpackage.vaa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            vaa r0 = new vaa
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            akrh r6 = r0.d
            defpackage.aqil.P(r8)     // Catch: java.lang.Throwable -> L29
            goto L49
        L29:
            r7 = move-exception
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            defpackage.aqil.P(r8)
            java.lang.String r8 = "ImageCaptionTransportListener::onBeforeInsertion"
            akrh r8 = defpackage.aktp.e(r8)
            r0.d = r8     // Catch: java.lang.Throwable -> L4f
            r0.c = r3     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r6 = r5.h(r6, r7, r0)     // Catch: java.lang.Throwable -> L4f
            if (r6 == r1) goto L4e
            r4 = r8
            r8 = r6
            r6 = r4
        L49:
            r7 = 0
            defpackage.armd.i(r6, r7)
            return r8
        L4e:
            return r1
        L4f:
            r6 = move-exception
            r7 = r6
            r6 = r8
        L52:
            throw r7     // Catch: java.lang.Throwable -> L53
        L53:
            r8 = move-exception
            defpackage.armd.i(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vac.a(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.util.List, arpe):java.lang.Object");
    }

    @Override // defpackage.rwt
    public final /* synthetic */ void b(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        messageIdType.getClass();
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void c(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.rwo
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        if (((Boolean) this.c.b()).booleanValue() && messageCoreData.cI()) {
            String a = uzz.a(messageCoreData.V());
            if (a != null) {
                messageCoreData.bf(new rwn(a));
            }
            if (messageCoreData.F() != null) {
                ((alwl) b.g()).q("Successfully deserialized an image caption.");
            }
        }
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.rwt
    public final boolean fJ() {
        if (!((Boolean) this.c.b()).booleanValue()) {
            if (!((Boolean) ((utz) yig.al.get()).e()).booleanValue() || i() == null) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b1, code lost:
    
        if (((java.lang.Boolean) r0).booleanValue() != false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r10, java.util.List r11, defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vac.h(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, java.util.List, arpe):java.lang.Object");
    }

    @Override // defpackage.rwt
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.rwt
    public final /* synthetic */ void fK() {
    }

    @Override // defpackage.rwt
    public final /* synthetic */ void fL() {
    }

    @Override // defpackage.rwo
    public final /* synthetic */ void g() {
    }
}
