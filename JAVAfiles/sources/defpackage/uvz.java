package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.net.tachyonreceiver.PullMessagesWorker;
import com.google.android.apps.messaging.shared.net.tachyonrefresh.TachyonRefreshWorker;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.ToLongFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uvz implements algk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ uvz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v142, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object, wul] */
    /* JADX WARN: Type inference failed for: r3v67, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // defpackage.algk
    public final Object apply(Object obj) {
        String r;
        int i = 4;
        int i2 = 2;
        aqem aqemVar = null;
        switch (this.c) {
            case 0:
                Stream stream = Collection.EL.stream(this.b);
                Object obj2 = this.a;
                Stream filter = stream.filter(new uhe(obj2, 3));
                final uac uacVar = ((uwc) obj2).k;
                filter.min(Comparator.CC.comparingLong(new ToLongFunction() { // from class: uwb
                    @Override // java.util.function.ToLongFunction
                    public final long applyAsLong(Object obj3) {
                        return uac.this.j((sqf) obj3);
                    }
                })).ifPresent(new uoa(obj2, 7));
                return null;
            case 1:
                utt uttVar = (utt) this.b;
                uttVar.d = true;
                Context context = (Context) this.a;
                context.sendBroadcast(lqn.f(context, acyt.class, RcsIntents.ACTION_CSLIB_FLAGS_UPDATED).a());
                uttVar.a();
                return null;
            case 2:
                ((alwl) ((alwl) uwd.b.g()).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageTracker", "stopTracking", 114, "MessageTracker.java")).D("Stopped tracking messages %s for tracking purpose %s", this.b, this.a);
                return null;
            case 3:
                ((alwl) ((alwl) ((alwl) uwd.b.i()).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/flaggedmessages/MessageTracker", "stopTracking", 122, "MessageTracker.java")).D("Error when trying to stop tracking %s for tracking purpose %s", this.b, this.a);
                return null;
            case 4:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Object obj3 = this.a;
                if (!booleanValue) {
                    ((uyn) obj3).a.o("User has not been onboarded, skipping clean up tasks.");
                    return upm.b();
                }
                uyo uyoVar = (uyo) this.b;
                if (uyoVar.d) {
                    qiu.h(((uyl) ((uyn) obj3).g.get()).a());
                }
                int i3 = 8;
                if (uyoVar.b) {
                    uyn uynVar = (uyn) obj3;
                    if (((Boolean) uynVar.e.b()).booleanValue() && ((Optional) ((apxx) uynVar.d).a).isPresent()) {
                        qiu.h(((uyv) ((Optional) ((apxx) uynVar.d).a).get()).a().i(new uwa(obj3, i3), uynVar.f));
                    } else {
                        qiu.h(((ifq) uynVar.b.b()).a());
                    }
                }
                if (uyoVar.c) {
                    vco vcoVar = (vco) ((uyn) obj3).c.b();
                    qiu.h(vcoVar.b.h().h(new uyi(13), vcoVar.a).i(new uwa(vcoVar, 10), vcoVar.a));
                    qiu.h(vcoVar.g().i(new uwa(vcoVar, 9), vcoVar.a));
                    qiu.h(vcoVar.b.j(new uyi(11)).h(new uyi(12), vcoVar.a));
                    qiu.h(vcoVar.b.j(new uyi(i)).h(new uyi(i3), vcoVar.a));
                }
                return upm.b();
            case 5:
                upm upmVar = (upm) obj;
                ((mgv) ((uzv) this.a).e.b()).f((ahka) this.b);
                return upmVar;
            case 6:
                aozy builder = ((aehp) obj).toBuilder();
                Object obj4 = this.b;
                obj4.getClass();
                Object obj5 = this.a;
                obj5.getClass();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                ((aehp) builder.b).a().put(obj4, obj5);
                return (aehp) builder.s();
            case 7:
                Iterator it = ((Set) ((vax) this.a).c.b()).iterator();
                while (it.hasNext()) {
                    ((vgy) it.next()).c((String) this.b);
                }
                return null;
            case 8:
                aozy builder2 = ((vdv) obj).toBuilder();
                aozb w = aozb.w((byte[]) this.a);
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                Object obj6 = this.b;
                ((vdv) builder2.b).e = w;
                aozb w2 = aozb.w((byte[]) obj6);
                if (!builder2.b.isMutable()) {
                    builder2.u();
                }
                ((vdv) builder2.b).f = w2;
                return (vdv) builder2.s();
            case 9:
                aozy builder3 = ((vee) obj).toBuilder();
                aozb w3 = aozb.w((byte[]) this.a);
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                Object obj7 = this.b;
                ((vee) builder3.b).f = w3;
                aozb w4 = aozb.w((byte[]) obj7);
                if (!builder3.b.isMutable()) {
                    builder3.u();
                }
                ((vee) builder3.b).g = w4;
                return (vee) builder3.s();
            case 10:
                vee veeVar = (vee) obj;
                ((AtomicReference) this.b).set(veeVar);
                aozy builder4 = veeVar.toBuilder();
                if (!builder4.b.isMutable()) {
                    builder4.u();
                }
                ((vee) builder4.b).j = ((vec) this.a).a();
                return (vee) builder4.s();
            case 11:
                aozy aozyVar = (aozy) obj;
                aozy createBuilder = aqen.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj8 = this.b;
                apag apagVar = createBuilder.b;
                aqen aqenVar = (aqen) apagVar;
                obj8.getClass();
                aqenVar.c = (aqgb) obj8;
                aqenVar.b = 1 | aqenVar.b;
                if (!apagVar.isMutable()) {
                    createBuilder.u();
                }
                apag apagVar2 = createBuilder.b;
                ((aqen) apagVar2).d = "Bugle";
                if (!apagVar2.isMutable()) {
                    createBuilder.u();
                }
                Object obj9 = this.a;
                aqen aqenVar2 = (aqen) createBuilder.b;
                aqep aqepVar = (aqep) aozyVar.s();
                aqepVar.getClass();
                aqenVar2.e = aqepVar;
                aqenVar2.b |= 2;
                vex vexVar = (vex) obj9;
                yjr yjrVar = vexVar.b;
                ykb j = vexVar.a.j();
                if (!yjrVar.x() && (r = j.r()) != null) {
                    aqemVar = vex.k(r);
                } else {
                    String e = vexVar.c.e("device_country", "unknown");
                    if (e.length() == 2) {
                        aqemVar = vex.k(e);
                    } else {
                        String v = j.v(Locale.US);
                        if (!TextUtils.isEmpty(v)) {
                            aqemVar = vex.k(v);
                        }
                    }
                }
                if (aqemVar != null) {
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    aqen aqenVar3 = (aqen) createBuilder.b;
                    aqenVar3.f = aqemVar;
                    aqenVar3.b = 4 | aqenVar3.b;
                }
                return (aqen) createBuilder.s();
            case 12:
                alvw d = vfv.c.d();
                d.X(alwp.a, "BugleNetwork");
                alvg alvgVar = (alvg) ((alvg) d).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "scheduleMessageIdCheck", 248, "BindHandlerImpl.java");
                Object obj10 = this.a;
                vfv vfvVar = (vfv) obj10;
                String aD = akec.aD(vfvVar.E);
                Object obj11 = this.b;
                alvgVar.D("%s BindHandler: add message ID to check: %s", aD, obj11);
                synchronized (vfvVar.m) {
                    ((vfv) obj10).r.add(obj11);
                    if (((vfv) obj10).s == null) {
                        alvw g = vfv.c.g();
                        g.X(alwp.a, "BugleNetwork");
                        ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/net/handler/bindhandler/BindHandlerImpl", "scheduleMessageIdCheck", 256, "BindHandlerImpl.java")).t("%s BindHandler: scheduling a pull", akec.aD(((vfv) obj10).E));
                        ((vfv) obj10).s = ((vfv) obj10).w.schedule(new uql(obj10, 6), ((Integer) vbh.l.e()).intValue(), TimeUnit.SECONDS);
                    }
                }
                ((mbl) vfvVar.v.b()).e("Bugle.Ditto.Binding.TicklePulling.Counts", 1);
                return null;
            case 13:
                alvw i4 = vgt.a.i();
                i4.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) ((alvg) i4).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/net/inboxmessagedispatcher/InboxMessageDispatcherImpl", "ackRequestCatchingThrowable", 284, "InboxMessageDispatcherImpl.java")).D("InboxMessageDispatcherImpl: Failed to ack message messageId: %s messageClass: %s", this.b, this.a);
                return null;
            case 14:
                Throwable th = (Throwable) obj;
                alvw i5 = vhe.a.i();
                i5.X(alwp.a, "BugleNetwork");
                ((alvg) ((alvg) ((alvg) i5).g(th)).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiver", "handlePullMessagesError", (char) 156, "TachyonReceiver.java")).q("Tachyon PullMessages or RegisterRefresh failed");
                if (vch.d(th)) {
                    Object obj12 = this.b;
                    Context context2 = ((vhe) this.a).b;
                    xyo a = PullMessagesWorker.e.a();
                    a.H("Scheduling pull retry");
                    aqfn aqfnVar = (aqfn) obj12;
                    a.z("app", aqfnVar.d);
                    a.q();
                    gsd gsdVar = new gsd();
                    gsdVar.c(2);
                    gsz gszVar = new gsz(PullMessagesWorker.class);
                    gszVar.c("pull_messages_worker");
                    gszVar.f(gsdVar.a());
                    hgi hgiVar = new hgi((char[]) null);
                    hgiVar.n("pull_messages_app", aqfnVar.d);
                    hgiVar.n("pull_messages_id", aqfnVar.c);
                    gszVar.i(hgiVar.j());
                    gszVar.g(((Long) PullMessagesWorker.f.e()).longValue(), TimeUnit.SECONDS);
                    kkc j2 = gszVar.j();
                    gvf.ar(context2).l("pull_messages_" + aqfnVar.d + aqfnVar.c, gso.REPLACE, j2);
                }
                return null;
            case 15:
                Throwable th2 = (Throwable) obj;
                boolean d2 = vch.d(th2);
                ?? r3 = this.b;
                if (d2) {
                    aozy createBuilder2 = aqfn.a.createBuilder();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    apag apagVar3 = createBuilder2.b;
                    r3.getClass();
                    ((aqfn) apagVar3).c = (String) r3;
                    asku askuVar = asku.PHONE_NUMBER;
                    if (!apagVar3.isMutable()) {
                        createBuilder2.u();
                    }
                    ((aqfn) createBuilder2.b).b = askuVar.a();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    Object obj13 = this.a;
                    ((aqfn) createBuilder2.b).d = "RCS";
                    aqfn aqfnVar2 = (aqfn) createBuilder2.s();
                    Context context3 = ((vhm) obj13).c;
                    xyo a2 = TachyonRefreshWorker.e.a();
                    a2.H("Scheduling refresh retry");
                    a2.z("app", aqfnVar2.d);
                    a2.q();
                    gsz gszVar2 = new gsz(TachyonRefreshWorker.class);
                    gszVar2.c("tachyon_refresh_worker");
                    gsd gsdVar2 = new gsd();
                    gsdVar2.d();
                    gsdVar2.c(2);
                    gszVar2.f(gsdVar2.a());
                    hgi hgiVar2 = new hgi((char[]) null);
                    hgiVar2.n("tachyon_refresh_app", aqfnVar2.d);
                    hgiVar2.n("tachyon_refresh_id", aqfnVar2.c);
                    gszVar2.i(hgiVar2.j());
                    gszVar2.g(((Long) TachyonRefreshWorker.f.e()).longValue(), TimeUnit.SECONDS);
                    kkc j3 = gszVar2.j();
                    gvf.ar(context3).l("tachyon_refresh_" + aqfnVar2.d + aqfnVar2.c, gso.REPLACE, j3);
                }
                xyo e2 = vhm.a.e();
                e2.H("Failed to update registration");
                e2.w("number", r3, 2);
                e2.r(th2);
                return null;
            case 16:
                Optional optional = ((vkn) this.b).a;
                Object obj14 = this.a;
                alwo alwoVar = vka.a;
                return new vlp((dyu) obj, ((vkh) obj14).d(), false, optional);
            case 17:
                ((alwl) ((alwl) ((alwl) vka.a.i()).g((Exception) obj)).h("com/google/android/apps/messaging/shared/notification2o/CreateNotificationHandler", "createNotificationFromInputData", 319, "CreateNotificationHandler.java")).q("createNotification call failed finished");
                vjs vjsVar = (vjs) ((vka) this.a).k.b();
                vlm d3 = ((vkh) this.b).d();
                d3.getClass();
                ((mbl) vjsVar.a.b()).e("Bugle.Notifications2o.FailedToPost.Count", d3.i);
                return upm.e();
            case 18:
                rry rryVar = (rry) this.a;
                MessageIdType u = rryVar.u();
                if (((Boolean) obj).booleanValue() && !u.b() && !rryVar.ap()) {
                    Object obj15 = this.b;
                    rryVar.t();
                    Optional map = ((vlw) obj15).n.map(new vil(15));
                    if (map.isPresent()) {
                        return vke.c(vkf.NAT_REMINDER, (dyk) map.get(), Optional.empty());
                    }
                    ((alwl) ((alwl) vlw.a.i()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createReminderAction", 683, "IncomingMessageActionCreator.java")).q("Reminder action is not present, not creating reminder action");
                    return null;
                }
                ((alwl) ((alwl) vlw.a.g()).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageActionCreator", "createReminderAction", 671, "IncomingMessageActionCreator.java")).q("Unable to create reminder action from message data");
                return null;
            case 19:
                vlw vlwVar = (vlw) this.b;
                CharSequence[] charSequenceArr = (CharSequence[]) ((Optional) obj).flatMap(new viu(vlwVar.g, i2)).orElse(null);
                Bundle bundle = new Bundle();
                Object obj16 = this.a;
                rto rtoVar = (rto) obj16;
                bundle.putString("conversation_id", rtoVar.L().a());
                bundle.putString("self_id", ((SelfIdentityIdImpl) ((rru) obj16).f()).a);
                bundle.putBoolean("requires_mms", rtoVar.S());
                bundle.putBoolean("has_rbm_bot_recipient", rtoVar.R());
                bundle.putBoolean("via_notification", true);
                bundle.putBoolean("via_quickreply", true);
                vkd a3 = vke.a(vkf.NAT_QUICK_REPLY, IconCompat.g(vlwVar.d, R.drawable.ic_wear_reply), vlwVar.d.getString(R.string.im_notification_reply), Optional.of(bundle));
                if (((ple) vlwVar.r.b()).a()) {
                    a3.f = Optional.of(new dzw[]{new dzw("android.intent.extra.TEXT", vlwVar.d.getString(R.string.im_notification_reply_prompt), null, true, 0, new Bundle(), new HashSet())});
                    a3.d = Optional.of(true);
                } else {
                    a3.f = Optional.of(new dzw[]{new dzw("android.intent.extra.TEXT", vlwVar.d.getString(R.string.im_notification_reply_prompt), charSequenceArr, true, 0, new Bundle(), new HashSet())});
                    a3.d = Optional.of(Boolean.valueOf(vmy.b()));
                }
                a3.e = Optional.of(1);
                return a3.a();
            default:
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    Object obj17 = this.a;
                    Object obj18 = this.b;
                    alwl alwlVar = (alwl) vmf.a.g();
                    alwlVar.X(ydl.p, obj17);
                    ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageBlueprint", "shouldCreateBuilderInfoForWearable", 918, "IncomingMessageBlueprint.java")).q("Skipping notification creation: conversation is not allowed by parents");
                    ((mbl) ((vmf) obj18).n.b()).c("Bugle.Kids.Notification.Blocked");
                }
                return bool;
        }
    }

    public /* synthetic */ uvz(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
