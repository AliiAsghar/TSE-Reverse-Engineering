package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import j$.util.Objects;
import j$.util.Optional;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyp implements kzy {
    static final uuf a = uuh.i(uuh.b, "show_otp_chip_in_conversation_list", true);
    public final armf b;
    public LinearLayout c;
    private final xnv d;
    private xvy e;

    public kyp(xnv xnvVar, armf armfVar) {
        this.d = xnvVar;
        this.b = armfVar;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        aqce aqceVar;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (((Boolean) a.e()).booleanValue()) {
            ryi ryiVar = kzxVar.I;
            if (ryiVar == null) {
                this.e.g(8);
                return;
            }
            Optional b = ryiVar.b();
            if (!b.isEmpty()) {
                ConversationIdType conversationIdType = ryiVar.b;
                MessageIdType messageIdType = ryiVar.c;
                aqby aqbyVar = (aqby) b.get();
                if (aqbyVar.b == 2) {
                    aqceVar = (aqce) aqbyVar.c;
                } else {
                    aqceVar = aqce.a;
                }
                alog r = alog.r(ryi.a(conversationIdType, messageIdType, aqceVar));
                if (r == null) {
                    this.e.g(8);
                    return;
                }
                long epochMilli = this.d.f().toEpochMilli() - TimeUnit.HOURS.toMillis(2L);
                kzd kzdVar = kzxVar.a;
                if (!kzxVar.o && kzdVar.F > epochMilli) {
                    this.e.g(0);
                    this.c.setGravity(8388611);
                    ((ConversationSuggestionsView) this.e.b()).c(r, new kyo(this, kzxVar));
                    View findViewById = ((ConversationSuggestionsView) this.e.b()).findViewById(R.id.suggestion_button);
                    if (findViewById != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()) != null) {
                        marginLayoutParams.setMarginStart(0);
                        return;
                    }
                    return;
                }
                this.e.g(8);
                return;
            }
            this.e.g(8);
            return;
        }
        this.e.g(8);
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.e = new xvy(view, R.id.conversation_suggestions_view_stub, R.id.conversation_suggestions_view, new kyn(this, 0));
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        if (!Objects.equals(kzxVar.I, kzxVar2.I)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kzy
    public final /* synthetic */ kzx a(kzx kzxVar) {
        return kzxVar;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
    }
}
