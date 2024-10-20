package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.ui.debug.LoadLinkPreviewsReceiver;
import com.google.android.apps.messaging.ui.debug.LoadMessagesReceiver;
import com.google.android.apps.messaging.ui.debug.LoadReactionsReceiver;
import com.google.android.apps.messaging.ui.debug.LoadRepliesReceiver;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.material.snackbar.Snackbar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aafa extends arpw implements arqv {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(aaea aaeaVar, Intent intent, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = aaeaVar;
        this.b = intent;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 1:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 2:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 3:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 4:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 5:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 6:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 7:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 8:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 9:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 10:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 11:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 12:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 13:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 14:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 15:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 16:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 17:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 18:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            case 19:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
            default:
                return ((aafa) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v82, types: [admc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v89, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r11v128, types: [java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v13, types: [nzq, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v137, types: [admc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v160, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v170, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r11v23, types: [armf, java.lang.Object] */
    @Override // defpackage.arpq
    public final Object b(Object obj) {
        apwt apwtVar;
        long e;
        apwt apwtVar2;
        armf armfVar = null;
        switch (this.c) {
            case 0:
                aqil.P(obj);
                Intent data = new Intent("android.intent.action.VIEW").setClassName(((aafb) this.a).b, "com.google.android.apps.messaging.ui.conversation.LaunchConversationActivity").setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM).setData((Uri) this.b);
                data.getClass();
                return akna.a(data);
            case 1:
                aqil.P(obj);
                Intent data2 = new Intent("android.intent.action.VIEW").setClassName(((aaea) this.a).a, "com.google.android.apps.messaging.ui.conversation.rbm.OpenRbmDeepLinkActivity").setFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM).setData(((Intent) this.b).getData());
                data2.getClass();
                return akna.a(data2);
            case 2:
                aqil.P(obj);
                if (((ahmv) this.a).h.a()) {
                    ((wpp) ((ahmv) this.a).b.b()).Y((MessageIdType) this.b, 3);
                } else {
                    ((wpp) ((ahmv) this.a).b.b()).V((MessageIdType) this.b);
                }
                return arnb.a;
            case 3:
                aqil.P(obj);
                String str = "";
                for (aoty aotyVar : aoty.values()) {
                    if (aotyVar.equals(aoty.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS) || aotyVar.equals(aoty.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS)) {
                        String str2 = str + "Configuration Type: " + aotyVar.name() + "\n";
                        alor alorVar = altc.a;
                        if (aotyVar == aoty.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS) {
                            alorVar = ((vau) ((aajs) this.b).d.b()).a((String) this.a);
                        } else if (aotyVar == aoty.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS) {
                            alorVar = ((vau) ((aajs) this.b).d.b()).b((String) this.a);
                        }
                        aluq listIterator = alorVar.keySet().listIterator();
                        listIterator.getClass();
                        while (listIterator.hasNext()) {
                            String str3 = (String) listIterator.next();
                            str2 = str2 + str3 + ": " + alorVar.get(str3) + "\n";
                        }
                        str = str2.concat("\n");
                    }
                }
                ((aajs) this.b).f.put(this.a, str);
                return arnb.a;
            case 4:
                aqil.P(obj);
                do {
                    apwtVar = ((LoadLinkPreviewsReceiver) this.b).d;
                    if (apwtVar == null) {
                        arro.b("syncManager");
                        apwtVar = null;
                    }
                } while (((wzp) apwtVar.b()).v());
                armf armfVar2 = ((LoadLinkPreviewsReceiver) this.b).e;
                if (armfVar2 == null) {
                    arro.b("transactionManager");
                } else {
                    armfVar = armfVar2;
                }
                ((agnq) armfVar.b()).e("LoadLinkPreviewsReceiver#transaction", new aafg(this.a, 16));
                return arnb.a;
            case 5:
                aqil.P(obj);
                Object e2 = qpf.a.e();
                e2.getClass();
                if (((Boolean) e2).booleanValue()) {
                    e = ((wyt) ((LoadMessagesReceiver) this.b).f().b()).f(wxr.e, (String) ((arsb) this.a).a);
                } else {
                    e = ((wyt) ((LoadMessagesReceiver) this.b).f().b()).e((String) ((arsb) this.a).a);
                }
                return new Long(e);
            case 6:
                aqil.P(obj);
                return new Long(((wyt) ((LoadMessagesReceiver) this.b).f().b()).f(wxr.e, (String) this.a));
            case 7:
                aqil.P(obj);
                do {
                    apwtVar2 = ((LoadReactionsReceiver) this.b).d;
                    if (apwtVar2 == null) {
                        arro.b("syncManager");
                        apwtVar2 = null;
                    }
                } while (((wzp) apwtVar2.b()).v());
                armf armfVar3 = ((LoadReactionsReceiver) this.b).e;
                if (armfVar3 == null) {
                    arro.b("transactionManager");
                } else {
                    armfVar = armfVar3;
                }
                agnq agnqVar = (agnq) armfVar.b();
                final ?? r0 = this.a;
                agnqVar.e("LoadReactionsReceiver#transaction", new Runnable() { // from class: aanc
                    @Override // java.lang.Runnable
                    public final void run() {
                        agnw d;
                        agnw d2;
                        svm svmVar = new svm();
                        svmVar.f("LoadReactionsReceiver#processBroadcast.delete");
                        svmVar.e();
                        svmVar.d();
                        sxy d3 = MessagesTable.d();
                        d3.w("LoadReactionsReceiver.processBroadcast");
                        d3.d(new aand(0));
                        d3.h(new atkn((Object) MessagesTable.c.i, false));
                        sxt sxtVar = (sxt) d3.b().n();
                        while (sxtVar.moveToNext()) {
                            Iterator it = r0;
                            if (!it.hasNext()) {
                                break;
                            }
                            List<String> ab = arsd.ab((String) it.next(), new String[]{","}, 50, 2);
                            if (!ab.isEmpty() && ((CharSequence) ab.get(0)).length() != 0) {
                                MessageIdType A = ((MessagesTable.BindData) sxtVar.cK()).A();
                                A.getClass();
                                LoadReactionsReceiver.a.o("Trying to insert reactions to message id " + A + ", size: " + ab.size());
                                int i = svc.a;
                                toy toyVar = new toy(null, null);
                                toyVar.m(A);
                                toyVar.n(wky.CUSTOM);
                                aozy createBuilder = wks.a.createBuilder();
                                createBuilder.getClass();
                                for (String str4 : ab) {
                                    aozy createBuilder2 = wkw.a.createBuilder();
                                    aozy createBuilder3 = wku.a.createBuilder();
                                    wky wkyVar = wky.CUSTOM;
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    ((wku) createBuilder3.b).c = wkyVar.a();
                                    if (!createBuilder3.b.isMutable()) {
                                        createBuilder3.u();
                                    }
                                    wku wkuVar = (wku) createBuilder3.b;
                                    str4.getClass();
                                    wkuVar.b = str4;
                                    wku wkuVar2 = (wku) createBuilder3.s();
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    wkw wkwVar = (wkw) createBuilder2.b;
                                    wkuVar2.getClass();
                                    wkwVar.c = wkuVar2;
                                    wkwVar.b |= 1;
                                    aozy createBuilder4 = wkx.a.createBuilder();
                                    if (!createBuilder4.b.isMutable()) {
                                        createBuilder4.u();
                                    }
                                    wkx wkxVar = (wkx) createBuilder4.b;
                                    wkxVar.b |= 2;
                                    wkxVar.d = false;
                                    aozy createBuilder5 = wkt.a.createBuilder();
                                    if (!createBuilder5.b.isMutable()) {
                                        createBuilder5.u();
                                    }
                                    ((wkt) createBuilder5.b).c = true;
                                    if (!createBuilder4.b.isMutable()) {
                                        createBuilder4.u();
                                    }
                                    wkx wkxVar2 = (wkx) createBuilder4.b;
                                    wkt wktVar = (wkt) createBuilder5.s();
                                    wktVar.getClass();
                                    wkxVar2.c = wktVar;
                                    wkxVar2.b |= 1;
                                    wkx wkxVar3 = (wkx) createBuilder4.s();
                                    if (!createBuilder2.b.isMutable()) {
                                        createBuilder2.u();
                                    }
                                    wkw wkwVar2 = (wkw) createBuilder2.b;
                                    wkxVar3.getClass();
                                    apax apaxVar = wkwVar2.d;
                                    if (!apaxVar.c()) {
                                        wkwVar2.d = apag.mutableCopy(apaxVar);
                                    }
                                    wkwVar2.d.add(wkxVar3);
                                    wkw wkwVar3 = (wkw) createBuilder2.s();
                                    if (!createBuilder.b.isMutable()) {
                                        createBuilder.u();
                                    }
                                    wks wksVar = (wks) createBuilder.b;
                                    wkwVar3.getClass();
                                    apax apaxVar2 = wksVar.b;
                                    if (!apaxVar2.c()) {
                                        wksVar.b = apag.mutableCopy(apaxVar2);
                                    }
                                    wksVar.b.add(wkwVar3);
                                }
                                toyVar.o((wks) createBuilder.s());
                                svj l = toyVar.l(new svc(6));
                                d = agnc.d("$primary");
                                d2 = agnc.d("$primary");
                                agnc.a(d2, "message_reactions", l, new spl(d, 12), new smq(l, 10));
                            }
                        }
                        sxtVar.close();
                        LoadReactionsReceiver.a.o("Done inserting reactions to messages");
                    }
                });
                return arnb.a;
            case 8:
                aqil.P(obj);
                apwt apwtVar3 = ((LoadRepliesReceiver) this.b).d;
                if (apwtVar3 == null) {
                    arro.b("syncManager");
                    apwtVar3 = null;
                }
                ((wzp) apwtVar3.b()).q(false);
                armf armfVar4 = ((LoadRepliesReceiver) this.b).e;
                if (armfVar4 == null) {
                    arro.b("transactionManager");
                } else {
                    armfVar = armfVar4;
                }
                ((agnq) armfVar.b()).e("LoadRepliesReceiver#transaction", new aafg(this.a, 17));
                return arnb.a;
            case 9:
                aqil.P(obj);
                ((abfh) this.a).a().q((Activity) this.b, false);
                return arnb.a;
            case 10:
                aqil.P(obj);
                ((abfh) this.a).a().p(amww.DECLINED_RCS_IN_WELCOME_ACTIVITY);
                Object obj2 = this.b;
                Activity activity = (Activity) obj2;
                String string = activity.getResources().getString(R.string.fast_track_popup_declined_snack_bar_text_v2);
                string.getClass();
                Context context = (Context) obj2;
                if (!xwr.h(context) && activity.hasWindowFocus()) {
                    Snackbar r = Snackbar.r(context, activity.getWindow().getDecorView().getRootView(), string);
                    r.n();
                    r.i();
                } else {
                    ((abbu) ((abfh) this.a).f.b()).l(string);
                }
                return arnb.a;
            case 11:
                aqil.P(obj);
                amwt w = ((vrn) ((adjh) this.b).b.a()).w(new adiw((String) this.a));
                w.getClass();
                alvw g = adjh.a.g();
                g.X(alwp.a, "IdentityMappingPopulator");
                ((alvg) g.h("com/google/android/ims/provisioning/api/identitymapping/IdentityMappingProducerImpl$getAvailabilityForSimId$2", "invokeSuspend", 106, "IdentityMappingProducerImpl.kt")).D("Availability: %s for sim id: %s", w, advq.SIM_ID.c(this.a));
                return w;
            case 12:
                aqil.P(obj);
                return arsd.k(((adtl) ((adjh) this.b).e.b()).z((Configuration) this.a));
            case 13:
                aqil.P(obj);
                return arsd.k(((adnk) ((adjh) this.b).c.b()).i((String) this.a));
            case 14:
                aqil.P(obj);
                while (!this.a.isEmpty()) {
                    adtl adtlVar = (adtl) ((admf) this.b).j.get(((arnr) this.a).removeLast());
                    if (adtlVar != null) {
                        admf admfVar = (admf) this.b;
                        admfVar.k.addLast(adtlVar);
                        ((AtomicBoolean) adtlVar.a).set(true);
                        if (admfVar.q.get()) {
                            ((alvg) admf.d.i().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$enterStates$2", "invokeSuspend", 322, "StateMachineV2.kt")).t("State machine has quit, can't enter %s", adtlVar.c);
                        } else if (admfVar.t.get()) {
                            ((alvg) admf.d.g().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$enterStates$2", "invokeSuspend", 324, "StateMachineV2.kt")).t("Entering %s", adtlVar.c);
                            adtlVar.c.b();
                        } else {
                            ((alvg) admf.d.g().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$enterStates$2", "invokeSuspend", 327, "StateMachineV2.kt")).t("Pretend entering %s", adtlVar.c);
                        }
                        Iterator it = admfVar.u.iterator();
                        while (it.hasNext()) {
                            ((admh) it.next()).a();
                        }
                    }
                }
                return arnb.a;
            case 15:
                aqil.P(obj);
                while (!((admf) this.b).k.isEmpty() && !d.F(((adtl) aqjn.ab(((admf) this.b).k)).b, this.a)) {
                    adtl adtlVar2 = (adtl) ((admf) this.b).k.removeLast();
                    if (((admf) this.b).q.get()) {
                        ((alvg) admf.d.i().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$exitCurrentStatesUntil$2", "invokeSuspend", 293, "StateMachineV2.kt")).t("State machine has quit, can't exit %s", adtlVar2.c);
                    } else if (((admf) this.b).t.get()) {
                        ((alvg) admf.d.g().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$exitCurrentStatesUntil$2", "invokeSuspend", 295, "StateMachineV2.kt")).t("Exiting %s", adtlVar2.c);
                        adtlVar2.c.c();
                    } else {
                        ((alvg) admf.d.g().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2$exitCurrentStatesUntil$2", "invokeSuspend", 298, "StateMachineV2.kt")).t("Pretend exiting %s", adtlVar2.c);
                    }
                    ((AtomicBoolean) adtlVar2.a).set(false);
                }
                return arnb.a;
            case 16:
                aqil.P(obj);
                if (d.F(adom.P(this.b), true)) {
                    ((cit) this.a).b();
                }
                return arnb.a;
            case 17:
                aqil.P(obj);
                if (((arrx) this.a).a) {
                    this.b.a();
                }
                return arnb.a;
            case 18:
                aqil.P(obj);
                this.b.a(Boolean.valueOf(!d.F(this.a, afac.a)));
                return arnb.a;
            case 19:
                aqil.P(obj);
                ((afaw) this.a).f.a(this.b);
                return arnb.a;
            default:
                aqil.P(obj);
                ((afhe) this.a).a.a(this.b);
                return arnb.a;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [byn, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [java.lang.Object, arqg] */
    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Iterator, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Object, arqv] */
    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        switch (this.c) {
            case 0:
                return new aafa((aafb) this.a, (Uri) this.b, arpeVar, 0);
            case 1:
                return new aafa((aaea) this.a, (Intent) this.b, arpeVar, 1);
            case 2:
                return new aafa((ahmv) this.a, (MessageIdType) this.b, arpeVar, 2);
            case 3:
                return new aafa((aajs) this.b, (String) this.a, arpeVar, 3);
            case 4:
                return new aafa((LoadLinkPreviewsReceiver) this.b, (Iterator) this.a, arpeVar, 4);
            case 5:
                return new aafa((LoadMessagesReceiver) this.b, (arsb) this.a, arpeVar, 5);
            case 6:
                return new aafa((LoadMessagesReceiver) this.b, (String) this.a, arpeVar, 6);
            case 7:
                return new aafa((LoadReactionsReceiver) this.b, (Iterator) this.a, arpeVar, 7);
            case 8:
                return new aafa((LoadRepliesReceiver) this.b, (Iterator) this.a, arpeVar, 8);
            case 9:
                return new aafa((abfh) this.a, (Activity) this.b, arpeVar, 9);
            case 10:
                return new aafa((abfh) this.a, (Activity) this.b, arpeVar, 10, (byte[]) null);
            case 11:
                return new aafa((adjh) this.b, (String) this.a, arpeVar, 11);
            case 12:
                return new aafa((adjh) this.b, (Configuration) this.a, arpeVar, 12);
            case 13:
                return new aafa((adjh) this.b, (String) this.a, arpeVar, 13, (byte[]) null);
            case 14:
                return new aafa((arnr) this.a, (admf) this.b, arpeVar, 14);
            case 15:
                return new aafa((admf) this.b, this.a, arpeVar, 15);
            case 16:
                return new aafa((cit) this.a, (byn) this.b, arpeVar, 16);
            case 17:
                return new aafa((arrx) this.a, (arqg) this.b, arpeVar, 17);
            case 18:
                return new aafa((arqr) this.b, (arqv) this.a, arpeVar, 18);
            case 19:
                return new aafa((afaw) this.a, (Context) this.b, arpeVar, 19);
            default:
                return new aafa((afhe) this.a, (Activity) this.b, arpeVar, 20);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(aafb aafbVar, Uri uri, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = aafbVar;
        this.b = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(aajs aajsVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = aajsVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(abfh abfhVar, Activity activity, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = abfhVar;
        this.b = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(abfh abfhVar, Activity activity, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.a = abfhVar;
        this.b = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(adjh adjhVar, Configuration configuration, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = adjhVar;
        this.a = configuration;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(adjh adjhVar, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = adjhVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(adjh adjhVar, String str, arpe arpeVar, int i, byte[] bArr) {
        super(2, arpeVar);
        this.c = i;
        this.b = adjhVar;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(admf admfVar, Object obj, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = admfVar;
        this.a = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(afaw afawVar, Context context, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = afawVar;
        this.b = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(afhe afheVar, Activity activity, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = afheVar;
        this.b = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(ahmv ahmvVar, MessageIdType messageIdType, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = ahmvVar;
        this.b = messageIdType;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(arnr arnrVar, admf admfVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = arnrVar;
        this.b = admfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(arqr arqrVar, arqv arqvVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = arqrVar;
        this.a = arqvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(arrx arrxVar, arqg arqgVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = arrxVar;
        this.b = arqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(cit citVar, byn bynVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.a = citVar;
        this.b = bynVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(LoadLinkPreviewsReceiver loadLinkPreviewsReceiver, Iterator it, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = loadLinkPreviewsReceiver;
        this.a = it;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(LoadMessagesReceiver loadMessagesReceiver, arsb arsbVar, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = loadMessagesReceiver;
        this.a = arsbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(LoadMessagesReceiver loadMessagesReceiver, String str, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = loadMessagesReceiver;
        this.a = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(LoadReactionsReceiver loadReactionsReceiver, Iterator it, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = loadReactionsReceiver;
        this.a = it;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aafa(LoadRepliesReceiver loadRepliesReceiver, Iterator it, arpe arpeVar, int i) {
        super(2, arpeVar);
        this.c = i;
        this.b = loadRepliesReceiver;
        this.a = it;
    }
}
