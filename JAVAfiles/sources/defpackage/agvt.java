package defpackage;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvt extends nq {
    private static final alvi a = alvi.m("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener");
    private final agvx b;
    private int c = -1;

    public agvt(agvx agvxVar) {
        this.b = agvxVar;
    }

    @Override // defpackage.nq
    public final void dG(RecyclerView recyclerView, int i, int i2) {
        int K;
        int m;
        if (!(recyclerView instanceof EmojiPickerBodyRecyclerView)) {
            ((alvg) a.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener", "onScrolled", 28, "EmojiPickerBodyScrollListener.java")).q("Scroll listener not attached to EmojiPickerBodyRecyclerView.");
            return;
        }
        EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView = (EmojiPickerBodyRecyclerView) recyclerView;
        no noVar = emojiPickerBodyRecyclerView.l;
        if (!(noVar instanceof agvr)) {
            ((alvg) a.a(agyk.a).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyScrollListener", "onScrolled", 36, "EmojiPickerBodyScrollListener.java")).q("EmojiPickerBodyRecyclerView's adapter is not an EmojiPickerBodyAdapter.");
            return;
        }
        agvr agvrVar = (agvr) noVar;
        nw nwVar = emojiPickerBodyRecyclerView.m;
        if (!(nwVar instanceof GridLayoutManager)) {
            ((alvg) ((alvg) EmojiPickerBodyRecyclerView.ab.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerBodyRecyclerView", "findFirstCompletelyVisibleItemPosition", 192, "EmojiPickerBodyRecyclerView.java")).q("findFirstCompletelyVisibleItemPosition() : Cannot find layout manager.");
            K = -1;
        } else {
            K = ((GridLayoutManager) nwVar).K();
        }
        int i3 = this.c;
        if (i3 != K && K != -1) {
            if (i3 == -1) {
                m = 0;
            } else {
                m = agvrVar.m(i3);
            }
            int m2 = agvrVar.m(K);
            int i4 = emojiPickerBodyRecyclerView.ac;
            agvrVar.G(m2);
            if ((m != m2 || m2 != i4) && (i != 0 || i2 != 0)) {
                this.b.a(m2, 5);
                emojiPickerBodyRecyclerView.ac = m2;
            }
            this.c = K;
        }
    }
}
