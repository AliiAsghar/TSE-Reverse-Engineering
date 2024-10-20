package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.diagnostics.DiagnosticsService;
import com.google.android.apps.messaging.diagnostics.sensor.ui.TakeBugReportDialogView;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsActivity;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsFragment;
import com.google.android.apps.messaging.diagnostics.ui.DiagnosticsScenarioView;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.apps.messaging.popup.spam.SpamPopupView;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.stream.Stream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class klx implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ klx(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r11v53, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lqx lqxVar = null;
        switch (this.b) {
            case 0:
                Object obj = this.a;
                kma kmaVar = (kma) obj;
                kme kmeVar = kmaVar.p;
                if (kmeVar != null) {
                    int m = kmeVar.m();
                    int sum = Collection.EL.stream(kmaVar.p.c).mapToInt(new kmb(3)).sum();
                    if (m != 0 && sum != 0) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((klu) kmaVar.b.b()).T(R.string.donation_donate_dialog_body_text, ((klu) kmaVar.b.b()).z().getQuantityString(R.plurals.donation_donate_dialog_body_text_messages, m, Integer.valueOf(m)), ((klu) kmaVar.b.b()).z().getQuantityString(R.plurals.donation_donate_dialog_body_text_conversations, sum, Integer.valueOf(sum))));
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(((klu) kmaVar.b.b()).z().getDimensionPixelSize(R.dimen.body_text_size)), 0, spannableStringBuilder.length(), 17);
                        ajgi ajgiVar = new ajgi((Context) kmaVar.c.b());
                        ajgiVar.x(R.string.donation_donate_dialog_title);
                        ajgiVar.n(spannableStringBuilder);
                        ajgiVar.t(R.string.donation_donate_dialog_positive_button_label, new aabt((aksr) kmaVar.l.b(), "DataDonationFragmentPeer#getDonatePositiveButton", new ivs(obj, 4), 8));
                        ajgiVar.o(android.R.string.cancel, null);
                        ajgiVar.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((jar) this.a).c();
                return;
            case 2:
                ((TakeBugReportDialogView) this.a).c(view, 1);
                return;
            case 3:
                ((TakeBugReportDialogView) this.a).c(view, 2);
                return;
            case 4:
                ((DiagnosticsActivity) this.a).c().d();
                return;
            case 5:
                DiagnosticsFragment diagnosticsFragment = (DiagnosticsFragment) this.a;
                kmw kmwVar = diagnosticsFragment.a;
                if (!kmwVar.g) {
                    List<knj> list = kmwVar.c;
                    if (list != null) {
                        for (knj knjVar : list) {
                            knjVar.b(1);
                            int i = alog.d;
                            knjVar.b = alsx.a;
                        }
                    }
                    if (kmwVar.b.bindService(new Intent(kmwVar.b, (Class<?>) DiagnosticsService.class), kmwVar.f, 1)) {
                        kmwVar.g = true;
                    }
                    kmwVar.h = diagnosticsFragment;
                    return;
                }
                kmw.a.p("Diagnostic scenarios are still running");
                return;
            case 6:
                Object obj2 = this.a;
                Uri a = ((DiagnosticsFragment) obj2).a.e.a();
                if (a != null) {
                    Intent intent = new Intent();
                    intent.setAction("android.intent.action.SEND");
                    intent.setType("text/plain");
                    intent.putExtra("android.intent.extra.STREAM", a);
                    intent.putExtra("android.intent.extra.SUBJECT", "AM Diagnostics Report");
                    intent.putExtra("extra_subject_mandatory", true);
                    ((cg) obj2).aG(Intent.createChooser(intent, "Share ".concat(String.valueOf(a.getLastPathSegment()))));
                    return;
                }
                return;
            case 7:
                DiagnosticsScenarioView diagnosticsScenarioView = (DiagnosticsScenarioView) this.a;
                diagnosticsScenarioView.d.c = diagnosticsScenarioView.b.isChecked();
                return;
            case 8:
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) this.a;
                ksq ksqVar = advancedFeedbackDataView.j;
                if (ksqVar != null) {
                    aktp.L(new ktq(ksqVar), advancedFeedbackDataView.i);
                    return;
                }
                return;
            case 9:
                AdvancedFeedbackDataView advancedFeedbackDataView2 = (AdvancedFeedbackDataView) this.a;
                TextView textView = advancedFeedbackDataView2.i;
                if (view == textView) {
                    textView.callOnClick();
                    return;
                } else {
                    advancedFeedbackDataView2.g.toggle();
                    return;
                }
            case 10:
                Object obj3 = this.a;
                kto ktoVar = (kto) obj3;
                if (ktoVar.c == null) {
                    ktoVar.e.j(" ");
                    return;
                }
                if (((Boolean) ktf.b.e()).booleanValue()) {
                    Stream filter = Collection.EL.stream(ktoVar.g).filter(new ilu(10));
                    int i2 = alog.d;
                    if (!((alog) filter.collect(alls.a)).isEmpty() && !ktoVar.i.g() && ktoVar.t.E().d == 1) {
                        if (!ktoVar.i.g()) {
                            ((alwl) ktoVar.h.n().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer", "requestLocationPermissionAndLaunchFeedback", 585, "AdvancedFeedbackFragmentPeer.java")).q("Request location permission");
                            ((yjl) ktoVar.j.b()).c(new zgs(obj3, 1));
                            return;
                        }
                        return;
                    }
                }
                if (((Boolean) ktf.c.e()).booleanValue() && ktoVar.e() && ktoVar.t.E().d == 1) {
                    aktp.K(new ktr(), ktoVar.b);
                    return;
                } else {
                    ktoVar.b();
                    return;
                }
            case 11:
                kto ktoVar2 = (kto) this.a;
                ((kor) ktoVar2.p.b()).d(3, Optional.of(ktoVar2.n), Optional.empty(), Optional.empty(), Optional.empty());
                ktoVar2.t.c().d();
                return;
            case 12:
                ((kuc) this.a).c.toggle();
                return;
            case 13:
                kuf kufVar = (kuf) this.a;
                kufVar.c.toggle();
                kuc kucVar = kufVar.f;
                if (kucVar != null) {
                    kucVar.a();
                    return;
                }
                return;
            case 14:
                kuy.a.o("Set default sms button clicked");
                kvw kvwVar = (kvw) this.a;
                kvwVar.b.startActivityForResult(((lzv) kvwVar.B.b()).l(kvwVar.b.F()), 1);
                return;
            case 15:
                kvw kvwVar2 = (kvw) this.a;
                kvwVar2.b(kvwVar2.b).ao(0);
                return;
            case 16:
                ((yyd) this.a).a().run();
                return;
            case 17:
                this.a.run();
                return;
            case 18:
                kxb kxbVar = (kxb) this.a;
                kxbVar.b.e();
                lqv lqvVar = kxbVar.d;
                if (lqvVar != null) {
                    kxc kxcVar = (kxc) lqvVar;
                    kxcVar.e();
                    lqx lqxVar2 = kxcVar.b;
                    if (lqxVar2 == null) {
                        arro.b("host");
                    } else {
                        lqxVar = lqxVar2;
                    }
                    lqxVar.b();
                    return;
                }
                return;
            case 19:
                lrb lrbVar = ((SpamPopupView) this.a).e;
                if (lrbVar != null) {
                    yyt yytVar = (yyt) lrbVar.b.b();
                    yytVar.b();
                    yytVar.a();
                    if (ymd.a()) {
                        ((mho) lrbVar.d.b()).aA(2, 2);
                        lrbVar.d();
                        return;
                    }
                    return;
                }
                return;
            default:
                SpamPopupView spamPopupView = (SpamPopupView) this.a;
                lrb lrbVar2 = spamPopupView.e;
                if (lrbVar2 != null) {
                    Context context = spamPopupView.getContext();
                    ((yyt) lrbVar2.b.b()).a();
                    if (ymd.a()) {
                        ((mho) lrbVar2.d.b()).ax(2);
                    }
                    lrbVar2.d();
                    ((lzv) lrbVar2.c.b()).G(context);
                    return;
                }
                return;
        }
    }
}
