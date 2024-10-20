package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xfn implements ancs {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xfn(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v94, types: [akul] */
    /* JADX WARN: Type inference failed for: r2v4, types: [arwe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v39, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.Collection, java.lang.Object] */
    @Override // defpackage.ancs
    public final ListenableFuture a(Object obj) {
        akul c;
        int i;
        akul a;
        alog alogVar;
        int i2 = 19;
        int i3 = 18;
        int i4 = 0;
        int i5 = 2;
        ?? r6 = 0;
        r6 = 0;
        int i6 = 1;
        switch (this.b) {
            case 0:
                lgg a2 = ((xfo) this.a).m.a((qso) obj);
                c = qjh.c(a2.d, arpj.a, arwf.a, new qrr(a2, (arpe) null, 2));
                return c;
            case 1:
                return ((qsr) ((xfo) this.a).l.b()).a((qss) obj);
            case 2:
                xgw xgwVar = ((xha) this.a).b;
                return aktp.ah(new wuo(xgwVar, 8), xgwVar.d);
            case 3:
                Throwable th = (Throwable) obj;
                ((alwl) ((alwl) ((alwl) xha.a.h()).g(th)).h("com/google/android/apps/messaging/shared/telephony/ReverseTelephonySyncWorkItemHandler", "processPendingWorkItemAsync", 'E', "ReverseTelephonySyncWorkItemHandler.java")).q("ReverseTelephonySyncWorkItemHandler failed");
                return ((uvi) ((xha) this.a).c.b()).b(th).h(new xgu(i5), andi.a);
            case 4:
                xhp xhpVar = (xhp) obj;
                alok alokVar = new alok();
                apct apctVar = xhpVar.c;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                xhq xhqVar = (xhq) this.a;
                alokVar.h("TelephonyRecreatedIntentTimestamp", xhqVar.e(apctVar));
                apct apctVar2 = xhpVar.c;
                if (apctVar2 == null) {
                    apctVar2 = apct.a;
                }
                alokVar.h("TelephonyRecreatedReverseSyncTimestamp", xhqVar.e(apctVar2));
                return aktp.ag(alokVar.b());
            case 5:
                return ((xoa) this.a).a((alog) obj);
            case 6:
                xow xowVar = (xow) obj;
                if (xowVar == null) {
                    return xpt.a("Failed to resume the download. No file transfer bind data found.");
                }
                if (xowVar.h() == null) {
                    return xpt.a("Failed to resume the download. No file information found.");
                }
                return aktp.ai(new wkf(xowVar, 13), ((xqb) this.a).d);
            case 7:
                xpt xptVar = (xpt) obj;
                alvw i7 = xql.a.i();
                i7.X(alwp.a, "BugleFileTransfer");
                alvg alvgVar = (alvg) ((alvg) i7).g(xptVar);
                alvgVar.X(ydl.f, this.a);
                ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadCompletedHandler", "processPendingWorkItemAsync", 296, "FileDownloadCompletedHandler.java")).q("Failed to complete file transfer.");
                if (xptVar.d().booleanValue()) {
                    return aktp.ag(upm.e());
                }
                return aktp.ag(upm.d());
            case 8:
                xpt xptVar2 = (xpt) obj;
                alwl alwlVar = (alwl) ((alwl) xqq.a.i()).g(xptVar2);
                alwlVar.X(ydl.f, this.a);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "processPendingWorkItemAsync", 158, "FileDownloadFailedHandler.java")).q("Failed to complete file transfer failed processing.");
                if (xptVar2.d().booleanValue()) {
                    return aktp.ag(upm.e());
                }
                return aktp.ag(upm.d());
            case 9:
                xpt xptVar3 = (xpt) obj;
                alwl alwlVar2 = (alwl) ((alwl) xri.a.i()).g(xptVar3);
                alwlVar2.X(ydl.e, ((rvf) this.a).b);
                ((alwl) alwlVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/PersistThumbnailHandler", "processPendingWorkItemAsync", 167, "PersistThumbnailHandler.java")).q("Failed to persist thumbnail for incoming file transfer.");
                if (xptVar3.d().booleanValue()) {
                    return aktp.ag(upm.e());
                }
                return aktp.ag(upm.d());
            case 10:
                xpt xptVar4 = (xpt) obj;
                alwl alwlVar3 = (alwl) ((alwl) xrm.a.i()).g(xptVar4);
                alwlVar3.X(ydl.e, ((rvf) this.a).b);
                ((alwl) alwlVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/ThumbnailDownloadCompletedHandler", "processPendingWorkItemAsync", 205, "ThumbnailDownloadCompletedHandler.java")).q("Failed to update thumbnail for incoming file transfer.");
                if (xptVar4.d().booleanValue()) {
                    return aktp.ag(upm.e());
                }
                return aktp.ag(upm.d());
            case 11:
                if (xwj.f()) {
                    ?? r0 = this.a;
                    xyo d = xwj.a.d();
                    d.H("Running regex message annotator on");
                    d.c(r0.B());
                    d.q();
                    return yyb.aH();
                }
                int i8 = alog.d;
                return aktp.ag(alsx.a);
            case 12:
                xzj xzjVar = (xzj) obj;
                if ((xzjVar.b & 1) != 0 && !xzjVar.c.isEmpty()) {
                    return albo.bI(xzjVar.c);
                }
                xzk xzkVar = (xzk) this.a;
                return xzkVar.c.j(new xqp(i3)).h(new xqp(i2), xzkVar.b);
            case 13:
                Integer num = (Integer) obj;
                Object obj2 = this.a;
                zai zaiVar = (zai) obj2;
                Stream sorted = Collection.EL.stream(zaiVar.b).filter(new wjl(i3)).sorted(new lvh(19));
                int i9 = alog.d;
                alog alogVar2 = (alog) sorted.collect(alls.a);
                alpo alpoVar = alpo.a;
                ArrayList arrayList = new ArrayList();
                int size = alogVar2.size();
                double d2 = 0.0d;
                for (int i10 = 0; i10 < size; i10++) {
                    yfa yfaVar = (yfa) alogVar2.get(i10);
                    double a3 = yfaVar.a();
                    if (a3 != 0.0d) {
                        double d3 = d2 + a3;
                        alzz.aY(alst.e(Integer.valueOf(yyb.aM(d2)), Integer.valueOf(yyb.aM(d3))), yfaVar, arrayList);
                        d2 = d3;
                    }
                }
                alzz.aY(alst.d(Integer.valueOf(yyb.aM(d2)), Integer.MAX_VALUE), zaiVar.d, arrayList);
                alpo aX = alzz.aX(arrayList);
                alog alogVar3 = aX.b;
                akdg akdgVar = new akdg(14);
                almo almoVar = new almo(num);
                also alsoVar = also.a;
                List as = alzz.as(alogVar3, akdgVar);
                if (!(as instanceof RandomAccess)) {
                    as = new ArrayList(as);
                }
                int size2 = as.size() - 1;
                while (true) {
                    if (i4 <= size2) {
                        int i11 = (i4 + size2) >>> 1;
                        int compare = alsoVar.compare(almoVar, as.get(i11));
                        if (compare < 0) {
                            size2 = i11 - 1;
                        } else if (compare > 0) {
                            i4 = i11 + 1;
                        } else {
                            as.subList(i4, size2 + 1);
                            i = i4 + (i11 - i4);
                        }
                    } else {
                        i = i4 - 1;
                    }
                }
                if (i != -1 && ((alst) aX.b.get(i)).a(num)) {
                    r6 = aX.c.get(i);
                }
                yfb yfbVar = (yfb) r6;
                if (yfbVar instanceof yfa) {
                    return ((yfa) yfbVar).b().h(new xpm(obj2, yfbVar, 12), zaiVar.e);
                }
                return aktp.ag(zaiVar.d);
            case 14:
                boolean booleanValue = ((Boolean) yiq.q.e()).booleanValue();
                Object obj3 = this.a;
                if (booleanValue) {
                    a = ((yin) obj3).b();
                } else if (((Boolean) ((utz) yiq.r.get()).e()).booleanValue()) {
                    yin yinVar = (yin) obj3;
                    akul b = yinVar.b();
                    akul a4 = yinVar.a(false);
                    a = aktp.an(b, a4).h(new xfb(b, a4, 16, r6), yinVar.d);
                } else {
                    a = ((yin) obj3).a(true);
                }
                yin yinVar2 = (yin) obj3;
                return a.h(new yez(obj3, 3), yinVar2.c).h(new yez(obj3, 7), yinVar2.c);
            case 15:
                ParticipantsTable.BindData a5 = ((rsa) obj).a();
                if (a5 == null) {
                    ytj.a.l("Participant was null");
                    return aktp.ag(new atal(1, (char[]) null));
                }
                if (!a5.A().a()) {
                    ytj.a.l("Participant is not verified sms applicable.");
                    return aktp.ag(new atal(1, (char[]) null));
                }
                Object obj4 = this.a;
                ytj ytjVar = (ytj) obj4;
                if (!ytjVar.c.d()) {
                    ytj.a.l("Verified Sms is not enabled, don't load brand info.");
                    return aktp.ag(new atal(1, (char[]) null));
                }
                if (a5.A() != tqr.VERIFICATION_VERIFIED) {
                    ytj.a.l("Participant is unverified. Hide conversation start view.");
                    return aktp.ag(new atal(2, (char[]) null));
                }
                return aktp.ai(new xfb(obj4, ytjVar.e.q(a5).n(), i3, r6), ytjVar.b);
            case 16:
                yuf yufVar = (yuf) obj;
                alog n = alog.n(DesugarCollections.unmodifiableMap(yufVar.e).keySet());
                if (yufVar.h && (yufVar.b & 2) != 0) {
                    yty ytyVar = yufVar.j;
                    if (ytyVar == null) {
                        ytyVar = yty.a;
                    }
                    alogVar = alog.n(DesugarCollections.unmodifiableMap(ytyVar.f).keySet());
                } else {
                    alogVar = alsx.a;
                }
                alog alogVar4 = alogVar;
                Object obj5 = this.a;
                akul ad = aktp.ad((Iterable) Collection.EL.stream(n).map(new yuq(obj5, yufVar, i4)).collect(alls.a));
                akul ad2 = aktp.ad((Iterable) Collection.EL.stream(alogVar4).map(new yuq(obj5, yufVar, i5)).collect(alls.a));
                return aktp.ap(ad, ad2).h(new kwr(yufVar, n, ad, alogVar4, ad2, 6), ((yuu) obj5).d);
            case 17:
                anmo anmoVar = (anmo) obj;
                anmd anmdVar = (anmd) ((vdm) ((vjs) this.a).a).a().h(((Long) vcv.h.e()).longValue(), TimeUnit.MILLISECONDS);
                aqrs aqrsVar = anmdVar.a;
                aqux aquxVar = anme.d;
                if (aquxVar == null) {
                    synchronized (anme.class) {
                        aquxVar = anme.d;
                        if (aquxVar == null) {
                            aquu a6 = aqux.a();
                            a6.e = aquw.UNARY;
                            a6.a = aqux.c("google.communications.verifiedsms.v1.MessageVerificationService", "ReportDiagnosticInfo");
                            a6.b();
                            anmo anmoVar2 = anmo.a;
                            aozs aozsVar = arkx.a;
                            a6.c = new arkw(anmoVar2);
                            a6.d = new arkw(anmp.a);
                            aquxVar = a6.a();
                            anme.d = aquxVar;
                        }
                    }
                }
                return akul.g(arlj.a(aqrsVar.a(aquxVar, anmdVar.b), anmoVar));
            case 18:
                return ((ytw) this.a).b.e();
            case 19:
                return aktp.af((Throwable) this.a);
            default:
                yuf yufVar2 = (yuf) obj;
                Stream stream = Collection.EL.stream(DesugarCollections.unmodifiableMap(yufVar2.e).keySet());
                Object obj6 = this.a;
                Stream map = stream.map(new uzn(obj6, yufVar2, i2, r6));
                int i12 = alog.d;
                alog alogVar5 = (alog) map.collect(alls.a);
                return aktp.ao(alogVar5).h(new ytr(alogVar5, i6), ((ytw) obj6).j);
        }
    }
}
