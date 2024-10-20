package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.photos.client.MediaUploadStates;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ibo implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ibo(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, tqx] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, ila] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.lang.Object, ila] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, ila] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, ila] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i = 1;
        switch (this.b) {
            case 0:
                ((gpx) this.a).a.i(true, true, true);
                return;
            case 1:
                this.a.a(obj);
                return;
            case 2:
                akyx akyxVar = (akyx) obj;
                boolean isPresent = akyxVar.a.isPresent();
                Object obj2 = this.a;
                if (isPresent) {
                    gpx gpxVar = (gpx) obj2;
                    gpxVar.a.p(gpxVar.d.k((String) akyxVar.a.get()), false);
                    gpxVar.a.f(true);
                    return;
                }
                gpx gpxVar2 = (gpx) obj2;
                ((ilw) gpxVar2.a).G.F();
                gpxVar2.a.f(true);
                return;
            case 3:
                cj fe = ((ilw) ((gpx) this.a).a).k.fe();
                fe.getClass();
                fe.onBackPressed();
                return;
            case 4:
                ajya.c((Intent) this.a, (ajwt) obj);
                return;
            case 5:
                ajya.c((Intent) this.a, (ajwt) obj);
                return;
            case 6:
                ajya.c((Intent) this.a, (ajwt) obj);
                return;
            case 7:
                ((ikc) this.a).m.set(false);
                return;
            case 8:
                smr smrVar = (smr) obj;
                Object obj3 = this.a;
                ikc ikcVar = (ikc) obj3;
                if (ikcVar.e.isConnected()) {
                    ikcVar.j.ifPresent(new ilf(obj3, smrVar, i));
                    return;
                }
                return;
            case 9:
                int i2 = ioe.a;
                ltx a = ((lty) obj).a();
                ilw ilwVar = (ilw) this.a;
                ilwVar.I = a;
                ilwVar.l.b(ilwVar.I.a());
                return;
            case 10:
                aaeu aaeuVar = (aaeu) obj;
                aaeuVar.b().k(qiu.b(), andi.a);
                akfb a2 = aaeuVar.a();
                ilw ilwVar2 = (ilw) this.a;
                ilwVar2.ac.C(a2, new ils(ilwVar2));
                return;
            case 11:
                ((aaet) this.a).a();
                ((aaeu) obj).c().k(qiu.b(), andi.a);
                return;
            case 12:
                alwo alwoVar = ilw.a;
                ((inn) obj).k(this.a);
                return;
            case 13:
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                boolean booleanValue = ((Boolean) vof.a.e()).booleanValue();
                Object obj4 = this.a;
                if (booleanValue && ((Boolean) ipe.g.e()).booleanValue()) {
                    ((ilw) obj4).K.R(new ibo(messagePartCoreData, 12), null);
                }
                ilw ilwVar3 = (ilw) obj4;
                ilwVar3.c.b(aauk.a(messagePartCoreData), ilwVar3.G.r(messagePartCoreData));
                return;
            case 14:
                ((inn) obj).i(((ime) ((Optional) this.a).get()).a.W());
                return;
            case 15:
                ((rtc) this.a).c(((Long) obj).longValue());
                return;
            case 16:
                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) obj;
                alwo alwoVar2 = imk.a;
                Uri t = messagePartCoreData2.t();
                t.getClass();
                String uri = t.toString();
                MediaUploadStates mediaUploadStates = (MediaUploadStates) this.a;
                if (mediaUploadStates.a.containsKey(uri)) {
                    messagePartCoreData2.aA((afvq) mediaUploadStates.a.get(uri));
                    return;
                }
                return;
            case 17:
                if (((Long) obj).longValue() <= 0) {
                    Object obj5 = this.a;
                    alwl alwlVar = (alwl) GalleryContent.o.h();
                    alwlVar.Z(alwk.FULL);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/conversation/draft/model/GalleryContent$Builder", "build", 152, "GalleryContent.java")).r("GalleryContent with invalid duration from source: %d", ((imm) obj5).c.a());
                    return;
                }
                return;
            case 18:
                int intValue = ((Integer) obj).intValue();
                ipc ipcVar = (ipc) this.a;
                if (!ipcVar.k) {
                    return;
                }
                inj injVar = ipcVar.g;
                injVar.e(injVar.d, intValue);
                return;
            case 19:
                this.a.a(obj);
                return;
            default:
                lyg lygVar = (lyg) obj;
                ((ird) this.a).f.F(lygVar, lygVar.H());
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
