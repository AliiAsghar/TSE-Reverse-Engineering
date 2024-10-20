package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class irc extends ire {
    public boolean c;
    public int d;

    public irc(Context context, xnv xnvVar, aack aackVar) {
        super(aackVar, xnvVar);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.conversation_compose_message_placeholder_default_height);
    }

    @Override // defpackage.no
    public final int b() {
        if (this.c) {
            return 1;
        }
        return 0;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        ((akhx) ooVar).s.getLayoutParams().height = this.d;
    }

    @Override // defpackage.no
    public final long gI(int i) {
        return -5L;
    }

    @Override // defpackage.ire
    protected final int m(int i) {
        return R.layout.conversation_compose_message_placeholder;
    }
}
