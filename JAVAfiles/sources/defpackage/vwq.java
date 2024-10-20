package defpackage;

import android.app.ActivityManager;
import android.content.Intent;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.receiver.RestoreReceiver;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class vwq implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ vwq(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v67, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r6v54, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v57, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        byte[] bArr = null;
        int i = 2;
        int i2 = 0;
        switch (this.b) {
            case 0:
                Instant instant = (Instant) obj;
                alwo alwoVar = vwr.a;
                if (instant.toEpochMilli() >= 0) {
                    Object obj2 = this.a;
                    apct j = aotl.j(instant);
                    aozy aozyVar = (aozy) obj2;
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    vws vwsVar = (vws) aozyVar.b;
                    vws vwsVar2 = vws.a;
                    j.getClass();
                    vwsVar.c = j;
                    vwsVar.b |= 1;
                    return;
                }
                return;
            case 1:
                ajpy ajpyVar = (ajpy) obj;
                alwo alwoVar2 = vwr.a;
                aozy createBuilder = vws.a.createBuilder();
                ajpyVar.b().ifPresent(new vwq(createBuilder, i2));
                ajpyVar.a().ifPresent(new vwq(createBuilder, i));
                vws vwsVar3 = (vws) createBuilder.s();
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                vwp vwpVar = (vwp) aozyVar2.b;
                vwp vwpVar2 = vwp.a;
                vwsVar3.getClass();
                vwpVar.g = vwsVar3;
                vwpVar.b |= 1;
                return;
            case 2:
                alwo alwoVar3 = vwr.a;
                String a = ((ajpu) obj).a();
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                vws vwsVar4 = (vws) aozyVar3.b;
                vws vwsVar5 = vws.a;
                vwsVar4.d = a;
                return;
            case 3:
                ueo ueoVar = (ueo) obj;
                alwo alwoVar4 = vxx.a;
                if (ueoVar.b()) {
                    Object obj3 = this.a;
                    alvw g = vxx.b.g();
                    g.X(alwp.a, "BugleDataModel");
                    alvg alvgVar = (alvg) g;
                    alvgVar.X(ydl.p, obj3);
                    ((alvg) alvgVar.h("com/google/android/apps/messaging/shared/rcs/incoming/IncomingRcsMessageProcessor", "updateMatrixParticipant", 1025, "IncomingRcsMessageProcessor.java")).q("Found fake Matrix user");
                    ueoVar.d();
                    ueoVar.c();
                    return;
                }
                return;
            case 4:
                ?? r0 = this.a;
                r0.t();
                r0.aE();
                ((vae) obj).b();
                return;
            case 5:
                String str = (String) obj;
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                qgr qgrVar = (qgr) aozyVar4.b;
                qgr qgrVar2 = qgr.a;
                str.getClass();
                qgrVar.b |= 1;
                qgrVar.c = str;
                return;
            case 6:
                qfj qfjVar = (qfj) obj;
                aozy aozyVar5 = (aozy) this.a;
                if (!aozyVar5.b.isMutable()) {
                    aozyVar5.u();
                }
                qez qezVar = (qez) aozyVar5.b;
                apap apapVar = qez.a;
                qfjVar.getClass();
                qezVar.h = qfjVar;
                qezVar.c |= 4;
                return;
            case 7:
                apct j2 = aotl.j((Instant) obj);
                aozy aozyVar6 = (aozy) this.a;
                if (!aozyVar6.b.isMutable()) {
                    aozyVar6.u();
                }
                qfm qfmVar = (qfm) aozyVar6.b;
                qfm qfmVar2 = qfm.a;
                j2.getClass();
                qfmVar.d = j2;
                qfmVar.b |= 2;
                return;
            case 8:
                qei qeiVar = (qei) obj;
                aozy aozyVar7 = (aozy) this.a;
                if (!aozyVar7.b.isMutable()) {
                    aozyVar7.u();
                }
                qfo qfoVar = (qfo) aozyVar7.b;
                apap apapVar2 = qfo.a;
                qeiVar.getClass();
                qfoVar.f = qeiVar;
                qfoVar.c |= 16;
                return;
            case 9:
                qei qeiVar2 = (qei) obj;
                aozy aozyVar8 = (aozy) this.a;
                if (!aozyVar8.b.isMutable()) {
                    aozyVar8.u();
                }
                qfo qfoVar2 = (qfo) aozyVar8.b;
                apap apapVar3 = qfo.a;
                qeiVar2.getClass();
                qfoVar2.f = qeiVar2;
                qfoVar2.c |= 16;
                return;
            case 10:
                vza vzaVar = (vza) this.a;
                Duration between = Duration.between((Instant) obj, Instant.ofEpochMilli(vzaVar.c.a()));
                if (Duration.ZERO.compareTo(between) > 0) {
                    vza.a.l("Skipping UMA histogram update for invalid incoming message queuing duration");
                    return;
                } else {
                    vzaVar.b.g("Bugle.MessagingService.GetMessages.Queuing.Latency", between.toMillis());
                    return;
                }
            case 11:
                this.a.a(obj);
                return;
            case 12:
                ((wjm) ((wjk) this.a).e.b()).e((MessageIdType) obj);
                return;
            case 13:
                Iterator it = ((Set) obj).iterator();
                while (it.hasNext()) {
                    ((wnu) it.next()).p((Intent) this.a);
                }
                return;
            case 14:
                RestoreReceiver restoreReceiver = (RestoreReceiver) this.a;
                armf armfVar = restoreReceiver.x;
                if (armfVar != null && armfVar.b() != null) {
                    ((maq) restoreReceiver.x.b()).b();
                }
                ((ActivityManager) ((xca) restoreReceiver.m.b()).c.getSystemService("activity")).clearApplicationUserData();
                xca.a.p("force exit.");
                System.exit(0);
                return;
            case 15:
                this.a.a(obj);
                return;
            case 16:
                ((dtq) this.a).b(null);
                return;
            case 17:
                wne wneVar = (wne) this.a;
                wneVar.a();
                wneVar.k.e(wneVar.b);
                wneVar.b.t();
                return;
            case 18:
                wpp wppVar = (wpp) obj;
                qiu.h(aktp.ah(new wnc(wppVar, this.a, i2, bArr), wppVar.a));
                return;
            case 19:
                wpp wppVar2 = (wpp) obj;
                qiu.h(aktp.ah(new wnc(wppVar2, this.a, i, bArr), wppVar2.a));
                return;
            default:
                wpj wpjVar = (wpj) obj;
                wpjVar.getClass();
                Object obj4 = this.a;
                obj4.getClass();
                wpjVar.e((qwe) obj4);
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
