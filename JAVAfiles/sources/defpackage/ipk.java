package defpackage;

import android.content.LocusId;
import android.os.Bundle;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipk extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipk(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.Object, ascd] */
    /* JADX WARN: Type inference failed for: r0v49, types: [afcs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v52, types: [afcs, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v47, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r14v60, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r14v63, types: [java.lang.Object, lrc] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.b) {
            case 0:
                ind indVar = (ind) obj;
                indVar.getClass();
                return ((ifb) this.a).d(indVar, ipm.a());
            case 1:
                afxy afxyVar = (afxy) obj;
                afxyVar.getClass();
                afxyVar.j((Bundle) this.a);
                return arnb.a;
            case 2:
                LocationContentItem locationContentItem = (LocationContentItem) obj;
                locationContentItem.getClass();
                MessagePartCoreData e = ((ifb) this.a).e(locationContentItem, ipo.a());
                e.getClass();
                return e;
            case 3:
                qwm qwmVar = (qwm) obj;
                ((jad) this.a).e.a(qwmVar.g(), Integer.valueOf(qwmVar.e()));
                return arnb.a;
            case 4:
                jca jcaVar = (jca) obj;
                jcaVar.getClass();
                this.a.contains(lqj.a);
                this.a.contains(lqj.b);
                this.a.contains(lqj.c);
                this.a.contains(lqj.d);
                this.a.contains(lqj.g);
                jcaVar.c();
                return arnb.a;
            case 5:
                String str = (String) obj;
                str.getClass();
                cj fe = ((jco) this.a).b.fe();
                if (fe != null) {
                    fe.setLocusContext(new LocusId(str), null);
                }
                return arnb.a;
            case 6:
                ((khl) ((jco) this.a).f.b()).g(((Boolean) obj).booleanValue());
                return arnb.a;
            case 7:
                lrc lrcVar = (lrc) obj;
                lrcVar.getClass();
                return new kih(this.a, new ixz(lrcVar, 10));
            case 8:
                long j = ((cjn) obj).a;
                ((lkd) ((jfj) this.a).e.b()).b(new lmo("verified", null, 2));
                return true;
            case 9:
                cti ctiVar = (cti) obj;
                ctiVar.getClass();
                long g = ctiVar.g() & 4294967295L;
                kjp kjpVar = ((jfz) this.a).c;
                if (!kjpVar.c.contains("bottom_content_insets")) {
                    kjpVar.e.put("bottom_content_insets", Integer.valueOf(arrn.r((int) g, 0)));
                    ?? r0 = kjpVar.a;
                    Collection values = ((HashMap) kjpVar.e).values();
                    values.getClass();
                    r0.f(Integer.valueOf(aqjn.U(values)));
                }
                return arnb.a;
            case 10:
                ltd ltdVar = (ltd) obj;
                ltdVar.getClass();
                if (((jhc) this.a).e != null) {
                    ltdVar.a();
                }
                return arnb.a;
            case 11:
                jhc jhcVar = (jhc) obj;
                jhcVar.getClass();
                if (!d.F(jhcVar.a, this.a)) {
                    return jhc.c(jhcVar, (String) this.a, null, null, false, false, 1, 766);
                }
                return jhcVar;
            case 12:
                ((jkk) this.a).b(null);
                return arnb.a;
            case 13:
                long j2 = ((cjn) obj).a;
                this.a.a();
                return true;
            case 14:
                lrc lrcVar2 = (lrc) obj;
                lrcVar2.getClass();
                String string = ((jky) this.a).b.getString(R.string.recipient_incoming_only_dialog_body);
                string.getClass();
                String string2 = ((jky) this.a).b.getString(android.R.string.ok);
                string2.getClass();
                return new aepx(string, null, null, null, false, false, new aewr(string2, new jjw(lrcVar2, 6)), null, null, 446);
            case 15:
                jgx jgxVar = (jgx) obj;
                jgxVar.getClass();
                alvw d = jlw.a.d();
                d.X(alwp.a, "BugleComposeRow2");
                ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/attachment/DraftAttachmentController$addAttachment$2$1$1$1", "invoke", 159, "DraftAttachmentController.kt")).t("addAttachment receiving trimmed video: %s", jgxVar);
                ((jlw) this.a).u.u(jgxVar);
                return arnb.a;
            case 16:
                jha jhaVar = (jha) obj;
                jhaVar.getClass();
                return Boolean.valueOf(aeke.cj(jhaVar, this.a));
            case 17:
                jhc jhcVar2 = (jhc) obj;
                jhcVar2.getClass();
                Object obj2 = this.a;
                List az = aqjn.az(jhcVar2.b);
                az.remove(obj2);
                return jhc.c(jhcVar2, null, az, null, false, false, 0, 1021);
            case 18:
                jha jhaVar2 = (jha) obj;
                jhaVar2.getClass();
                return Boolean.valueOf(aeke.cj(jhaVar2, this.a));
            case 19:
                this.a.a();
                return arnb.a;
            default:
                this.a.a();
                return arnb.a;
        }
    }
}
