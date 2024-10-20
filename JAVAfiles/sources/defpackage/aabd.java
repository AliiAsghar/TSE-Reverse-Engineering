package defpackage;

import android.content.Context;
import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aabd {
    public static final alvi a = alvi.m("com/google/android/apps/messaging/ui/conversation/emoji/ResourceBasedEmojiVariantService");
    public final Context b;
    public final anen c;
    public final Map d = new ConcurrentHashMap();
    public final Map e = new ConcurrentHashMap();
    public final Map f = new ConcurrentHashMap();
    public int g = 1;
    public int h = 1;
    public final aiwu i;

    public aabd(Context context, aiwu aiwuVar, anen anenVar) {
        this.b = context;
        this.i = aiwuVar;
        this.c = anenVar;
    }

    public final String a(String str) {
        return (String) Map.EL.getOrDefault(this.e, str, str);
    }

    public final String b(String str) {
        java.util.Map map = this.f;
        String a2 = a(str);
        return (String) Map.EL.getOrDefault(map, a2, a2);
    }

    public final List c(String str) {
        return (List) Map.EL.getOrDefault(this.d, a(str), alog.r(str));
    }

    public final void d() {
        qjb.a(new zom(this, 18), this.c);
    }

    public final void e() {
        qjb.a(new zom(this, 17), this.c);
    }
}
