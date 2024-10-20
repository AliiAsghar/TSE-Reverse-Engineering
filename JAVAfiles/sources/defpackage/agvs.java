package defpackage;

import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agvs extends mr {
    final /* synthetic */ agvo c;
    final /* synthetic */ EmojiPickerBodyRecyclerView d;

    public agvs(EmojiPickerBodyRecyclerView emojiPickerBodyRecyclerView, agvo agvoVar) {
        this.c = agvoVar;
        this.d = emojiPickerBodyRecyclerView;
    }

    @Override // defpackage.mr
    public final int b(int i) {
        no noVar = this.d.l;
        if (noVar != null) {
            int c = noVar.c(i);
            if (c != agvl.a && c != agwo.a && c != agwy.a && c != agwp.a) {
                return 1;
            }
            return this.c.a;
        }
        return 1;
    }
}
