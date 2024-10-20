package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jmy extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmy(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [pkd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [pkd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v48, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v83, types: [armf, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        lrc lrcVar = null;
        switch (this.b) {
            case 0:
                if (((jat) this.a).b.a()) {
                    jat jatVar = (jat) this.a;
                    qjh.l(jatVar.g, null, new gau(jatVar, (arpe) null, 18, (byte[]) null), 3);
                }
                return arnb.a;
            case 1:
                if (((jat) this.a).b.a()) {
                    jat jatVar2 = (jat) this.a;
                    qjh.l(jatVar2.g, null, new gau(jatVar2, (arpe) null, 17), 3);
                }
                return arnb.a;
            case 2:
                return ((jgw) this.a).a;
            case 3:
                return qta.p(((jos) this.a).a);
            case 4:
                return (IncomingDraft) ((jos) this.a).a.b("incoming_draft");
            case 5:
                return (Set) this.a.b();
            case 6:
                return (MessageCoreData) ((jph) this.a).a.a("draft_data");
            case 7:
                return (MessageCoreData) ((jph) this.a).a.b("draft_data");
            case 8:
                znj znjVar = (znj) ((jrr) this.a).g.b();
                aiwl a = wus.a();
                a.i(wuk.IMAGE_COMPRESSION);
                a.k(yfq.a);
                return znjVar.ab(a.f());
            case 9:
                return (jsm) this.a.b();
            case 10:
                lrc lrcVar2 = ((jsy) this.a).e;
                if (lrcVar2 == null) {
                    arro.b("popupController");
                } else {
                    lrcVar = lrcVar2;
                }
                lrcVar.a();
                return arnb.a;
            case 11:
                String str = ((jsy) this.a).f;
                if (str.length() == 0) {
                    str = null;
                }
                Object obj = this.a;
                ((jsy) obj).i.e(new jpi(str, obj, 3));
                lrc lrcVar3 = ((jsy) this.a).e;
                if (lrcVar3 == null) {
                    arro.b("popupController");
                } else {
                    lrcVar = lrcVar3;
                }
                lrcVar.a();
                return arnb.a;
            case 12:
                lrc lrcVar4 = ((jsy) this.a).e;
                if (lrcVar4 == null) {
                    arro.b("popupController");
                } else {
                    lrcVar = lrcVar4;
                }
                lrcVar.a();
                return arnb.a;
            case 13:
                jsy jsyVar = (jsy) this.a;
                jsyVar.f = "";
                lrc lrcVar5 = jsyVar.e;
                if (lrcVar5 == null) {
                    arro.b("popupController");
                } else {
                    lrcVar = lrcVar5;
                }
                jsy jsyVar2 = (jsy) this.a;
                lrcVar.b(jsyVar2.c(jsyVar2.h));
                return arnb.a;
            case 14:
                jsy jsyVar3 = (jsy) this.a;
                jsyVar3.g = !jsyVar3.g;
                lrc lrcVar6 = jsyVar3.e;
                if (lrcVar6 == null) {
                    arro.b("popupController");
                } else {
                    lrcVar = lrcVar6;
                }
                jsy jsyVar4 = (jsy) this.a;
                lrcVar.b(jsyVar4.c(jsyVar4.h));
                return arnb.a;
            case 15:
                return ((lfx) this.a.b()).b();
            case 16:
                jub jubVar = (jub) this.a;
                qjh.l(jubVar.c, null, new jsu(jubVar, (arpe) null, 3), 3);
                return arnb.a;
            case 17:
                return juw.b((juw) ((jub) this.a).d.b());
            case 18:
                ((jug) this.a).e();
                return arnb.a;
            case 19:
                jug jugVar = (jug) this.a;
                jugVar.c(new jue(jugVar, (arpe) null, 0));
                return arnb.a;
            default:
                ((jug) this.a).e();
                return arnb.a;
        }
    }
}
