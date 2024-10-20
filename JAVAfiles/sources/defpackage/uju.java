package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import io.grpc.Status;
import j$.time.Instant;
import j$.util.Optional;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.function.Function;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class uju implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ uju(aday adayVar, agrr agrrVar, List list, aefu aefuVar, int i) {
        this.e = i;
        this.a = adayVar;
        this.b = agrrVar;
        this.d = list;
        this.c = aefuVar;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v107, types: [arhk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v67, types: [akgh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.lang.Object, java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, akfb] */
    /* JADX WARN: Type inference failed for: r6v24, types: [java.lang.Object, java.util.function.Function] */
    @Override // java.lang.Runnable
    public final void run() {
        Object a;
        alog alogVar;
        agnw d;
        agnw d2;
        boolean b;
        int i = 0;
        switch (this.e) {
            case 0:
                Object obj = this.c;
                Optional empty = Optional.empty();
                qwm qwmVar = (qwm) obj;
                ParticipantsTable.BindData a2 = qwmVar.a();
                int i2 = alog.d;
                ujv ujvVar = (ujv) this.a;
                ujvVar.f(empty, (ConversationIdType) this.b, qwmVar, a2, alsx.a, 211, ujvVar.e.f().toEpochMilli(), -1L, (String) this.d);
                return;
            case 1:
                ujv ujvVar2 = (ujv) this.a;
                rwd rwdVar = (rwd) ujvVar2.d.b();
                ConversationIdType conversationIdType = (ConversationIdType) this.b;
                MessageCoreData l = rwdVar.l(conversationIdType);
                if (l != null && l.cT()) {
                    ((uzo) ujvVar2.j.b()).a(l.B());
                }
                ?? r0 = this.c;
                List K = ((rtz) ujvVar2.c.b()).K(conversationIdType);
                long f = ((rtz) ujvVar2.c.b()).f(conversationIdType);
                qwm c = ((ryg) ujvVar2.f.b()).c(r0);
                if (c == null) {
                    return;
                }
                ujvVar2.f((Optional) this.d, conversationIdType, c, c.a(), K, 240, ujvVar2.e.f().toEpochMilli(), f, String.format(Locale.ENGLISH, "%d (%s) ", Integer.valueOf(c.c()), c.h()));
                return;
            case 2:
                Object obj2 = this.a;
                Object obj3 = this.c;
                Optional empty2 = Optional.empty();
                if (obj2 != null) {
                    a = obj2;
                } else {
                    a = ((qwm) obj3).a();
                }
                if (obj2 != null) {
                    alogVar = alog.r(obj2);
                } else {
                    int i3 = alog.d;
                    alogVar = alsx.a;
                }
                alog alogVar2 = alogVar;
                Object obj4 = this.b;
                ujv ujvVar3 = (ujv) this.d;
                ujvVar3.f(empty2, (ConversationIdType) obj4, (qwm) obj3, (ParticipantsTable.BindData) a, alogVar2, 218, ujvVar3.e.f().toEpochMilli(), -1L, null);
                return;
            case 3:
                xyo c2 = ukg.a.c();
                c2.H("cleaning up verified sms data");
                String str = (String) this.a;
                c2.e(str);
                ConversationIdType conversationIdType2 = (ConversationIdType) this.c;
                c2.b(conversationIdType2);
                Object obj5 = this.d;
                c2.z("sender id", obj5);
                c2.q();
                xyo c3 = ukg.a.c();
                c3.H("Cleaning participant");
                c3.q();
                tbb f2 = ParticipantsTable.f();
                f2.aj("cleanupVerificationData-participants");
                tbd tbdVar = new tbd();
                tbdVar.h(str);
                f2.L(tbdVar);
                f2.v(tqr.VERIFICATION_NA);
                f2.E();
                f2.p();
                f2.r();
                f2.a().e();
                xyo c4 = ukg.a.c();
                c4.H("Cleaning all messages from sender");
                c4.q();
                sya syaVar = new sya();
                syaVar.aj("cleanupVerificationData-messages");
                syc sycVar = new syc();
                sycVar.F(str);
                syaVar.O(sycVar);
                syaVar.M(tqr.VERIFICATION_NA);
                syaVar.a().e();
                xyo c5 = ukg.a.c();
                c5.H("Removing sender from VerifiedSmsSendersTable");
                c5.q();
                tpn tpnVar = new tpn();
                tpnVar.f("cleanupVerificationData");
                tpnVar.b(new uje(obj5, 5));
                tpnVar.d();
                xyo c6 = ukg.a.c();
                c6.H("Adding sender to blacklist");
                c6.q();
                String[] strArr = tow.a;
                int i4 = toe.a;
                top topVar = new top();
                topVar.b((String) obj5);
                too a3 = topVar.a();
                d = agnc.d("$primary");
                d2 = agnc.d("$primary");
                agnc.a(d2, "verified_sms_blacklisted_senders", a3, new tkg(d, 6), new swb(15));
                ukg ukgVar = (ukg) this.b;
                ((rtz) ukgVar.e.b()).P(str);
                alvw g = ukg.b.g();
                g.X(alwp.a, "BugleNotifications");
                ((alvg) ((alvg) g).h("com/google/android/apps/messaging/shared/datamodel/verifiedsmsworkers/UpdateMessageVerificationStatusWorkHelper", "cleanupVerificationData", 344, "UpdateMessageVerificationStatusWorkHelper.java")).q("Creating notification from UpdateMessageVerificationStatusWorkHelper#cleanupVerificationData");
                ((wpp) ukgVar.k.b()).K();
                ukgVar.h.i(conversationIdType2);
                return;
            case 4:
                vxx vxxVar = (vxx) this.a;
                Iterator it = ((Set) vxxVar.y.b()).iterator();
                while (true) {
                    ?? r4 = this.c;
                    if (it.hasNext()) {
                        ((rwo) it.next()).g();
                    } else {
                        if (((vxv) this.b).b()) {
                            vxxVar.t.a((String) this.d, r4, true);
                        }
                        vxxVar.ac.i(r4);
                        ((rvw) vxxVar.H.b()).a(r4);
                        Iterator it2 = ((Set) vxxVar.y.b()).iterator();
                        while (it2.hasNext()) {
                            ((rwo) it2.next()).e(r4);
                        }
                        return;
                    }
                }
            case 5:
                Object obj6 = this.d;
                wne wneVar = (wne) obj6;
                wni wniVar = wneVar.i;
                String k = ((wna) this.a).k((Context) this.c, (Intent) this.b);
                if (!wniVar.d.isDone()) {
                    xyo c7 = wne.a.c();
                    c7.H("Launching foreground service for");
                    c7.H(wneVar.b);
                    c7.q();
                    via viaVar = (via) wneVar.d.b();
                    if (TextUtils.isEmpty(k)) {
                        String name = wneVar.b.getClass().getName();
                        if (((Boolean) wnf.a.e()).booleanValue()) {
                            k = wneVar.c.getString(R.string.broadcast_receiver_notification_text_extra_info, name);
                        } else {
                            k = wneVar.c.getString(R.string.foreground_service_notification_generic_text);
                        }
                    }
                    uwf.a(new wnd(obj6, viaVar.b(k), i));
                    String f3 = wneVar.b.f();
                    if (!TextUtils.isEmpty(f3)) {
                        wneVar.j = wneVar.h.c(f3, UUID.randomUUID().toString());
                    }
                }
                wneVar.a();
                return;
            case 6:
                Object obj7 = this.c;
                ImageView imageView = (ImageView) this.b;
                imageView.setImageDrawable((Drawable) obj7);
                imageView.setContentDescription(this.d);
                ((zqu) this.a).e.animate().scaleX(1.0f).scaleY(1.0f).setDuration(75L).setInterpolator(new DecelerateInterpolator()).start();
                return;
            case 7:
                Object obj8 = this.b;
                Object obj9 = this.c;
                ?? r42 = this.d;
                try {
                    if (a.bC(((aacp) this.a).u, r42, new zkf(12))) {
                        r42.apply(obj9);
                    }
                    ((dtq) obj8).b(null);
                    return;
                } catch (Throwable th) {
                    ((dtq) obj8).d(th);
                    return;
                }
            case 8:
                Object obj10 = this.b;
                enm c8 = dyx.c((View) obj10);
                Object obj11 = this.c;
                Object obj12 = this.a;
                ?? r6 = this.d;
                if (c8 != null && c8.N().a() == eng.DESTROYED) {
                    return;
                }
                try {
                    if (a.bC(((ConversationMessageView) obj10).v, r6, new zkf(14))) {
                        r6.apply(obj12);
                    }
                    ((dtq) obj11).b(null);
                    return;
                } catch (Throwable th2) {
                    ((dtq) obj11).d(th2);
                    return;
                }
            case 9:
                Object obj13 = this.c;
                ?? r02 = this.d;
                Object obj14 = this.b;
                try {
                    agrr F = ((aday) this.a).F(r02);
                    ((agrr) obj14).a |= F.a;
                    ((agrr) obj14).b = F.b | ((agrr) obj14).b;
                    if (b) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    agrr agrrVar = (agrr) obj14;
                    if (agrrVar.b()) {
                        agrrVar.a(((aefu) obj13).b);
                    }
                }
            case 10:
                ((alvg) ((alvg) ahtq.a.a((Level) this.a).g((Throwable) this.b)).h("com/google/android/libraries/phenotype/client/Phlogger", "logInternal", 49, "Phlogger.java")).Q((String) this.c, (Object[]) this.d);
                return;
            case 11:
                Object obj15 = ((aohs) this.d).a;
                final akgd akgdVar = (akgd) this.b;
                ((akgl) obj15).a(this.c, new akgo() { // from class: akfe
                    @Override // defpackage.akgo
                    public final int a(Instant instant, akfa akfaVar, boolean z) {
                        if (akfaVar.f() && akfaVar.g()) {
                            if (!akfaVar.d().isBefore(instant.minus(akgd.this.k))) {
                                return 2;
                            }
                        }
                        if (!z && akfaVar.f()) {
                            return 2;
                        }
                        if (akfaVar.f()) {
                            return 3;
                        }
                        return 1;
                    }
                }, this.a);
                return;
            case 12:
                ((aqzh) this.a).j((Status) this.b, (arak) this.d, (aqut) this.c);
                return;
            case 13:
                ((arbh) this.d).a.a((Status) this.b, (arak) this.a, (aqut) this.c);
                return;
            case 14:
                argc.x((argc) this.d);
                ((argc) this.d).v.a((Status) this.b, (arak) this.a, (aqut) this.c);
                return;
            default:
                synchronized (this.a) {
                    if (((arhj) this.c).b == 0) {
                        try {
                            this.b.b(this.d);
                            ((arhl) this.a).a.remove(this.b);
                            if (((arhl) this.a).a.isEmpty()) {
                                ((arhl) this.a).b.shutdown();
                                ((arhl) this.a).b = null;
                            }
                        } catch (Throwable th3) {
                            ((arhl) this.a).a.remove(this.b);
                            if (((arhl) this.a).a.isEmpty()) {
                                ((arhl) this.a).b.shutdown();
                                ((arhl) this.a).b = null;
                            }
                            throw th3;
                        }
                    }
                }
                return;
        }
    }

    public /* synthetic */ uju(aohs aohsVar, akfb akfbVar, akgd akgdVar, akgh akghVar, int i) {
        this.e = i;
        this.d = aohsVar;
        this.c = akfbVar;
        this.b = akgdVar;
        this.a = akghVar;
    }

    public uju(aqzh aqzhVar, Status status, arak arakVar, aqut aqutVar, int i) {
        this.e = i;
        this.b = status;
        this.d = arakVar;
        this.c = aqutVar;
        this.a = aqzhVar;
    }

    public uju(arhl arhlVar, arhj arhjVar, arhk arhkVar, Object obj, int i) {
        this.e = i;
        this.c = arhjVar;
        this.b = arhkVar;
        this.d = obj;
        this.a = arhlVar;
    }

    public /* synthetic */ uju(ConversationMessageView conversationMessageView, Function function, alog alogVar, dtq dtqVar, int i) {
        this.e = i;
        this.b = conversationMessageView;
        this.d = function;
        this.a = alogVar;
        this.c = dtqVar;
    }

    public uju(Object obj, Status status, arak arakVar, aqut aqutVar, int i) {
        this.e = i;
        this.b = status;
        this.a = arakVar;
        this.c = aqutVar;
        this.d = obj;
    }

    public /* synthetic */ uju(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public /* synthetic */ uju(Object obj, Object obj2, Object obj3, Object obj4, int i, byte[] bArr) {
        this.e = i;
        this.a = obj;
        this.d = obj2;
        this.c = obj3;
        this.b = obj4;
    }

    public /* synthetic */ uju(ujv ujvVar, ConversationIdType conversationIdType, qwm qwmVar, ParticipantsTable.BindData bindData, int i) {
        this.e = i;
        this.d = ujvVar;
        this.b = conversationIdType;
        this.c = qwmVar;
        this.a = bindData;
    }

    public /* synthetic */ uju(ukg ukgVar, String str, ConversationIdType conversationIdType, String str2, int i) {
        this.e = i;
        this.b = ukgVar;
        this.a = str;
        this.c = conversationIdType;
        this.d = str2;
    }

    public /* synthetic */ uju(vxx vxxVar, MessageCoreData messageCoreData, vxv vxvVar, String str, int i) {
        this.e = i;
        this.a = vxxVar;
        this.c = messageCoreData;
        this.b = vxvVar;
        this.d = str;
    }
}
