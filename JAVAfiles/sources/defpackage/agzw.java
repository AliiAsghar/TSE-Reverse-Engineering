package defpackage;

import com.google.android.libraries.inputmethod.emoji.view.EmojiView;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class agzw implements agyl {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ agzw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.agyl
    public final void a(Object obj) {
        if (this.b != 0) {
            ((EmojiView) this.a).b((agxs) obj);
        } else {
            ((ConcurrentHashMap) this.a).remove((Class) obj);
        }
    }
}
