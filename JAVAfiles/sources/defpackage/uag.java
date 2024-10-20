package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uag implements ujs {
    private final Context a;

    public uag(Context context, ofy ofyVar) {
        context.getClass();
        ofyVar.getClass();
        this.a = context;
    }

    private static final String e(rry rryVar) {
        if (((Boolean) new mss(3).get()).booleanValue()) {
            String str = rryVar.aZ().a;
            str.getClass();
            return str;
        }
        String J = rryVar.J();
        J.getClass();
        return J;
    }

    @Override // defpackage.ujs
    public final String a(rry rryVar) {
        rryVar.getClass();
        if (rryVar.f() == 224) {
            String string = this.a.getString(R.string.e2ee_conversation_tombstone_v2, e(rryVar));
            string.getClass();
            return string;
        }
        String Q = rryVar.Q(this.a);
        if (Q == null) {
            return "";
        }
        return Q;
    }

    @Override // defpackage.ujs
    public final void b(View view, TextView textView, rry rryVar, int i) {
        textView.getClass();
        rryVar.getClass();
        if (!c(rryVar)) {
            return;
        }
        if (rryVar.f() == 224) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  ");
            Drawable drawable = this.a.getDrawable(R.drawable.ic_lock_outline_black_12dp);
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                drawable.setTint(i);
                spannableStringBuilder.setSpan(new ytg(drawable), 0, 1, 34);
            }
            String string = this.a.getString(R.string.chatting_conversation_tombstone_v2, e(rryVar));
            string.getClass();
            spannableStringBuilder.append((CharSequence) string);
            textView.setText(spannableStringBuilder);
        } else {
            textView.setText(rryVar.Q(this.a));
        }
        textView.setTextColor(i);
        textView.setPadding(0, 0, 0, 0);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.etouffee_tombstone_min_height);
        int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.etouffee_tombstone_top_padding);
        view.setMinimumHeight(dimensionPixelSize);
        view.setPadding(0, dimensionPixelSize2, 0, 0);
    }

    @Override // defpackage.ujs
    public final boolean c(rry rryVar) {
        rryVar.getClass();
        int f = rryVar.f();
        if (!ttd.f()) {
            return false;
        }
        if (f == 222 || f == 223) {
            return true;
        }
        if (f != 224) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ujs
    public final boolean d(boolean z) {
        if (!z) {
            return true;
        }
        return false;
    }
}
