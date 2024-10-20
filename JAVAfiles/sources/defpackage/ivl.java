package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsFragment;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsScenarioView;
import com.google.android.apps.messaging.shared.fcm.impl.BugleFirebaseMessagingService;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivl implements Runnable {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, ila] */
    @Override // java.lang.Runnable
    public final void run() {
        cj fe;
        int i = 2;
        int i2 = 3;
        InsetDrawable insetDrawable = null;
        int i3 = 0;
        switch (this.b) {
            case 0:
                ((ixd) this.a).aq(false);
                return;
            case 1:
                alvi alviVar = ixd.a;
                this.a.i(false, false, false);
                return;
            case 2:
                ((ixd) this.a).Q(new ivg(i2), new ivg(4));
                return;
            case 3:
                ((zrb) this.a).c.am(false, true, 1);
                return;
            case 4:
                Object obj = this.a;
                ixd ixdVar = (ixd) obj;
                if (ixdVar.ca.g() && !ixdVar.b()) {
                    ixdVar.aD(ixdVar.M.S(R.string.sim_number_empty_warning_snackbar), ixdVar.M.S(R.string.sim_number_empty_warning_action_label), new ivl(obj, i3), true);
                    return;
                }
                return;
            case 5:
                ((ixd) this.a).an();
                return;
            case 6:
                alvi alviVar2 = ixd.a;
                ((yyd) this.a).a().run();
                return;
            case 7:
                ixd ixdVar2 = (ixd) this.a;
                cj F = ixdVar2.M.F();
                ksw kswVar = new ksw(null, null);
                kswVar.f(amek.BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU);
                ixdVar2.cK.a(F, kswVar.e());
                return;
            case 8:
                ((ixd) this.a).ad();
                return;
            case 9:
                iyc iycVar = (iyc) this.a;
                ConversationScrollToBottomButton conversationScrollToBottomButton = iycVar.b;
                conversationScrollToBottomButton.setElevation(conversationScrollToBottomButton.getContext().getResources().getDimension(R.dimen.conversation_scroll_to_bottom_button_elevation));
                float elevation = conversationScrollToBottomButton.getElevation() * 0.8f;
                float elevation2 = conversationScrollToBottomButton.getElevation() * 0.8f;
                Rect rect = new Rect();
                Drawable background = iycVar.c.getBackground();
                if (background instanceof InsetDrawable) {
                    insetDrawable = (InsetDrawable) background;
                }
                if (insetDrawable != null) {
                    insetDrawable.getPadding(rect);
                }
                conversationScrollToBottomButton.setOutlineProvider(new iya(iycVar, rect, (int) elevation2, (int) elevation));
                return;
            case 10:
                ((jar) this.a).o = 1;
                return;
            case 11:
                ((jar) this.a).o = 3;
                return;
            case 12:
                knj knjVar = (knj) this.a;
                if (knjVar.c) {
                    knjVar.b(2);
                    knk a = knjVar.a();
                    knjVar.c(a.d, a.c);
                    return;
                } else {
                    knl h = knjVar.f.h();
                    h.H("skipping");
                    h.H(knjVar.a);
                    h.q();
                    return;
                }
            case 13:
                kmw kmwVar = (kmw) ((qdq) this.a).a;
                DiagnosticsFragment diagnosticsFragment = kmwVar.h;
                if (diagnosticsFragment != null && (fe = diagnosticsFragment.fe()) != null) {
                    fe.runOnUiThread(new ivl(diagnosticsFragment, 14));
                }
                if (kmwVar.g) {
                    kmwVar.b.unbindService(kmwVar.f);
                    kmwVar.g = false;
                    return;
                }
                return;
            case 14:
                DiagnosticsFragment diagnosticsFragment2 = (DiagnosticsFragment) this.a;
                diagnosticsFragment2.c.setEnabled(true);
                diagnosticsFragment2.b.setEnabled(true);
                diagnosticsFragment2.b.setVisibility(0);
                return;
            case 15:
                DiagnosticsFragment diagnosticsFragment3 = (DiagnosticsFragment) this.a;
                diagnosticsFragment3.c.setEnabled(false);
                diagnosticsFragment3.b.setEnabled(false);
                return;
            case 16:
                ((DiagnosticsScenarioView) this.a).a();
                return;
            case 17:
                kpa kpaVar = (kpa) this.a;
                byte[] r = ((ykw) kpaVar.e.b()).r("ditto_active_desktop_id");
                if (r == null) {
                    alvw g = kpa.b.g();
                    g.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "hasDittoActiveAnonymousDesktopId", 282, "TachyonBindApplicationStateManager.java")).q("No need to start anonymous Tachyon binding due to no active desktop id");
                    return;
                }
                try {
                    if (((aqfn) apag.parseFrom(aqfn.a, r, aozs.a())).d.equals("Bugle")) {
                        alvw g2 = kpa.b.g();
                        g2.X(alwp.a, "BugleNetwork");
                        ((alvg) ((alvg) g2).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "onFirstActivityStarted", 138, "TachyonBindApplicationStateManager.java")).q("Start anonymous Tachyon binding for Bugle app");
                        ((vhi) kpaVar.c.b()).d();
                        return;
                    }
                    alvw g3 = kpa.b.g();
                    g3.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) g3).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "hasDittoActiveAnonymousDesktopId", 292, "TachyonBindApplicationStateManager.java")).q("No need to start anonymous Tachyon binding for non-anonymous app");
                    return;
                } catch (apba e) {
                    alvw i4 = kpa.b.i();
                    i4.X(alwp.a, "BugleNetwork");
                    ((alvg) ((alvg) ((alvg) i4).g(e)).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "hasDittoActiveAnonymousDesktopId", (char) 294, "TachyonBindApplicationStateManager.java")).q("Skip anonymous Tachyon binding because unable to parse desktop id");
                    return;
                }
            case 18:
                kpa kpaVar2 = (kpa) this.a;
                for (String str : ((Map) ((apxx) kpaVar2.f).a).keySet()) {
                    if (str.equals("CMS")) {
                        ((vfw) ((Map) ((apxx) kpaVar2.f).a).get(str)).d();
                    } else {
                        ((vfw) ((Map) ((apxx) kpaVar2.f).a).get(str)).c();
                    }
                }
                return;
            case 19:
                Object obj2 = this.a;
                kpa kpaVar3 = (kpa) obj2;
                if (((pow) kpaVar3.k.b()).a()) {
                    vcl vclVar = (vcl) kpaVar3.l.b();
                    qjh.c(vclVar.b, arpj.a, arwf.a, new vck(vclVar, (arpe) null, 0));
                    return;
                } else {
                    akul.g(((adjc) kpaVar3.d.b()).g()).i(new ici(obj2, 20), kpaVar3.i);
                    return;
                }
            default:
                if (kpq.b.compareAndSet(false, true)) {
                    Object obj3 = this.a;
                    kpq.a.o("Enabling Firebase component");
                    kpq kpqVar = (kpq) obj3;
                    Context context = kpqVar.c;
                    PackageManager packageManager = context.getPackageManager();
                    ComponentName componentName = new ComponentName(context, (Class<?>) BugleFirebaseMessagingService.class);
                    if (true == vht.d()) {
                        i = 1;
                    }
                    packageManager.setComponentEnabledSetting(componentName, i, 1);
                    return;
                }
                throw new AssertionError("FirebaseRegistrationStartupTask is provided more than once");
        }
    }
}
