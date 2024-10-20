package defpackage;

import android.app.Notification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsp {
    public final int a;
    public final int b;
    public final Notification c;

    public gsp(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        gsp gspVar = (gsp) obj;
        if (this.a != gspVar.a || this.b != gspVar.b) {
            return false;
        }
        return this.c.equals(gspVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
