package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ire extends no {
    private final View.OnClickListener c;
    private final View.OnLongClickListener d;
    protected final aack e;
    private final xnv f;

    /* JADX INFO: Access modifiers changed from: protected */
    public ire(aack aackVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, xnv xnvVar) {
        this.e = aackVar;
        this.c = onClickListener;
        this.d = onLongClickListener;
        this.f = xnvVar;
    }

    public final akhx G(ViewGroup viewGroup, int i, LayoutInflater layoutInflater) {
        long j;
        if (i == R.layout.conversation_message_view) {
            j = this.f.a();
            i = R.layout.conversation_message_view;
        } else {
            j = 0;
        }
        aacv aacvVar = (aacv) layoutInflater.inflate(i, viewGroup, false);
        if (i == R.layout.conversation_message_view) {
            xzb.d("Bugle", "ConversationMessageView inflate: %d millis", Long.valueOf(this.f.a() - j));
        }
        if (aacvVar instanceof aacl) {
            ((aacl) aacvVar).e(this.e);
        }
        View.OnClickListener onClickListener = this.c;
        View.OnLongClickListener onLongClickListener = this.d;
        if (i == R.layout.conversation_rich_card_view || i == R.layout.conversation_rich_card_view2 || i == R.layout.conversation_rich_card_carousel_view) {
            onClickListener = null;
            onLongClickListener = null;
        }
        return new akhx(aacvVar.a(), onClickListener, onLongClickListener);
    }

    @Override // defpackage.no
    public final int c(int i) {
        return m(i);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        return G(viewGroup, i, LayoutInflater.from(viewGroup.getContext()));
    }

    @Override // defpackage.no
    public final /* synthetic */ void k(oo ooVar) {
        ((aacv) ((akhx) ooVar).s).b();
    }

    protected abstract int m(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public ire(aack aackVar, xnv xnvVar) {
        this(aackVar, null, null, xnvVar);
    }
}
