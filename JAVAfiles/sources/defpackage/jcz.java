package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jcz implements jcu {
    public final Context a;
    public final OpenConversation2Arguments b;
    public final lkd c;
    private final asai d;
    private final Set e;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.Map, java.lang.Object] */
    public jcz(Context context, lkd lkdVar, asai asaiVar, asai asaiVar2, hmk hmkVar, OpenConversation2Arguments openConversation2Arguments) {
        context.getClass();
        lkdVar.getClass();
        asaiVar.getClass();
        asaiVar2.getClass();
        hmkVar.getClass();
        openConversation2Arguments.getClass();
        this.a = context;
        this.c = lkdVar;
        this.b = openConversation2Arguments;
        jxp jxpVar = jxp.a;
        jxpVar.getClass();
        if (!hmkVar.a.containsKey(jxpVar)) {
            hmkVar.a.put(jxpVar, ascy.a(null));
        }
        Object obj = hmkVar.a.get(jxpVar);
        obj.getClass();
        this.d = arrn.P(asaiVar, asaiVar2, (asai) obj, new jit(this, (arpe) null, 1));
        this.e = aqjn.e(khe.a);
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.e;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.d;
    }
}
