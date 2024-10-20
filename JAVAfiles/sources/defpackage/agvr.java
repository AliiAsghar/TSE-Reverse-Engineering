package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.os.Trace;
import android.support.v7.widget.AppCompatTextView;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvr extends agwb implements aguc {
    public static final alvi c = alvi.m("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter");
    private static int s = 0;
    public final Runnable d;
    public final boolean e;
    public int f;
    private final alhr t;
    private final alhr u;
    private final Runnable v;
    private final View.OnClickListener w;

    public agvr(Context context, agwm agwmVar, alog alogVar, agvv agvvVar, agvb agvbVar, aguz aguzVar, alhr alhrVar, alhr alhrVar2, Runnable runnable, Runnable runnable2, View.OnClickListener onClickListener) {
        super(context, agwmVar, alogVar, agvvVar, agvbVar, aguzVar);
        SystemClock.elapsedRealtime();
        this.f = -1;
        alvg alvgVar = (alvg) ((alvg) c.g()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter", "<init>", 87, "EmojiPickerBodyAdapter.java");
        int i = s + 1;
        s = i;
        alvgVar.r("EmojiPickerBodyAdapter created (instance count = %s)", i);
        this.e = false;
        this.t = alhrVar;
        this.u = alhrVar2;
        this.v = runnable;
        this.d = runnable2;
        this.w = onClickListener;
    }

    @Override // defpackage.agwb, defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        oo e;
        oo agwtVar;
        int measuredHeight;
        int measuredHeight2;
        gvf.bd("EmojiPickerBodyAdapter.onCreateViewHolder");
        try {
            if (i == agwz.a) {
                View inflate = this.o.inflate(R.layout.loading_placeholder_view, viewGroup, false);
                int L = L(viewGroup) / this.i;
                if (this.j < brg.a) {
                    measuredHeight2 = this.k;
                } else {
                    measuredHeight2 = (int) (viewGroup.getMeasuredHeight() / this.j);
                }
                inflate.setLayoutParams(new ViewGroup.LayoutParams(L, measuredHeight2));
                e = new oo(inflate);
            } else {
                if (i == agwy.a) {
                    agwtVar = new oo(this.o.inflate(R.layout.loading_category_view_holder, viewGroup, false));
                } else if (i == agwp.a) {
                    agwtVar = new oo(this.o.inflate(R.layout.error_category_view_holder, viewGroup, false));
                } else if (i == agws.a) {
                    int L2 = L(viewGroup) / this.i;
                    if (this.j < brg.a) {
                        measuredHeight = this.k;
                    } else {
                        measuredHeight = (int) (viewGroup.getMeasuredHeight() / this.j);
                    }
                    agwtVar = new agwt(viewGroup, L2, measuredHeight, this.w, this.p);
                } else {
                    e = super.e(viewGroup, i);
                }
                e = agwtVar;
            }
            return e;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.agwb, defpackage.no
    public final void g(oo ooVar, int i) {
        int i2 = ooVar.f;
        View view = ooVar.a;
        if (i2 == agvl.a) {
            int a = this.n.a(i);
            String str = ((agvl) this.n.get(i)).b;
            if (str.isEmpty()) {
                str = (String) this.h.get(a);
            }
            if (!str.isEmpty()) {
                agso.e(view, str);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.category_name);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.switch_recent_category_prompt_text);
            if (a == 0) {
                ?? r8 = this.t.get();
                if (r8 == 0) {
                    Context context = this.r;
                    alvi alviVar = aguf.a;
                    appCompatTextView.setText(context.getString(R.string.emoji_category_recent));
                } else {
                    appCompatTextView.setText((CharSequence) r8);
                }
                appCompatTextView.setVisibility(0);
                Object obj = this.u.get();
                if (obj != null) {
                    ((alvg) ((alvg) c.f()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyAdapter", "onBindViewHolder", 181, "EmojiPickerBodyAdapter.java")).q("emoji: next category");
                    appCompatTextView2.setText(this.r.getString(R.string.recent_category_switch_prompt_text, obj));
                    appCompatTextView2.setVisibility(0);
                    appCompatTextView2.setOnClickListener(new agrb(this, 7, null));
                    return;
                }
                appCompatTextView2.setVisibility(8);
                appCompatTextView2.setText((CharSequence) null);
                appCompatTextView2.setOnClickListener(null);
                return;
            }
            if (str.isEmpty()) {
                appCompatTextView.setVisibility(8);
            } else {
                appCompatTextView.setText(str);
                appCompatTextView.setVisibility(0);
            }
            appCompatTextView2.setVisibility(8);
            appCompatTextView2.setText((CharSequence) null);
            appCompatTextView2.setOnClickListener(null);
            return;
        }
        if (i2 != agws.a) {
            if (i2 == agwy.a) {
                this.v.run();
                return;
            }
            if (i2 == agwp.a) {
                agwp agwpVar = (agwp) this.n.get(i);
                TextView textView = (TextView) view.findViewById(R.id.error_category_text);
                CharSequence charSequence = agwpVar.b;
                textView.setText((CharSequence) null);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            if (i2 == agwn.a) {
                int i3 = this.f;
                int i4 = this.i;
                if (i3 > 0) {
                    int round = Math.round(i3 / i4);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(round, view.getHeight());
                    } else {
                        layoutParams.width = round;
                    }
                    view.setLayoutParams(layoutParams);
                }
            }
            super.g(ooVar, i);
            return;
        }
        agws agwsVar = (agws) this.n.get(i);
        G(m(i));
        aglo agloVar = agwsVar.b;
        throw null;
    }
}
