package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.datadonation.redact.RedactedSpan;
import com.google.android.apps.messaging.datadonation.ui.DataDonationActivity;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.ztc;
import j$.util.Collection;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ixl implements akvz {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ixl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [armf, java.lang.Object] */
    @Override // defpackage.akvz
    public final /* synthetic */ akwa a(akvv akvvVar) {
        int i = 6;
        int i2 = 4;
        int i3 = 3;
        int i4 = 8;
        int i5 = 0;
        int i6 = 1;
        switch (this.b) {
            case 0:
                ((ixd) this.a).Z(1);
                return akwa.a;
            case 1:
                ((ixd) this.a).bu();
                return akwa.a;
            case 2:
                ((ixd) this.a).R(new ivn(i4), new ivn(9));
                return akwa.a;
            case 3:
                uaa uaaVar = new uaa();
                apxh.e(uaaVar);
                uaaVar.q(((ixd) this.a).M.G(), "e2ee_learn_more_alert_dialog_fragment");
                return akwa.a;
            case 4:
                ((ixd) this.a).u();
                throw null;
            case 5:
                ztc.b bVar = (ztc.b) akvvVar;
                ixd ixdVar = (ixd) this.a;
                if (ixdVar.bX == null) {
                    return akwa.a;
                }
                ixdVar.cv = bVar.a();
                ixdVar.aJ(true);
                return akwa.a;
            case 6:
                if (((Boolean) ((utz) zxh.a.get()).e()).booleanValue()) {
                    Object obj = this.a;
                    ((ixd) obj).Q(new ivp(obj, i), new ivp(obj, i4));
                }
                return akwa.a;
            case 7:
                izz izzVar = (izz) this.a;
                ((izc) izzVar.e.b()).b();
                return new akwa(new izu((ConversationIdType) izzVar.g, (msz) izzVar.h));
            case 8:
                ((jar) this.a).c();
                return akwa.b;
            case 9:
                ((jar) this.a).c();
                return akwa.b;
            case 10:
                kmm kmmVar = (kmm) akvvVar;
                ((kls) this.a).a(kmmVar.a(), kmmVar.b());
                return akwa.a;
            case 11:
                kmo kmoVar = (kmo) akvvVar;
                en j = ((DataDonationActivity) ((kls) this.a).a.b()).j();
                if (j != null) {
                    ((Button) j.getCustomView().findViewById(R.id.data_donation_toolbar_button)).setEnabled(!kmoVar.a());
                }
                return akwa.a;
            case 12:
                int a = ((kmg) akvvVar).a();
                kls klsVar = (kls) this.a;
                klsVar.e = a;
                ((DataDonationActivity) klsVar.a.b()).finish();
                return akwa.a;
            case 13:
                Object obj2 = this.a;
                final kma kmaVar = (kma) obj2;
                final kmf kmfVar = (kmf) akvvVar;
                View inflate = LayoutInflater.from((Context) kmaVar.c.b()).inflate(R.layout.dialog_text_edit, (ViewGroup) null, false);
                ((TextView) inflate.findViewById(R.id.message_editor)).setText(kmfVar.c().c(kmfVar.a()));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(((klu) kmaVar.b.b()).z().getText(R.string.donation_edit_dialog_body_text));
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(((klu) kmaVar.b.b()).z().getDimensionPixelSize(R.dimen.body_text_size)), 0, spannableStringBuilder.length(), 17);
                ajgi ajgiVar = new ajgi((Context) kmaVar.c.b());
                ajgiVar.n(spannableStringBuilder);
                ajgiVar.z(inflate);
                ajgiVar.t(R.string.donation_edit_dialog_positive_button_label, new aabt((aksr) kmaVar.l.b(), "DataDonationFragmentPeer#getEditTextPositiveButton", new DialogInterface.OnClickListener() { // from class: klw
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i7) {
                        boolean z;
                        Optional of;
                        int i8;
                        TextView textView = (TextView) ((ev) dialogInterface).findViewById(R.id.message_editor);
                        textView.getClass();
                        CharSequence text = textView.getText();
                        albo.T(text instanceof Spanned);
                        kme kmeVar = kma.this.p;
                        kmeVar.getClass();
                        Spanned spanned = (Spanned) text;
                        kmf kmfVar2 = kmfVar;
                        int b = kmfVar2.b();
                        int a2 = kmfVar2.a();
                        int i9 = 0;
                        if (!TextUtils.isEmpty(spanned)) {
                            kmj kmjVar = (kmj) ((kmk) kmeVar.c.get(b)).c.get(a2);
                            d.s(!TextUtils.isEmpty(spanned));
                            Spanned spanned2 = kmjVar.b;
                            if (TextUtils.equals(spanned2, spanned)) {
                                of = Optional.empty();
                            } else {
                                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spanned);
                                RedactedSpan[] redactedSpanArr = (RedactedSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), RedactedSpan.class);
                                RedactedSpan[] redactedSpanArr2 = (RedactedSpan[]) spanned2.getSpans(0, spanned2.length(), RedactedSpan.class);
                                int length = redactedSpanArr.length;
                                int i10 = 0;
                                while (i10 < length) {
                                    RedactedSpan redactedSpan = redactedSpanArr[i10];
                                    int length2 = redactedSpanArr2.length;
                                    int i11 = i9;
                                    while (true) {
                                        if (i11 < length2) {
                                            RedactedSpan redactedSpan2 = redactedSpanArr2[i11];
                                            if (redactedSpan.a != redactedSpan2.a || !TextUtils.equals(spannableStringBuilder2.subSequence(spannableStringBuilder2.getSpanStart(redactedSpan), spannableStringBuilder2.getSpanEnd(redactedSpan)), spanned2.subSequence(spanned2.getSpanStart(redactedSpan2), spanned2.getSpanEnd(redactedSpan2)))) {
                                                i11++;
                                            }
                                        } else {
                                            spannableStringBuilder2.removeSpan(redactedSpan);
                                            break;
                                        }
                                    }
                                    i10++;
                                    i9 = 0;
                                }
                                ibi ibiVar = new ibi((String) kla.a.e());
                                alog f = ibiVar.f(spanned2.toString());
                                alog f2 = ibiVar.f(spannableStringBuilder2.toString());
                                int[][] aO = lga.aO(f, f2);
                                int i12 = ((alsx) f).c;
                                int i13 = ((alsx) f2).c;
                                int i14 = 0;
                                int i15 = 0;
                                int i16 = 0;
                                while (i12 > 0 && i13 > 0) {
                                    int i17 = i12 - 1;
                                    int[] iArr = aO[i17];
                                    int i18 = i13 - 1;
                                    int i19 = iArr[i18];
                                    int i20 = iArr[i13];
                                    if (i19 <= i20) {
                                        int[] iArr2 = aO[i12];
                                        i8 = i17;
                                        if (i19 <= iArr2[i18]) {
                                            if (i19 < iArr2[i13]) {
                                                i16++;
                                            }
                                            i12 = i8;
                                            i13 = i18;
                                        }
                                    } else {
                                        i8 = i17;
                                    }
                                    if (i20 < aO[i12][i18]) {
                                        i14++;
                                        i12 = i8;
                                    } else {
                                        i15++;
                                        i13 = i18;
                                    }
                                }
                                while (i12 > 0) {
                                    i14++;
                                    i12--;
                                }
                                while (i13 > 0) {
                                    i15++;
                                    i13--;
                                }
                                of = Optional.of(new kmq(spannableStringBuilder2, new kky(i15, i14, i16)));
                            }
                            if (!of.isEmpty()) {
                                kmjVar.d = ((kmq) of.get()).b;
                                kmjVar.c = ((kmq) of.get()).a;
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        kmeVar.H(z, b, a2);
                    }
                }, i4));
                ajgiVar.o(android.R.string.cancel, null);
                ev create = ajgiVar.create();
                create.setOnShowListener(new klv(obj2, create, i5));
                create.show();
                return akwa.a;
            case 14:
                kme kmeVar = ((kma) this.a).p;
                kmeVar.getClass();
                Collection.EL.stream(kmeVar.c).forEach(new ivd(((klq) akvvVar).a(), i3));
                kmeVar.p();
                kmeVar.G();
                return akwa.a;
            case 15:
                ((kma) this.a).s.setEnabled(((kmn) akvvVar).a());
                return akwa.a;
            case 16:
                kop a2 = ((koq) akvvVar).a();
                int i7 = a2.c;
                Object obj3 = this.a;
                if (i7 - 1 != 0) {
                    kor korVar = (kor) obj3;
                    Object obj4 = korVar.a;
                    Dialog dialog = ((bw) korVar.b).d;
                    if (dialog != null) {
                        dialog.dismiss();
                    }
                    ((kot) obj4).c.aP(6);
                    kot.a.l("User canceled taking a bug report");
                } else {
                    kor korVar2 = (kor) obj3;
                    Object obj5 = korVar2.a;
                    Object obj6 = korVar2.b;
                    knc kncVar = a2.a;
                    String str = a2.b;
                    Context x = ((cg) obj6).x();
                    Dialog dialog2 = ((bw) obj6).d;
                    if (dialog2 != null) {
                        dialog2.dismiss();
                    }
                    if (kncVar == null) {
                        kot.a.q("No category is selected, skip taking bug report");
                    } else {
                        kot kotVar = (kot) obj5;
                        kotVar.c.aQ(4, kncVar.a());
                        acir b = kotVar.b.b(x, kncVar.b, str);
                        b.s(new kos(akto.j(new irs(obj5, kncVar, 10)), i5));
                        b.r(new mih(i6));
                        xyo d = kot.a.d();
                        d.H("User took bug report");
                        d.z("Category", kncVar.b);
                        d.z("Comment", str);
                        d.q();
                    }
                }
                return akwa.a;
            case 17:
                ksq a3 = ((ktt) akvvVar).a();
                ktj ktjVar = new ktj();
                apxh.e(ktjVar);
                Bundle bundle = new Bundle();
                bundle.putString("advanced_feedback_data_description", a3.f());
                bundle.putString("advanced_feedback_data_rationale", a3.i());
                bundle.putString("advanced_feedback_data_name", a3.g());
                bundle.putString("advanced_feedback_data_rationale_title", a3.j());
                ktjVar.ak(bundle);
                kth kthVar = (kth) this.a;
                bd bdVar = new bd(kthVar.a.a());
                bdVar.A(R.anim.enter, R.anim.exit);
                bdVar.z(R.id.advanced_feedback_fragment_container, ktjVar);
                bdVar.y();
                bdVar.b();
                kthVar.d = 2;
                return akwa.a;
            case 18:
                ((kth) this.a).a();
                return akwa.a;
            case 19:
                ktz ktzVar = new ktz();
                apxh.e(ktzVar);
                kth kthVar2 = (kth) this.a;
                bd bdVar2 = new bd(kthVar2.a.a());
                bdVar2.A(R.anim.enter_right, R.anim.exit_left);
                bdVar2.z(R.id.advanced_feedback_fragment_container, ktzVar);
                bdVar2.b();
                kthVar2.d = 3;
                return akwa.a;
            default:
                aahz aahzVar = (aahz) akvvVar;
                alog r = alog.r(aahzVar.a());
                Object obj7 = this.a;
                kvw kvwVar = (kvw) obj7;
                ((lfl) kvwVar.F.b()).b(kvwVar.g(kvwVar.b), r, aahzVar.b(), new kut(obj7, i2));
                return akwa.a;
        }
    }
}
