package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmk {
    public final Object a;

    public hmk(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map, java.lang.Object] */
    public final void a(hne hneVar, hpj hpjVar) {
        ?? r0 = this.a;
        if (hpjVar.equals(r0.get(hneVar))) {
            r0.remove(hneVar);
        }
    }

    public final /* synthetic */ hzh b() {
        apag s = ((aozy) this.a).s();
        s.getClass();
        return (hzh) s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [hnm, java.lang.Object] */
    public final synchronized hnm c(Class cls) {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ico icoVar = (ico) this.a.get(i);
            if (((Class) icoVar.b).isAssignableFrom(cls)) {
                return icoVar.a;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List, java.lang.Object] */
    public final synchronized void d(Class cls, hnm hnmVar) {
        this.a.add(new ico(cls, hnmVar));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    public final synchronized List e() {
        return this.a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    public final synchronized void f(ImageHeaderParser imageHeaderParser) {
        this.a.add(imageHeaderParser);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [hmx, java.lang.Object] */
    public final synchronized hmx g(Class cls) {
        for (ico icoVar : this.a) {
            if (((Class) icoVar.a).isAssignableFrom(cls)) {
                return icoVar.b;
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    public final synchronized void h(Class cls, hmx hmxVar) {
        this.a.add(new ico(cls, hmxVar, (char[]) null));
    }

    public final miz i(miz mizVar) {
        mym e = mizVar.e();
        if (e instanceof myr) {
            myr myrVar = (myr) e;
            if (myrVar.b() != null) {
                if (((ydc) this.a).f(myrVar.b())) {
                    return null;
                }
                return mizVar;
            }
            return mizVar;
        }
        return mizVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ascd] */
    public final void j(boolean z) {
        this.a.f(Boolean.valueOf(z));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final asai k() {
        agip b = ((jvw) this.a.b()).b();
        return new idx(b.d, (Duration) b.b.a(), 17);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void l(qog qogVar) {
        ((uof) this.a.b()).a(upk.a("contact_recipient_change_sync", qogVar));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final void m() {
        ((uof) this.a.b()).a(upk.a("schedule_contacts_import", aozo.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final qya n(Function function) {
        anen anenVar = (anen) this.a.b();
        anenVar.getClass();
        return new qya(anenVar, function);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final /* synthetic */ qiz o(Object obj) {
        xnv xnvVar = (xnv) this.a.b();
        xnvVar.getClass();
        obj.getClass();
        return new qiz(xnvVar, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(defpackage.arpe r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.qiq
            if (r0 == 0) goto L13
            r0 = r6
            qiq r0 = (defpackage.qiq) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            qiq r0 = new qiq
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            arpl r1 = defpackage.arpl.a
            int r2 = r0.b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.aqil.P(r6)
            goto L47
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            defpackage.aqil.P(r6)
            enj r6 = new enj
            r2 = 0
            r4 = 4
            r6.<init>(r5, r2, r4)
            asae r2 = new asae
            r2.<init>(r6)
            r0.b = r3
            java.lang.Object r6 = defpackage.arrn.U(r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            armq r6 = (defpackage.armq) r6
            java.lang.Object r6 = r6.a
            defpackage.aqil.P(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hmk.p(arpe):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public final unz q(qfq qfqVar, uta utaVar) {
        return ((uof) this.a.b()).a(upk.b("chatapi_incoming_group_chat_notification_message", qfqVar, utaVar));
    }

    public hmk(Object obj, byte[] bArr) {
        this.a = obj;
    }

    public hmk() {
        this.a = new arvv();
    }

    public hmk(Collection collection) {
        this.a = aqjn.az(collection);
    }

    public hmk(armf armfVar, int[] iArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hmk(byte[] bArr) {
        this.a = new HashMap();
        new HashMap();
    }

    public hmk(armf armfVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hmk(armf armfVar, char[] cArr, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hmk(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new ArrayList();
    }

    public hmk(byte[] bArr, byte[] bArr2) {
        this.a = new ArrayList();
    }

    public hmk(char[] cArr) {
        this.a = new ArrayList();
    }

    public hmk(armf armfVar, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
    }

    public hmk(byte[] bArr, char[] cArr) {
        this.a = new LinkedHashMap();
    }

    public hmk(short[] sArr) {
        this.a = ascy.a(false);
    }

    public hmk(ydc ydcVar) {
        ydcVar.getClass();
        this.a = ydcVar;
    }

    public hmk(armf armfVar) {
        armfVar.getClass();
        this.a = armfVar;
    }
}
