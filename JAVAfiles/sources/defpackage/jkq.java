package defpackage;

import android.net.Uri;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkq extends arrp implements arqg {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkq(Object obj, Object obj2, int i) {
        super(0);
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v109, types: [cas, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v15, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v22, types: [jha, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [owi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v58, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r0v65, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v67, types: [jzy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v82, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r0v86, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, kaa] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, miz] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, mjg] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.lang.Object, mjg] */
    /* JADX WARN: Type inference failed for: r1v40, types: [java.lang.Object, mjg] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, miz] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        boolean booleanValue;
        boolean z = true;
        lrc lrcVar = null;
        switch (this.c) {
            case 0:
                if (((lig) this.a).l.a()) {
                    lig ligVar = (lig) this.a;
                    qjh.l(ligVar.j, null, new gau(ligVar, (arpe) null, 15), 3);
                }
                Object obj = this.a;
                ((lre) ((lig) obj).e).c(new geg(obj, this.b, 9, null));
                return arnb.a;
            case 1:
                lig ligVar2 = (lig) this.a;
                qjh.l(ligVar2.j, null, new jks(ligVar2, (arpe) null, 2, (byte[]) null), 3);
                this.b.a();
                return arnb.a;
            case 2:
                alvw f = jmc.a.f();
                f.X(alwp.a, "BugleComposeRow2");
                ((alvg) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentUiAdapterImpl$getUiDataFlow$1", "invoke", 98, "DraftAttachmentUiAdapterImpl.kt")).t("Putting in vCardFlowCache for %s", this.a);
                return ((jmc) this.b).e.a(this.a);
            case 3:
                Object b = ((jug) this.a).e.b();
                b.getClass();
                boolean booleanValue2 = ((Boolean) b).booleanValue();
                Object obj2 = this.b;
                if (true != booleanValue2) {
                    obj2 = null;
                }
                if (obj2 == null) {
                    return null;
                }
                return (juh) arsd.k((Optional) ((apxx) obj2).a);
            case 4:
                Object b2 = ((jvi) this.a).b.b();
                b2.getClass();
                boolean booleanValue3 = ((Boolean) b2).booleanValue();
                Object obj3 = this.b;
                if (true != booleanValue3) {
                    obj3 = null;
                }
                if (obj3 == null) {
                    return null;
                }
                return (juh) arsd.k((Optional) ((apxx) obj3).a);
            case 5:
                this.b.a(((jwc) this.a).e);
                lrc lrcVar2 = ((jwc) this.a).g;
                if (lrcVar2 == null) {
                    arro.b("popupController");
                } else {
                    lrcVar = lrcVar2;
                }
                lrcVar.a();
                return arnb.a;
            case 6:
                Object obj4 = this.b;
                if (obj4 != null) {
                    ((jxd) obj4).a.a(this.a);
                }
                return arnb.a;
            case 7:
                this.b.a(this.a);
                return arnb.a;
            case 8:
                ((arxm) this.b.a()).v(null);
                this.a.a();
                return arnb.a;
            case 9:
                Object obj5 = this.b;
                nei neiVar = (nei) this.a;
                qjh.l(neiVar.c, null, new jli(neiVar, (Optional) obj5, (arpe) null, 19), 3);
                return arnb.a;
            case 10:
                return this.a.a(this.b);
            case 11:
                if (((kag) this.a).b.e()) {
                    ((kag) this.a).b.d(this.b, false, null);
                } else if (lga.bO(this.b)) {
                    ((kag) this.a).d.d(this.b);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                ((kcy) ((mlt) this.a).i).d(this.b);
                return arnb.a;
            case 13:
                ((kcy) ((mlt) this.a).i).d(this.b);
                return arnb.a;
            case 14:
                ((kcg) this.a).c.r(this.b, 2);
                return arnb.a;
            case 15:
                miz mizVar = ((kay) this.a).d;
                qiu.f(((lfx) this.b).c.p(mizVar.b()), "Failed to download contact card");
                return true;
            case 16:
                Uri uri = ((kay) this.a).a.a;
                uri.getClass();
                ((lkd) ((lfx) this.b).d).b(new lor(uri));
                return true;
            case 17:
                ((lfx) this.b).c.r(((kay) this.a).d, 2);
                return arnb.a;
            case 18:
                kbb kbbVar = (kbb) this.a;
                if (!kbbVar.g) {
                    ((kbc) this.b).e.r(kbbVar.d, 2);
                }
                return arnb.a;
            case 19:
                booleanValue = ((Boolean) this.a.a()).booleanValue();
                if (booleanValue) {
                    ((kbn) this.b).a();
                } else {
                    ((kbn) this.b).b();
                }
                return arnb.a;
            default:
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    alur it2 = ((nbb) it.next()).c.iterator();
                    it2.getClass();
                    while (it2.hasNext()) {
                        atok atokVar = ((nba) it2.next()).d;
                        khj khjVar = ((kbq) this.a).c;
                        if (d.F(khjVar.c, atokVar)) {
                            khjVar.b.g(khj.a, null, ahqp.SUCCESS);
                            khjVar.c = null;
                        }
                    }
                }
                return arnb.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkq(Object obj, Object obj2, int i, byte[] bArr) {
        super(0);
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
