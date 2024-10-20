package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.widget.GridLayoutManager;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.AsyncImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaau extends no implements aabc {
    public static final alvi c = alvi.m("com/google/android/apps/messaging/ui/conversation/emoji/EmojiRecyclerViewAdapter");
    public static final Integer[] d = {Integer.valueOf(R.array.emoji_emotions), Integer.valueOf(R.array.emoji_people), Integer.valueOf(R.array.emoji_nature), Integer.valueOf(R.array.emoji_food), Integer.valueOf(R.array.emoji_places), Integer.valueOf(R.array.emoji_activities), Integer.valueOf(R.array.emoji_objects), Integer.valueOf(R.array.emoji_symbols), Integer.valueOf(R.array.emoji_flags)};
    public static final Integer[] e = {Integer.valueOf(R.string.am_emoji_category_recent), Integer.valueOf(R.string.am_emoji_category_smileys_and_emotions), Integer.valueOf(R.string.am_emoji_category_people), Integer.valueOf(R.string.am_emoji_category_animals_and_nature), Integer.valueOf(R.string.am_emoji_category_food_and_beverage), Integer.valueOf(R.string.am_emoji_category_travel_and_places), Integer.valueOf(R.string.am_emoji_category_activities_and_events), Integer.valueOf(R.string.am_emoji_category_objects), Integer.valueOf(R.string.am_emoji_category_symbols), Integer.valueOf(R.string.am_emoji_category_flags)};
    public final Context f;
    public final mho g;
    public final aaak h;
    public final ydc i;
    public final int j;
    public final aaax k;
    public FrameLayout.LayoutParams l;
    public List m = new ArrayList();
    public List n = new ArrayList();
    public SparseIntArray o = new SparseIntArray();
    public SparseArray p = new SparseArray();
    public int q;
    public int r;
    public int s;
    public final aabd t;
    public aaar u;
    public final zxy v;
    public ahjj w;
    private final LayoutInflater x;

    public aaau(Context context, zxy zxyVar, ydc ydcVar, mho mhoVar, aabd aabdVar, aaak aaakVar, aaax aaaxVar) {
        this.f = context;
        this.v = zxyVar;
        this.i = ydcVar;
        this.j = context.getResources().getDimensionPixelSize(R.dimen.emoji_gallery_icon_size_updated);
        this.g = mhoVar;
        this.t = aabdVar;
        this.h = aaakVar;
        this.k = aaaxVar;
        this.x = LayoutInflater.from(context);
    }

    public final int F() {
        if (this.n.isEmpty()) {
            return 1;
        }
        return 0;
    }

    public final int G() {
        int i = this.s;
        return i + i;
    }

    public final void H(int i) {
        Resources resources = this.f.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.emoji_gallery_padding);
        int i2 = i - (dimensionPixelSize + dimensionPixelSize);
        int max = Math.max(1, i2 / resources.getDimensionPixelSize(R.dimen.emoji_gallery_column_size_updated));
        this.s = max;
        int max2 = Math.max(1, i2 / max);
        this.r = max2;
        this.q = Math.max(0, (max2 - this.j) / 2);
        int i3 = this.r;
        this.l = new FrameLayout.LayoutParams(i3, i3);
    }

    public final void I(List list, SparseIntArray sparseIntArray) {
        GridLayoutManager gridLayoutManager;
        if (!((CopyOnWriteArrayList) this.v.d).isEmpty()) {
            ArrayList arrayList = new ArrayList();
            this.n = new ArrayList();
            int G = G();
            Iterator it = ((CopyOnWriteArrayList) this.v.d).iterator();
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (i2 >= G) {
                    break;
                }
                if (this.h.b(str)) {
                    arrayList.add(new aaas(str, 0, false));
                    this.n.add(str);
                    i2++;
                }
            }
            int size = arrayList.size();
            if (size != 0) {
                int i3 = size + 1;
                int m = m(1);
                if (sparseIntArray.indexOfKey(0) < 0) {
                    list.add(0, new aaas(this.f.getResources().getString(R.string.am_emoji_category_recent), 0, true));
                    sparseIntArray.put(0, 0);
                } else {
                    list.subList(1, m).clear();
                }
                int i4 = i3 - m;
                if (i4 != 0) {
                    for (int i5 = 0; i5 < this.o.size(); i5++) {
                        int keyAt = this.o.keyAt(i5);
                        if (keyAt != 0) {
                            this.o.put(keyAt, this.o.get(keyAt) + i4);
                        }
                    }
                    aaar aaarVar = this.u;
                    if (aaarVar != null && (gridLayoutManager = aaarVar.al) != null) {
                        int L = gridLayoutManager.L();
                        if (L == 0) {
                            if (((CopyOnWriteArrayList) aaarVar.ag.d).size() <= 1) {
                                L = 0;
                            }
                        }
                        View U = aaarVar.al.U(L);
                        if (U != null) {
                            i = U.getTop();
                        }
                        aaarVar.al.ad(L + i4, i);
                    }
                }
                for (int i6 = 1; i6 < i3; i6++) {
                    list.add(i6, (aaas) arrayList.get(i6 - 1));
                }
            }
        }
    }

    public final void J() {
        this.w = null;
    }

    @Override // defpackage.aabc
    public final void K(zxy zxyVar) {
        I(this.m, this.o);
    }

    @Override // defpackage.no
    public final int b() {
        return this.m.size();
    }

    @Override // defpackage.no
    public final int c(int i) {
        return ((aaas) this.m.get(i)).b - 1;
    }

    @Override // defpackage.no
    public final oo e(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return new akhx(this, this.x.inflate(R.layout.emoji_recycler_view_header, viewGroup, false));
        }
        return new aaat(this, this.x.inflate(R.layout.emoji_recycler_view_item, viewGroup, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.no
    public final void g(oo ooVar, int i) {
        int i2;
        aaas aaasVar = (aaas) this.m.get(i);
        if (aaasVar.b == 1) {
            akhx akhxVar = (akhx) ooVar;
            ?? r7 = aaasVar.c;
            ((TextView) akhxVar.s).setText((CharSequence) r7);
            ((TextView) akhxVar.s).setContentDescription(r7);
            akhxVar.a.setContentDescription(r7);
            return;
        }
        aaat aaatVar = (aaat) ooVar;
        Object obj = aaasVar.c;
        aaatVar.s.g();
        aaatVar.s.setLayoutParams(aaatVar.u.l);
        AsyncImageView asyncImageView = aaatVar.s;
        int i3 = aaatVar.u.q;
        asyncImageView.setPadding(i3, i3, i3, i3);
        aaatVar.s.setOnClickListener(aaatVar);
        aaatVar.s.setOnLongClickListener(aaatVar);
        String str = (String) obj;
        String a = aaatVar.u.h.a(aaatVar.u.t.b(str));
        Uri f = ydk.f(aaatVar.u.f, a);
        int i4 = aaatVar.u.j;
        aaatVar.s.d(new ufk(f, i4, i4));
        aaatVar.s.setContentDescription(a);
        aaatVar.a.setContentDescription(a);
        boolean F = aaatVar.F(str);
        View view = aaatVar.t;
        if (true != F) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
    }

    public final int m(int i) {
        if (this.o.indexOfKey(i) < 0) {
            return 0;
        }
        return this.o.get(i);
    }
}
