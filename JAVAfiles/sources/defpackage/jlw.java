package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlw {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController");
    public static final jmt b = new jmt(true, 104857600, true, true, 10, albo.cb(6));
    private final izc A;
    public final arpi c;
    public final arwe d;
    public final arwe e;
    public final jly f;
    public final jlj g;
    public final armf h;
    public final ouc i;
    public final armf j;
    public final alhz k;
    public final armf l;
    public final ascv m;
    public final afkx n;
    public final jat o;
    public final jxv p;
    public final jxv q;
    public final iji r;
    public final akip s;
    public final nei t;
    public final qdq u;
    private final ascg v;
    private final jof w;
    private final afdv x;
    private final arml y;
    private final job z;

    public jlw(arpi arpiVar, arwe arweVar, arwe arweVar2, jxv jxvVar, jat jatVar, iji ijiVar, akip akipVar, jly jlyVar, ascg ascgVar, job jobVar, jlj jljVar, nei neiVar, armf armfVar, armf armfVar2, jxv jxvVar2, ouc oucVar, armf armfVar3, alhz alhzVar, jof jofVar, izc izcVar, armf armfVar4, afdv afdvVar) {
        arpiVar.getClass();
        arweVar.getClass();
        arweVar2.getClass();
        jxvVar.getClass();
        jlyVar.getClass();
        ascgVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        izcVar.getClass();
        armfVar4.getClass();
        afdvVar.getClass();
        this.c = arpiVar;
        this.d = arweVar;
        this.e = arweVar2;
        this.p = jxvVar;
        this.o = jatVar;
        this.r = ijiVar;
        this.s = akipVar;
        this.f = jlyVar;
        this.v = ascgVar;
        this.z = jobVar;
        this.g = jljVar;
        this.t = neiVar;
        this.h = armfVar2;
        this.q = jxvVar2;
        this.i = oucVar;
        this.j = armfVar3;
        this.k = alhzVar;
        this.w = jofVar;
        this.A = izcVar;
        this.l = armfVar4;
        this.x = afdvVar;
        this.y = armd.a(new jjw(armfVar, 10));
        jjv jjvVar = new jjv(new jjv(ascgVar, 9), 10);
        int i = ascp.a;
        this.m = arrn.T(jjvVar, arweVar2, asco.a, b);
        this.u = new qdq(this, null);
        this.n = new jlt(this);
    }

    public final Object a(jha jhaVar, arpe arpeVar) {
        return arro.q(this.c, new jlq(jhaVar, this, null), arpeVar);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.Map, java.lang.Object] */
    public final Object b(jha jhaVar, arpe arpeVar) {
        Object obj;
        Object d;
        if (jhaVar instanceof jgz) {
            jgz jgzVar = (jgz) jhaVar;
            this.w.a(jgzVar);
            obj = jgzVar.a;
        } else if (!(jhaVar instanceof jgv)) {
            if (jhaVar instanceof jgw) {
                obj = null;
            } else {
                throw new armm();
            }
        } else {
            obj = ((jgv) jhaVar).a;
        }
        if (obj instanceof afcw) {
            alvw f = a.f();
            f.X(alwp.a, "BugleComposeRow2");
            ((alvg) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController", "cleanUpRemovedAttachment", 281, "DraftAttachmentController.kt")).t("Removing from vCardFlowCache for %s", obj);
        }
        if (!(jhaVar instanceof jgx) && (d = d(jhaVar, arpeVar)) == arpl.a) {
            return d;
        }
        return arnb.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.jha r10, defpackage.arpe r11) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlw.c(jha, arpe):java.lang.Object");
    }

    public final Object d(jha jhaVar, arpe arpeVar) {
        jgz jgzVar;
        Object b2;
        Uri uri = null;
        if (jhaVar instanceof jgz) {
            jgzVar = (jgz) jhaVar;
        } else {
            jgzVar = null;
        }
        if (jgzVar != null) {
            uri = jgzVar.b.a;
        }
        if (uri != null && this.z.c(uri) && (b2 = this.z.b(uri, arpeVar)) == arpl.a) {
            return b2;
        }
        return arnb.a;
    }

    public final void e(arqr arqrVar) {
        qjh.l(this.e, null, new jec(this, arqrVar, (arpe) null, 8), 3);
    }

    public final jsm f() {
        Object a2 = this.y.a();
        a2.getClass();
        return (jsm) a2;
    }
}
