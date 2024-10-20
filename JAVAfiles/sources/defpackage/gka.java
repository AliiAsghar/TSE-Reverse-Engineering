package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gka {
    public final gjz a;
    public boolean c;
    public Bundle d;
    public boolean e;
    private final arqg h;
    public final gvf g = new gvf(null);
    public final Map b = new LinkedHashMap();
    public boolean f = true;

    public gka(gjz gjzVar, arqg arqgVar) {
        this.a = gjzVar;
        this.h = arqgVar;
    }

    public final void a() {
        if (this.a.N().a() == eng.INITIALIZED) {
            if (!this.c) {
                this.h.a();
                this.a.N().c(new rb(this, 3));
                this.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }
}
