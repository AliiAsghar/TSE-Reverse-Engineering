package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aara extends aapy {
    public aara(aarc aarcVar) {
        super(aarcVar, R.dimen.emoji_content_item_height, R.layout.compose2o_item_placeholder);
    }

    @Override // defpackage.aapy
    protected final oo F(ViewGroup viewGroup, int i) {
        return new oo(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.compose2o_emoji_item_view, viewGroup, false));
    }

    @Override // defpackage.aapy
    protected final boolean H() {
        return true;
    }

    @Override // defpackage.aapy
    protected final int m() {
        return R.string.c2o_category_emoji_content_description;
    }
}
