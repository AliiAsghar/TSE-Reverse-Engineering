package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uad implements ujs {
    final Context a;
    public final armf b;
    final trz c;
    final ksi d;

    public uad(Context context, armf armfVar, trz trzVar, ksi ksiVar) {
        this.a = context;
        this.b = armfVar;
        this.c = trzVar;
        this.d = ksiVar;
    }

    @Override // defpackage.ujs
    public final String a(rry rryVar) {
        if (!TextUtils.isEmpty((String) ttd.t.e())) {
            Context context = this.a;
            return context.getString(R.string.e2ee_conversation_tombstone_with_learn_more_v2, rryVar.G(context), yyb.bs(context));
        }
        Context context2 = this.a;
        return context2.getString(R.string.e2ee_conversation_tombstone_v2, rryVar.G(context2));
    }

    @Override // defpackage.ujs
    public final void b(View view, TextView textView, rry rryVar, int i) {
        if (!c(rryVar)) {
            return;
        }
        Context context = textView.getContext();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  ");
        Drawable drawable = context.getDrawable(R.drawable.ic_lock_outline_black_12dp);
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            drawable.setTint(textView.getCurrentTextColor());
            spannableStringBuilder.setSpan(new ytg(drawable), 0, 1, 34);
        }
        String str = (String) ttd.t.e();
        if (TextUtils.isEmpty(str)) {
            spannableStringBuilder.append((CharSequence) context.getString(R.string.chatting_conversation_tombstone_v2, rryVar.G(context)));
        } else {
            String bs = yyb.bs(context);
            spannableStringBuilder.append((CharSequence) context.getString(R.string.chatting_tombstone_with_details, rryVar.G(context), bs));
            yyb.bv(textView.getContext(), spannableStringBuilder, bs, new ivq(this, context, str, 5));
            ahnz.s(textView);
            ahnz.u(textView, LinkMovementMethod.getInstance());
            if (this.c.l()) {
                textView.setTag(R.id.growthkit_view_tag, "etouffee_initialization_tombstone");
                this.d.a();
            }
        }
        textView.setText(spannableStringBuilder);
    }

    @Override // defpackage.ujs
    public final boolean c(rry rryVar) {
        int f = rryVar.f();
        if (f == 213) {
            if (ttd.f()) {
                if (!ttd.b()) {
                    return true;
                }
                return false;
            }
        } else if (f == 219) {
            if (ttd.f()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ujs
    public final boolean d(boolean z) {
        return false;
    }
}
