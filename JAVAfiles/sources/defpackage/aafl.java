package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.richcard.RichCardVideoOverlayView;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import com.google.android.apps.messaging.ui.debug.DebugMmsConfigFragment;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.CategoryToggleView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.emoji.EmojiContentItemView;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aafl implements View.OnClickListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aafl(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v75, types: [aaqi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.util.concurrent.Executor, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 0;
        int i2 = 2;
        switch (this.b) {
            case 0:
                ConversationSuggestionsView conversationSuggestionsView = (ConversationSuggestionsView) this.a;
                ((yii) conversationSuggestionsView.e.b()).a();
                if (((Boolean) ktf.a.e()).booleanValue()) {
                    kor korVar = conversationSuggestionsView.h;
                    Context context = conversationSuggestionsView.getContext();
                    ksw kswVar = new ksw(null, null);
                    kswVar.f(amek.BUGLE_ADVANCED_FEEDBACK_SOURCE_P2P_SUGGESTION);
                    korVar.a(context, kswVar.e());
                    return;
                }
                conversationSuggestionsView.c.h(conversationSuggestionsView.getContext());
                return;
            case 1:
                RichCardVideoOverlayView richCardVideoOverlayView = (RichCardVideoOverlayView) this.a;
                Uri uri = richCardVideoOverlayView.b;
                if (uri != null) {
                    richCardVideoOverlayView.d.D(richCardVideoOverlayView.getContext(), uri, null);
                    richCardVideoOverlayView.c.R(6);
                    return;
                }
                return;
            case 2:
                ((ConversationSuggestionsView) this.a).e();
                return;
            case 3:
                ((ConversationSuggestionsView) this.a).e();
                return;
            case 4:
                Object obj = this.a;
                Activity f = abbu.f((View) obj);
                if (f != null) {
                    ConversationSuggestionsView conversationSuggestionsView2 = (ConversationSuggestionsView) obj;
                    conversationSuggestionsView2.d.ay(4, 2);
                    conversationSuggestionsView2.c.g(f, (String) yig.v.e());
                    conversationSuggestionsView2.d();
                    return;
                }
                return;
            case 5:
                ConversationSuggestionsView conversationSuggestionsView3 = (ConversationSuggestionsView) this.a;
                conversationSuggestionsView3.d.ax(4);
                conversationSuggestionsView3.e();
                return;
            case 6:
                ConversationSuggestionsView conversationSuggestionsView4 = (ConversationSuggestionsView) this.a;
                conversationSuggestionsView4.g.ifPresent(new aabj(10));
                conversationSuggestionsView4.e();
                return;
            case 7:
                aagg aaggVar = (aagg) this.a;
                lzv lzvVar = (lzv) aaggVar.d.b();
                cj F = ((aagf) aaggVar.b.b()).F();
                alhr alhrVar = aagh.a;
                lzvVar.y(F, (String) aagh.c.e());
                return;
            case 8:
                Object obj2 = this.a;
                DebugMmsConfigFragment debugMmsConfigFragment = (DebugMmsConfigFragment) obj2;
                eu euVar = new eu(debugMmsConfigFragment.fe());
                View inflate = debugMmsConfigFragment.fe().getLayoutInflater().inflate(R.layout.mms_config_debug_mcc_mnc_dialog, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(R.id.mcc_entry);
                TextView textView2 = (TextView) inflate.findViewById(R.id.mnc_entry);
                euVar.setView(inflate);
                euVar.setPositiveButton(R.string.menu_save_apn, new aabt(debugMmsConfigFragment, textView, textView2, i2));
                euVar.setNegativeButton(R.string.share_cancel, new aajo(obj2, i));
                euVar.d(R.string.menu_restore_default_apn, new aajo(obj2, i2));
                euVar.g(R.string.debug_mms_config_mcc_mnc_title);
                debugMmsConfigFragment.a = euVar.create();
                textView.setText(String.valueOf(debugMmsConfigFragment.b[0]));
                textView2.setText(String.valueOf(debugMmsConfigFragment.b[1]));
                debugMmsConfigFragment.a.show();
                return;
            case 9:
                ((aegz) ((Optional) ((vap) ((aajs) this.a).b.b()).a.b()).get()).b();
                return;
            case 10:
                xze xzeVar = aalt.c;
                Toast.makeText((Context) this.a, String.format(Locale.US, "%s\n%s\n%s", "$M substitutes for message count", "$C substitutes for conversation count", "$U substitutes for random UUID"), 1).show();
                return;
            case 11:
                xze xzeVar2 = aalt.c;
                DatePicker datePicker = (DatePicker) this.a;
                if (datePicker.isShown()) {
                    datePicker.setVisibility(8);
                    return;
                } else {
                    datePicker.setVisibility(0);
                    return;
                }
            case 12:
                aaok aaokVar = (aaok) this.a;
                akbo akboVar = (akbo) aaokVar.c.b();
                zlz zlzVar = (zlz) aaokVar.b.b();
                akboVar.c(ahlp.l(zlzVar.a(aaokVar.h).i(new aang(zlzVar, i2), zlzVar.b).h(new zms(12), zlzVar.c)), aaokVar.j);
                return;
            case 13:
                ((ahiy) ((aaok) this.a).e.b()).q(aneh.a, new akgc("debug_tachyon_state_data_source"));
                return;
            case 14:
                boolean booleanValue = ((Boolean) aapt.a.e()).booleanValue();
                Object obj3 = this.a;
                if (booleanValue) {
                    ((aapp) obj3).j(amqe.EXPAND);
                    return;
                } else {
                    ((aapp) obj3).k(amqe.EXPAND);
                    return;
                }
            case 15:
                aaqa aaqaVar = ((aapy) this.a).d.b;
                if (aaqaVar != null) {
                    aaqaVar.a(amqe.CATEGORY_OVERFLOW);
                    return;
                }
                return;
            case 16:
                aaqo aaqoVar = ((CategoryToggleView) this.a).c;
                if (aaqoVar != null) {
                    aaqoVar.i();
                    return;
                }
                return;
            case 17:
                ?? r10 = this.a;
                aaqf aaqfVar = ((EmojiContentItemView) r10).c;
                if (aaqfVar != 0) {
                    aaqfVar.a(r10);
                    return;
                }
                return;
            case 18:
                ((aarp) this.a).a.c.o();
                return;
            case 19:
                ((aarp) this.a).a.c.p();
                return;
            default:
                ((aarp) this.a).a.b.i(amqe.EXPAND);
                return;
        }
    }
}
