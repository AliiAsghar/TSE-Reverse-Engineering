package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afwx extends oo {
    public static final /* synthetic */ int v = 0;
    public final View s;
    public final arml t;
    final /* synthetic */ afwz u;
    private final arml w;
    private final arml x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afwx(afwz afwzVar, View view) {
        super(view);
        this.u = afwzVar;
        this.s = view;
        this.w = armd.a(new afww(this, 3));
        this.t = armd.a(new afww(this, 2));
        this.x = armd.a(new afww(this, 0));
    }

    private final ImageView E() {
        Object a = this.x.a();
        a.getClass();
        return (ImageView) a;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, arml] */
    public final void D(String str, afwu afwuVar) {
        float f;
        str.getClass();
        afwuVar.getClass();
        Object a = this.w.a();
        a.getClass();
        TextView textView = (TextView) a;
        SpannableString spannableString = new SpannableString(afwuVar.a());
        int T = arsd.T(spannableString, str, 0, 6);
        aday adayVar = this.u.g;
        if (T > 0) {
            spannableString.setSpan(adayVar.aa(), 0, T, 33);
        }
        if (T >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(((Number) adayVar.b.a()).intValue()), T, str.length() + T, 33);
            if (spannableString.length() > str.length() + T) {
                spannableString.setSpan(adayVar.aa(), T + str.length(), spannableString.length(), 33);
            }
        } else {
            spannableString.setSpan(adayVar.aa(), 0, spannableString.length(), 33);
        }
        textView.setText(spannableString);
        ImageView E = E();
        afwz afwzVar = this.u;
        E.setContentDescription(E().getContext().getString(R.string.search_end_icon_content_description_with_search_term, afwuVar.a()));
        E.setOnClickListener(afwzVar.c.a("SearchRowsAdapter.ViewHolder#onEndIconClick", new abbh(afwzVar, afwuVar, 9)));
        if (true != afwv.A(E)) {
            f = -45.0f;
        } else {
            f = 45.0f;
        }
        E.setRotation(f);
    }
}
