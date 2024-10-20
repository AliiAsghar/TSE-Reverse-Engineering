package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzx implements Iterable {
    public final ArrayList a = new ArrayList();
    public final Context b;

    public dzx(Context context) {
        this.b = context;
    }

    public final PendingIntent a(int i, int i2) {
        if (!this.a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return PendingIntent.getActivities(this.b, i, intentArr, i2, null);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public final Intent[] b() {
        int size = this.a.size();
        Intent[] intentArr = new Intent[size];
        if (size != 0) {
            intentArr[0] = new Intent((Intent) this.a.get(0)).addFlags(268484608);
            for (int i = 1; i < size; i++) {
                intentArr[i] = new Intent((Intent) this.a.get(i));
            }
        }
        return intentArr;
    }

    public final void c(Intent intent) {
        this.a.add(intent);
    }

    public final void d(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.b.getPackageManager());
        }
        if (component != null) {
            e(component);
        }
        c(intent);
    }

    public final void e(ComponentName componentName) {
        int size = this.a.size();
        try {
            Intent v = dxt.v(this.b, componentName);
            while (v != null) {
                this.a.add(size, v);
                v = dxt.v(this.b, v.getComponent());
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public final Iterator<Intent> iterator() {
        return this.a.iterator();
    }
}
