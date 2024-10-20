package defpackage;

import android.os.Build;
import java.util.Locale;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agrl extends agrn {
    public static final String a = String.format(Locale.US, "Mozilla/5.0; Hats App/v%d (Android %s; SDK %d; %s; %s; %s)", 2, Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.ID, Build.MODEL, Build.TAGS);
    public volatile Random b = new Random();
    public volatile boolean c;
    public volatile agkx d;
    private volatile agqz f;
    private volatile agrr g;

    @Override // defpackage.agrn
    public final agqz a() {
        if (this.f == null) {
            synchronized (this) {
                if (this.f == null) {
                    this.f = new agra();
                }
            }
        }
        return this.f;
    }

    @Override // defpackage.agrn
    public final agrr b() {
        if (this.g == null) {
            synchronized (this) {
                if (this.g == null) {
                    this.g = new agrr();
                }
            }
        }
        return this.g;
    }
}
