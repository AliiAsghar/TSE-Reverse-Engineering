package defpackage;

import android.content.Context;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jdk implements jcu {
    public final yti a;
    private final asai b;
    private final Set c;

    public jdk(Context context, khb khbVar, yti ytiVar) {
        context.getClass();
        khbVar.getClass();
        ytiVar.getClass();
        this.a = ytiVar;
        this.b = new jeo(khbVar.a(), context, this, khbVar, 1);
        this.c = aqil.r(new khe[]{khe.b, khe.c});
    }

    @Override // defpackage.jcu
    public final Set a() {
        return this.c;
    }

    @Override // defpackage.jcu
    public final asai b() {
        return this.b;
    }
}
