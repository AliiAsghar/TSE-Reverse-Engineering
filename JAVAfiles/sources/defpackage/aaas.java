package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaas {
    public final int a;
    public final int b;
    public final Object c;

    public aaas(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    public aaas(String str, int i, boolean z) {
        this.c = str;
        this.b = true != z ? 2 : 1;
        this.a = i;
    }
}
