package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jew implements jcu {
    public final asai a;
    public final lkd b;
    private final Context c;
    private final Set d;

    public jew(Context context, lkd lkdVar) {
        context.getClass();
        lkdVar.getClass();
        this.c = context;
        this.b = lkdVar;
        String string = context.getString(R.string.learn_more_about_rcs_chats);
        string.getClass();
        this.a = new aghw(new aehz(string, null, false, false, false, false, null, null, new ixz(this, 13), 1022), 9);
        this.d = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.d;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.a;
    }
}
