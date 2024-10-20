package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcr implements kkl {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter");
    private final pjy A;
    private final pkb B;
    private final armf C;
    private final jfa D;
    private final pkc E;
    private final qdq F;
    public final Context b;
    public final arwe c;
    public final arpi d;
    public final Conversation e;
    public final mjg f;
    public final armf g;
    public final armf h;
    public final jxl i;
    public final jxn j;
    public final pkl k;
    public final jxm l;
    public final pka m;
    public final Optional n;
    public final Set o;
    public final ConcurrentHashMap p;
    public final arqr q;
    public final arqw r;
    public final arqr s;
    public final arqr t;
    public final lkd u;
    public final lnb v;
    public final lre w;
    private final ked x;
    private final ofm y;
    private final pkg z;

    public kcr(Context context, arwe arweVar, arpi arpiVar, Conversation conversation, mjg mjgVar, armf armfVar, armf armfVar2, lkd lkdVar, qdq qdqVar, lnb lnbVar, armf armfVar3, ked kedVar, jxl jxlVar, ofm ofmVar, armf armfVar4, pkg pkgVar, pjy pjyVar, pkb pkbVar, armf armfVar5, jxn jxnVar, pkl pklVar, jfa jfaVar, jxm jxmVar, pka pkaVar, pkc pkcVar, lre lreVar, Optional optional) {
        context.getClass();
        arweVar.getClass();
        arpiVar.getClass();
        conversation.getClass();
        mjgVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        lkdVar.getClass();
        armfVar3.getClass();
        jxlVar.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        jfaVar.getClass();
        jxmVar.getClass();
        lreVar.getClass();
        this.b = context;
        this.c = arweVar;
        this.d = arpiVar;
        this.e = conversation;
        this.f = mjgVar;
        this.g = armfVar;
        this.h = armfVar2;
        this.u = lkdVar;
        this.F = qdqVar;
        this.v = lnbVar;
        this.x = kedVar;
        this.i = jxlVar;
        this.y = ofmVar;
        this.z = pkgVar;
        this.A = pjyVar;
        this.B = pkbVar;
        this.C = armfVar5;
        this.j = jxnVar;
        this.k = pklVar;
        this.D = jfaVar;
        this.l = jxmVar;
        this.m = pkaVar;
        this.E = pkcVar;
        this.w = lreVar;
        this.n = optional;
        armd.a(new kav(armfVar4, 14));
        this.o = new LinkedHashSet();
        this.p = new ConcurrentHashMap();
        qjh.l(arweVar, null, new kbl(this, (arpe) null, 3), 3);
        this.q = qkf.f(new jya((Object) jfaVar, 4, (int[]) null), arweVar);
        this.r = qkf.h(new jvq((Object) this, 2, (char[]) null), arweVar);
        this.s = qkf.f(new jya((Object) this, 3, (short[]) null), arweVar);
        this.t = qkf.f(new jya((Object) this, 2, (char[]) null), arweVar);
    }

    public final aerq a(aers aersVar, kcl kclVar) {
        int m;
        int i;
        if (ymd.b() && !this.n.isEmpty() && kclVar.e) {
            myt mytVar = kclVar.f;
            if ((mytVar instanceof myn) && (m = ((myn) mytVar).m()) != 0 && m - 1 != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return new aert(aersVar, true, null, null, null, 28);
                        }
                        return new aert(aersVar, false, null, this.b.getString(R.string.spatula_warning), new kav(this, 13), 6);
                    }
                    return new aert(aersVar, false, null, this.b.getString(R.string.spatula_warning), new kbp(this, kclVar, 15, null), 6);
                }
                return new aert(aersVar, false, new kbp(this, kclVar, 14, null), null, null, 26);
            }
        }
        return aersVar;
    }

    public final void b(loq loqVar) {
        afsx H = afwv.H(loqVar.a);
        if (H == null) {
            return;
        }
        this.F.u(new jgw(H, loqVar.b, null, afco.a));
        alvw g = a.g();
        g.X(alwp.a, "BugleImage");
        ((alvg) g.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter", "processMediaViewerResult", 608, "ImageBubbleUiAdapter.kt")).D("Draft attachment added with uri: %s media type: %s", loqVar.b, loqVar.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.qkg c(defpackage.kcl r76) {
        /*
            Method dump skipped, instructions count: 1635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kcr.c(kcl):qkg");
    }

    @Override // defpackage.kkl, java.lang.AutoCloseable
    public final void close() {
        if (this.k.a()) {
            this.p.clear();
        }
    }
}
