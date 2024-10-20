package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uae implements ujs {
    private final Context a;

    public uae(Context context) {
        this.a = context;
    }

    @Override // defpackage.ujs
    public final String a(rry rryVar) {
        if (rryVar.f() == 216) {
            Context context = this.a;
            return context.getString(R.string.e2ee_conversation_tombstone_v2, rryVar.G(context));
        }
        String Q = rryVar.Q(this.a);
        if (Q == null) {
            return "";
        }
        return Q;
    }

    @Override // defpackage.ujs
    public final void b(View view, TextView textView, rry rryVar, int i) {
        if (c(rryVar)) {
            Context context = textView.getContext();
            if (rryVar.f() == 216) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  ");
                Drawable drawable = context.getDrawable(R.drawable.ic_lock_outline_black_12dp);
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                    drawable.setTint(i);
                    spannableStringBuilder.setSpan(new ytg(drawable), 0, 1, 34);
                }
                spannableStringBuilder.append((CharSequence) context.getString(R.string.chatting_conversation_tombstone_v2, rryVar.G(context)));
                textView.setText(spannableStringBuilder);
            } else {
                textView.setText(rryVar.Q(context));
            }
            textView.setTextColor(i);
            if (!ttd.b()) {
                textView.setPadding(0, 0, 0, 0);
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.etouffee_tombstone_min_height);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.etouffee_tombstone_top_padding);
                view.setMinimumHeight(dimensionPixelSize);
                view.setPadding(0, dimensionPixelSize2, 0, 0);
            }
        }
    }

    @Override // defpackage.ujs
    public final boolean c(rry rryVar) {
        int f = rryVar.f();
        if (!ttd.f()) {
            return false;
        }
        if (f == 216 || f == 215) {
            return true;
        }
        if (f != 214) {
            return false;
        }
        return true;
    }

    @Override // defpackage.ujs
    public final boolean d(boolean z) {
        if (ttd.b() || z) {
            return false;
        }
        return true;
    }
}
