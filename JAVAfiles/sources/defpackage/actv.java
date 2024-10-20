package defpackage;

import android.app.PendingIntent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class actv {
    public Thread a;
    public String b;
    public PendingIntent c;

    public final String toString() {
        return "Thread: \"" + this.a.getName() + "\", intent: " + String.valueOf(this.c);
    }
}
