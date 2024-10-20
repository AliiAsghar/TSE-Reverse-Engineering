package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wnc implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ wnc(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, xbh] */
    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, xbh] */
    /* JADX WARN: Type inference failed for: r0v58, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v81, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v93, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v98, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r1v56, types: [yan, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr;
        Integer valueOf;
        Integer valueOf2;
        switch (this.c) {
            case 0:
                Object obj = this.b;
                wpp wppVar = (wpp) this.a;
                albo.T(wppVar.b.add(obj));
                if (wppVar.b.size() == 1) {
                    Object obj2 = wppVar.c;
                    qiu.h(aktp.ah(new uql(obj2, 18), ((wnb) obj2).b));
                    return;
                }
                return;
            case 1:
                ((wkk) this.b).t.o(wkk.n((vrk) this.a));
                return;
            case 2:
                ((wpp) this.a).w((wng) this.b);
                return;
            case 3:
                ((wpp) this.a).w((wng) this.b);
                return;
            case 4:
                wod wodVar = (wod) this.b;
                rwd rwdVar = (rwd) wodVar.c.b();
                rve rveVar = (rve) this.a;
                ((mho) wodVar.b.b()).z(rveVar, rwdVar.s(rveVar), 25, amxo.RCS_LEGACY);
                return;
            case 5:
                tli tliVar = new tli();
                wva wvaVar = (wva) this.a;
                tliVar.b(wvaVar.e.a());
                tliVar.c((String) this.b);
                agpw agpwVar = new agpw(tliVar);
                tlg tlgVar = new tlg(tlj.a);
                tlgVar.w("moveDataFromSync#update");
                tlc[] tlcVarArr = {(tlc) tlj.d.d};
                int c = a.bp().c();
                Integer.valueOf(c).getClass();
                if (((Integer) tlj.b.getOrDefault(tlcVarArr[0].toString(), -1)).intValue() > c) {
                    agnc.t("columnReference.toString()", c);
                }
                tlgVar.m(tlcVarArr);
                tlgVar.k(agpwVar);
                alog t = tlgVar.b().t();
                if (((alsx) t).c == 1) {
                    bArr = ((tla) t.get(0)).k();
                } else {
                    bArr = null;
                }
                if (bArr != null) {
                    wvaVar.w(bArr);
                    tle tleVar = new tle();
                    tleVar.f("moveDataFromSync#delete");
                    tleVar.a = agpwVar;
                    tleVar.d();
                    return;
                }
                return;
            case 6:
                ((xbf) this.a).d(this.b);
                return;
            case 7:
                ((xbf) this.a).d(this.b);
                return;
            case 8:
                Object obj3 = this.b;
                xcj xcjVar = (xcj) obj3;
                Map map = (Map) xcjVar.h.b();
                Object obj4 = this.a;
                armf armfVar = (armf) map.get(obj4);
                armfVar.getClass();
                qiu.h(xcjVar.c.a(akto.k(new rbn(obj3, armfVar, obj4, 16, (char[]) null)), xcjVar.f));
                return;
            case 9:
                alwo alwoVar = xep.a;
                sng sngVar = new sng();
                sngVar.aj("setGroupRoutingToken");
                Object obj5 = this.b;
                sngVar.X(new xeo(obj5, 8));
                byte[] H = ((aozb) this.a).H();
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                valueOf2 = Integer.valueOf(a.bp().c());
                int intValue2 = valueOf2.intValue();
                if (intValue2 < 58120) {
                    agnc.t("tachygram_group_routing_info_token", intValue2);
                }
                if (intValue >= 58120) {
                    sngVar.a.put("tachygram_group_routing_info_token", H);
                }
                int e = sngVar.a().e();
                if (e != 0) {
                    if (e > 1) {
                        alwl alwlVar = (alwl) xep.a.g();
                        alwlVar.X(ydl.I, obj5);
                        ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "setGroupRoutingToken", 120, "TachygramDatabaseOperations.java")).q("Updated more than one conversation's tachygram group routing token.");
                        return;
                    }
                    return;
                }
                alwl alwlVar2 = (alwl) xep.a.i();
                alwlVar2.X(ydl.I, obj5);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramDatabaseOperations", "setGroupRoutingToken", 111, "TachygramDatabaseOperations.java")).q("Failed to update conversation(s) group routing token for tachygram group.");
                return;
            case 10:
                ((xrf) this.b).s.c((ConversationIdType) this.a, 3);
                return;
            case 11:
                uof uofVar = (uof) ((vyv) ((xse) this.a).b.b()).a.b();
                Object obj6 = this.b;
                uofVar.e("messaging_file_upload", (String) obj6);
                alwl alwlVar3 = (alwl) xse.a.g();
                alwlVar3.X(xod.a, obj6);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/uploads/FileUploadWorkScheduler", "cancel", 133, "FileUploadWorkScheduler.java")).q("File upload cancelled.");
                return;
            case 12:
                Object obj7 = this.b;
                Object obj8 = ((xsl) obj7).g;
                Object obj9 = this.a;
                synchronized (obj8) {
                    apvh apvhVar = (apvh) ((xsl) obj7).h.get(obj9);
                    if (apvhVar != null) {
                        apvhVar.e();
                        alwl alwlVar4 = (alwl) xsl.a.g();
                        alwlVar4.X(xod.a, ((pzn) obj9).a);
                        alwlVar4.X(xod.j, ((pzn) obj9).b);
                        ((alwl) alwlVar4.h("com/google/android/apps/messaging/shared/transfer/uploads/ScottyFileUploader", "pause", 159, "ScottyFileUploader.java")).q("Paused ongoing file upload.");
                        ((xsl) obj7).h.remove(obj9);
                    } else {
                        alwl alwlVar5 = (alwl) xsl.a.g();
                        alwlVar5.X(xod.a, ((pzn) obj9).a);
                        alwlVar5.X(xod.j, ((pzn) obj9).b);
                        ((alwl) alwlVar5.h("com/google/android/apps/messaging/shared/transfer/uploads/ScottyFileUploader", "pause", 166, "ScottyFileUploader.java")).q("Could not find ongoing file upload to pause.");
                    }
                }
                return;
            case 13:
                xsu xsuVar = (xsu) this.a;
                if (!((pzw) xsuVar.b.b()).j(xsuVar.c, new xwb(this.b))) {
                    alwl alwlVar6 = (alwl) ((alwl) xsu.a.i()).h("com/google/android/apps/messaging/shared/transfer/uploads/TachygramTransferListener", "onTransferHandleReady", 83, "TachygramTransferListener.java");
                    pzn pznVar = xsuVar.c;
                    alwlVar6.D("Failed to update transfer handle in database. Transfer ID: %s. Processing ID: %s", pznVar.a, pznVar.b);
                    return;
                }
                return;
            case 14:
                ((mbb) ((yyt) this.a).c.b()).a().b((amfq) this.b, mbt.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                return;
            case 15:
                Object obj10 = this.a;
                obj10.getClass();
                ((xxh) this.b).j.l((ConversationIdType) obj10);
                return;
            case 16:
                ((xza) this.a).a.logp(Level.INFO, "com.google.android.apps.messaging.shared.util.common.LogSaver$DiskLogSaver", "log", (String) this.b);
                return;
            case 17:
                if (((View) this.a).getContext() == null) {
                    return;
                }
                this.b.run();
                return;
            case 18:
                if (!((eno) this.a).c.equals(eng.RESUMED)) {
                    return;
                }
                this.b.run();
                return;
            case 19:
                alvi alviVar = yav.d;
                this.b.a((Intent) this.a);
                return;
            default:
                yav yavVar = (yav) this.b;
                Iterator it = yavVar.n.iterator();
                while (it.hasNext()) {
                    qjb.a(new wnc((yan) it.next(), this.a, 19), yavVar.h);
                }
                return;
        }
    }

    public /* synthetic */ wnc(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
