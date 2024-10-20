package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uak {
    public static final uak a = new uak();

    private uak() {
    }

    public static final SpannableStringBuilder a(TextView textView, boolean z) {
        Context context = textView.getContext();
        String string = context.getString(R.string.details_link);
        string.getClass();
        String string2 = context.getString(R.string.rcs_chat_with_details, string);
        string2.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (z) {
            e(spannableStringBuilder, textView);
        }
        spannableStringBuilder.append((CharSequence) string2);
        f(spannableStringBuilder, textView, string);
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder b(rry rryVar, TextView textView, boolean z, boolean z2) {
        SpannableStringBuilder spannableStringBuilder;
        String string;
        String string2;
        boolean z3;
        if (z) {
            Context context = textView.getContext();
            String g = g(textView);
            spannableStringBuilder = new SpannableStringBuilder("");
            e(spannableStringBuilder, textView);
            if (!z2) {
                String g2 = g(textView);
                Context context2 = textView.getContext();
                aron aronVar = new aron((byte[]) null);
                SelfIdentityId s = rryVar.s();
                List<rtw> list = rryVar.g;
                if (list != null && s != null) {
                    z3 = false;
                    for (rtw rtwVar : list) {
                        if (d.F(rtwVar.a, ((SelfIdentityIdImpl) s).a)) {
                            z3 = true;
                        } else {
                            String str = rtwVar.b;
                            if (str != null) {
                                aronVar.add(wfh.y(str));
                            } else {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                        }
                    }
                } else {
                    z3 = false;
                }
                List x = aqjn.x(aronVar);
                if (z3) {
                    aron aronVar2 = (aron) x;
                    int i = aronVar2.c;
                    if (i != 0) {
                        if (i != 1) {
                            string2 = textView.getContext().getString(R.string.you_and_multiple_others_joined_group_with_details, String.valueOf(aronVar2.c), g(textView));
                        } else {
                            string2 = textView.getContext().getString(R.string.you_and_one_person_joined_group_with_details, x.get(0), g(textView));
                        }
                    } else {
                        string2 = textView.getContext().getString(R.string.you_joined_group_with_details, g(textView));
                    }
                    string2.getClass();
                } else {
                    string2 = context2.getString(R.string.participant_joined_group_with_details, ytd.c(textView.getResources(), x), g2);
                    string2.getClass();
                }
            } else if (h(rryVar)) {
                string2 = context.getString(R.string.you_created_encrypted_rcs_group_with_details, rryVar.G(context), g);
                string2.getClass();
            } else {
                string2 = context.getString(R.string.someone_else_created_encrypted_rcs_group_with_details, rryVar.K(false), rryVar.G(context), g);
                string2.getClass();
            }
            spannableStringBuilder.append((CharSequence) string2);
            f(spannableStringBuilder, textView, g);
        } else {
            Context context3 = textView.getContext();
            String g3 = g(textView);
            spannableStringBuilder = new SpannableStringBuilder("");
            if (h(rryVar)) {
                string = context3.getString(R.string.you_created_rcs_group_with_details, rryVar.G(context3), g3);
            } else {
                string = context3.getString(R.string.someone_else_created_rcs_group_with_details, rryVar.K(false), rryVar.G(context3), g3);
            }
            spannableStringBuilder.append((CharSequence) string);
            f(spannableStringBuilder, textView, g3);
        }
        return spannableStringBuilder;
    }

    public static final SpannableStringBuilder c(TextView textView, rry rryVar, boolean z) {
        Context context = textView.getContext();
        String g = g(textView);
        String string = context.getString(R.string.chatting_tombstone_with_details, rryVar.G(context), g);
        string.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("");
        if (z) {
            e(spannableStringBuilder, textView);
        }
        spannableStringBuilder.append((CharSequence) string);
        f(spannableStringBuilder, textView, g);
        return spannableStringBuilder;
    }

    private static final void e(SpannableStringBuilder spannableStringBuilder, TextView textView) {
        Drawable drawable = textView.getContext().getDrawable(R.drawable.ic_lock_outline_black_12dp);
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        drawable.setTint(textView.getCurrentTextColor());
        spannableStringBuilder.append("  ");
        spannableStringBuilder.setSpan(new ImageSpan(drawable, 1), 0, 1, 34);
    }

    private static final void f(SpannableStringBuilder spannableStringBuilder, TextView textView, String str) {
        yyb.bv(textView.getContext(), spannableStringBuilder, str, new uai(textView, 2));
        ahnz.s(textView);
        ahnz.u(textView, LinkMovementMethod.getInstance());
    }

    private static final String g(TextView textView) {
        String string = textView.getContext().getString(R.string.details_link);
        string.getClass();
        return string;
    }

    private static final boolean h(rry rryVar) {
        String str;
        SelfIdentityId s = rryVar.s();
        if (s != null) {
            str = ((SelfIdentityIdImpl) s).a;
        } else {
            str = null;
        }
        return TextUtils.equals(str, rryVar.F());
    }
}
