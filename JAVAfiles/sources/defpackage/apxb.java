package defpackage;

import android.app.Activity;
import android.app.Application;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class apxb implements apxq {
    protected final Activity a;
    public final apxq b;
    private volatile Object c;
    private final Object d = new Object();

    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public interface a {
        ktk c();
    }

    public apxb(Activity activity) {
        apxq apxfVar;
        this.a = activity;
        if (activity instanceof re) {
            apxfVar = new apxd((re) activity);
        } else {
            apxfVar = new apxf(activity);
        }
        this.b = apxfVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object a() {
        String concat;
        if (!(this.a.getApplication() instanceof apxq)) {
            if (Application.class.equals(this.a.getApplication().getClass())) {
                concat = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
            } else {
                concat = "Found: ".concat(String.valueOf(String.valueOf(this.a.getApplication().getClass())));
            }
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(concat));
        }
        ktk c = ((a) aovp.m(this.b, a.class)).c();
        c.c = this.a;
        Object obj = c.b;
        return new kqj((krv) obj, (kqk) c.a, (Activity) c.c);
    }

    @Override // defpackage.apxq
    public final Object aS() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = a();
                }
            }
        }
        return this.c;
    }

    public final apxk b() {
        apxd apxdVar = (apxd) this.b;
        return ((apxe) apxd.a(apxdVar.a, apxdVar.b).a(apxe.class)).a;
    }
}
