package defpackage;

import android.content.Context;
import android.os.Trace;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class agwb extends agwu {
    public static final alvi g = alvi.m("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerCoreBodyAdapter");
    private CharSequence c;
    private int d;
    private Set e;
    private Set f;
    protected final alog h;
    public final int i;
    protected final float j;
    protected final int k;
    public final int l;
    public final aguz m;
    public agww n;
    protected final LayoutInflater o;
    protected final agvv p;
    private final agvb s;
    private final int t;
    private final Map u;
    private final int v;

    /* JADX INFO: Access modifiers changed from: protected */
    public agwb(Context context, agwm agwmVar, alog alogVar, agvv agvvVar, agvb agvbVar, aguz aguzVar) {
        super(context);
        this.d = -1;
        this.e = new HashSet();
        this.f = new HashSet();
        this.u = new HashMap();
        this.i = agwmVar.e;
        this.j = agwmVar.a;
        this.k = agwmVar.b;
        this.l = agwmVar.f;
        CharSequence charSequence = agwmVar.g;
        this.h = alogVar;
        this.p = agvvVar;
        this.s = agvbVar;
        this.m = aguzVar;
        alob alobVar = new alob();
        for (int i = 0; i < ((alsx) alogVar).c; i++) {
            alobVar.h(alsx.a);
        }
        this.n = new agww(alobVar.g(), agwmVar.f, agwmVar.e);
        this.v = agwmVar.n;
        this.t = this.n.e;
        this.o = LayoutInflater.from(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int F(int i) {
        return this.n.b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int G(int i) {
        agww agwwVar = this.n;
        if (i >= agwwVar.b) {
            ((alvg) agww.a.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/picker/ItemViewDataFlatList", "getCategoryStartPosition", 152, "ItemViewDataFlatList.java")).u("Too large categoryIndex (%s vs %s)", i, agwwVar.b);
            return 0;
        }
        return agwwVar.d[i];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int H() {
        return this.n.b;
    }

    final int I(agwa agwaVar) {
        int i;
        int i2 = agwaVar.a;
        if (i2 >= 0 && i2 < this.n.e && (i = agwaVar.b) >= 0 && i < F(i2)) {
            return G(i2) + i;
        }
        return -1;
    }

    public final void J(agxv agxvVar, boolean z) {
        if (z) {
            String str = agxvVar.b;
            if (!this.m.c(str).isEmpty()) {
                agwa agwaVar = (agwa) this.u.get(this.m.d(str));
                if (agwaVar != null) {
                    if (this.s.e() == 2) {
                        u(G(agwaVar.a), this.n.b(agwaVar.a));
                    } else if (this.s.e() == 1) {
                        int I = I(agwaVar);
                        if (I != -1) {
                            q(I);
                        }
                    } else {
                        p();
                    }
                }
            }
        }
        if (this.v != 1) {
            int I2 = I(new agwa(agxvVar.d, agxvVar.c));
            this.c = null;
            this.f = this.e;
            if (I2 != -1) {
                this.e = new HashSet();
                if (agxvVar.d == 0) {
                    this.c = agxvVar.b;
                }
                this.e.add(Integer.valueOf(I2));
                q(I2);
            }
            Iterator it = this.f.iterator();
            while (it.hasNext()) {
                q(((Integer) it.next()).intValue());
            }
        }
    }

    public final void K(alog alogVar) {
        this.n.d(0, alogVar);
        this.e.remove(Integer.valueOf(this.d));
        u(0, F(0));
    }

    @Override // defpackage.no
    public final int b() {
        int i = this.n.e;
        if (i == this.t) {
            return 0;
        }
        return i;
    }

    @Override // defpackage.no
    public final int c(int i) {
        return this.n.get(i).a();
    }

    @Override // defpackage.no
    public oo e(ViewGroup viewGroup, int i) {
        View view;
        int measuredHeight;
        oo akhxVar;
        int measuredHeight2;
        View view2;
        int i2;
        gvf.bd("EmojiPickerCoreBodyAdapter.onCreateViewHolder");
        try {
            if (i == agvl.a) {
                view2 = this.o.inflate(R.layout.category_text_view, viewGroup, false);
                view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            } else {
                if (i == agwo.a) {
                    view = this.o.inflate(R.layout.emoji_picker_empty_category_text_view, viewGroup, false);
                    if (this.j > brg.a) {
                        i2 = (int) (viewGroup.getMeasuredHeight() / this.j);
                    } else {
                        i2 = this.k;
                    }
                    view.setMinimumHeight(i2);
                } else {
                    if (i == agwn.a) {
                        LayoutInflater layoutInflater = this.o;
                        int L = L(viewGroup) / this.i;
                        if (this.j < brg.a) {
                            measuredHeight2 = this.k;
                        } else {
                            measuredHeight2 = (int) (viewGroup.getMeasuredHeight() / this.j);
                        }
                        akhxVar = new akhx(viewGroup, layoutInflater, L, measuredHeight2, this.p);
                        return akhxVar;
                    }
                    if (i == agvn.a) {
                        view = new View(this.r);
                        int L2 = L(viewGroup) / this.i;
                        if (this.j < brg.a) {
                            measuredHeight = this.k;
                        } else {
                            measuredHeight = (int) (viewGroup.getMeasuredHeight() / this.j);
                        }
                        view.setLayoutParams(new ViewGroup.LayoutParams(L2, measuredHeight));
                    } else {
                        ((alvg) ((alvg) g.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerCoreBodyAdapter", "onCreateViewHolder", 181, "EmojiPickerCoreBodyAdapter.java")).q("EmojiPickerCoreBodyAdapter gets unsupported view type.");
                        view = new View(this.r);
                        view.setLayoutParams(new ViewGroup.LayoutParams(L(viewGroup) / this.i, this.k));
                    }
                }
                view2 = view;
            }
            akhxVar = new oo(view2);
            return akhxVar;
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.no
    public void g(oo ooVar, int i) {
        boolean z;
        String c;
        int i2;
        int i3 = ooVar.f;
        View view = ooVar.a;
        if (i3 == agvl.a) {
            int a = this.n.a(i);
            String str = ((agvl) this.n.get(i)).b;
            if (str.isEmpty()) {
                str = (String) this.h.get(a);
            }
            if (!str.isEmpty()) {
                agso.e(view, str);
            }
            AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.category_name);
            if (a == 0) {
                Context context = this.r;
                alvi alviVar = aguf.a;
                appCompatTextView.setText(context.getString(R.string.emoji_category_recent));
                appCompatTextView.setVisibility(0);
                return;
            }
            if (str.isEmpty()) {
                appCompatTextView.setVisibility(8);
                return;
            } else {
                appCompatTextView.setText(str);
                appCompatTextView.setVisibility(0);
                return;
            }
        }
        if (i3 == agwo.a) {
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(R.id.emoji_picker_empty_category_view);
            String str2 = ((agwo) this.n.get(i)).c;
            if (str2.isEmpty()) {
                int m = m(i);
                Context context2 = this.r;
                if (m == 0) {
                    i2 = R.string.emoji_empty_recent_category;
                } else {
                    i2 = R.string.emoji_empty_non_recent_category;
                }
                str2 = context2.getString(i2);
            }
            appCompatTextView2.setText(str2);
            return;
        }
        if (i3 == agwn.a) {
            agwn agwnVar = (agwn) this.n.get(i);
            akhx akhxVar = (akhx) ooVar;
            int m2 = m(i);
            int G = i - G(m2);
            boolean z2 = true;
            if (m2 == 0) {
                if (agwnVar.b(this.c)) {
                    m2 = 0;
                    z = true;
                } else {
                    m2 = 0;
                    z = false;
                }
            } else {
                z = false;
            }
            Set set = this.e;
            Integer valueOf = Integer.valueOf(i);
            if (!set.contains(valueOf) && !agwnVar.b(null) && !z) {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    this.d = ooVar.a();
                }
                this.e.add(valueOf);
            }
            int F = F(m2);
            agvb agvbVar = this.s;
            String str3 = agwnVar.d;
            if (agwnVar.f && (c = agvbVar.c(str3)) != null) {
                agxl.a();
                if (agxl.c(c, agxg.instance.h)) {
                    str3 = c;
                }
            }
            agxu a2 = agxv.a();
            a2.d(str3);
            a2.g(G);
            a2.b(m2);
            a2.c(F);
            agxu agxuVar = new agxu(a2.a());
            agxuVar.f(z2);
            agxv a3 = agxuVar.a();
            alog alogVar = agwnVar.e;
            ((EmojiView) akhxVar.s).c(a3);
            ((EmojiView) akhxVar.s).b = alogVar;
            if (m2 > 0 && !this.m.c(agwnVar.d).isEmpty()) {
                this.u.put(this.m.d(agwnVar.d), new agwa(m2, i - G(m2)));
            }
            ImageView imageView = (ImageView) view.findViewById(R.id.variant_availability_indicator);
            if (imageView == null) {
                ((alvg) ((alvg) agwu.q.i()).h("com/google/android/libraries/inputmethod/emoji/picker/ItemListHolderAdapter", "updateVisibilityOfVariantAvailabilityIndicator", 47, "ItemListHolderAdapter.java")).q("Unable to find variant availability indicator view");
            } else if (!agwnVar.e.isEmpty()) {
                imageView.setImageDrawable(this.r.getDrawable(R.drawable.ic_signal_cellular_4_bar_auto_mirrored));
                imageView.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                imageView.setVisibility(8);
            }
        }
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return this.n.get(i).h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int m(int i) {
        return this.n.a(i);
    }
}
