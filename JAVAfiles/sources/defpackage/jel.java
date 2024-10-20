package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jel implements jcu {
    private final asai a;
    private final Set b;

    public jel(Context context, lkd lkdVar, Conversation conversation) {
        context.getClass();
        lkdVar.getClass();
        conversation.getClass();
        String string = context.getString(R.string.action_help_and_feedback);
        string.getClass();
        this.a = new aghw(new aehz(string, null, false, true, !((Boolean) ktf.a.e()).booleanValue(), false, null, null, new jdr(lkdVar, conversation, 8), 998), 9);
        this.b = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.b;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.a;
    }
}
