package defpackage;

import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rhc {
    public int a;
    public int b;
    public int c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;

    public rhc() {
    }

    private final void g(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.b;
        } else {
            i2 = (~i) & this.b;
        }
        this.b = i2;
    }

    public final rhd a() {
        int i;
        int i2;
        int i3 = this.a;
        if (i3 != 0 && (i = this.b) != 0 && (i2 = this.c) != 0) {
            Object obj = this.d;
            Object obj2 = this.e;
            return new rhd((atok) obj, (rve) obj2, i3, i, i2, (asgt) this.f, (apct) this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" type");
        }
        if (this.b == 0) {
            sb.append(" xslNode");
        }
        if (this.c == 0) {
            sb.append(" xslInsideNode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final dyr b() {
        Object obj = this.d;
        if (obj == null && this.g == null) {
            throw new NullPointerException("Must supply pending intent or shortcut to bubble");
        }
        if (obj == null && this.f == null) {
            throw new NullPointerException("Must supply an icon or shortcut for the bubble");
        }
        Object obj2 = this.g;
        Object obj3 = this.e;
        Object obj4 = this.f;
        int i = this.a;
        int i2 = this.c;
        int i3 = this.b;
        IconCompat iconCompat = (IconCompat) obj4;
        dyr dyrVar = new dyr((PendingIntent) obj2, (PendingIntent) obj3, iconCompat, i, i2, i3, (String) obj);
        dyrVar.f = i3;
        return dyrVar;
    }

    public final void c(boolean z) {
        g(1, z);
    }

    public final void d(int i) {
        this.a = Math.max(i, 0);
        this.c = 0;
    }

    public final void e(int i) {
        this.c = i;
        this.a = 0;
    }

    public final void f(boolean z) {
        g(2, z);
    }

    public rhc(PendingIntent pendingIntent, IconCompat iconCompat) {
        if (pendingIntent == null) {
            throw new NullPointerException("Bubble requires non-null pending intent");
        }
        this.g = pendingIntent;
        this.f = iconCompat;
    }

    public rhc(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            return;
        }
        throw new NullPointerException("Bubble requires a non-null shortcut id");
    }
}
