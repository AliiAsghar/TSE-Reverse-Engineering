package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class hqm implements hqk {
    int a;
    public Bitmap.Config b;
    private final hqn c;

    public hqm(hqn hqnVar) {
        this.c = hqnVar;
    }

    @Override // defpackage.hqk
    public final void a() {
        this.c.c(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hqm) {
            hqm hqmVar = (hqm) obj;
            if (this.a == hqmVar.a && d.F(this.b, hqmVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = this.a * 31;
        Bitmap.Config config = this.b;
        if (config != null) {
            i = config.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final String toString() {
        return hqo.c(this.a, this.b);
    }
}
