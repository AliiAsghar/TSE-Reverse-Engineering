package defpackage;

import android.net.Uri;
import android.provider.BlockedNumberContract;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.util.block.BlockedNumbersJob;
import com.google.android.gms.feedback.FileTeleporter;
import j$.util.Collection;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wkf implements Callable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ wkf(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.util.List, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri;
        int i = 15;
        boolean z = false;
        Object obj = null;
        int i2 = 1;
        switch (this.b) {
            case 0:
                Object obj2 = this.a;
                return Boolean.valueOf(Collection.EL.stream(((wkk) obj2).n.p()).map(new wki(obj2, i2)).anyMatch(new wjl(5)));
            case 1:
                return Boolean.valueOf(((wih) ((wkk) this.a).p.b()).a().equals(wiz.TOGGLE_STATE_USER_DISABLED));
            case 2:
                wga wgaVar = new wga(16);
                MessagesTable.BindData a = MessagesTable.a((MessageIdType) this.a);
                if (a != null) {
                    obj = wgaVar.apply(a);
                }
                return (amso) obj;
            case 3:
                ((wva) this.a).n();
                return null;
            case 4:
                return ((wva) this.a).s();
            case 5:
                tlg tlgVar = new tlg(tlj.a);
                tlgVar.w("getAllExistingDataAsync");
                tlgVar.c(new wki(this.a, 7));
                return tlgVar.b().t();
            case 6:
                wva wvaVar = (wva) this.a;
                return (apbt) wvaVar.i.a().orElse(wvaVar.g);
            case 7:
                alob alobVar = new alob();
                alobVar.h(new FileTeleporter(((yyz) ((xap) this.a).b.b()).l().getBytes(StandardCharsets.UTF_8), "Carrier config"));
                return alobVar.g();
            case 8:
                Object obj3 = this.a;
                akrc b = ((xcj) obj3).g.b("StartupHandlerImpl App Interactive Delay Timer Fired");
                try {
                    akul b2 = ((xcj) obj3).b(true);
                    b.close();
                    return b2;
                } catch (Throwable th) {
                    try {
                        b.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            case 9:
                alwo alwoVar = xfw.a;
                return Boolean.valueOf(!((alog) this.a).isEmpty());
            case 10:
                apax<xgo> apaxVar = ((xgp) this.a).b;
                alob alobVar2 = new alob();
                for (xgo xgoVar : apaxVar) {
                    File file = new File(xgoVar.c);
                    if (file.exists() && xng.d(file)) {
                        alobVar2.h(xgoVar.b);
                    }
                }
                tbt tbtVar = new tbt();
                tbtVar.aj("deletePartsCache");
                tbtVar.i();
                tbtVar.m();
                tbtVar.v(new xgt(alobVar2, i));
                tbtVar.a().e();
                return upm.b();
            case 11:
                return alor.j(((xpi) ((xph) this.a).a).b);
            case 12:
                alwo alwoVar2 = xqb.a;
                xpc c = xpf.c();
                c.w("getFileInformationForResume");
                ahmv ahmvVar = xpf.d;
                c.c((xoy) ahmvVar.h, (xoy) ahmvVar.f);
                xpe xpeVar = new xpe();
                xpeVar.c((String) this.a);
                xpeVar.d(xpg.DOWNLOAD);
                c.k(new agpw(xpeVar));
                return (xow) ((xoz) c.b().n()).cO();
            case 13:
                alwo alwoVar3 = xqb.a;
                return (String) MessagesTable.f(((xow) this.a).m(), new xos(3), new wso(19));
            case 14:
                alwl alwlVar = (alwl) xrf.a.g();
                ?? r1 = this.a;
                alwlVar.X(ydl.a, r1.B().a());
                alwlVar.X(ydl.e, r1.E().b);
                alwlVar.X(ydl.o, r1.z().toString());
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/transfer/incoming/IncomingFileTransferProcessor", "scheduleFinishingActionsForIncomingFileTransferPushMessage", 975, "IncomingFileTransferProcessor.java")).q("Incoming file transfer push message successfully processed.");
                return pwh.SUCCESS;
            case 15:
                Object obj4 = this.a;
                try {
                    Iterator it = ((gsx) obj4).b.j.a.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String uri2 = ((Uri) it.next()).toString();
                            uri = BlockedNumberContract.BlockedNumbers.CONTENT_URI;
                            if (uri2.startsWith(uri.toString())) {
                                ((xxb) ((BlockedNumbersJob) obj4).e.b()).d();
                            }
                        }
                    }
                    return new gsw();
                } finally {
                    BlockedNumbersJob.c(((gsx) obj4).a);
                }
            case 16:
                if (xxe.b) {
                    ((alwl) ((alwl) xxe.a.g()).h("com/google/android/apps/messaging/shared/util/block/BlockedParticipantsUtil", "haveSystemBlockList", 77, "BlockedParticipantsUtil.java")).q("BlockedParticipantsUtil#haveSystemBlockList: debugUseLocalBlocking is true");
                } else {
                    z = ((xxe) this.a).b();
                }
                return Boolean.valueOf(z);
            case 17:
                xxe xxeVar = (xxe) this.a;
                if (xxeVar.c() || !xxeVar.b()) {
                    return false;
                }
                taz e = ParticipantsTable.e();
                e.w("hasUnmigratedBlockedContacts");
                e.g(new xos(i));
                return Boolean.valueOf(e.b().K());
            case 18:
                ydm ydmVar = (ydm) this.a;
                ydmVar.c.a();
                ydmVar.a.set(((Integer) ydp.a.e()).intValue());
                return null;
            case 19:
                ydn ydnVar = (ydn) this.a;
                ydnVar.e.a();
                ydnVar.b.set(((Integer) ydp.b.e()).intValue());
                ydnVar.c.set(((Integer) ydp.c.e()).intValue());
                int intValue = ((Integer) ydp.d.e()).intValue();
                if (((yyt) ydnVar.a.b()).z()) {
                    intValue = Math.min(intValue, Level.FINE.intValue());
                }
                ydnVar.d.set(intValue);
                return null;
            default:
                ArrayList arrayList = new ArrayList();
                arrayList.add(new FileTeleporter(((yep) ((xap) this.a).a).d().getBytes(), "GServicesValues"));
                return arrayList;
        }
    }
}
