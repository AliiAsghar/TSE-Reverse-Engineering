package defpackage;

import android.content.Context;
import android.location.Location;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation2.bottomcontent.composerow.draft.attachment.RichLocation;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import defpackage.cvc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsv extends arrp implements arqr {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jsv(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v45, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, lrc] */
    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        int i = 1;
        lrc lrcVar = null;
        afbz afbzVar = null;
        lrc lrcVar2 = null;
        switch (this.b) {
            case 0:
                jhc jhcVar = (jhc) obj;
                jhcVar.getClass();
                return jhc.c(jhcVar, null, null, (String) this.a, false, false, 0, 1019);
            case 1:
                this.a.a();
                return arnb.a;
            case 2:
                lrc lrcVar3 = (lrc) obj;
                lrcVar3.getClass();
                jsy jsyVar = (jsy) this.a;
                jsyVar.e = lrcVar3;
                return jsyVar.c(jsyVar.h);
            case 3:
                String str = (String) obj;
                str.getClass();
                jsy jsyVar2 = (jsy) this.a;
                jsyVar2.f = str;
                lrc lrcVar4 = jsyVar2.e;
                if (lrcVar4 == null) {
                    arro.b("popupController");
                } else {
                    lrcVar = lrcVar4;
                }
                jsy jsyVar3 = (jsy) this.a;
                lrcVar.b(jsyVar3.c(jsyVar3.h));
                return arnb.a;
            case 4:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj2 = this.a;
                aemn aemnVar = new aemn(new jmy(obj2, 19), new jmy(obj2, 20), i);
                if (((jug) this.a).a() == null || !booleanValue) {
                    return null;
                }
                return aemnVar;
            case 5:
                Location location = (Location) obj;
                if (location == null) {
                    ((jvf) this.a).a(new IllegalStateException("Location is null"));
                } else {
                    Object obj3 = this.a;
                    String j = vht.j(location.getLatitude(), location.getLongitude());
                    alvw d = jvf.a.d();
                    d.X(alwp.a, "BugleComposeRow2");
                    ((alvg) d.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl", "handleLatLngResult", 232, "LocationHandlerImpl.kt")).D("Setting location url as attachment, uri %s, location %s", j, location);
                    j.getClass();
                    jvf jvfVar = (jvf) obj3;
                    qjh.l(jvfVar.b, null, new jli(jvfVar, new RichLocation(j, location.getLatitude(), location.getLongitude()), (arpe) null, 13), 3);
                }
                return arnb.a;
            case 6:
                lrc lrcVar5 = (lrc) obj;
                lrcVar5.getClass();
                String string = ((jvf) this.a).c.getString(R.string.location_shortcut_attach_current_error);
                string.getClass();
                String string2 = ((jvf) this.a).c.getString(android.R.string.ok);
                string2.getClass();
                return new aepx(string, null, null, null, false, false, new aewr(string2, new juf(lrcVar5, 2)), null, null, 446);
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                jwc jwcVar = (jwc) this.a;
                jwcVar.e = str2;
                lrc lrcVar6 = jwcVar.g;
                if (lrcVar6 == null) {
                    arro.b("popupController");
                } else {
                    lrcVar2 = lrcVar6;
                }
                jwc jwcVar2 = (jwc) this.a;
                aeqa aeqaVar = jwcVar2.f;
                aeqaVar.getClass();
                lrcVar2.b(jwcVar2.a(aeqaVar));
                return arnb.a;
            case 8:
                lrc lrcVar7 = (lrc) obj;
                lrcVar7.getClass();
                jwc jwcVar3 = (jwc) this.a;
                jwcVar3.g = lrcVar7;
                aeqa aeqaVar2 = jwcVar3.f;
                aeqaVar2.getClass();
                return aeqaVar2;
            case 9:
                lrc lrcVar8 = (lrc) obj;
                lrcVar8.getClass();
                return ((jws) this.a).d.a(lrcVar8);
            case 10:
                cvc.a aVar = (cvc.a) obj;
                aVar.getClass();
                cvc cvcVar = (cvc) this.a;
                aVar.e(cvcVar, 0, cvcVar.b / 2, brg.a);
                return arnb.a;
            case 11:
                this.a.h((jxb) obj);
                return arnb.a;
            case 12:
                MessageId messageId = (MessageId) obj;
                messageId.getClass();
                jyk jykVar = (jyk) this.a;
                qjh.l(jykVar.f, null, new jvr(jykVar, messageId, (arpe) null, 10), 3);
                return arnb.a;
            case 13:
                long j2 = ((cjn) obj).a;
                ((jym) this.a).r.a();
                return arnb.a;
            case 14:
                cvc.a.n((cvc.a) obj, (cvc) this.a, 0L);
                return arnb.a;
            case 15:
                String r = ((ResolvedRecipient) obj).r(false);
                r.getClass();
                String c = ((mlt) this.a).c(r);
                c.getClass();
                return c;
            case 16:
                lrc lrcVar9 = (lrc) obj;
                lrcVar9.getClass();
                String string3 = ((kaw) this.a).a.getString(R.string.message_bubble_satellite_failure_media_popup_title);
                string3.getClass();
                Context context = ((kaw) this.a).a;
                String string4 = context.getString(R.string.message_bubble_satellite_failure_media_popup_body);
                arnv arnvVar = arnv.a;
                String string5 = context.getString(R.string.message_bubble_satellite_failure_media_popup_dismiss);
                string5.getClass();
                return new aeqa(string3, arnvVar, string4, null, null, new aewr(string5, new jwl((Object) lrcVar9, 3, (short[]) null)), null, 88);
            case 17:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                kbi kbiVar = (kbi) this.a;
                afbz afbzVar2 = kbiVar.j;
                if (afbzVar2 != null) {
                    afbzVar = new afbz(afbzVar2.a, afbzVar2.b, afbzVar2.c, afbzVar2.d, afbzVar2.e, afbzVar2.f, afbzVar2.g, booleanValue2);
                }
                return new kbi(kbiVar.n, kbiVar.a, kbiVar.b, kbiVar.c, kbiVar.d, kbiVar.e, kbiVar.f, kbiVar.g, kbiVar.h, kbiVar.i, afbzVar, kbiVar.k, kbiVar.m);
            case 18:
                ((bxi) obj).getClass();
                return new kbe(this.a, 0);
            case 19:
                ((bxi) obj).getClass();
                kbo kboVar = ((kbi) this.a).h;
                if (kboVar != null) {
                    kboVar.d.a();
                }
                return new kbf();
            default:
                int intValue = ((Number) obj).intValue();
                if (intValue != -2 && intValue != -1) {
                    if (intValue == 1) {
                        ((kbn) this.a).b();
                    }
                } else {
                    ((kbn) this.a).a();
                }
                return arnb.a;
        }
    }
}
